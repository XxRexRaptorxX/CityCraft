package xxrexraptorxx.citycraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import xxrexraptorxx.citycraft.main.CityCraft;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.registry.ModBlockTags;
import xxrexraptorxx.citycraft.registry.ModBlocks;

import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class BlockTagGen extends BlockTagsProvider {

    public BlockTagGen(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper helper) {
        super(packOutput, lookupProvider, References.MODID, helper);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        var lookup = provider.lookupOrThrow(Registries.BLOCK);

        addByPathPredicate(lookup, ModBlockTags.BLANK_ASPHALT, path -> (path.equals("asphalt") || path.endsWith("_asphalt")) && !isSpecialAsphalt(path));
        addByPathPredicate(lookup, ModBlockTags.BLANK_ASPHALT_SLABS, path -> path.endsWith("_asphalt_slab") || (path.contains("_asphalt") && !isSpecialAsphalt(path)));

        addByPathPredicate(lookup, ModBlockTags.WHITE_MARKED_ASPHALT, path -> path.startsWith("asphalt_with_white") && !path.contains("slab"));
        addByPathPredicate(lookup, ModBlockTags.WHITE_MARKED_ASPHALT_SLABS, path -> path.startsWith("asphalt_with_white") && path.endsWith("_slab"));

        addByPathPredicate(lookup, ModBlockTags.YELLOW_MARKED_ASPHALT, path -> path.startsWith("asphalt_with_yellow") && !path.contains("slab"));
        addByPathPredicate(lookup, ModBlockTags.YELLOW_MARKED_ASPHALT_SLABS, path -> path.startsWith("asphalt_with_yellow") && path.endsWith("_slab"));

        tag(ModBlockTags.ASPHALT_WITH_MARKINGS).addTag(ModBlockTags.WHITE_MARKED_ASPHALT).addTag(ModBlockTags.YELLOW_MARKED_ASPHALT);
        tag(ModBlockTags.ASPHALT_SLABS_WITH_MARKINGS).addTag(ModBlockTags.WHITE_MARKED_ASPHALT_SLABS).addTag(ModBlockTags.YELLOW_MARKED_ASPHALT_SLABS);

        tag(ModBlockTags.ASPHALT).addTag(ModBlockTags.BLANK_ASPHALT).addTag(ModBlockTags.ASPHALT_WITH_MARKINGS).add(ModBlocks.CRACKED_ASPHALT.get())
                .add(ModBlocks.CRACKED_ASPHALT_SLAB.get()).add(ModBlocks.POTHOLE_ASPHALT.get()).add(ModBlocks.POTHOLE_ASPHALT_SLAB.get()).add(ModBlocks.DIRTY_ASPHALT.get())
                .add(ModBlocks.DIRTY_ASPHALT_SLAB.get()).add(ModBlocks.BOOST_ASPHALT.get()).add(ModBlocks.BOOST_ASPHALT_SLAB.get()).add(ModBlocks.RED_BUMPER_SLAB.get())
                .add(ModBlocks.YELLOW_BUMPER_SLAB.get());

        tag(ModBlockTags.CHIMNEYS_BOOSTER).addTags(BlockTags.FIRE, BlockTags.CAMPFIRES, Tags.Blocks.PLAYER_WORKSTATIONS_FURNACES);

        tag(ModBlockTags.CONCRETE_WALLS).addTag(ModBlockTags.COLORED_CONCRETE_WALLS);
        tag(ModBlockTags.BRICK_WALLS).addTag(ModBlockTags.COLORED_BRICK_WALLS).add(Blocks.BRICK_WALL);

        addByPathModPredicate(lookup, Tags.Blocks.DYED_BLACK, path -> (path.contains("black")));
        addByPathModPredicate(lookup, Tags.Blocks.DYED_WHITE, path -> (path.contains("white")));
        addByPathModPredicate(lookup, Tags.Blocks.DYED_ORANGE, path -> (path.contains("orange")));
        addByPathModPredicate(lookup, Tags.Blocks.DYED_MAGENTA, path -> (path.contains("magenta")));
        addByPathModPredicate(lookup, Tags.Blocks.DYED_LIGHT_BLUE, path -> (path.contains("light_blue")));
        addByPathModPredicate(lookup, Tags.Blocks.DYED_YELLOW, path -> (path.contains("yellow")));
        addByPathModPredicate(lookup, Tags.Blocks.DYED_LIME, path -> (path.contains("lime")));
        addByPathModPredicate(lookup, Tags.Blocks.DYED_PINK, path -> (path.contains("pink")));
        addByPathModPredicate(lookup, Tags.Blocks.DYED_GRAY, path -> (path.contains("gray") && !path.contains("light")));
        addByPathModPredicate(lookup, Tags.Blocks.DYED_LIGHT_GRAY, path -> (path.contains("light_gray")));
        addByPathModPredicate(lookup, Tags.Blocks.DYED_CYAN, path -> (path.contains("cyan")));
        addByPathModPredicate(lookup, Tags.Blocks.DYED_PURPLE, path -> (path.contains("purple")));
        addByPathModPredicate(lookup, Tags.Blocks.DYED_BLUE, path -> (path.contains("blue") && !path.contains("light")));
        addByPathModPredicate(lookup, Tags.Blocks.DYED_BROWN, path -> (path.contains("brown")));
        addByPathModPredicate(lookup, Tags.Blocks.DYED_GREEN, path -> (path.contains("green")));
        addByPathModPredicate(lookup, Tags.Blocks.DYED_RED, path -> (path.contains("red")));

        tag(BlockTags.CLIMBABLE).add(ModBlocks.IRON_LADDER.get());
        tag(BlockTags.FALL_DAMAGE_RESETTING).add(ModBlocks.IRON_LADDER.get());
        tag(ModBlockTags.createBlockTag("c", "ladders")).add(ModBlocks.IRON_LADDER.get());
        tag(BlockTags.FENCES).add(ModBlocks.IRON_FENCE.get());
        tag(ModBlockTags.createBlockTag("c", "fences/iron")).add(ModBlocks.IRON_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.IRON_FENCE_GATE.get());
        tag(ModBlockTags.createBlockTag("c", "fence_gates/iron")).add(ModBlocks.IRON_FENCE_GATE.get());

        addByPathPredicate(lookup, ModBlockTags.TRAFFIC_BARRIERS, path -> path.contains("traffic_barrier"));
        addByPathPredicate(lookup, ModBlockTags.CONCRETES, path -> path.contains("concrete"));
        addByPathPredicate(lookup, ModBlockTags.LEVERS, path -> path.endsWith("lever"));
        addByPathPredicate(lookup, ModBlockTags.POSTS, path -> path.endsWith("_post") && !path.contains("road_edge"));
        addByPathPredicate(lookup, ModBlockTags.POLES, path -> path.endsWith("_pole"));
        addByPathPredicate(lookup, ModBlockTags.LAMPS, path -> path.endsWith("_lamp") || path.endsWith("_light") || path.contains("lantern"));
        addByPathPredicate(lookup, ModBlockTags.SPEED_BOOST_BLOCKS, path -> path.contains("asphalt") && !path.contains("pothole"));
        addByPathPredicate(lookup, ModBlockTags.CHIMNEYS, path -> path.endsWith("_chimney"));
        addByPathPredicate(lookup, ModBlockTags.FLUES, path -> path.endsWith("_flue"));
        addByPathPredicate(lookup, ModBlockTags.BRICKS, path -> path.endsWith("bricks"));
        addByPathPredicate(lookup, ModBlockTags.FLOWER_BOXES, path -> path.endsWith("_flower_box"));
        addByPathPredicate(lookup, ModBlockTags.CONCRETE_BARRIERS, path -> path.endsWith("_concrete_barrier"));

        addByPathModPredicate(lookup, BlockTags.SLABS, path -> path.endsWith("_slab") || path.endsWith("_panel") || path.startsWith("drain_cover"));
        addByPathModPredicate(lookup, BlockTags.STAIRS, path -> path.endsWith("_stairs"));
        // addByPathModPredicate(lookup, BlockTags.FENCES, path -> path.endsWith("_fence")); Note: Too many different model types, can confuse other mods
        addByPathModPredicate(lookup, BlockTags.PRESSURE_PLATES, path -> path.endsWith("_pressure_plate"));
        addByPathModPredicate(lookup, BlockTags.BUTTONS, path -> path.endsWith("_button"));
        addByPathModPredicate(lookup, BlockTags.WALLS, path -> path.endsWith("_wall"));
        addByPathModPredicate(lookup, BlockTags.DEAD_BUSH_MAY_PLACE_ON, path -> path.endsWith("_flower_box"));
        addByPathModPredicate(lookup, BlockTags.MUSHROOM_GROW_BLOCK, path -> path.endsWith("_flower_box"));
        addByPathModPredicate(lookup, BlockTags.SMALL_DRIPLEAF_PLACEABLE, path -> path.endsWith("_flower_box"));
        addByPathModPredicate(lookup, BlockTags.DIRT, path -> path.endsWith("_flower_box"));

        addByPathModPredicate(lookup, ModBlockTags.GABION_FENCES, path -> path.endsWith("_gabion_fence"));
        addByPathModPredicate(lookup, ModBlockTags.THIN_FENCES, path -> path.endsWith("_fence") && !path.endsWith("iron_fence") && !path.contains("gabion"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_LAMPS, path -> path.endsWith("_lamp"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_CHISELED_CONCRETE, path -> path.contains("chiseled_concrete"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_CONCRETE_BUTTONS, path -> path.contains("concrete_button"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_POLISHED_CONCRETE, path -> path.contains("polished_concrete"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_CONCRETE_BRICKS, path -> path.contains("concrete_bricks"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_CONCRETE_CRACKED_BRICKS, path -> path.contains("concrete_cracked_bricks"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_CONCRETE_PILLARS, path -> path.contains("concrete_pillar"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_CONCRETE_BARRIERS, path -> path.contains("concrete_barrier"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_REINFORCED_CONCRETE, path -> path.contains("reinforced_concrete"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_CONCRETE_WALLS, path -> path.contains("concrete_wall"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_CONCRETE_STAIRS, path -> path.contains("concrete_stairs"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_CONCRETE_SLABS, path -> path.contains("concrete_slab"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_CONCRETE_PRESSURE_PLATES, path -> path.contains("concrete_pressure_plate"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_CONCRETE_LEVERS, path -> path.contains("concrete_laver"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_CRACKED_CONCRETE, path -> path.contains("cracked_concrete") && !path.contains("bricks"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_MOSSY_CONCRETE, path -> path.contains("concrete") && path.contains("mossy") && !path.contains("bricks"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_CONCRETE_CHIMNEYS, path -> path.contains("concrete_chimney"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_CONCRETE_FLOWER_BOXES, path -> path.contains("concrete_flower_box"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_BRICKS, path -> path.endsWith("bricks") && !path.contains("concrete"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_BRICK_STAIRS, path -> path.contains("brick_stair") && !path.contains("concrete"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_BRICK_SLABS, path -> path.contains("brick_slab") && !path.contains("concrete"));
        addByPathModPredicate(lookup, ModBlockTags.COLORED_BRICK_WALLS, path -> path.contains("brick_wall") && !path.contains("concrete"));

        tag(ModBlockTags.createBlockTag("c", "asphalt")).addTag(ModBlockTags.ASPHALT);
        tag(ModBlockTags.createBlockTag("c", "traffic_barrier")).addTag(ModBlockTags.TRAFFIC_BARRIERS);
        tag(ModBlockTags.createBlockTag("car", "drivable_blocks")).addTag(ModBlockTags.ASPHALT);

        addByPathModPredicate(lookup, BlockTags.MINEABLE_WITH_PICKAXE,
                path -> !path.contains("wood") || !path.contains("tape") || !path.contains("lighting_rod") || !path.contains("flower_box"));
    }


    private void addByPathPredicate(HolderLookup.RegistryLookup<Block> blockLookup, TagKey<Block> tag, Predicate<String> pathPredicate) {
        var appender = tag(tag);

        blockLookup.listElementIds().forEach(id -> {
            String ns = id.location().getNamespace();
            if (!References.MODID.equals(ns) && !"minecraft".equals(ns)) return;

            String path = id.location().getPath().toLowerCase(Locale.ROOT);

            try {
                if (pathPredicate.test(path)) {
                    ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, id.location());

                    CityCraft.LOGGER.info("Generate block tag with " + path);
                    appender.add(key);
                }
            } catch (Exception ignored) {
            }
        });

        appender.replace(false);
    }


    private void addByPathModPredicate(HolderLookup.RegistryLookup<Block> blockLookup, TagKey<Block> tag, Predicate<String> pathPredicate) {
        var appender = tag(tag);

        blockLookup.listElementIds().forEach(id -> {
            String ns = id.location().getNamespace();
            if (!References.MODID.equals(ns)) return;

            String path = id.location().getPath().toLowerCase(Locale.ROOT);

            try {
                if (pathPredicate.test(path)) {
                    ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, id.location());
                    CityCraft.LOGGER.info("Generate block tag with " + path);

                    appender.add(key);
                }
            } catch (Exception ignored) {
            }
        });

        appender.replace(false);
    }


    public static boolean isSpecialAsphalt(String path) {
        return path.contains("pothole") || path.contains("mossy") || path.contains("dirty") || path.contains("boost") || path.contains("cracked") || path.contains("asphalt_with");
    }

}
