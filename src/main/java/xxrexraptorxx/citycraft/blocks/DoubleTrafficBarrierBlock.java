package xxrexraptorxx.citycraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import xxrexraptorxx.citycraft.registry.ModTags;


public class DoubleTrafficBarrierBlock extends FenceBlock implements SimpleWaterloggedBlock {

    private static final VoxelShape POST_SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 16.0D, 13.0D);
    private static final VoxelShape FULL_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);


    public DoubleTrafficBarrierBlock() {
        super(Properties.of()
                .strength(5.0F, 6.5F)
                .sound(SoundType.METAL)
                .mapColor(MapColor.METAL)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
        );

    }


    @Override
    public boolean connectsTo(BlockState state, boolean isSideSolid, Direction direction) {
        boolean flag = this.isSameFence(state);
        return !isExceptionForConnection(state) && isSideSolid || flag;
    }


    private boolean isSameFence(BlockState state) {
        return state.is(ModTags.TRAFFIC_BARRIERS_TAG);
    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        if (state.getValue(NORTH) || state.getValue(EAST) || state.getValue(SOUTH) || state.getValue(WEST)) {
            return FULL_SHAPE;

        } else {
            return  POST_SHAPE;
        }
    }
}