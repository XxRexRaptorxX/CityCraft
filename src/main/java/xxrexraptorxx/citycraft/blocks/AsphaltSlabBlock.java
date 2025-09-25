package xxrexraptorxx.citycraft.blocks;

import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.utils.Config;

public class AsphaltSlabBlock extends SlabBlock {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public AsphaltSlabBlock() {
        super(BlockBehaviour.Properties.ofFullCopy(ModBlocks.ASPHALT_BLOCK.get()));

        this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }


    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (level.isClientSide || entity == null) return;

        boolean isBoostAsphalt = this == ModBlocks.BOOST_ASPHALT_SLAB.get();
        boolean isRegularAsphalt = !isBoostAsphalt && Config.ENABLE_ASPHALT_SPEED_EFFECT.get();

        if (isRegularAsphalt || isBoostAsphalt) {
            int duration = isBoostAsphalt ? 30 : 10;
            int amplifier = isBoostAsphalt ? Config.BOOST_SPEED_EFFECT_AMPLIFIER.get() : Config.SPEED_EFFECT_AMPLIFIER.get();

            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, duration, amplifier, false, false, true));
            }
        }
    }


    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
        if (Config.ENABLE_TOOLTIPS.get()) {

            if (this == ModBlocks.BOOST_ASPHALT_SLAB.get()) {
                list.add(Component.translatable("message." + References.MODID + ".boost_speed_info").withStyle(ChatFormatting.GRAY));

            } else if (Config.ENABLE_ASPHALT_SPEED_EFFECT.get() && this != ModBlocks.POTHOLE_ASPHALT_SLAB.get()) {
                list.add(Component.translatable("message." + References.MODID + ".speed_info").withStyle(ChatFormatting.GRAY));
            }
        }
    }


    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, TYPE, WATERLOGGED);
    }


    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        BlockState blockstate = context.getLevel().getBlockState(blockpos);

        if (blockstate.is(this)) {
            return blockstate.setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(TYPE, SlabType.DOUBLE).setValue(WATERLOGGED, Boolean.valueOf(false));

        } else {
            FluidState fluidstate = context.getLevel().getFluidState(blockpos);
            BlockState blockstate1 = this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED,
                    Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
            Direction direction = context.getClickedFace();

            return direction != Direction.DOWN && (direction == Direction.UP || !(context.getClickLocation().y - (double) blockpos.getY() > 0.5D))
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
}
