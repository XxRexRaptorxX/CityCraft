package xxrexraptorxx.citycraft.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import org.jetbrains.annotations.Nullable;

import java.util.function.ToIntFunction;

public class VariableTrafficSignBlock extends HorizontalDirectionalBlock {

    public static final MapCodec<VariableTrafficSignBlock> CODEC = simpleCodec(VariableTrafficSignBlock::new);
    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;

    public VariableTrafficSignBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(true)));
    }

    public VariableTrafficSignBlock() {
        super(Properties.of()
                .requiresCorrectToolForDrops()
                .strength(0.5F)
                .sound(SoundType.METAL)
                .mapColor(DyeColor.GRAY)
                .instrument(NoteBlockInstrument.BIT)
                .lightLevel(litBlockEmission(5)));
    }

    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, LIT);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection())
                .setValue(LIT, Boolean.valueOf(!context.getLevel().hasNeighborSignal(context.getClickedPos())));
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
