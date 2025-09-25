package xxrexraptorxx.citycraft.utils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LanternBlock;
import xxrexraptorxx.citycraft.blocks.*;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.registry.ModBlocks;

import java.util.ArrayList;
import java.util.List;

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


    public static List<ItemStack> getAllLampBlocks() {
        List<ItemStack> blocks = new ArrayList<>();

        for (Block block : BuiltInRegistries.BLOCK) {
            if (block instanceof LampBlock) {
                ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(block);

                if (blockId != null && blockId.getNamespace().equals(References.MODID)) {
                    blocks.add(new ItemStack(block));
                }
            }
        }

        return blocks;
    }


    public static List<ItemStack> getAllLanternBlocks() {
        List<ItemStack> blocks = new ArrayList<>();

        for (Block block : BuiltInRegistries.BLOCK) {
            if (block instanceof LanternBlockSlab || block instanceof LanternBlock) {
                ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(block);

                if (blockId != null && blockId.getNamespace().equals(References.MODID)) {
                    blocks.add(new ItemStack(block));
                }
            }
        }

        return blocks;
    }


    public static List<ItemStack> getAllChimneyBlocks() {
        List<ItemStack> blocks = new ArrayList<>();

        for (Block block : BuiltInRegistries.BLOCK) {
            if (block instanceof ChimneyBlock || block instanceof FlueBlock) {
                ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(block);

                if (blockId != null && blockId.getNamespace().equals(References.MODID)) {
                    blocks.add(new ItemStack(block));
                }
            }
        }

        return blocks;
    }


    public static List<ItemStack> getAllAsphaltSpeedBlocks() {
        List<ItemStack> blocks = new ArrayList<>();

        for (Block block : BuiltInRegistries.BLOCK) {
            if ((block instanceof AsphaltBlock && block != ModBlocks.POTHOLE_ASPHALT.get() && block != ModBlocks.BOOST_ASPHALT.get())
                    || (block instanceof AsphaltSlabBlock && block != ModBlocks.POTHOLE_ASPHALT_SLAB.get() && block != ModBlocks.BOOST_ASPHALT_SLAB.get())) {
                ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(block);

                if (blockId != null && blockId.getNamespace().equals(References.MODID)) {
                    blocks.add(new ItemStack(block));
                }
            }
        }

        return blocks;
    }


    public static List<ItemStack> getAllBoostBlocks() {
        List<ItemStack> blocks = new ArrayList<>();

        for (Block block : BuiltInRegistries.BLOCK) {
            if (block instanceof AsphaltBlock && BuiltInRegistries.BLOCK.getKey(block).getPath().contains("boost")) {
                ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(block);

                if (blockId != null && blockId.getNamespace().equals(References.MODID)) {
                    blocks.add(new ItemStack(block));
                }
            }
        }

        return blocks;
    }


    public static List<ItemStack> getAllNeonBlocks() {
        List<ItemStack> blocks = new ArrayList<>();

        for (Block block : BuiltInRegistries.BLOCK) {
            if (block instanceof NeonBlock) {
                ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(block);

                if (blockId != null && blockId.getNamespace().equals(References.MODID)) {
                    blocks.add(new ItemStack(block));
                }
            }
        }

        return blocks;
    }
}
