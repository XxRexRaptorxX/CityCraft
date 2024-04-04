package xxrexraptorxx.citycraft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
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

        itemGenerated(ModBlocks.WHITE_CHAIN);
        itemGenerated(ModBlocks.RED_CHAIN);
        itemGenerated(ModBlocks.BLACK_CHAIN);
        itemGenerated(ModBlocks.YELLOW_CHAIN);

        fenceItem(ModBlocks.IRON_FENCE, ModBlocks.IRON_POLE);
    }



    private void itemGenerated(RegistryObject item) {
        singleTexture(item.getId().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/" + item.getId().getPath()));
    }

    private void itemHandheld(RegistryObject item) {
        singleTexture(item.getId().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(References.MODID, "item/" + item.getId().getPath()));
    }

    private void itemBlock(RegistryObject item) {
        withExistingParent(item.getId().getPath(), modLoc( "block/" + item.getId().getPath()));
    }

    public void fenceItem(RegistryObject<FenceBlock> block, RegistryObject<Block> textureBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(References.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(textureBlock.get()).getPath()));
    }

}
