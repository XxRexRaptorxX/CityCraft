package xxrexraptorxx.citycraft.blocks;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import org.jetbrains.annotations.Nullable;
import xxrexraptorxx.citycraft.utils.Config;

import java.util.List;


public class DrainCoverBlock extends SlabBlock {

	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;


	public DrainCoverBlock() {
		super(Properties.of(Material.METAL)
				.strength(5.5F, 6.5F)
				.sound(SoundType.METAL)
				.requiresCorrectToolForDrops()
				.noOcclusion()
				.color(MaterialColor.METAL)
		);

		this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.valueOf(false)));
	}


	@Override
	public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
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
	public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, TYPE, WATERLOGGED);
	}


	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockPos blockpos = context.getClickedPos();
		BlockState blockstate = context.getLevel().getBlockState(blockpos);

		if (blockstate.is(this)) {
			return blockstate.setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(TYPE, SlabType.DOUBLE).setValue(WATERLOGGED, Boolean.valueOf(false));

		} else {
			FluidState fluidstate = context.getLevel().getFluidState(blockpos);
			BlockState blockstate1 = this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
			Direction direction = context.getClickedFace();

			return direction != Direction.DOWN && (direction == Direction.UP || !(context.getClickLocation().y - (double)blockpos.getY() > 0.5D)) ? blockstate1 : blockstate1.setValue(TYPE, SlabType.TOP);
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
	public void appendHoverText(ItemStack stack, @Nullable BlockGetter level, List<Component> list, TooltipFlag flag) {
		if (Config.ENABLE_TOOLTIPS.get()) {
			list.add(Component.translatable("message.citycraft.drain_cover_tooltip").withStyle(ChatFormatting.GRAY));
		}
	}
}