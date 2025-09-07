package xxrexraptorxx.citycraft.blocks;

import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.AABB;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.utils.Config;

public class DrainCoverBlock extends SlabBlock {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public DrainCoverBlock() {
        super(Properties.of()
                .strength(5.5F, 6.5F)
                .sound(SoundType.METAL)
                .mapColor(MapColor.METAL)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .noOcclusion());

        this.registerDefaultState(
                this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    @Override
    public BlockState updateShape(
            BlockState state,
            Direction direction,
            BlockState neighborState,
            LevelAccessor level,
            BlockPos pos,
            BlockPos neighborPos) {
        BlockPos above = pos.above();
        BlockPos below = pos.below();
        FluidState fluidStateAbove = level.getFluidState(above);
        FluidState fluidStateBelow = level.getFluidState(below);

        if (fluidStateAbove.is(FluidTags.WATER)) {
            state = state.setValue(WATERLOGGED, true);

            if (fluidStateBelow.getType() == Fluids.EMPTY) {
                BlockState blockStateBelow = level.getBlockState(below);
                if (blockStateBelow.isAir()) {
                    level.setBlock(below, fluidStateAbove.createLegacyBlock(), 2);
                }
            }
        } else {
            if (fluidStateBelow.getType() != Fluids.EMPTY) {
                level.setBlock(below, Blocks.AIR.defaultBlockState(), 3);
            }
            state = state.setValue(WATERLOGGED, false);
        }

        return state;
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        BlockPos above = pos.above();
        BlockPos below = pos.below();

        // Handle item movement
        AABB itemCheckBox =
                new AABB(pos.getX(), pos.getY(), pos.getZ(), above.getX() + 1, above.getY() + 1, above.getZ() + 1);

        if (!level.getEntitiesOfClass(ItemEntity.class, itemCheckBox).isEmpty()) {
            level.getEntitiesOfClass(ItemEntity.class, itemCheckBox).forEach(itemEntity -> {
                ItemStack stack = itemEntity.getItem();
                itemEntity.setPos(itemEntity.getX(), below.getY(), itemEntity.getZ());
            });
        }

        level.scheduleTick(pos, this, 5);
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (!level.isClientSide) {
            level.scheduleTick(pos, this, 20); // Schedule the first tick in 20 game ticks (1 second)
        }
    }

    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, TYPE, WATERLOGGED);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        BlockState blockstate = context.getLevel().getBlockState(blockpos);

        if (blockstate.is(this)) {
            return blockstate
                    .setValue(FACING, context.getHorizontalDirection().getOpposite())
                    .setValue(TYPE, SlabType.DOUBLE)
                    .setValue(WATERLOGGED, Boolean.valueOf(false));

        } else {
            FluidState fluidstate = context.getLevel().getFluidState(blockpos);
            BlockState blockstate1 = this.defaultBlockState()
                    .setValue(FACING, context.getHorizontalDirection().getOpposite())
                    .setValue(TYPE, SlabType.BOTTOM)
                    .setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
            Direction direction = context.getClickedFace();

            return direction != Direction.DOWN
                            && (direction == Direction.UP
                                    || !(context.getClickLocation().y - (double) blockpos.getY() > 0.5D))
                    ? blockstate1
                    : blockstate1.setValue(TYPE, SlabType.TOP);
        }
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
        if (Config.ENABLE_TOOLTIPS.get()) {
            list.add(Component.translatable("message." + References.MODID + ".drain_cover_tooltip")
                    .withStyle(ChatFormatting.GRAY));
        }
    }
}
