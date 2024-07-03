package xxrexraptorxx.citycraft.blocks;

import net.minecraft.ChatFormatting;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class TrafficSignBlock extends FenceBlock implements SimpleWaterloggedBlock {

	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

	public TrafficSignBlock() {
		super(Properties.of()
				.strength(3.0F, 4.0F)
				.sound(SoundType.METAL)
				.mapColor(DyeColor.WHITE)
				.instrument(NoteBlockInstrument.IRON_XYLOPHONE)
				.requiresCorrectToolForDrops()
		);
	}


	@Override
	public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		if (BuiltInRegistries.BLOCK.getKey(Block.byItem(stack.getItem())).getPath().contains("_eu_sign")) {
			list.add(Component.literal("[EU]").withStyle(ChatFormatting.GRAY));

		} else if (BuiltInRegistries.BLOCK.getKey(Block.byItem(stack.getItem())).getPath().contains("_us_sign")) {
			list.add(Component.literal("[US]").withStyle(ChatFormatting.GRAY));

		} else if (BuiltInRegistries.BLOCK.getKey(Block.byItem(stack.getItem())).getPath().contains("_zh_sign")) {
			list.add(Component.literal("[ZH]").withStyle(ChatFormatting.GRAY));
		}
	}


	@Override
	public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(NORTH, EAST, WEST, SOUTH, WATERLOGGED, FACING);
	}


	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());

		return super.getStateForPlacement(context).setValue(NORTH, false).setValue(SOUTH, false).setValue(WEST, false).setValue(EAST, false)
				.setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER)).setValue(FACING, context.getHorizontalDirection());
	}


	@Override
	public boolean connectsTo(BlockState state, boolean isSideSolid, Direction direction) {
		return false;
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