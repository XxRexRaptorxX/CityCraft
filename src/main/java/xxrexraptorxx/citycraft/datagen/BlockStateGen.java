package xxrexraptorxx.citycraft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.registry.ModBlocks;

public class BlockStateGen extends BlockStateProvider {


    public BlockStateGen(PackOutput packOutput, ExistingFileHelper exFileHelper) {
        super(packOutput, References.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.ASPHALT_BLOCK.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_HATCHING.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_FRAME.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_EDGE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_SIDE_ARROW.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_SIDE_ARROW.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE.get());
        simpleBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING.get());
        simpleBlock(ModBlocks.WHITE_ASPHALT.get());
        simpleBlock(ModBlocks.ORANGE_ASPHALT.get());
        simpleBlock(ModBlocks.MAGENTA_ASPHALT.get());
        simpleBlock(ModBlocks.LIGHT_BLUE_ASPHALT.get());
        simpleBlock(ModBlocks.YELLOW_ASPHALT.get());
        simpleBlock(ModBlocks.LIME_ASPHALT.get());
        simpleBlock(ModBlocks.PINK_ASPHALT.get());
        simpleBlock(ModBlocks.RED_ASPHALT.get());
        simpleBlock(ModBlocks.GRAY_ASPHALT.get());
        simpleBlock(ModBlocks.LIGHT_GRAY_ASPHALT.get());
        simpleBlock(ModBlocks.CYAN_ASPHALT.get());
        simpleBlock(ModBlocks.PURPLE_ASPHALT.get());
        simpleBlock(ModBlocks.BLUE_ASPHALT.get());
        simpleBlock(ModBlocks.BROWN_ASPHALT.get());
        simpleBlock(ModBlocks.GREEN_ASPHALT.get());
        simpleBlock(ModBlocks.RED_ASPHALT.get());
    }

}