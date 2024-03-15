package xxrexraptorxx.citycraft.datagen;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import xxrexraptorxx.citycraft.blocks.AsphaltBlock;
import xxrexraptorxx.citycraft.blocks.AsphaltSlabBlock;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.registry.ModBlocks;

public class BlockStateGen extends BlockStateProvider {


    public BlockStateGen(PackOutput packOutput, ExistingFileHelper exFileHelper) {
        super(packOutput, References.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.ASPHALT_BLOCK.get());
        makeBlockItemFromExistingModel(ModBlocks.ASPHALT_BLOCK.get());
        simpleBlock(ModBlocks.CRACKED_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.CRACKED_ASPHALT.get());
        simpleBlock(ModBlocks.POTHOLE_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.POTHOLE_ASPHALT.get());
        simpleBlock(ModBlocks.MOSSY_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.MOSSY_ASPHALT.get());
        simpleBlock(ModBlocks.DIRTY_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.DIRTY_ASPHALT.get());

        simpleBlock(ModBlocks.WHITE_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.WHITE_ASPHALT.get());
        simpleBlock(ModBlocks.ORANGE_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.ORANGE_ASPHALT.get());
        simpleBlock(ModBlocks.MAGENTA_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.MAGENTA_ASPHALT.get());
        simpleBlock(ModBlocks.LIGHT_BLUE_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.LIGHT_BLUE_ASPHALT.get());
        simpleBlock(ModBlocks.YELLOW_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.YELLOW_ASPHALT.get());
        simpleBlock(ModBlocks.LIME_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.LIME_ASPHALT.get());
        simpleBlock(ModBlocks.PINK_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.PINK_ASPHALT.get());
        simpleBlock(ModBlocks.RED_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.RED_ASPHALT.get());
        simpleBlock(ModBlocks.GRAY_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.GRAY_ASPHALT.get());
        simpleBlock(ModBlocks.LIGHT_GRAY_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.LIGHT_GRAY_ASPHALT.get());
        simpleBlock(ModBlocks.CYAN_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.CYAN_ASPHALT.get());
        simpleBlock(ModBlocks.PURPLE_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.PURPLE_ASPHALT.get());
        simpleBlock(ModBlocks.BLUE_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.BLUE_ASPHALT.get());
        simpleBlock(ModBlocks.BROWN_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.BROWN_ASPHALT.get());
        simpleBlock(ModBlocks.GREEN_ASPHALT.get());
        makeBlockItemFromExistingModel(ModBlocks.GREEN_ASPHALT.get());

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
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW.get());
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
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW.get());
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


        asphaltSlab(ModBlocks.ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.CRACKED_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.POTHOLE_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.MOSSY_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.DIRTY_ASPHALT_SLAB.get());

        asphaltSlab(ModBlocks.WHITE_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.ORANGE_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.MAGENTA_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.LIGHT_BLUE_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.YELLOW_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.LIME_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.PINK_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.RED_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.GRAY_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.LIGHT_GRAY_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.CYAN_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.PURPLE_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.BLUE_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.BROWN_ASPHALT_SLAB.get());
        asphaltSlab(ModBlocks.GREEN_ASPHALT_SLAB.get());

        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_HATCHING_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_FRAME_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING_SLAB.get());

        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_FRAME_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING_SLAB.get());

        directionalAsphaltBlock(ModBlocks.BOOST_ASPHALT.get());
        directionalAsphaltSlab(ModBlocks.BOOST_ASPHALT_SLAB.get());

        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_A.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_B.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_C.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_D.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_E.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_F.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_G.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_H.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_I.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_J.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_K.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_L.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_M.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_N.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_O.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_P.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_Q.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_R.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_S.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_T.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_U.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_V.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_W.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_X.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_Y.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_Z.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_A.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_B.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_C.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_D.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_E.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_F.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_G.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_H.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_I.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_J.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_K.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_L.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_M.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_N.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_O.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_P.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_Q.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_R.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_S.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_T.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_U.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_V.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_W.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_X.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_Y.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_Z.get());

        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_A_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_B_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_C_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_D_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_E_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_F_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_G_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_H_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_I_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_J_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_K_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_L_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_M_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_N_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_O_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_P_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_Q_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_R_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_S_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_T_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_U_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_V_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_W_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_X_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_Y_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_Z_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_A_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_B_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_C_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_D_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_E_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_F_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_G_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_H_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_I_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_J_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_K_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_L_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_M_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_N_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_O_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_P_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_Q_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_R_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_S_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_T_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_U_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_V_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_W_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_X_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_Y_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_Z_SLAB.get());
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

                    ModelFile model = models().withExistingParent(blockTexture, References.MODID + ":block/directional_cube")
                            .texture("down", "block/" + blockTexture)   //down
                            .texture("up", "block/" + blockTexture)    //up
                            .texture("north", "block/" + blockTexture)  //north
                            .texture("south", "block/" + blockTexture)   //south
                            .texture("east", "block/" + asphaltTexture)   //east
                            .texture("west", "block/" + asphaltTexture)  //west
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

        makeBlockItemFromExistingModel(block);
    }


    private void asphaltSlab(Block block) {
        String blockTexture = BuiltInRegistries.BLOCK.getKey(block).getPath().replace("_slab", "");

        slabBlock((SlabBlock) block, modLoc("block/" + blockTexture), modLoc("block/" + blockTexture));
        makeBlockItemFromExistingModel(block);
    }


    private void directionalAsphaltSlab(Block block) {
        String asphaltTexture = BuiltInRegistries.BLOCK.getKey(ModBlocks.ASPHALT_BLOCK.get()).getPath();
        String blockTexture = BuiltInRegistries.BLOCK.getKey(block).getPath().replace("_slab", "");

        ModelFile bottom = models().withExistingParent(blockTexture + "_slab", References.MODID + ":block/directional_slab")
                .texture("down", "block/" + blockTexture)   //down
                .texture("up", "block/" + blockTexture)    //up
                .texture("north", "block/" + blockTexture)  //north
                .texture("south", "block/" + blockTexture)   //south
                .texture("east", "block/" + asphaltTexture)   //east
                .texture("west", "block/" + asphaltTexture)  //west
                .texture("particle", modLoc("block/" + asphaltTexture));

        ModelFile top = models().withExistingParent(blockTexture + "_slab_top", References.MODID + ":block/directional_slab_top")
                .texture("down", "block/" + blockTexture)   //down
                .texture("up", "block/" + blockTexture)    //up
                .texture("north", "block/" + blockTexture)  //north
                .texture("south", "block/" + blockTexture)   //south
                .texture("east", "block/" + asphaltTexture)   //east
                .texture("west", "block/" + asphaltTexture)  //west
                .texture("particle", modLoc("block/" + asphaltTexture));

        ModelFile full = models().withExistingParent(blockTexture, References.MODID + ":block/directional_cube")
                .texture("down", "block/" + blockTexture)   //down
                .texture("up", "block/" + blockTexture)    //up
                .texture("north", "block/" + blockTexture)  //north
                .texture("south", "block/" + blockTexture)   //south
                .texture("east", "block/" + asphaltTexture)   //east
                .texture("west", "block/" + asphaltTexture)  //west
                .texture("particle", modLoc("block/" + asphaltTexture));

        getVariantBuilder(block)
                .forAllStates(state -> {

                    SlabType type = state.getValue(AsphaltSlabBlock.TYPE);
                    Direction dir = state.getValue(AsphaltSlabBlock.FACING);
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
                            .modelFile(type == SlabType.BOTTOM ? bottom : type == SlabType.TOP ? top : full)
                            .rotationX(x)
                            .rotationY(y)
                            .build();
                });

        makeBlockItemFromExistingModel(block);
    }


}

// > https://github.com/Beethoven92/BetterEndForge/blob/master/src/main/java/mod/beethoven92/betterendforge/data/client/ModBlockStates.java