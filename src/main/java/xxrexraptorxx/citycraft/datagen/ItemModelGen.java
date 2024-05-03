package xxrexraptorxx.citycraft.datagen;

//import net.minecraft.data.DataGenerator;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.Blocks;
//import net.minecraft.world.level.block.FenceBlock;
//import net.minecraft.world.level.block.WallBlock;
//import net.minecraftforge.client.model.generators.ItemModelProvider;
//import net.minecraftforge.common.data.ExistingFileHelper;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
//import xxrexraptorxx.citycraft.main.References;
//import xxrexraptorxx.citycraft.registry.ModBlocks;
//import xxrexraptorxx.citycraft.registry.ModItems;
//
//public class ItemModelGen extends ItemModelProvider {
//
//    public ItemModelGen(DataGenerator generator, ExistingFileHelper existingFileHelper) {
//        super(generator, References.MODID, existingFileHelper);
//
//
//    @Override
//    protected void registerModels() {
//        itemGenerated(ModItems.COAL_COKE);
//        itemGenerated(ModItems.COAL_TAR);
//        itemGenerated(ModItems.ASPHALT_MIXTURE);
//        itemGenerated(ModItems.DYE_MIX);
//
//        itemGenerated(ModBlocks.WHITE_CHAIN);
//        itemGenerated(ModBlocks.RED_CHAIN);
//        itemGenerated(ModBlocks.BLACK_CHAIN);
//        itemGenerated(ModBlocks.YELLOW_CHAIN);
//
//        fenceItem(ModBlocks.IRON_FENCE, ModBlocks.IRON_POLE);
//
//        wallItem(ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
//        wallItem(ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
//        wallItem(ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
//        wallItem(ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
//        wallItem(ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
//        wallItem(ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
//        wallItem(ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
//        wallItem(ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
//        wallItem(ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
//        wallItem(ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
//        wallItem(ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
//        wallItem(ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
//        wallItem(ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
//        wallItem(ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
//        wallItem(ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
//        wallItem(ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
//    }
//
//
//
//    private void itemGenerated(RegistryObject item) {
//        singleTexture(item.getId().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/" + item.getId().getPath()));
//    }
//
//    private void itemHandheld(RegistryObject item) {
//        singleTexture(item.getId().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(References.MODID, "item/" + item.getId().getPath()));
//    }
//
//    private void itemBlock(RegistryObject item) {
//        withExistingParent(item.getId().getPath(), modLoc( "block/" + item.getId().getPath()));
//    }
//
//    public void fenceItem(RegistryObject<FenceBlock> block, RegistryObject<Block> textureBlock) {
//        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
//                .texture("texture",  new ResourceLocation(References.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(textureBlock.get()).getPath()));
//    }
//
//    public void wallItem(RegistryObject<WallBlock> block, Block textureBlock) {
//        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
//                .texture("wall",  new ResourceLocation( "minecraft:block/" + ForgeRegistries.BLOCKS.getKey(textureBlock).getPath()));
//    }
//
//}
