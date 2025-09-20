package xxrexraptorxx.citycraft.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.registry.ModItems;

public class ItemModelGen extends ItemModelProvider {

    public ItemModelGen(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, References.MODID, existingFileHelper);
    }


    @Override
    protected void registerModels() {
        itemGenerated(ModItems.COAL_COKE);
        itemGenerated(ModItems.COAL_TAR);
        itemGenerated(ModItems.ASPHALT_MIXTURE);
        itemGenerated(ModItems.DYE_MIX);

        itemGenerated(ModBlocks.WHITE_CHAIN);
        itemGenerated(ModBlocks.RED_CHAIN);
        itemGenerated(ModBlocks.BLACK_CHAIN);
        itemGenerated(ModBlocks.YELLOW_CHAIN);

        fenceItem(ModBlocks.IRON_FENCE, ModBlocks.IRON_POLE.get());

        wallItem(ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
        wallItem(ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
        wallItem(ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
        wallItem(ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
        wallItem(ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
        wallItem(ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
        wallItem(ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
        wallItem(ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
        wallItem(ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
        wallItem(ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
        wallItem(ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
        wallItem(ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
        wallItem(ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
        wallItem(ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
        wallItem(ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
        wallItem(ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);

        buttonItem(ModBlocks.BLACK_CONCRETE_BUTTON, Blocks.BLACK_CONCRETE);
        buttonItem(ModBlocks.WHITE_CONCRETE_BUTTON, Blocks.WHITE_CONCRETE);
        buttonItem(ModBlocks.ORANGE_CONCRETE_BUTTON, Blocks.ORANGE_CONCRETE);
        buttonItem(ModBlocks.MAGENTA_CONCRETE_BUTTON, Blocks.MAGENTA_CONCRETE);
        buttonItem(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON, Blocks.LIGHT_BLUE_CONCRETE);
        buttonItem(ModBlocks.YELLOW_CONCRETE_BUTTON, Blocks.YELLOW_CONCRETE);
        buttonItem(ModBlocks.LIME_CONCRETE_BUTTON, Blocks.LIME_CONCRETE);
        buttonItem(ModBlocks.PINK_CONCRETE_BUTTON, Blocks.PINK_CONCRETE);
        buttonItem(ModBlocks.GRAY_CONCRETE_BUTTON, Blocks.GRAY_CONCRETE);
        buttonItem(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON, Blocks.LIGHT_GRAY_CONCRETE);
        buttonItem(ModBlocks.CYAN_CONCRETE_BUTTON, Blocks.CYAN_CONCRETE);
        buttonItem(ModBlocks.PURPLE_CONCRETE_BUTTON, Blocks.PURPLE_CONCRETE);
        buttonItem(ModBlocks.BLUE_CONCRETE_BUTTON, Blocks.BLUE_CONCRETE);
        buttonItem(ModBlocks.BROWN_CONCRETE_BUTTON, Blocks.BROWN_CONCRETE);
        buttonItem(ModBlocks.GREEN_CONCRETE_BUTTON, Blocks.GREEN_CONCRETE);
        buttonItem(ModBlocks.RED_CONCRETE_BUTTON, Blocks.RED_CONCRETE);

        itemBlock(ModBlocks.RED_WHITE_BARRIER_TAPE);
        itemBlock(ModBlocks.YELLOW_BLACK_BARRIER_TAPE);
    }


    private void itemGenerated(DeferredItem item) {
        singleTexture(item.getId().getPath(), ResourceLocation.withDefaultNamespace(ITEM_FOLDER + "/generated"), "layer0",
                ResourceLocation.fromNamespaceAndPath(References.MODID, "item/" + item.getId().getPath()));
    }


    private void itemGenerated(DeferredBlock item) {
        singleTexture(item.getId().getPath(), ResourceLocation.withDefaultNamespace(ITEM_FOLDER + "/generated"), "layer0",
                ResourceLocation.fromNamespaceAndPath(References.MODID, "item/" + item.getId().getPath()));
    }


    private void itemHandheld(DeferredItem item) {
        singleTexture(item.getId().getPath(), ResourceLocation.withDefaultNamespace(ITEM_FOLDER + "/handheld"), "layer0",
                ResourceLocation.fromNamespaceAndPath(References.MODID, "item/" + item.getId().getPath()));
    }


    private void itemBlock(DeferredBlock item) {
        withExistingParent(item.getId().getPath(), modLoc("block/" + item.getId().getPath()));
    }


    public void fenceItem(DeferredBlock<FenceBlock> block, Block textureBlock) {
        this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block.get()).getPath(), mcLoc(BLOCK_FOLDER + "/fence_inventory")).texture("texture",
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/" + BuiltInRegistries.BLOCK.getKey(textureBlock).getPath()));
    }


    public void wallItem(DeferredBlock<WallBlock> block, Block textureBlock) {
        this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block.get()).getPath(), mcLoc(BLOCK_FOLDER + "/wall_inventory")).texture("wall",
                ResourceLocation.withDefaultNamespace("block/" + BuiltInRegistries.BLOCK.getKey(textureBlock).getPath()));
    }

    private void buttonItem(DeferredBlock<ButtonBlock> block, Block textureBlock) {
        this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block.get()).getPath(), mcLoc(BLOCK_FOLDER + "/button_inventory")).texture("texture",
                ResourceLocation.withDefaultNamespace("block/" + BuiltInRegistries.BLOCK.getKey(textureBlock).getPath()));
    }
}
