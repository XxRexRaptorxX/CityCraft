package xxrexraptorxx.citycraft.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WallSignBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final MapCodec<WallSignBlock> CODEC = simpleCodec(WallSignBlock::new);
    private static final VoxelShape SHAPE_NORTH = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 1.0D);
    private static final VoxelShape SHAPE_SOUTH = Block.box(0.0D, 0.0D, 15.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape SHAPE_WEST = Block.box(0.0D, 0.0D, 0.0D, 1.0D, 16.0D, 16.0D);
    private static final VoxelShape SHAPE_EAST = Block.box(15.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    public WallSignBlock(Properties properties) {
        super(properties);
    }

    public WallSignBlock() {
        super(Properties.of()
                .strength(2.0F, 3.0F)
                .sound(SoundType.METAL)
                .mapColor(DyeColor.WHITE)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .noCollission()
                .noOcclusion());
        this.registerDefaultState(this.stateDefinition
                .any()
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction clickedFace = context.getClickedFace();

        if (clickedFace.getAxis() != Direction.Axis.Y) {
            boolean waterlogged =
                    context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
            return this.defaultBlockState()
                    .setValue(FACING, clickedFace.getOpposite())
                    .setValue(WATERLOGGED, waterlogged);
        }
        return null;
    }

    @Override
    public BlockState updateShape(
            BlockState state,
            Direction direction,
            BlockState facingState,
            LevelAccessor level,
            BlockPos pos,
            BlockPos facingPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }

        if (!state.canSurvive(level, pos)) {
            level.destroyBlock(pos, true);

            return Blocks.AIR.defaultBlockState();
        }

        return super.updateShape(state, direction, facingState, level, pos, facingPos);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        Direction supportDir = state.getValue(FACING);
        BlockPos supportPos = pos.relative(supportDir);

        return world.getBlockState(supportPos).isFaceSturdy(world, supportPos, state.getValue(FACING));
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction facing = state.getValue(FACING);
        return switch (facing) {
            case SOUTH -> SHAPE_SOUTH;
            case NORTH -> SHAPE_NORTH;
            case EAST -> SHAPE_EAST;
            case WEST -> SHAPE_WEST;
            default -> SHAPE_SOUTH;
        };
    }
}
