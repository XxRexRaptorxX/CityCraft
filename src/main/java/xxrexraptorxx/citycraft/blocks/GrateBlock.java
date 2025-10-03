package xxrexraptorxx.citycraft.blocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WaterloggedTransparentBlock;

public class GrateBlock extends WaterloggedTransparentBlock {

    public GrateBlock(Properties properties) {
        super(properties.noOcclusion().requiresCorrectToolForDrops().isValidSpawn(Blocks::never).isRedstoneConductor((blockState, blockGetter, blockPos) -> false)
                .isSuffocating((blockState, blockGetter, blockPos) -> false).isViewBlocking((blockState, blockGetter, blockPos) -> false));
    }
}
