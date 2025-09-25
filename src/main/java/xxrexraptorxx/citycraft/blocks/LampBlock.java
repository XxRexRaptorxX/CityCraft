package xxrexraptorxx.citycraft.blocks;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.utils.Config;

import java.util.List;


public class LampBlock extends RedstoneLampBlock {
    public static final BooleanProperty FORCED_ON = BooleanProperty.create("forced_on");
    public static final BooleanProperty FLICKERING = BooleanProperty.create("flickering");


    public LampBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FORCED_ON, false).setValue(FLICKERING, false));
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FORCED_ON, FLICKERING);
    }


    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block neighbour, BlockPos fromPos, boolean isMoving) {
        boolean powered = level.hasNeighborSignal(pos);
        boolean forced = state.getValue(FORCED_ON);
        boolean flick = state.getValue(FLICKERING);
        boolean lit = state.getValue(BlockStateProperties.LIT);

        if (forced && !lit && !level.isClientSide()) {
            level.setBlock(pos, state.setValue(BlockStateProperties.LIT, true), Block.UPDATE_ALL);
            if (state.getValue(FLICKERING)) {
                level.scheduleTick(pos, this, 1 + level.getRandom().nextInt(4));
            }
            return;
        }

        if (flick) {
            if ((powered || forced) && !level.isClientSide()) {
                level.scheduleTick(pos, this, 1 + level.getRandom().nextInt(6));
            } else if (!powered && !forced && lit && !level.isClientSide()) {
                level.setBlock(pos, state.setValue(BlockStateProperties.LIT, false), Block.UPDATE_ALL);
            }
            return;
        }

        if (lit != powered) {
            if (!level.isClientSide()) {
                level.setBlock(pos, state.setValue(BlockStateProperties.LIT, powered), Block.UPDATE_ALL);
            }
        }
    }


    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack held = player.getItemInHand(hand);

        if (held.getItem() instanceof TieredItem) {

            if (!level.isClientSide()) {
                boolean currently = state.getValue(FLICKERING);
                BlockState newState = state.setValue(FLICKERING, !currently);

                if (!currently && (newState.getValue(FORCED_ON) || level.hasNeighborSignal(pos))) {
                    level.scheduleTick(pos, this, 1);
                }

                if (currently) {
                    boolean shouldLit = newState.getValue(FORCED_ON) || level.hasNeighborSignal(pos);
                    newState = newState.setValue(BlockStateProperties.LIT, shouldLit);
                }

                level.setBlock(pos, newState, Block.UPDATE_ALL);
                level.playSound(null, pos, SoundEvents.GLASS_BREAK, SoundSource.BLOCKS, 0.9F, 1.0F);
            }

            return ItemInteractionResult.SUCCESS;
        }

        return super.useItemOn(stack, state, level, pos, player, hand, hit);
    }


    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        boolean flick = state.getValue(FLICKERING);
        boolean forced = state.getValue(FORCED_ON);
        boolean powered = level.hasNeighborSignal(pos);

        if (!flick) return;

        if (!(powered || forced)) {
            if (state.getValue(BlockStateProperties.LIT)) {
                level.setBlock(pos, state.setValue(BlockStateProperties.LIT, false), Block.UPDATE_ALL);
            }
            return;
        }

        boolean nextLit = random.nextInt(6) != 0;
        if (state.getValue(BlockStateProperties.LIT) != nextLit) {
            level.setBlock(pos, state.setValue(BlockStateProperties.LIT, nextLit), Block.UPDATE_ALL);
        }

        if ((powered || forced) && flick) {
            int delay = 1 + random.nextInt(6);
            level.scheduleTick(pos, this, delay);
        }
    }


    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
        if (Config.ENABLE_TOOLTIPS.get()) {
            list.add(Component.translatable("message." + References.MODID + ".flicker_info").withStyle(ChatFormatting.GRAY));
        }
    }
}
