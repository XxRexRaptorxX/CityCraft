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
    }

}