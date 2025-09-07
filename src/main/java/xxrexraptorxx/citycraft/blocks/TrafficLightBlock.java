package xxrexraptorxx.citycraft.blocks;

import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import xxrexraptorxx.citycraft.registry.ModBlocks;

public class TrafficLightBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {

    public static final MapCodec<TrafficLightBlock> CODEC = simpleCodec(TrafficLightBlock::new);
    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    private static final VoxelShape TRIPPE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);
    private static final VoxelShape DOUBLE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 12.0D, 12.0D);
    private static final VoxelShape SINGLE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D);
    private static final VoxelShape SIDE_EAST_WEST = Block.box(4.0D, 0.0D, 0.0D, 12.0D, 8.0D, 16.0D);
    private static final VoxelShape SIDE_NORTH_SOUTH = Block.box(0.0D, 0.0D, 4.0D, 16.0D, 8.0D, 12.0D);

    public TrafficLightBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(LIT, Boolean.valueOf(true))
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    public TrafficLightBlock() {
        super(Properties.of()
                .requiresCorrectToolForDrops()
                .strength(0.5F)
                .sound(SoundType.METAL)
                .mapColor(DyeColor.GRAY)
                .instrument(NoteBlockInstrument.PLING)
                .lightLevel(litBlockEmission(2))
                .requiresCorrectToolForDrops());
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        String blockName = BuiltInRegistries.BLOCK.getKey(this).getPath();

        if (blockName.contains("tripple")) {
            return TRIPPE;
        } else if (blockName.contains("double")) {
            return DOUBLE;
        } else if (this == ModBlocks.SIGNAL_LIGHT.get() || this == ModBlocks.PEDESTRIAN_SIGNAL_LIGHT.get()) {
            return SINGLE;
        } else {

            // SIDE
            if (state.getValue(FACING) == Direction.NORTH || state.getValue(FACING) == Direction.SOUTH) {
                return SIDE_NORTH_SOUTH;
            } else {
                return SIDE_EAST_WEST;
            }
        }
    }

    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, LIT, WATERLOGGED);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());

        return this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection())
                .setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER))
                .setValue(LIT, Boolean.valueOf(!context.getLevel().hasNeighborSignal(context.getClickedPos())));
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public BlockState updateShape(
            BlockState state,
            Direction facing,
            BlockState facingState,
            LevelAccessor level,
            BlockPos currentPos,
            BlockPos facingPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }

        return super.updateShape(state, facing, facingState, level, currentPos, facingPos);
    }

    @Override
    public void neighborChanged(
            BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
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
    public boolean canConnectRedstone(
            BlockState state, BlockGetter level, BlockPos pos, @Nullable Direction direction) {
        return true;
    }

    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return (block) -> {
            return block.getValue(BlockStateProperties.LIT) ? lightValue : 0;
        };
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }
}
