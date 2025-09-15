package xxrexraptorxx.citycraft.blocks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HalfTransparentBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class NeonBlock extends HalfTransparentBlock {

    private static final int MAX_COMPONENT_SIZE = 1024;

    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public NeonBlock(Properties properties) {
        super(properties.lightLevel(litBlockEmission(15)).noOcclusion());
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, false));
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }


    private Set<BlockPos> collectConnectedLamps(Level level, BlockPos start, int maxSize) {
        Set<BlockPos> visited = new HashSet<>();
        Deque<BlockPos> queue = new ArrayDeque<>();
        queue.add(start);

        while (!queue.isEmpty() && visited.size() < maxSize) {
            BlockPos pos = queue.removeFirst();
            if (visited.contains(pos)) continue;

            BlockState bs = level.getBlockState(pos);
            if (!(bs.getBlock() instanceof NeonBlock)) continue;

            visited.add(pos);

            for (Direction dir : Direction.values()) {
                BlockPos np = pos.relative(dir);
                if (visited.contains(np)) continue;
                BlockState ns = level.getBlockState(np);
                if (ns.getBlock() instanceof NeonBlock) {
                    queue.addLast(np);
                }
            }
        }

        return visited;
    }


    private void updateComponent(Level level, BlockPos pos) {
        if (level.isClientSide) return;

        Set<BlockPos> component = collectConnectedLamps(level, pos, MAX_COMPONENT_SIZE);
        if (component.isEmpty()) return;

        boolean truncated = component.size() >= MAX_COMPONENT_SIZE;

        boolean anyPowered = false;
        for (BlockPos p : component) {
            if (level.hasNeighborSignal(p)) {
                anyPowered = true;
                break;
            }
        }

        if (truncated && !anyPowered) {
            anyPowered = true;
        }

        for (BlockPos p : component) {
            BlockState bs = level.getBlockState(p);
            if (!(bs.getBlock() instanceof NeonBlock)) continue;
            boolean isLit = bs.getValue(LIT);
            if (isLit != anyPowered) {
                level.setBlock(p, bs.setValue(LIT, anyPowered), Block.UPDATE_CLIENTS);
            }
        }
    }


    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (level.isClientSide) return;
        level.scheduleTick(pos, this, 2);
    }


    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean moved) {
        if (!level.isClientSide) {
            level.scheduleTick(pos, this, 2);
        }
        super.onPlace(state, level, pos, oldState, moved);
    }


    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!level.isClientSide && state.getBlock() != newState.getBlock()) {
            for (Direction dir : Direction.values()) {
                BlockPos np = pos.relative(dir);
                BlockState ns = level.getBlockState(np);
                if (ns.getBlock() instanceof NeonBlock) {
                    level.scheduleTick(np, this, 2);
                }
            }
        }
        super.onRemove(state, level, pos, newState, isMoving);
    }


    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        updateComponent(level, pos);
    }


    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(LIT, context.getLevel().hasNeighborSignal(context.getClickedPos()));
    }


    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return (block) -> block.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }
}
