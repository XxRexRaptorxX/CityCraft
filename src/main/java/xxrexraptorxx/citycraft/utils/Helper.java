package xxrexraptorxx.citycraft.utils;

import net.minecraftforge.registries.ForgeRegistries;
import xxrexraptorxx.citycraft.blocks.TrafficLightBlock;
import xxrexraptorxx.citycraft.registry.ModBlocks;

public class Helper {

    @SuppressWarnings("ConstantConditions")
    public static <T> T unsafeNullCast() {
        return null;
    }


    public static String getTrafficLightModelType(TrafficLightBlock block) {
        String blockName = ForgeRegistries.BLOCKS.getKey(block).getPath();

        if (blockName.contains("tripple")) {
            return "tripple_traffic_lights";

        } else if (blockName.contains("double")) {
            return "double_traffic_lights";

        } else if (block == ModBlocks.SIGNAL_LIGHT.get() || block == ModBlocks.PEDESTRIAN_SIGNAL_LIGHT.get()) {
            return "traffic_lights";

        } else {
            return "side_traffic_lights";
        }
    }


}