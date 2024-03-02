package xxrexraptorxx.citycraft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.registry.ModBlocks;

public class ItemModelGen extends ItemModelProvider {

    public ItemModelGen(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, References.MODID, existingFileHelper);
    }


    @Override
    protected void registerModels() {
        //itemBlock(ModBlocks.ASPHALT_BLOCK);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_HATCHING);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_FRAME);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_EDGE);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_SIDE_ARROW);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_SIDE_ARROW);
        //itemBlock(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW);

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

}
