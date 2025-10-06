package xxrexraptorxx.citycraft.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import xxrexraptorxx.citycraft.blocks.StepBarrierBlock;
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
        itemGenerated(ModItems.IRON_ROD);

        itemGenerated(ModBlocks.WHITE_CHAIN);
        itemGenerated(ModBlocks.RED_CHAIN);
        itemGenerated(ModBlocks.BLACK_CHAIN);
        itemGenerated(ModBlocks.YELLOW_CHAIN);

        itemBlock(ModBlocks.IRON_LADDER);

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

        wallItem(ModBlocks.BLACK_BRICK_WALL, ModBlocks.BLACK_BRICKS.get());
        wallItem(ModBlocks.WHITE_BRICK_WALL, ModBlocks.WHITE_BRICKS.get());
        wallItem(ModBlocks.ORANGE_BRICK_WALL, ModBlocks.ORANGE_BRICKS.get());
        wallItem(ModBlocks.MAGENTA_BRICK_WALL, ModBlocks.MAGENTA_BRICKS.get());
        wallItem(ModBlocks.LIGHT_BLUE_BRICK_WALL, ModBlocks.LIGHT_BLUE_BRICKS.get());
        wallItem(ModBlocks.YELLOW_BRICK_WALL, ModBlocks.YELLOW_BRICKS.get());
        wallItem(ModBlocks.LIME_BRICK_WALL, ModBlocks.LIME_BRICKS.get());
        wallItem(ModBlocks.PINK_BRICK_WALL, ModBlocks.PINK_BRICKS.get());
        wallItem(ModBlocks.GRAY_BRICK_WALL, ModBlocks.GRAY_BRICKS.get());
        wallItem(ModBlocks.LIGHT_GRAY_BRICK_WALL, ModBlocks.LIGHT_GRAY_BRICKS.get());
        wallItem(ModBlocks.CYAN_BRICK_WALL, ModBlocks.CYAN_BRICKS.get());
        wallItem(ModBlocks.PURPLE_BRICK_WALL, ModBlocks.PURPLE_BRICKS.get());
        wallItem(ModBlocks.BLUE_BRICK_WALL, ModBlocks.BLUE_BRICKS.get());
        wallItem(ModBlocks.BROWN_BRICK_WALL, ModBlocks.BROWN_BRICKS.get());
        wallItem(ModBlocks.GREEN_BRICK_WALL, ModBlocks.GREEN_BRICKS.get());
        wallItem(ModBlocks.RED_BRICK_WALL, ModBlocks.RED_BRICKS.get());

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

        leverItem(ModBlocks.BLACK_CONCRETE_LEVER);
        leverItem(ModBlocks.WHITE_CONCRETE_LEVER);
        leverItem(ModBlocks.ORANGE_CONCRETE_LEVER);
        leverItem(ModBlocks.MAGENTA_CONCRETE_LEVER);
        leverItem(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER);
        leverItem(ModBlocks.YELLOW_CONCRETE_LEVER);
        leverItem(ModBlocks.LIME_CONCRETE_LEVER);
        leverItem(ModBlocks.PINK_CONCRETE_LEVER);
        leverItem(ModBlocks.GRAY_CONCRETE_LEVER);
        leverItem(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER);
        leverItem(ModBlocks.CYAN_CONCRETE_LEVER);
        leverItem(ModBlocks.PURPLE_CONCRETE_LEVER);
        leverItem(ModBlocks.BLUE_CONCRETE_LEVER);
        leverItem(ModBlocks.BROWN_CONCRETE_LEVER);
        leverItem(ModBlocks.GREEN_CONCRETE_LEVER);
        leverItem(ModBlocks.RED_CONCRETE_LEVER);

        generateBarrierInventoryModel(ModBlocks.BLACK_CONCRETE_BARRIER, Blocks.BLACK_CONCRETE);
        generateBarrierInventoryModel(ModBlocks.WHITE_CONCRETE_BARRIER, Blocks.WHITE_CONCRETE);
        generateBarrierInventoryModel(ModBlocks.ORANGE_CONCRETE_BARRIER, Blocks.ORANGE_CONCRETE);
        generateBarrierInventoryModel(ModBlocks.MAGENTA_CONCRETE_BARRIER, Blocks.MAGENTA_CONCRETE);
        generateBarrierInventoryModel(ModBlocks.LIGHT_BLUE_CONCRETE_BARRIER, Blocks.LIGHT_BLUE_CONCRETE);
        generateBarrierInventoryModel(ModBlocks.YELLOW_CONCRETE_BARRIER, Blocks.YELLOW_CONCRETE);
        generateBarrierInventoryModel(ModBlocks.LIME_CONCRETE_BARRIER, Blocks.LIME_CONCRETE);
        generateBarrierInventoryModel(ModBlocks.PINK_CONCRETE_BARRIER, Blocks.PINK_CONCRETE);
        generateBarrierInventoryModel(ModBlocks.GRAY_CONCRETE_BARRIER, Blocks.GRAY_CONCRETE);
        generateBarrierInventoryModel(ModBlocks.LIGHT_GRAY_CONCRETE_BARRIER, Blocks.LIGHT_GRAY_CONCRETE);
        generateBarrierInventoryModel(ModBlocks.CYAN_CONCRETE_BARRIER, Blocks.CYAN_CONCRETE);
        generateBarrierInventoryModel(ModBlocks.PURPLE_CONCRETE_BARRIER, Blocks.PURPLE_CONCRETE);
        generateBarrierInventoryModel(ModBlocks.BLUE_CONCRETE_BARRIER, Blocks.BLUE_CONCRETE);
        generateBarrierInventoryModel(ModBlocks.BROWN_CONCRETE_BARRIER, Blocks.BROWN_CONCRETE);
        generateBarrierInventoryModel(ModBlocks.GREEN_CONCRETE_BARRIER, Blocks.GREEN_CONCRETE);
        generateBarrierInventoryModel(ModBlocks.RED_CONCRETE_BARRIER, Blocks.RED_CONCRETE);

        itemGenerated(ModBlocks.WIRE_FENCE, "block");
        itemGenerated(ModBlocks.CHAIN_LINK_FENCE, "block");
        itemGenerated(ModBlocks.MESH_FENCE, "block");
        itemGenerated(ModBlocks.BARBED_WIRE_FENCE, "block");
    }


    private void itemGenerated(DeferredItem item) {
        singleTexture(item.getId().getPath(), ResourceLocation.withDefaultNamespace(ITEM_FOLDER + "/generated"), "layer0",
                ResourceLocation.fromNamespaceAndPath(References.MODID, "item/" + item.getId().getPath()));
    }


    private void itemGenerated(DeferredBlock item) {
        itemGenerated(item, "item");
    }


    private void itemGenerated(DeferredBlock item, String textureFolder) {
        singleTexture(item.getId().getPath(), ResourceLocation.withDefaultNamespace(ITEM_FOLDER + "/generated"), "layer0",
                ResourceLocation.fromNamespaceAndPath(References.MODID, textureFolder + "/" + item.getId().getPath()));
    }


    private void itemHandheld(DeferredItem item) {
        singleTexture(item.getId().getPath(), ResourceLocation.withDefaultNamespace(ITEM_FOLDER + "/handheld"), "layer0",
                ResourceLocation.fromNamespaceAndPath(References.MODID, "item/" + item.getId().getPath()));
    }


    private void itemBlock(DeferredBlock item) {
        withExistingParent(item.getId().getPath(), modLoc("block/" + item.getId().getPath()));
    }


    public void wallItem(DeferredBlock<WallBlock> block, Block textureBlock) {
        generateInventoryModel(block, textureBlock, "wall", "wall");

    }


    public void fenceItem(DeferredBlock<FenceBlock> block, Block textureBlock) {
        generateInventoryModel(block, textureBlock, "fence");
    }


    private void buttonItem(DeferredBlock<ButtonBlock> block, Block textureBlock) {
        generateInventoryModel(block, textureBlock, "button");
    }


    private void generateInventoryModel(DeferredBlock<?> block, Block textureBlock, String modelName) {
        generateInventoryModel(block, textureBlock, modelName, "texture");
    }


    private void generateInventoryModel(DeferredBlock<?> block, Block textureBlock, String modelName, String textureKeyName) {
        this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block.get()).getPath(), mcLoc(BLOCK_FOLDER + "/" + modelName + "_inventory")).texture(textureKeyName,
                ResourceLocation.fromNamespaceAndPath(BuiltInRegistries.BLOCK.getKey(textureBlock).getNamespace(),
                        "block/" + BuiltInRegistries.BLOCK.getKey(textureBlock).getPath()));
    }


    private void generateBarrierInventoryModel(DeferredBlock<StepBarrierBlock> block, Block textureBlock) {
        this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block.get()).getPath(), modLoc(BLOCK_FOLDER + "/" + "step_barrier_inventory")).texture("texture", ResourceLocation
                .fromNamespaceAndPath(BuiltInRegistries.BLOCK.getKey(textureBlock).getNamespace(), "block/" + BuiltInRegistries.BLOCK.getKey(textureBlock).getPath()));
    }


    private void leverItem(DeferredBlock<LeverBlock> block) {
        singleTexture(block.getId().getPath(), ResourceLocation.withDefaultNamespace(ITEM_FOLDER + "/generated"), "layer0",
                ResourceLocation.fromNamespaceAndPath(block.getId().getNamespace(), "block/" + block.getId().getPath()));
    }
}
