package xxrexraptorxx.citycraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.MapColor;

import java.util.function.ToIntFunction;


public class LanternBlockPanel extends SlabBlock {

	public static final BooleanProperty LIT;


	public LanternBlockPanel() {
		super(Properties.of()
				.strength(5.0F, 6.0F)
				.sound(SoundType.GLASS)
				.mapColor(MapColor.METAL)
				.instrument(NoteBlockInstrument.BELL)
				.requiresCorrectToolForDrops()
				.lightLevel(litBlockEmission(15))
		);
		this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.valueOf(false)).setValue(LIT, false));
	}


	@Override
	public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource source) {
		int brightness = level.getBrightness(LightLayer.SKY, pos) - level.getSkyDarken();

		if (brightness > 10) {
			level.setBlock(pos, state.setValue(LIT, false), 2);
		} else {
			level.setBlock(pos, state.setValue(LIT, true), 2);
		}

		level.scheduleTick(pos, this, 20);
	}



	@Override
	public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(LIT, TYPE, WATERLOGGED);
	}


	@Override
	public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
		super.onPlace(state, level, pos, oldState, isMoving);

		if (!level.isClientSide()) {
			level.scheduleTick(pos, this, 20);
		}
	}


	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockPos blockpos = context.getClickedPos();
		BlockState blockstate = context.getLevel().getBlockState(blockpos);


		if (blockstate.is(this)) {
			return blockstate.setValue(LIT, false).setValue(TYPE, SlabType.DOUBLE).setValue(WATERLOGGED, Boolean.valueOf(false));

		} else {
			FluidState fluidstate = context.getLevel().getFluidState(blockpos);
			BlockState blockstate1 = this.defaultBlockState().setValue(LIT, false).setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
			Direction direction = context.getClickedFace();

			return direction != Direction.DOWN && (direction == Direction.UP || !(context.getClickLocation().y - (double)blockpos.getY() > 0.5D)) ? blockstate1 : blockstate1.setValue(TYPE, SlabType.TOP);
		}
	}


	//@Override
	//public  BlockState updateShape(BlockState state, Direction direction, BlockState p_53278_, LevelAccessor level, BlockPos pos, BlockPos p_53281_) {
	//		//level.scheduleTick(pos, this, 1);
//
	//	int brightness = level.getBrightness(LightLayer.SKY, pos) - level.getSkyDarken();
	//	System.out.println(brightness);
//
	//	if (brightness > 10) {
	//		level.setBlock(pos, (BlockState)state.cycle(LIT), 2);
	//	}
//
	//	level.scheduleTick(pos, this, 20);
//
	//	return super.updateShape(state, direction, p_53278_, level, p_53281_, p_53281_);
	//}


	private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
		return (block) -> {
			return block.getValue(BlockStateProperties.LIT) ? lightValue : 0;
		};
	}


	static {
		LIT = RedstoneTorchBlock.LIT;
	}

}