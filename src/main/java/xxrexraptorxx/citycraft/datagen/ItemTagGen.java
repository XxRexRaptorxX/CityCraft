package xxrexraptorxx.citycraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import xxrexraptorxx.citycraft.main.CityCraft;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.registry.ModBlockTags;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.registry.ModItemTags;
import xxrexraptorxx.citycraft.registry.ModItems;

import javax.annotation.Nullable;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class ItemTagGen extends ItemTagsProvider {

    public ItemTagGen(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider blockTagsProvider,
            @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagsProvider.contentsGetter(), References.MODID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        var lookup = provider.lookupOrThrow(Registries.ITEM);

        copy(ModBlockTags.BLANK_ASPHALT, ModItemTags.BLANK_ASPHALT);
        copy(ModBlockTags.BLANK_ASPHALT_SLABS, ModItemTags.BLANK_ASPHALT_SLABS);
        copy(ModBlockTags.WHITE_MARKED_ASPHALT, ModItemTags.WHITE_MARKED_ASPHALT);
        copy(ModBlockTags.WHITE_MARKED_ASPHALT_SLABS, ModItemTags.WHITE_MARKED_ASPHALT_SLABS);
        copy(ModBlockTags.YELLOW_MARKED_ASPHALT, ModItemTags.YELLOW_MARKED_ASPHALT);
        copy(ModBlockTags.YELLOW_MARKED_ASPHALT_SLABS, ModItemTags.YELLOW_MARKED_ASPHALT_SLABS);
        copy(ModBlockTags.ASPHALT_WITH_MARKINGS, ModItemTags.ASPHALT_WITH_MARKINGS);
        copy(ModBlockTags.ASPHALT_SLABS_WITH_MARKINGS, ModItemTags.ASPHALT_SLABS_WITH_MARKINGS);
        copy(ModBlockTags.SPEED_BOOST_BLOCKS, ModItemTags.SPEED_BOOST_BLOCKS);
        copy(ModBlockTags.ASPHALT, ModItemTags.ASPHALT);
        copy(ModBlockTags.TRAFFIC_BARRIERS, ModItemTags.TRAFFIC_BARRIERS);
        copy(ModBlockTags.POLES, ModItemTags.POLES);
        copy(ModBlockTags.POSTS, ModItemTags.POSTS);
        copy(ModBlockTags.CHIMNEYS, ModItemTags.CHIMNEYS);
        copy(ModBlockTags.FLUES, ModItemTags.FLUES);
        copy(ModBlockTags.FLOWER_BOXES, ModItemTags.FLOWER_BOXES);
        copy(ModBlockTags.COLORED_LAMPS, ModItemTags.COLORED_LAMPS);
        copy(ModBlockTags.COLORED_CHISELED_CONCRETE, ModItemTags.COLORED_CHISELED_CONCRETE);
        copy(ModBlockTags.COLORED_CONCRETE_BUTTONS, ModItemTags.COLORED_CONCRETE_BUTTONS);
        copy(ModBlockTags.COLORED_POLISHED_CONCRETE, ModItemTags.COLORED_POLISHED_CONCRETE);
        copy(ModBlockTags.COLORED_CONCRETE_BRICKS, ModItemTags.COLORED_CONCRETE_BRICKS);
        copy(ModBlockTags.COLORED_CONCRETE_CRACKED_BRICKS, ModItemTags.COLORED_CONCRETE_CRACKED_BRICKS);
        copy(ModBlockTags.COLORED_CONCRETE_PILLARS, ModItemTags.COLORED_CONCRETE_PILLARS);
        copy(ModBlockTags.COLORED_REINFORCED_CONCRETE, ModItemTags.COLORED_REINFORCED_CONCRETE);
        copy(ModBlockTags.COLORED_CONCRETE_WALLS, ModItemTags.COLORED_CONCRETE_WALLS);
        copy(ModBlockTags.COLORED_CONCRETE_STAIRS, ModItemTags.COLORED_CONCRETE_STAIRS);
        copy(ModBlockTags.COLORED_CONCRETE_SLABS, ModItemTags.COLORED_CONCRETE_SLABS);
        copy(ModBlockTags.COLORED_CONCRETE_PRESSURE_PLATES, ModItemTags.COLORED_CONCRETE_PRESSURE_PLATES);
        copy(ModBlockTags.COLORED_CONCRETE_LEVERS, ModItemTags.COLORED_CONCRETE_LEVERS);
        copy(ModBlockTags.COLORED_CRACKED_CONCRETE, ModItemTags.COLORED_CRACKED_CONCRETE);
        copy(ModBlockTags.COLORED_MOSSY_CONCRETE, ModItemTags.COLORED_MOSSY_CONCRETE);
        copy(ModBlockTags.COLORED_CONCRETE_CHIMNEYS, ModItemTags.COLORED_CONCRETE_CHIMNEYS);
        copy(ModBlockTags.COLORED_CONCRETE_FLOWER_BOXES, ModItemTags.COLORED_CONCRETE_FLOWER_BOXES);
        copy(ModBlockTags.COLORED_BRICKS, ModItemTags.COLORED_BRICKS);
        copy(ModBlockTags.COLORED_BRICK_SLABS, ModItemTags.COLORED_BRICK_SLABS);
        copy(ModBlockTags.COLORED_BRICK_STAIRS, ModItemTags.COLORED_BRICK_STAIRS);
        copy(ModBlockTags.COLORED_BRICK_WALLS, ModItemTags.COLORED_BRICK_WALLS);
        copy(ModBlockTags.THIN_FENCES, ModItemTags.THIN_FENCES);
        copy(ModBlockTags.GABION_FENCES, ModItemTags.GABION_FENCES);

        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.BUTTONS, ItemTags.BUTTONS);
        copy(BlockTags.FENCES, ItemTags.FENCES);
        copy(BlockTags.PRESSURE_PLATES, ModItemTags.createItemTag(ResourceLocation.DEFAULT_NAMESPACE, "pressure_plates"));
        copy(ModBlockTags.LEVERS, ModItemTags.createItemTag(ResourceLocation.DEFAULT_NAMESPACE, "levers"));

        addByPathPredicate(lookup, ModItemTags.CHAINS, path -> path.endsWith("_chain"));
        addByPathModPredicate(lookup, ModItemTags.NEON_LIGHTS, path -> path.endsWith("_neon_light"));

        addByPathModPredicate(lookup, ModItemTags.MARKED_ASPHALT_CRAFTING_MATERIALS, path -> (path.contains("asphalt_with_yellow") && !path.contains("slab")));
        addByPathModPredicate(lookup, ModItemTags.MARKED_ASPHALT_CRAFTING_MATERIALS, path -> (path.contains("asphalt_with_white") && !path.contains("slab")));
        addByPathModPredicate(lookup, ModItemTags.MARKED_ASPHALT_CRAFTING_MATERIALS, path -> (path.contains("asphalt_with_white") && path.contains("slab")));
        addByPathModPredicate(lookup, ModItemTags.MARKED_ASPHALT_CRAFTING_MATERIALS, path -> (path.contains("asphalt_with_yellow") && path.contains("slab")));
        tag(ModItemTags.MARKED_ASPHALT_CRAFTING_MATERIALS).add(ModBlocks.ASPHALT_BLOCK.get().asItem());
        tag(ModItemTags.MARKED_ASPHALT_SLAB_CRAFTING_MATERIALS).add(ModBlocks.ASPHALT_SLAB.get().asItem());

        addByPathMCPredicate(lookup, ModItemTags.SIGNS_WOOD, path -> path.endsWith("_sign") && !path.contains("hanging") && !isNetherWood(path));
        addByPathMCPredicate(lookup, ModItemTags.HANGING_WOOD_SIGNS, path -> path.endsWith("hanging_sign") && !isNetherWood(path));

        tag(ModItemTags.createItemTag("c", "dyes/mix")).add(ModItems.DYE_MIX.get());
        tag(Tags.Items.DYES).addTag(ModItemTags.createItemTag("c", "dyes/mix"));
        tag(ModItemTags.createItemTag("c", "dusts/asphalt")).add(ModItems.ASPHALT_MIXTURE.get());
        tag(Tags.Items.DUSTS).addTag(ModItemTags.createItemTag("c", "dusts/asphalt"));
        tag(ItemTags.COALS).add(ModItems.COAL_COKE.get());
        tag(ModItemTags.IRON_RODS).add(ModItems.IRON_ROD.get());
        tag(Tags.Items.RODS).addTag(ModItemTags.IRON_RODS);

        addByPathModPredicate(lookup, Tags.Items.DYED_BLACK, path -> (path.contains("black")));
        addByPathModPredicate(lookup, Tags.Items.DYED_WHITE, path -> (path.contains("white")));
        addByPathModPredicate(lookup, Tags.Items.DYED_ORANGE, path -> (path.contains("orange")));
        addByPathModPredicate(lookup, Tags.Items.DYED_MAGENTA, path -> (path.contains("magenta")));
        addByPathModPredicate(lookup, Tags.Items.DYED_LIGHT_BLUE, path -> (path.contains("light_blue")));
        addByPathModPredicate(lookup, Tags.Items.DYED_YELLOW, path -> (path.contains("yellow")));
        addByPathModPredicate(lookup, Tags.Items.DYED_LIME, path -> (path.contains("lime")));
        addByPathModPredicate(lookup, Tags.Items.DYED_PINK, path -> (path.contains("pink")));
        addByPathModPredicate(lookup, Tags.Items.DYED_GRAY, path -> (path.contains("gray") && !path.contains("light")));
        addByPathModPredicate(lookup, Tags.Items.DYED_LIGHT_GRAY, path -> (path.contains("light_gray")));
        addByPathModPredicate(lookup, Tags.Items.DYED_CYAN, path -> (path.contains("cyan")));
        addByPathModPredicate(lookup, Tags.Items.DYED_PURPLE, path -> (path.contains("purple")));
        addByPathModPredicate(lookup, Tags.Items.DYED_BLUE, path -> (path.contains("blue") && !path.contains("light")));
        addByPathModPredicate(lookup, Tags.Items.DYED_BROWN, path -> (path.contains("brown")));
        addByPathModPredicate(lookup, Tags.Items.DYED_GREEN, path -> (path.contains("green")));
        addByPathModPredicate(lookup, Tags.Items.DYED_RED, path -> (path.contains("red")));
    }


    public static boolean isNetherWood(String path) {
        return path.contains("crimson") || path.contains("warped");
    }


    private void addByPathPredicate(HolderLookup.RegistryLookup<Item> blockLookup, TagKey<Item> tag, Predicate<String> pathPredicate) {
        var appender = tag(tag);

        blockLookup.listElementIds().forEach(id -> {
            String ns = id.location().getNamespace();
            if (!References.MODID.equals(ns) && !"minecraft".equals(ns)) return;

            String path = id.location().getPath().toLowerCase(Locale.ROOT);

            try {
                if (pathPredicate.test(path)) {
                    ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id.location());
                    CityCraft.LOGGER.info("Generate item tag with " + path);

                    appender.add(key);
                }
            } catch (Exception ignored) {
            }
        });

        appender.replace(false);
    }


    private void addByPathModPredicate(HolderLookup.RegistryLookup<Item> blockLookup, TagKey<Item> tag, Predicate<String> pathPredicate) {
        var appender = tag(tag);

        blockLookup.listElementIds().forEach(id -> {
            String ns = id.location().getNamespace();
            if (!References.MODID.equals(ns)) return;

            String path = id.location().getPath().toLowerCase(Locale.ROOT);

            try {
                if (pathPredicate.test(path)) {
                    ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id.location());
                    CityCraft.LOGGER.info("Generate item tag with " + path);

                    appender.add(key);
                }
            } catch (Exception ignored) {
            }
        });

        appender.replace(false);
    }


    private void addByPathMCPredicate(HolderLookup.RegistryLookup<Item> blockLookup, TagKey<Item> tag, Predicate<String> pathPredicate) {
        var appender = tag(tag);

        blockLookup.listElementIds().forEach(id -> {
            String ns = id.location().getNamespace();
            if (!"minecraft".equals(ns)) return;

            String path = id.location().getPath().toLowerCase(Locale.ROOT);

            try {
                if (pathPredicate.test(path)) {
                    ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id.location());
                    CityCraft.LOGGER.info("Generate item tag with " + path);

                    appender.add(key);
                }
            } catch (Exception ignored) {
            }
        });

        appender.replace(false);
    }
}
