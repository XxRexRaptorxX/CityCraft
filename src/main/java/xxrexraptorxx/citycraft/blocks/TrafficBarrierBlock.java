package xxrexraptorxx.citycraft.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import xxrexraptorxx.citycraft.registry.ModTags;

public class TrafficBarrierBlock extends FenceBlock implements SimpleWaterloggedBlock {

    public TrafficBarrierBlock() {
        super(Properties.of().strength(5.0F, 6.5F).sound(SoundType.METAL).mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops());
    }


    @Override
    public boolean connectsTo(BlockState state, boolean isSideSolid, Direction direction) {
        boolean flag = this.isSameFence(state);
        return !isExceptionForConnection(state) && isSideSolid || flag;
    }


    private boolean isSameFence(BlockState state) {
        return state.is(ModTags.TRAFFIC_BARRIERS_TAG);
    }
}
