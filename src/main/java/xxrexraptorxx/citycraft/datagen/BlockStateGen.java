package xxrexraptorxx.citycraft.datagen;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import xxrexraptorxx.citycraft.blocks.AsphaltBlock;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.registry.ModBlocks;

public class BlockStateGen extends BlockStateProvider {


    public BlockStateGen(PackOutput packOutput, ExistingFileHelper exFileHelper) {
        super(packOutput, References.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.ASPHALT_BLOCK.get());
        simpleBlock(ModBlocks.CRACKED_ASPHALT.get());
        simpleBlock(ModBlocks.POTHOLE_ASPHALT.get());
        simpleBlock(ModBlocks.MOSSY_ASPHALT.get());
        simpleBlock(ModBlocks.DIRTY_ASPHALT.get());

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

        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_HATCHING.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_FRAME.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_SIDE_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_SIDE_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING.get());

        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_FRAME.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_SIDE_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING.get());


        //ITEM BLOCK MODELS
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_BLOCK.get());
        makeBlockItemFromExistingModel(ModBlocks.CRACKED_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.POTHOLE_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.MOSSY_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.DIRTY_ASPHALT.get());

        makeBlockItemFromExistingModel(ModBlocks.WHITE_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.ORANGE_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.MAGENTA_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.LIGHT_BLUE_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.YELLOW_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.LIME_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.PINK_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.RED_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.GRAY_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.LIGHT_GRAY_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.CYAN_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.PURPLE_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.BLUE_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.BROWN_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.GREEN_ASPHALT.get());

        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_HATCHING.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_FRAME.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_EDGE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_SIDE_ARROW.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_SIDE_ARROW.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING.get());

        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_FRAME.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_EDGE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_ARROW.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_SIDE_ARROW.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING.get());
    }


    private void makeBlockItemFromExistingModel(Block block) {
        final ModelFile model = models().getExistingFile(BuiltInRegistries.BLOCK.getKey(block));
        simpleBlockItem(block, model);
    }


    private void directionalAsphaltBlock(Block block) {
        String asphaltTexture = BuiltInRegistries.BLOCK.getKey(ModBlocks.ASPHALT_BLOCK.get()).getPath();
        String blockTexture = BuiltInRegistries.BLOCK.getKey(block).getPath();

        getVariantBuilder(block)
                .forAllStates(state -> {

                ModelFile model = models()
                        .cube(blockTexture,
                                modLoc("block/" + blockTexture),   //down
                                modLoc("block/" + blockTexture),    //up
                                modLoc("block/" + blockTexture),  //north
                                modLoc("block/" + blockTexture),   //south
                                modLoc("block/" + asphaltTexture),   //east
                                modLoc("block/" + asphaltTexture))  //west

                        .texture("particle", modLoc("block/" + asphaltTexture));

        Direction dir = state.getValue(AsphaltBlock.FACING);
        int x = 0;
        int y = 0;

        switch (dir) {
            case EAST:
                y = 270;
                break;
            case NORTH:
                y = 180;
                break;
            case SOUTH:
                break;
            case WEST:
                y = 90;
                break;
            default:
                break;
        }

        return ConfiguredModel.builder()
                .modelFile(model)
                .rotationX(x)
                .rotationY(y)
                .build();
        });
    }

}