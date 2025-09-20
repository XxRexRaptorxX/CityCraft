package xxrexraptorxx.citycraft.utils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import xxrexraptorxx.citycraft.registry.ModBlocks;

public class Helper {

    @SuppressWarnings("ConstantConditions")
    public static <T> T unsafeNullCast() {
        return null;
    }


    public static String getTrafficLightModelType(Block block) {
        String blockName = BuiltInRegistries.BLOCK.getKey(block).getPath();

        if (blockName.contains("triple")) {
            return "triple_traffic_lights";

        } else if (blockName.contains("double")) {
            return "double_traffic_lights";

        } else if (block == ModBlocks.SIGNAL_LIGHT.get() || block == ModBlocks.PEDESTRIAN_SIGNAL_LIGHT.get()) {
            return "traffic_lights";

        } else {
            return "side_traffic_lights";
        }
    }
}
