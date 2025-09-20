package xxrexraptorxx.citycraft.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import xxrexraptorxx.citycraft.registry.ModBlocks;

public class SignalLightBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {

    public static final MapCodec<SignalLightBlock> CODEC = MapCodec.unit(() -> new SignalLightBlock(BlockBehaviour.Properties.of()));

    public static final BooleanProperty LIT = BlockStateProperties.LIT;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    private static final VoxelShape SINGLE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D);
    private static final VoxelShape DOUBLE_SIDE_EAST_WEST = Block.box(4.0D, 0.0D, 0.0D, 12.0D, 8.0D, 16.0D);
    private static final VoxelShape DOUBLE_SIDE_NORTH_SOUTH = Block.box(0.0D, 0.0D, 4.0D, 16.0D, 8.0D, 12.0D);

    public SignalLightBlock(BlockBehaviour.Properties properties) {
        super(properties);

        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(LIT, true).setValue(WATERLOGGED, false));
    }


    @Override
    protected MapCodec<? extends SignalLightBlock> codec() {
        return CODEC;
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, LIT, WATERLOGGED);
    }


    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction facing = context.getHorizontalDirection();
        boolean powered = context.getLevel().hasNeighborSignal(context.getClickedPos());
        FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
        boolean waterlogged = fluidState.getType() == Fluids.WATER;

        return this.defaultBlockState().setValue(FACING, facing).setValue(LIT, !powered).setValue(WATERLOGGED, waterlogged);
    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        // SINGLE
        if (this == ModBlocks.SIGNAL_LIGHT.get() || this == ModBlocks.PEDESTRIAN_SIGNAL_LIGHT.get()) {
            return SINGLE;
        } else {
            // DOUBLE
            if (state.getValue(FACING) == Direction.NORTH || state.getValue(FACING) == Direction.SOUTH) {
                return DOUBLE_SIDE_NORTH_SOUTH;
            } else {
                return DOUBLE_SIDE_EAST_WEST;
            }
        }
    }


    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }


    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos currentPos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return super.updateShape(state, direction, neighborState, level, currentPos, neighborPos);
    }


    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (!level.isClientSide) {
            boolean powered = level.hasNeighborSignal(pos);
            boolean currentlyLit = state.getValue(LIT);

            if (powered == currentlyLit) {
                BlockState newState = state.setValue(LIT, !powered);
                level.setBlock(pos, newState, Block.UPDATE_ALL);
            }
        }
    }


    @Override
    public boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }


    @Override
    public int getAnalogOutputSignal(BlockState state, Level level, BlockPos pos) {
        return state.getValue(LIT) ? 15 : 0;
    }


    @Override
    public boolean canConnectRedstone(BlockState state, BlockGetter level, BlockPos pos, @Nullable Direction direction) {
        return true;
    }

}
