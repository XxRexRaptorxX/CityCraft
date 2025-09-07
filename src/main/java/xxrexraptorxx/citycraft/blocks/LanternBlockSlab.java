package xxrexraptorxx.citycraft.blocks;

import java.util.function.ToIntFunction;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
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

public class LanternBlockSlab extends SlabBlock {

    public static final BooleanProperty LIT;

    public LanternBlockSlab() {
        super(Properties.of()
                .strength(5.0F, 6.0F)
                .sound(SoundType.GLASS)
                .mapColor(MapColor.METAL)
                .instrument(NoteBlockInstrument.BELL)
                .requiresCorrectToolForDrops()
                .lightLevel(litBlockEmission(15)));
        this.registerDefaultState(this.defaultBlockState()
                .setValue(TYPE, SlabType.BOTTOM)
                .setValue(WATERLOGGED, false)
                .setValue(LIT, false));
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource source) {
        boolean powered = level.hasNeighborSignal(pos);
        // int brightness = level.getBrightness(LightLayer.SKY, pos) - level.getSkyDarken();

        if (powered || level.getSkyDarken() >= 6) {
            level.setBlock(pos, state.setValue(LIT, true), 2);
        } else {
            level.setBlock(pos, state.setValue(LIT, false), 2);
        }

        level.scheduleTick(pos, this, 100);
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
            return blockstate
                    .setValue(LIT, context.getLevel().hasNeighborSignal(context.getClickedPos()))
                    .setValue(TYPE, SlabType.DOUBLE)
                    .setValue(WATERLOGGED, Boolean.valueOf(false));

        } else {
            FluidState fluidstate = context.getLevel().getFluidState(blockpos);
            BlockState blockstate1 = this.defaultBlockState()
                    .setValue(LIT, context.getLevel().hasNeighborSignal(context.getClickedPos()))
                    .setValue(TYPE, SlabType.BOTTOM)
                    .setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
            Direction direction = context.getClickedFace();

            return direction != Direction.DOWN
                            && (direction == Direction.UP
                                    || !(context.getClickLocation().y - (double) blockpos.getY() > 0.5D))
                    ? blockstate1
                    : blockstate1.setValue(TYPE, SlabType.TOP);
        }
    }

    @Override
    public void neighborChanged(
            BlockState state, Level level, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean isMoving) {
        if (!level.isClientSide()) {
            boolean powered = level.hasNeighborSignal(pos);

            boolean shouldBeLit = powered || (level.getSkyDarken() >= 6);

            if (state.getValue(LIT) != shouldBeLit) {
                level.setBlock(pos, state.setValue(LIT, shouldBeLit), 2);
            }
        }
        super.neighborChanged(state, level, pos, neighborBlock, fromPos, isMoving);
    }

    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return (block) -> block.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }

    static {
        LIT = BlockStateProperties.LIT;
    }
}
