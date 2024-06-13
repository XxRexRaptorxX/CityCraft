package xxrexraptorxx.citycraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.function.ToIntFunction;


public class TrafficLightBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {

	public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;
	private static final VoxelShape TRIPPE = Block.box(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D);
	private static final VoxelShape DOUBLE = Block.box(7.0D, 0.0D, 7.0D, 9.0D, 12.0D, 9.0D);
	private static final VoxelShape SINGLE = Block.box(7.0D, 0.0D, 7.0D, 9.0D, 8.0D, 9.0D);
	private static final VoxelShape SIDE_NORTH = Block.box(0.0D, 0.0D, 4.0D, 0.0D, 8.0D, 12.0D);


	public TrafficLightBlock() {
		super(Properties.of()
				.requiresCorrectToolForDrops()
				.strength(0.5F)
				.sound(SoundType.METAL)
				.mapColor(DyeColor.GRAY)
				.instrument(NoteBlockInstrument.PLING)
				.lightLevel(litBlockEmission(2))
		);
		this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(true)));
	}


	@Override
	public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
		if (this == )
	}

	@Override
	public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, LIT);
	}


	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection())
				.setValue(LIT, Boolean.valueOf(!context.getLevel().hasNeighborSignal(context.getClickedPos())));
	}


	@Override
	public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
		if (!level.isClientSide) {
			boolean isLit = state.getValue(LIT);
			boolean hasSignal = level.hasNeighborSignal(pos);

			if (isLit && hasSignal) {
				level.setBlock(pos, state.setValue(LIT, false), 2);
			} else if (!isLit && !hasSignal) {
				level.setBlock(pos, state.setValue(LIT, true), 2);
			}
		}
	}


	@Override
	public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		boolean hasSignal = level.hasNeighborSignal(pos);
		if (state.getValue(LIT) && hasSignal) {
			level.setBlock(pos, state.setValue(LIT, false), 2);
		} else if (!state.getValue(LIT) && !hasSignal) {
			level.setBlock(pos, state.setValue(LIT, true), 2);
		}
	}


	@Override
	public boolean canConnectRedstone(BlockState state, BlockGetter level, BlockPos pos, @Nullable Direction direction) {
		return true;
	}


	private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
		return (block) -> {
			return block.getValue(BlockStateProperties.LIT) ? lightValue : 0;
		};
	}

}