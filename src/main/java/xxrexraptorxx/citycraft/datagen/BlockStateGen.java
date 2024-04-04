package xxrexraptorxx.citycraft.datagen;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceBlock;
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
import xxrexraptorxx.citycraft.utils.SignShape;

public class BlockStateGen extends BlockStateProvider {


    public BlockStateGen(PackOutput packOutput, ExistingFileHelper exFileHelper) {
        super(packOutput, References.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        makeSimpleBlock(ModBlocks.ASPHALT_BLOCK.get());
        makeSimpleBlock(ModBlocks.CRACKED_ASPHALT.get());
        makeSimpleBlock(ModBlocks.POTHOLE_ASPHALT.get());
        makeSimpleBlock(ModBlocks.MOSSY_ASPHALT.get());
        makeSimpleBlock(ModBlocks.DIRTY_ASPHALT.get());

        makeSimpleBlock(ModBlocks.WHITE_ASPHALT.get());
        makeSimpleBlock(ModBlocks.ORANGE_ASPHALT.get());
        makeSimpleBlock(ModBlocks.MAGENTA_ASPHALT.get());
        makeSimpleBlock(ModBlocks.LIGHT_BLUE_ASPHALT.get());
        makeSimpleBlock(ModBlocks.YELLOW_ASPHALT.get());
        makeSimpleBlock(ModBlocks.LIME_ASPHALT.get());
        makeSimpleBlock(ModBlocks.PINK_ASPHALT.get());
        makeSimpleBlock(ModBlocks.RED_ASPHALT.get());
        makeSimpleBlock(ModBlocks.GRAY_ASPHALT.get());
        makeSimpleBlock(ModBlocks.LIGHT_GRAY_ASPHALT.get());
        makeSimpleBlock(ModBlocks.CYAN_ASPHALT.get());
        makeSimpleBlock(ModBlocks.PURPLE_ASPHALT.get());
        makeSimpleBlock(ModBlocks.BLUE_ASPHALT.get());
        makeSimpleBlock(ModBlocks.BROWN_ASPHALT.get());
        makeSimpleBlock(ModBlocks.GREEN_ASPHALT.get());

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

        makeBlockItemFromExistingModel(ModBlocks.RED_BUMPER_SLAB.get());
        makeBlockItemFromExistingModel(ModBlocks.YELLOW_BUMPER_SLAB.get());
        makeBlockItemFromExistingModel(ModBlocks.ROAD_EDGE_POST.get());
        makeBlockItemFromExistingModel(ModBlocks.ORANGE_ROAD_EDGE_POST.get());

        makeBlockFromParentModel(ModBlocks.STONE_POST.get(), "post");
        makeBlockFromParentModel(ModBlocks.BLACK_POST.get(), "post");
        makeBlockFromParentModel(ModBlocks.RED_POST.get(), "post");
        makeBlockFromParentModel(ModBlocks.WHITE_POST.get(), "post");
        makeBlockFromParentModel(ModBlocks.YELLOW_POST.get(), "post");
        makeBlockFromParentModel(ModBlocks.RED_WHITE_POST.get(), "post");
        makeBlockFromParentModel(ModBlocks.YELLOW_BLACK_POST.get(), "post");

        makeBlockFromParentModel(ModBlocks.IRON_POLE.get(), "pole");
        makeBlockFromParentModel(ModBlocks.BLACK_POLE.get(), "pole");
        makeBlockFromParentModel(ModBlocks.RED_POLE.get(), "pole");
        makeBlockFromParentModel(ModBlocks.WHITE_POLE.get(), "pole");
        makeBlockFromParentModel(ModBlocks.YELLOW_POLE.get(), "pole");
        makeBlockFromParentModel(ModBlocks.RED_WHITE_POLE.get(), "pole");
        makeBlockFromParentModel(ModBlocks.YELLOW_BLACK_POLE.get(), "pole");

        trafficSignBlock(ModBlocks.LEFT_ARROW_EU_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.CAMPING_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.PR_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.PRIORITY_ROAD_EU_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.HIGHWAY_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LEFT_NARROWING_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.CHURCH_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.NO_PARKING_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.PARKING_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.NARROWING_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.NO_CARS_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.NO_TRUCK_PASSING_END_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.ONGOING_TRAFFIC_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.DETOUR_RIGHT_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.END_ALL_LIMITS_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.LEFT_DIRECTION_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.NO_PASSING_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.LEFT_CURVE_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.CATTLE_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.CAFE_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.NO_VEHICLES_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.DETOUR_AHEAD_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.NO_TRUCKS_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.BUS_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.DANGER_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.NO_ENTER_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.INTERSECTION_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.EIGHTY_SPEED_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.ASCEND_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.CYCLES_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.EMERGENCY_BAY_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.NO_PEDESTRIANS_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.PASS_LEFT_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.DESCEND_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.FIRST_AID_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.NO_BICYCLES_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.PRIORITY_OVER_ONCOMING_TRAFFIC_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.NO_THROUGH_ROAD_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.CREEPER_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.PRIORITY_ROAD_END_EU_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.LEFT_DOUBLE_CURVE_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.BICYCLE_PATH_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.JAMS_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.KM_AHEAD_EU_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.NO_PASSING_END_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.NO_TRUCK_PASSING_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.END_LINE_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.PASS_RIGHT_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.NO_PARKING_ALONG_CARRIAGEWAY_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.SIXTY_SPEED_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.PEDESTRIANS_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.CALMING_AREA_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LEFT_TURN_ARROW_EU_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.ONCOMING_TRAFFIC_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.LEFT_HERE_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.PRIORITY_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.DETOUR_LEFT_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.ONE_WAY_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.BUS_STOP_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.HIGHWAY_END_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.PEDESTRIAN_CROSSING_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.INFO_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.DISABLED_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.TEN_SPEED_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.CROSSBUCK_EU_SIGN.get(), SignShape.CROSS);
        trafficSignBlock(ModBlocks.THIRTY_SPEED_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.HOTEL_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.GATE_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.PETROL_STATION_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.CHILDREN_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.CROSSWALK_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.END_CALMING_AREA_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.GUIDE_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.PARKING_GARAGE_EU_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LEFT_RIGHT_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.HUNDRED_SPEED_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.NO_U_TURN_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.HUNDRED_TWENTY_SPEED_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.RAILROAD_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.REPAIR_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.RESTAURANT_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.RIGHT_ARROW_EU_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.RIGHT_CURVE_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.RIGHT_DIRECTION_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.RIGHT_DOUBLE_CURVE_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.RIGHT_HERE_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.RIGHT_NARROWING_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.RIGHT_TURN_ARROW_EU_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.ROADWORKS_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.ROCKFALL_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.ROUNDABOUT_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.SIDEWALK_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.SIGNAL_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.SLIPPERINESS_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.SNOW_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.STOP_EU_SIGN.get(), SignShape.OCTAGON);
        trafficSignBlock(ModBlocks.STRAIGHT_AHEAD_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.STRAIGHT_LEFT_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.STRAIGHT_RIGHT_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.TAXI_EU_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.TELEPHONE_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.UNEVEN_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.WARN_EU_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.WARNING_BEACON_ALT_EU_SIGN.get(), SignShape.BAKE);
        trafficSignBlock(ModBlocks.WARNING_BEACON_RIGHT_EU_SIGN.get(), SignShape.BAKE);
        trafficSignBlock(ModBlocks.WARNING_BEACON_LEFT_EU_SIGN.get(), SignShape.BAKE);
        trafficSignBlock(ModBlocks.WC_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.WEIGHT_EU_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.WET_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.YIELD_RIGHT_OF_WAY_EU_SIGN.get(), SignShape.UPSIDE_DOWN_TRIANGLE);
        trafficSignBlock(ModBlocks.NATURE_RESERVE_EU_SIGN .get(), SignShape.UPSIDE_DOWN_TRIANGLE);
        trafficSignBlock(ModBlocks.MOTORWAY_EU_SIGN .get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.MOTORWAY_END_EU_SIGN .get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.WATER_PROTECTION_AREA_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LEFT_AHEAD_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.RIGHT_AHEAD_EU_SIGN.get(), SignShape.ROUND);

        trafficSignBlock(ModBlocks.REPAIR_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.HILL_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.GUIDE_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LEFT_ADDED_LINE_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.INFO_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LEFT_ENTERING_ROADWAY_MERGE_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.LEFT_ARROW_GREEN_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.DOUBLE_ARROW_ORANGE_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.HOTEL_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.PEDESTRIANS_CROSSING_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.RIGHT_ARROW_GREEN_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.NO_BICYCLE_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LEFT_LANE_ENDS_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.RIGHT_DIAGONAL_ARROW_GREEN_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.LEFT_TURN_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.HANDICAPPED_ACCESSIBLE_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.RESTAURANT_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.HAIRPIN_CURVE_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.AIRPORT_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LEFT_DIRECTION_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.RAILROAD_CROSSING_US_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.RIGHT_ENTERING_ROADWAY_MERGE_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.DRINKING_WATER_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.CRAFT_CITY_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.NO_LEFT_TURN_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LEFT_DIAGONAL_ARROW_ORANGE_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.BATHROOMS_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LITTER_BARREL_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.NO_TRUCKS_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LEFT_TURN_ONLY_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.FORTYFIVE_ADVISORY_SPEED_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LIGHT_RAIL_TRANSIT_STATION_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.CRAFT_CITY_END_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.HOSPITAL_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.GAS_STATION_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.CATTLE_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.HANDICAPED_CROSSING_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.PICNIC_AREA_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.NO_U_TURN_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.RIGHT_DIAGONAL_ARROW_ORANGE_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.RIGHT_ADDED_LINE_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.RIGHT_LANE_ENDS_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.LEFT_SIDE_ROAD_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.PLAYGROUND_AHEAD_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.DIESEL_STATION_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.THIRTYFIVE_ADVISORY_SPEED_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LEFT_DIAGONAL_ARROW_YELLOW_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.CREEPER_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.LEFT_DIAGONAL_ARROW_GREEN_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.LOUNDRY_FACILITY_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.NO_PARKING_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.TWENTYFIVE_ADVISORY_SPEED_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.DOUBLE_ARROW_YELLOW_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.CAMPING_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.RIGHT_CURVE_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.LEFT_ARROW_YELLOW_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.LEFT_CURVE_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.CIRCULAR_INTERSECTION_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.LEFT_MERGING_TRAFFIC_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.DIVIDED_HIGHWAY_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.NO_PEDESTRIANS_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.CROSSBUCK_US_SIGN.get(), SignShape.CROSS);
        trafficSignBlock(ModBlocks.RIGHT_ARROW_ORANGE_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.ELECTRIC_STATION_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.BICYCLE_CROSSING_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.LEFT_REVERSE_TURN_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.LEFT_ARROW_ORANGE_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.MEDICAL_SERVICE_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.RIGHT_ARROW_YELLOW_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.RIGHT_DIRECTION_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.NO_RIGHT_TURN_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.CROSS_ROAD_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.DOUBLE_ARROW_GREEN_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.RIGHT_DIAGONAL_ARROW_YELLOW_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.RIGHT_MERGING_TRAFFIC_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.RIGHT_REVERSE_TURN_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.RIGHT_SIDE_ROAD_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.RIGHT_TURN_ONLY_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.RIGHT_TURN_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.ROAD_NARROWS_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.SIDE_ROAD_AT_ANGLE_LEFT_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.SIDE_ROAD_AT_ANGLE_RIGHT_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.SIGNAL_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.SLIPPERY_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.STRAIGHT_AHEAD_ONLY_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.SWIMMING_AREA_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.T_INTERSECTION_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.TELEPHONE_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.TRUCK_CROSSING_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.TRUCK_ROLLOVER_WARNING_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.TWO_WAY_TRAFFIC_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.VERY_SHARP_CURVE_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.WINTER_RECREATION_AREA_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.WINDING_ROAD_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.WORKERS_US_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.Y_INTERSECTION_US_SIGN.get(), SignShape.RHOMBUS);

        fenceBlock(((FenceBlock) ModBlocks.IRON_FENCE.get()), blockTexture(ModBlocks.IRON_POLE.get()));
    }


    private void makeBlockItemFromExistingModel(Block block) {
        final ModelFile model = models().getExistingFile(BuiltInRegistries.BLOCK.getKey(block));
        simpleBlockItem(block, model);
    }


    private void makeBlockFromParentModel(Block block, String parentModel) {
        String blockTexture = BuiltInRegistries.BLOCK.getKey(block).getPath();

        ModelFile model = models().withExistingParent(blockTexture, References.MODID + ":block/" + parentModel)
                .texture("texture", "block/" + blockTexture);

        simpleBlock(block, model);
        makeBlockItemFromExistingModel(block);
    }


    private void makeSimpleBlock(Block block) {
        simpleBlock(block);
        makeBlockItemFromExistingModel(block);
    }


    private void trafficSignBlock(Block block, SignShape shape) {
        String frontTexture = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String backTexture = shape.toString() + "_sign_back";

        getVariantBuilder(block).forAllStates(state -> {

            ModelFile model = models().withExistingParent(frontTexture, References.MODID + ":block/traffic_sign")
                    .texture("front", "block/" + frontTexture)
                    .texture("back", modLoc("block/" + backTexture));

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


    private void directionalAsphaltBlock(Block block) {
        String asphaltTexture = BuiltInRegistries.BLOCK.getKey(ModBlocks.ASPHALT_BLOCK.get()).getPath();
        String blockTexture = BuiltInRegistries.BLOCK.getKey(block).getPath();

        getVariantBuilder(block).forAllStates(state -> {

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