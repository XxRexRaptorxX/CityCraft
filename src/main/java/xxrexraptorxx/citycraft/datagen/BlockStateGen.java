package xxrexraptorxx.citycraft.datagen;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.*;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import xxrexraptorxx.citycraft.blocks.*;
import xxrexraptorxx.citycraft.blocks.WallSignBlock;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.utils.Enums.LightPhase;
import xxrexraptorxx.citycraft.utils.Enums.SignShape;
import xxrexraptorxx.citycraft.utils.Helper;


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

        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LEFT_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_RIGHT_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LEFT_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_RIGHT_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LEFT_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_RIGHT_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LEFT_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_RIGHT_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LEFT_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_RIGHT_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LEFT_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_RIGHT_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LEFT_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_RIGHT_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LEFT_EDGE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_RIGHT_EDGE.get());

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

        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LEFT_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_RIGHT_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LEFT_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LEFT_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LEFT_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_RIGHT_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LEFT_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_RIGHT_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LEFT_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LEFT_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LEFT_EDGE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_RIGHT_EDGE_SLAB.get());

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

        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_0.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_1.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_2.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_3.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_4.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_5.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_6.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_7.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_8.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_9.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_COMMA.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_DASH.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_DOT.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_EXCLAMATION.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_QUESTION.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_SLASH.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_0.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_1.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_2.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_3.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_4.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_5.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_6.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_7.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_8.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_9.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_COMMA.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_DASH.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_DOT.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_EXCLAMATION.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_QUESTION.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_SLASH.get());

        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_0_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_1_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_2_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_3_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_4_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_5_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_6_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_7_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_8_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_9_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_COMMA_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_DASH_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_DOT_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_EXCLAMATION_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_QUESTION_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_SLASH_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_0_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_1_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_2_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_3_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_4_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_5_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_6_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_7_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_8_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_9_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_COMMA_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_DASH_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_DOT_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_EXCLAMATION_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_QUESTION_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_SLASH_SLAB.get());

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

        makeBlockItemFromExistingModel(ModBlocks.IRON_POLE.get());
        makeBlockItemFromExistingModel(ModBlocks.REDSTONE_POLE.get());
        makeBlockItemFromExistingModel(ModBlocks.BLACK_POLE.get());
        makeBlockItemFromExistingModel(ModBlocks.RED_POLE.get());
        makeBlockItemFromExistingModel(ModBlocks.WHITE_POLE.get());
        makeBlockItemFromExistingModel(ModBlocks.YELLOW_POLE.get());
        makeBlockItemFromExistingModel(ModBlocks.RED_WHITE_POLE.get());
        makeBlockItemFromExistingModel(ModBlocks.YELLOW_BLACK_POLE.get());

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
        trafficSignBlock(ModBlocks.NATURE_RESERVE_EU_SIGN.get(), SignShape.UPSIDE_DOWN_TRIANGLE);
        trafficSignBlock(ModBlocks.MOTORWAY_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.MOTORWAY_END_EU_SIGN.get(), SignShape.SQUARE);
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

        trafficSignBlock(ModBlocks.EXIT_CLOSED_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.NO_HAZARDOUS_CARGO_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.M_AHEAD_EU_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.AHEAD_YELLOW_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.BICYCLE_PATH_RIGHT_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.BICYCLE_HIGHWAY_END_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.TEN_MINIMUM_SPEED_SIGN_EU.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.HIGHWAY_COUNTDOWN_MARKER_200_EU_SIGN.get(), SignShape.BAKE);
        trafficSignBlock(ModBlocks.BICYCLE_PATH_LEFT_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.BICYCLE_ROUTE_AHEAD_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.FEDERAL_HIGHWAY_COUNTDOWN_MARKER_100_EU_SIGN.get(), SignShape.BAKE);
        trafficSignBlock(ModBlocks.HIGHWAY_COUNTDOWN_MARKER_300_EU_SIGN.get(), SignShape.BAKE);
        trafficSignBlock(ModBlocks.BRIDLE_PATH_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.DETOUR_END_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.DETOUR_LEFT_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.FEDERAL_HIGHWAY_COUNTDOWN_MARKER_200_EU_SIGN.get(), SignShape.BAKE);
        trafficSignBlock(ModBlocks.DETOUR_RIGHT_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.AHEAD_GREEN_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.MOVABLE_BRIDGE_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.HIGHWAY_COUNTDOWN_MARKER_100_EU_SIGN.get(), SignShape.BAKE);
        trafficSignBlock(ModBlocks.BICYCLE_PATH_US_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.THIRTY_MINIMUM_SPEED_SIGN_EU.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.CHARGING_STATION_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.BICYCLE_ROUTE_LEFT_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LOOSE_GRAVEL_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.FEDERAL_HIGHWAY_COUNTDOWN_MARKER_300_EU_SIGN.get(), SignShape.BAKE);
        trafficSignBlock(ModBlocks.BICYCLE_HIGHWAY_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.PARKING_AREA_END_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.BICYCLE_PATH_AHEAD_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.NO_MONSTER_EU_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.AHEAD_ORANGE_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.BICYCLE_ROUTE_RIGHT_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LEFT_PRIORITY_ROAD_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.PARKING_AREA_START_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.PRIORITY_ROAD_FROM_LEFT_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.PRIORITY_ROAD_FROM_RIGHT_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.RAILWAY_COUNTDOWN_MARKER_80_EU_SIGN.get(), SignShape.BAKE);
        trafficSignBlock(ModBlocks.RAILWAY_COUNTDOWN_MARKER_160_EU_SIGN.get(), SignShape.BAKE);
        trafficSignBlock(ModBlocks.RAILWAY_COUNTDOWN_MARKER_240_EU_SIGN.get(), SignShape.BAKE);
        trafficSignBlock(ModBlocks.RIGHT_PRIORITY_ROAD_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.SHORE_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.TREE_OVERHANG_EU_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.TRUCK_ROUTE_AHEAD_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.TRUCK_ROUTE_RIGHT_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.TRUCK_ROUTE_LEFT_EU_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.WARN_US_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.WARNING_BEACON_ALT_US_SIGN.get(), SignShape.BAKE);
        trafficSignBlock(ModBlocks.WARNING_BEACON_LEFT_US_SIGN.get(), SignShape.BAKE);
        trafficSignBlock(ModBlocks.WARNING_BEACON_RIGHT_US_SIGN.get(), SignShape.BAKE);

        trafficSignBlock(ModBlocks.ONCOMING_TRAFFIC_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.INTERSECTION_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.DETOUR_LEFT_OR_RIGHT_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.PEDESTRIAN_CROSSING_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.EMERGENCY_BAY_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.CATTLE_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.NARROWING_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.DESCEND_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.CHILDREN_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.FIFTY_ADVISORY_SPEED_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.JAMS_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.DANGER_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.RIGHT_DOUBLE_CURVE_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.RAILROAD_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.DETOUR_LEFT_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.CREEPER_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.ASCEND_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.GAS_STATION_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.PARKING_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.BUMP_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.LEFT_DIRECTION_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.RIGHT_NARROWING_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.INFO_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.CYCLES_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.PRIORITY_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.CAMPING_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.ROUNDABOUT_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.SHORE_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.HIGHWAY_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.RIGHT_CURVE_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.LEFT_NARROWING_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.NATURE_RESERVE_AREA_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.LEFT_MERGING_TRAFFIC_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.HIGHWAY_END_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.LEFT_DOUBLE_CURVE_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.GATE_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.ROCKFALL_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.PARKING_GARAGE_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.DETOUR_RIGHT_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.THIRTY_ADVISORY_SPEED_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.RIGHT_DIRECTION_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.NARROW_BRIDGE_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.FORTY_ADVISORY_SPEED_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.ONE_WAY_CN_SIGN.get(), SignShape.BAKE);
        trafficSignBlock(ModBlocks.ROADWORKS_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.RIGHT_MERGING_TRAFFIC_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.LEFT_CURVE_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.GUIDE_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.SIDE_ROAD_AT_ANGLE_LEFT_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.SIDE_ROAD_AT_ANGLE_RIGHT_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.SIDE_ROAD_AT_LEFT_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.SIDE_ROAD_AT_RIGHT_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.SIGNAL_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.SLIPPERINESS_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.SLOW_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.SNOW_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.STOP_CN_SIGN.get(), SignShape.OCTAGON);
        trafficSignBlock(ModBlocks.T_INTERSECTION_CN_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.TELEPHONE_CN_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.UNEVEN_ROAD_CN_SIGN.get(), SignShape.TRIANGLE);

        trafficSignBlock(ModBlocks.ROUND_SIGN.get(), SignShape.ROUND);
        trafficSignBlock(ModBlocks.TRIANGLE_SIGN.get(), SignShape.TRIANGLE);
        trafficSignBlock(ModBlocks.RECTANGLE_SIGN.get(), SignShape.RECTANGLE);
        trafficSignBlock(ModBlocks.SQUARE_SIGN.get(), SignShape.SQUARE);
        trafficSignBlock(ModBlocks.CROSS_SIGN.get(), SignShape.CROSS);
        trafficSignBlock(ModBlocks.UPSIDE_DOWN_TRIANGLE_SIGN.get(), SignShape.UPSIDE_DOWN_TRIANGLE);
        trafficSignBlock(ModBlocks.RHOMBUS_SIGN.get(), SignShape.RHOMBUS);
        trafficSignBlock(ModBlocks.OCTAGON_SIGN.get(), SignShape.OCTAGON);
        trafficSignBlock(ModBlocks.BAKE_SIGN.get(), SignShape.BAKE);

        wallSignBlock(ModBlocks.WARNING_SIGN.get(), SignShape.TRIANGLE);
        wallSignBlock(ModBlocks.MONSTER_WARNING_SIGN.get(), SignShape.TRIANGLE);
        wallSignBlock(ModBlocks.TOXIC_WARNING_SIGN.get(), SignShape.TRIANGLE);
        wallSignBlock(ModBlocks.VOLTAGE_WARNING_SIGN.get(), SignShape.TRIANGLE);
        wallSignBlock(ModBlocks.FIRE_WARNING_SIGN.get(), SignShape.TRIANGLE);
        wallSignBlock(ModBlocks.LASER_WARNING_SIGN.get(), SignShape.TRIANGLE);
        wallSignBlock(ModBlocks.HOT_WARNING_SIGN.get(), SignShape.TRIANGLE);
        wallSignBlock(ModBlocks.MAGNETIC_WARNING_SIGN.get(), SignShape.TRIANGLE);
        wallSignBlock(ModBlocks.EXPLOSION_WARNING_SIGN.get(), SignShape.TRIANGLE);
        wallSignBlock(ModBlocks.GAS_CYLINDER_WARNING_SIGN.get(), SignShape.TRIANGLE);
        wallSignBlock(ModBlocks.RADIATION_WARNING_SIGN.get(), SignShape.TRIANGLE);
        wallSignBlock(ModBlocks.BIOHAZARD_WARNING_SIGN.get(), SignShape.TRIANGLE);
        wallSignBlock(ModBlocks.PROHIBITION_SIGN.get(), SignShape.ROUND);
        wallSignBlock(ModBlocks.ENTERING_PROHIBITED_SIGN.get(), SignShape.ROUND);
        wallSignBlock(ModBlocks.HEAVY_LOAD_PROHIBITED_SIGN.get(), SignShape.ROUND);
        wallSignBlock(ModBlocks.DRINKING_PROHIBITED_SIGN.get(), SignShape.ROUND);
        wallSignBlock(ModBlocks.PHONES_PROHIBITED_SIGN.get(), SignShape.ROUND);
        wallSignBlock(ModBlocks.PEDESTRIANS_PROHIBITED_SIGN.get(), SignShape.ROUND);
        wallSignBlock(ModBlocks.UNAUTHORISED_PROHIBITED_SIGN.get(), SignShape.ROUND);
        wallSignBlock(ModBlocks.SMOKING_PROHIBITED_SIGN.get(), SignShape.ROUND);
        wallSignBlock(ModBlocks.EATING_PROHIBITED_SIGN.get(), SignShape.ROUND);
        wallSignBlock(ModBlocks.MANDATORY_SIGN.get(), SignShape.ROUND);
        wallSignBlock(ModBlocks.HELMET_MANDATORY_SIGN.get(), SignShape.ROUND);
        wallSignBlock(ModBlocks.GLOVES_MANDATORY_SIGN.get(), SignShape.ROUND);
        wallSignBlock(ModBlocks.ARMOR_MANDATORY_SIGN.get(), SignShape.ROUND);
        wallSignBlock(ModBlocks.BOOTS_MANDATORY_SIGN.get(), SignShape.ROUND);
        wallSignBlock(ModBlocks.FIRST_AID_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.FIRE_ALARM_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.FIRE_TELEPHONE_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.FIRE_EXTINGUISHER_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.ASSEMBLY_POINT_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.EMERGENCY_TELEFONE_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.EMERGENCY_EXIT_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.EMERGENCY_EXIT_LEFT_SIGN.get(), SignShape.RECTANGLE);
        wallSignBlock(ModBlocks.EMERGENCY_EXIT_RIGHT_SIGN.get(), SignShape.RECTANGLE);
        wallSignBlock(ModBlocks.EMERGENCY_EXIT_AHEAD_SIGN.get(), SignShape.RECTANGLE);
        wallSignBlock(ModBlocks.EMERGENCY_EXIT_DOWNWARDS_SIGN.get(), SignShape.RECTANGLE);
        wallSignBlock(ModBlocks.EXIT_SIGN.get(), SignShape.RECTANGLE);

        wallSignBlock(ModBlocks.SIGN_0.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.SIGN_1.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.SIGN_2.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.SIGN_3.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.SIGN_4.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.SIGN_5.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.SIGN_6.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.SIGN_7.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.SIGN_8.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.SIGN_9.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.A_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.B_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.C_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.D_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.E_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.F_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.G_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.H_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.I_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.J_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.K_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.L_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.M_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.N_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.O_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.P_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.Q_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.R_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.S_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.T_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.U_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.V_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.W_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.X_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.Y_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.Z_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.EXCLAMATION_SIGN.get(), SignShape.SQUARE);
        wallSignBlock(ModBlocks.QUESTION_SIGN.get(), SignShape.SQUARE);

        fenceBlock(((FenceBlock) ModBlocks.IRON_FENCE.get()), blockTexture(ModBlocks.IRON_POLE.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.IRON_FENCE_GATE.get()), blockTexture(ModBlocks.IRON_POLE.get()));
        makeBlockItemFromExistingModel(ModBlocks.IRON_FENCE_GATE.get());

        wallBlock(((WallBlock) ModBlocks.BLACK_CONCRETE_WALL.get()), blockTexture(Blocks.BLACK_CONCRETE));
        wallBlock(((WallBlock) ModBlocks.WHITE_CONCRETE_WALL.get()), blockTexture(Blocks.WHITE_CONCRETE));
        wallBlock(((WallBlock) ModBlocks.ORANGE_CONCRETE_WALL.get()), blockTexture(Blocks.ORANGE_CONCRETE));
        wallBlock(((WallBlock) ModBlocks.MAGENTA_CONCRETE_WALL.get()), blockTexture(Blocks.MAGENTA_CONCRETE));
        wallBlock(((WallBlock) ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get()), blockTexture(Blocks.LIGHT_BLUE_CONCRETE));
        wallBlock(((WallBlock) ModBlocks.YELLOW_CONCRETE_WALL.get()), blockTexture(Blocks.YELLOW_CONCRETE));
        wallBlock(((WallBlock) ModBlocks.LIME_CONCRETE_WALL.get()), blockTexture(Blocks.LIME_CONCRETE));
        wallBlock(((WallBlock) ModBlocks.PINK_CONCRETE_WALL.get()), blockTexture(Blocks.PINK_CONCRETE));
        wallBlock(((WallBlock) ModBlocks.GRAY_CONCRETE_WALL.get()), blockTexture(Blocks.GRAY_CONCRETE));
        wallBlock(((WallBlock) ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get()), blockTexture(Blocks.LIGHT_GRAY_CONCRETE));
        wallBlock(((WallBlock) ModBlocks.CYAN_CONCRETE_WALL.get()), blockTexture(Blocks.CYAN_CONCRETE));
        wallBlock(((WallBlock) ModBlocks.PURPLE_CONCRETE_WALL.get()), blockTexture(Blocks.PURPLE_CONCRETE));
        wallBlock(((WallBlock) ModBlocks.BLUE_CONCRETE_WALL.get()), blockTexture(Blocks.BLUE_CONCRETE));
        wallBlock(((WallBlock) ModBlocks.BROWN_CONCRETE_WALL.get()), blockTexture(Blocks.BROWN_CONCRETE));
        wallBlock(((WallBlock) ModBlocks.GREEN_CONCRETE_WALL.get()), blockTexture(Blocks.GREEN_CONCRETE));
        wallBlock(((WallBlock) ModBlocks.RED_CONCRETE_WALL.get()), blockTexture(Blocks.RED_CONCRETE));

        makeBlockItemFromExistingModel(ModBlocks.BLOCK_PAINTER.get());

        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_BICYCLE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LEFT_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_RIGHT_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_HANDICAPPED.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_PEDESTRIAN.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_WHITE_TRIANGLE.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_BICYCLE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LEFT_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_RIGHT_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_HANDICAPPED_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_PEDESTRIAN_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_WHITE_TRIANGLE_SLAB.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_BICYCLE.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LEFT_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_RIGHT_ARROW.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_HANDICAPPED.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_PEDESTRIAN.get());
        directionalAsphaltBlock(ModBlocks.ASPHALT_WITH_YELLOW_TRIANGLE.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_BICYCLE_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LEFT_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_RIGHT_ARROW_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_HANDICAPPED_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_PEDESTRIAN_SLAB.get());
        directionalAsphaltSlab(ModBlocks.ASPHALT_WITH_YELLOW_TRIANGLE_SLAB.get());

        makeBlockItemFromExistingModel(ModBlocks.VARIABLE_TRAFFIC_SIGN.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_OPEN.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_CLOSED.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_CHANGE_LEFT.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_CHANGE_RIGHT.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_SIXTY_SPEED_LIMIT.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_EIGHTY_SPEED_LIMIT.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_HUNDRED_SPEED_LIMIT.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_HUNDRED_TWENTY_SPEED_LIMIT.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_CREEPER.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_DANGER.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_END_ALL_LIMITS.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_JAMS.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_NO_PASSING.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_NO_TRUCK_PASSING.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_ROADWORKS.get());
        variableTrafficSign(ModBlocks.VARIABLE_TRAFFIC_SIGN_SLIPPERINESS.get());

        trafficLights(ModBlocks.BICYCLE_DOUBLE_TRAFFIC_LIGHT.get());
        trafficLights(ModBlocks.BICYCLE_TRIPLE_TRAFFIC_LIGHT.get());
        trafficLights(ModBlocks.DOUBLE_TRAFFIC_LIGHT.get());
        trafficLights(ModBlocks.LEFT_TURN_DOUBLE_TRAFFIC_LIGHT.get());
        trafficLights(ModBlocks.LEFT_TURN_TRIPLE_TRAFFIC_LIGHT.get());
        trafficLights(ModBlocks.PEDESTRIAN_DOUBLE_TRAFFIC_LIGHT.get());
        trafficLights(ModBlocks.PEDESTRIAN_TRIPLE_TRAFFIC_LIGHT.get());
        trafficLights(ModBlocks.RIGHT_TURN_DOUBLE_TRAFFIC_LIGHT.get());
        trafficLights(ModBlocks.RIGHT_TURN_TRIPLE_TRAFFIC_LIGHT.get());
        trafficLights(ModBlocks.STRAIGHT_DOUBLE_TRAFFIC_LIGHT.get());
        trafficLights(ModBlocks.STRAIGHT_TRIPLE_TRAFFIC_LIGHT.get());
        trafficLights(ModBlocks.TRIPLE_TRAFFIC_LIGHT.get());

        signalLights(ModBlocks.DANGER_SIGNAL_LIGHT.get());
        signalLights(ModBlocks.PEDESTRIAN_SIGNAL_LIGHT.get());
        signalLights(ModBlocks.SIGNAL_LIGHT.get());
        signalLights(ModBlocks.TRAIN_SIGNAL_LIGHT.get());

        customLamp(ModBlocks.BLACK_LAMP.get());
        customLamp(ModBlocks.WHITE_LAMP.get());
        customLamp(ModBlocks.ORANGE_LAMP.get());
        customLamp(ModBlocks.MAGENTA_LAMP.get());
        customLamp(ModBlocks.LIGHT_BLUE_LAMP.get());
        customLamp(ModBlocks.YELLOW_LAMP.get());
        customLamp(ModBlocks.LIME_LAMP.get());
        customLamp(ModBlocks.PINK_LAMP.get());
        customLamp(ModBlocks.GRAY_LAMP.get());
        customLamp(ModBlocks.LIGHT_GRAY_LAMP.get());
        customLamp(ModBlocks.CYAN_LAMP.get());
        customLamp(ModBlocks.PURPLE_LAMP.get());
        customLamp(ModBlocks.BLUE_LAMP.get());
        customLamp(ModBlocks.BROWN_LAMP.get());
        customLamp(ModBlocks.GREEN_LAMP.get());
        customLamp(ModBlocks.RED_LAMP.get());

        customTranslucentLamp(ModBlocks.BLACK_NEON_LIGHT.get());
        customTranslucentLamp(ModBlocks.WHITE_NEON_LIGHT.get());
        customTranslucentLamp(ModBlocks.ORANGE_NEON_LIGHT.get());
        customTranslucentLamp(ModBlocks.MAGENTA_NEON_LIGHT.get());
        customTranslucentLamp(ModBlocks.LIGHT_BLUE_NEON_LIGHT.get());
        customTranslucentLamp(ModBlocks.YELLOW_NEON_LIGHT.get());
        customTranslucentLamp(ModBlocks.LIME_NEON_LIGHT.get());
        customTranslucentLamp(ModBlocks.PINK_NEON_LIGHT.get());
        customTranslucentLamp(ModBlocks.GRAY_NEON_LIGHT.get());
        customTranslucentLamp(ModBlocks.LIGHT_GRAY_NEON_LIGHT.get());
        customTranslucentLamp(ModBlocks.CYAN_NEON_LIGHT.get());
        customTranslucentLamp(ModBlocks.PURPLE_NEON_LIGHT.get());
        customTranslucentLamp(ModBlocks.BLUE_NEON_LIGHT.get());
        customTranslucentLamp(ModBlocks.BROWN_NEON_LIGHT.get());
        customTranslucentLamp(ModBlocks.GREEN_NEON_LIGHT.get());
        customTranslucentLamp(ModBlocks.RED_NEON_LIGHT.get());

        customLantern(ModBlocks.STREET_LANTERN.get());

        makeSimpleBlock(ModBlocks.CRACKED_WHITE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CRACKED_LIGHT_GRAY_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CRACKED_GRAY_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CRACKED_BLACK_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CRACKED_BROWN_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CRACKED_RED_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CRACKED_ORANGE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CRACKED_YELLOW_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CRACKED_LIME_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CRACKED_GREEN_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CRACKED_CYAN_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CRACKED_LIGHT_BLUE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CRACKED_BLUE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CRACKED_PURPLE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CRACKED_MAGENTA_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CRACKED_PINK_CONCRETE.get());

        makeSimpleBlock(ModBlocks.MOSSY_WHITE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.MOSSY_LIGHT_GRAY_CONCRETE.get());
        makeSimpleBlock(ModBlocks.MOSSY_GRAY_CONCRETE.get());
        makeSimpleBlock(ModBlocks.MOSSY_BLACK_CONCRETE.get());
        makeSimpleBlock(ModBlocks.MOSSY_BROWN_CONCRETE.get());
        makeSimpleBlock(ModBlocks.MOSSY_RED_CONCRETE.get());
        makeSimpleBlock(ModBlocks.MOSSY_ORANGE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.MOSSY_YELLOW_CONCRETE.get());
        makeSimpleBlock(ModBlocks.MOSSY_LIME_CONCRETE.get());
        makeSimpleBlock(ModBlocks.MOSSY_GREEN_CONCRETE.get());
        makeSimpleBlock(ModBlocks.MOSSY_CYAN_CONCRETE.get());
        makeSimpleBlock(ModBlocks.MOSSY_LIGHT_BLUE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.MOSSY_BLUE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.MOSSY_PURPLE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.MOSSY_MAGENTA_CONCRETE.get());
        makeSimpleBlock(ModBlocks.MOSSY_PINK_CONCRETE.get());

        makeBlockFromParentModel(ModBlocks.INFESTED_BLACK_CONCRETE.get(), BuiltInRegistries.BLOCK.getKey(Blocks.BLACK_CONCRETE));
        makeBlockFromParentModel(ModBlocks.INFESTED_WHITE_CONCRETE.get(), BuiltInRegistries.BLOCK.getKey(Blocks.WHITE_CONCRETE));
        makeBlockFromParentModel(ModBlocks.INFESTED_GRAY_CONCRETE.get(), BuiltInRegistries.BLOCK.getKey(Blocks.GRAY_CONCRETE));
        makeBlockFromParentModel(ModBlocks.INFESTED_LIGHT_GRAY_CONCRETE.get(), BuiltInRegistries.BLOCK.getKey(Blocks.LIGHT_GRAY_CONCRETE));

        makeSimpleBlock(ModBlocks.CHISELED_WHITE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CHISELED_LIGHT_GRAY_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CHISELED_GRAY_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CHISELED_BLACK_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CHISELED_BROWN_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CHISELED_RED_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CHISELED_ORANGE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CHISELED_YELLOW_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CHISELED_LIME_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CHISELED_GREEN_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CHISELED_CYAN_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CHISELED_LIGHT_BLUE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CHISELED_BLUE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CHISELED_PURPLE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CHISELED_MAGENTA_CONCRETE.get());
        makeSimpleBlock(ModBlocks.CHISELED_PINK_CONCRETE.get());

        makeSimpleBlock(ModBlocks.POLISHED_WHITE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.POLISHED_LIGHT_GRAY_CONCRETE.get());
        makeSimpleBlock(ModBlocks.POLISHED_GRAY_CONCRETE.get());
        makeSimpleBlock(ModBlocks.POLISHED_BLACK_CONCRETE.get());
        makeSimpleBlock(ModBlocks.POLISHED_BROWN_CONCRETE.get());
        makeSimpleBlock(ModBlocks.POLISHED_RED_CONCRETE.get());
        makeSimpleBlock(ModBlocks.POLISHED_ORANGE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.POLISHED_YELLOW_CONCRETE.get());
        makeSimpleBlock(ModBlocks.POLISHED_LIME_CONCRETE.get());
        makeSimpleBlock(ModBlocks.POLISHED_GREEN_CONCRETE.get());
        makeSimpleBlock(ModBlocks.POLISHED_CYAN_CONCRETE.get());
        makeSimpleBlock(ModBlocks.POLISHED_LIGHT_BLUE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.POLISHED_BLUE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.POLISHED_PURPLE_CONCRETE.get());
        makeSimpleBlock(ModBlocks.POLISHED_MAGENTA_CONCRETE.get());
        makeSimpleBlock(ModBlocks.POLISHED_PINK_CONCRETE.get());

        makeSimpleBlock(ModBlocks.WHITE_CONCRETE_BRICKS.get());
        makeSimpleBlock(ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS.get());
        makeSimpleBlock(ModBlocks.GRAY_CONCRETE_BRICKS.get());
        makeSimpleBlock(ModBlocks.BLACK_CONCRETE_BRICKS.get());
        makeSimpleBlock(ModBlocks.BROWN_CONCRETE_BRICKS.get());
        makeSimpleBlock(ModBlocks.RED_CONCRETE_BRICKS.get());
        makeSimpleBlock(ModBlocks.ORANGE_CONCRETE_BRICKS.get());
        makeSimpleBlock(ModBlocks.YELLOW_CONCRETE_BRICKS.get());
        makeSimpleBlock(ModBlocks.LIME_CONCRETE_BRICKS.get());
        makeSimpleBlock(ModBlocks.GREEN_CONCRETE_BRICKS.get());
        makeSimpleBlock(ModBlocks.CYAN_CONCRETE_BRICKS.get());
        makeSimpleBlock(ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS.get());
        makeSimpleBlock(ModBlocks.BLUE_CONCRETE_BRICKS.get());
        makeSimpleBlock(ModBlocks.PURPLE_CONCRETE_BRICKS.get());
        makeSimpleBlock(ModBlocks.MAGENTA_CONCRETE_BRICKS.get());
        makeSimpleBlock(ModBlocks.PINK_CONCRETE_BRICKS.get());

        makeSimpleBlock(ModBlocks.WHITE_CONCRETE_CRACKED_BRICKS.get());
        makeSimpleBlock(ModBlocks.LIGHT_GRAY_CONCRETE_CRACKED_BRICKS.get());
        makeSimpleBlock(ModBlocks.GRAY_CONCRETE_CRACKED_BRICKS.get());
        makeSimpleBlock(ModBlocks.BLACK_CONCRETE_CRACKED_BRICKS.get());
        makeSimpleBlock(ModBlocks.BROWN_CONCRETE_CRACKED_BRICKS.get());
        makeSimpleBlock(ModBlocks.RED_CONCRETE_CRACKED_BRICKS.get());
        makeSimpleBlock(ModBlocks.ORANGE_CONCRETE_CRACKED_BRICKS.get());
        makeSimpleBlock(ModBlocks.YELLOW_CONCRETE_CRACKED_BRICKS.get());
        makeSimpleBlock(ModBlocks.LIME_CONCRETE_CRACKED_BRICKS.get());
        makeSimpleBlock(ModBlocks.GREEN_CONCRETE_CRACKED_BRICKS.get());
        makeSimpleBlock(ModBlocks.CYAN_CONCRETE_CRACKED_BRICKS.get());
        makeSimpleBlock(ModBlocks.LIGHT_BLUE_CONCRETE_CRACKED_BRICKS.get());
        makeSimpleBlock(ModBlocks.BLUE_CONCRETE_CRACKED_BRICKS.get());
        makeSimpleBlock(ModBlocks.PURPLE_CONCRETE_CRACKED_BRICKS.get());
        makeSimpleBlock(ModBlocks.MAGENTA_CONCRETE_CRACKED_BRICKS.get());
        makeSimpleBlock(ModBlocks.PINK_CONCRETE_CRACKED_BRICKS.get());

        makePillarBlock(ModBlocks.WHITE_CONCRETE_PILLAR.get());
        makePillarBlock(ModBlocks.LIGHT_GRAY_CONCRETE_PILLAR.get());
        makePillarBlock(ModBlocks.GRAY_CONCRETE_PILLAR.get());
        makePillarBlock(ModBlocks.BLACK_CONCRETE_PILLAR.get());
        makePillarBlock(ModBlocks.BROWN_CONCRETE_PILLAR.get());
        makePillarBlock(ModBlocks.RED_CONCRETE_PILLAR.get());
        makePillarBlock(ModBlocks.ORANGE_CONCRETE_PILLAR.get());
        makePillarBlock(ModBlocks.YELLOW_CONCRETE_PILLAR.get());
        makePillarBlock(ModBlocks.LIME_CONCRETE_PILLAR.get());
        makePillarBlock(ModBlocks.GREEN_CONCRETE_PILLAR.get());
        makePillarBlock(ModBlocks.CYAN_CONCRETE_PILLAR.get());
        makePillarBlock(ModBlocks.LIGHT_BLUE_CONCRETE_PILLAR.get());
        makePillarBlock(ModBlocks.BLUE_CONCRETE_PILLAR.get());
        makePillarBlock(ModBlocks.PURPLE_CONCRETE_PILLAR.get());
        makePillarBlock(ModBlocks.MAGENTA_CONCRETE_PILLAR.get());
        makePillarBlock(ModBlocks.PINK_CONCRETE_PILLAR.get());

        makeStairsBlock(ModBlocks.WHITE_CONCRETE_STAIRS.get(), Blocks.WHITE_CONCRETE);
        makeStairsBlock(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), Blocks.LIGHT_GRAY_CONCRETE);
        makeStairsBlock(ModBlocks.GRAY_CONCRETE_STAIRS.get(), Blocks.GRAY_CONCRETE);
        makeStairsBlock(ModBlocks.BLACK_CONCRETE_STAIRS.get(), Blocks.BLACK_CONCRETE);
        makeStairsBlock(ModBlocks.BROWN_CONCRETE_STAIRS.get(), Blocks.BROWN_CONCRETE);
        makeStairsBlock(ModBlocks.RED_CONCRETE_STAIRS.get(), Blocks.RED_CONCRETE);
        makeStairsBlock(ModBlocks.ORANGE_CONCRETE_STAIRS.get(), Blocks.ORANGE_CONCRETE);
        makeStairsBlock(ModBlocks.YELLOW_CONCRETE_STAIRS.get(), Blocks.YELLOW_CONCRETE);
        makeStairsBlock(ModBlocks.LIME_CONCRETE_STAIRS.get(), Blocks.LIME_CONCRETE);
        makeStairsBlock(ModBlocks.GREEN_CONCRETE_STAIRS.get(), Blocks.GREEN_CONCRETE);
        makeStairsBlock(ModBlocks.CYAN_CONCRETE_STAIRS.get(), Blocks.CYAN_CONCRETE);
        makeStairsBlock(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), Blocks.LIGHT_BLUE_CONCRETE);
        makeStairsBlock(ModBlocks.BLUE_CONCRETE_STAIRS.get(), Blocks.BLUE_CONCRETE);
        makeStairsBlock(ModBlocks.PURPLE_CONCRETE_STAIRS.get(), Blocks.PURPLE_CONCRETE);
        makeStairsBlock(ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), Blocks.MAGENTA_CONCRETE);
        makeStairsBlock(ModBlocks.PINK_CONCRETE_STAIRS.get(), Blocks.PINK_CONCRETE);

        makeSlabBlock(ModBlocks.WHITE_CONCRETE_SLAB.get(), Blocks.WHITE_CONCRETE);
        makeSlabBlock(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), Blocks.LIGHT_GRAY_CONCRETE);
        makeSlabBlock(ModBlocks.GRAY_CONCRETE_SLAB.get(), Blocks.GRAY_CONCRETE);
        makeSlabBlock(ModBlocks.BLACK_CONCRETE_SLAB.get(), Blocks.BLACK_CONCRETE);
        makeSlabBlock(ModBlocks.BROWN_CONCRETE_SLAB.get(), Blocks.BROWN_CONCRETE);
        makeSlabBlock(ModBlocks.RED_CONCRETE_SLAB.get(), Blocks.RED_CONCRETE);
        makeSlabBlock(ModBlocks.ORANGE_CONCRETE_SLAB.get(), Blocks.ORANGE_CONCRETE);
        makeSlabBlock(ModBlocks.YELLOW_CONCRETE_SLAB.get(), Blocks.YELLOW_CONCRETE);
        makeSlabBlock(ModBlocks.LIME_CONCRETE_SLAB.get(), Blocks.LIME_CONCRETE);
        makeSlabBlock(ModBlocks.GREEN_CONCRETE_SLAB.get(), Blocks.GREEN_CONCRETE);
        makeSlabBlock(ModBlocks.CYAN_CONCRETE_SLAB.get(), Blocks.CYAN_CONCRETE);
        makeSlabBlock(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), Blocks.LIGHT_BLUE_CONCRETE);
        makeSlabBlock(ModBlocks.BLUE_CONCRETE_SLAB.get(), Blocks.BLUE_CONCRETE);
        makeSlabBlock(ModBlocks.PURPLE_CONCRETE_SLAB.get(), Blocks.PURPLE_CONCRETE);
        makeSlabBlock(ModBlocks.MAGENTA_CONCRETE_SLAB.get(), Blocks.MAGENTA_CONCRETE);
        makeSlabBlock(ModBlocks.PINK_CONCRETE_SLAB.get(), Blocks.PINK_CONCRETE);

        makeButtonBlock(ModBlocks.WHITE_CONCRETE_BUTTON.get(), Blocks.WHITE_CONCRETE);
        makeButtonBlock(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get(), Blocks.LIGHT_GRAY_CONCRETE);
        makeButtonBlock(ModBlocks.GRAY_CONCRETE_BUTTON.get(), Blocks.GRAY_CONCRETE);
        makeButtonBlock(ModBlocks.BLACK_CONCRETE_BUTTON.get(), Blocks.BLACK_CONCRETE);
        makeButtonBlock(ModBlocks.BROWN_CONCRETE_BUTTON.get(), Blocks.BROWN_CONCRETE);
        makeButtonBlock(ModBlocks.RED_CONCRETE_BUTTON.get(), Blocks.RED_CONCRETE);
        makeButtonBlock(ModBlocks.ORANGE_CONCRETE_BUTTON.get(), Blocks.ORANGE_CONCRETE);
        makeButtonBlock(ModBlocks.YELLOW_CONCRETE_BUTTON.get(), Blocks.YELLOW_CONCRETE);
        makeButtonBlock(ModBlocks.LIME_CONCRETE_BUTTON.get(), Blocks.LIME_CONCRETE);
        makeButtonBlock(ModBlocks.GREEN_CONCRETE_BUTTON.get(), Blocks.GREEN_CONCRETE);
        makeButtonBlock(ModBlocks.CYAN_CONCRETE_BUTTON.get(), Blocks.CYAN_CONCRETE);
        makeButtonBlock(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get(), Blocks.LIGHT_BLUE_CONCRETE);
        makeButtonBlock(ModBlocks.BLUE_CONCRETE_BUTTON.get(), Blocks.BLUE_CONCRETE);
        makeButtonBlock(ModBlocks.PURPLE_CONCRETE_BUTTON.get(), Blocks.PURPLE_CONCRETE);
        makeButtonBlock(ModBlocks.MAGENTA_CONCRETE_BUTTON.get(), Blocks.MAGENTA_CONCRETE);
        makeButtonBlock(ModBlocks.PINK_CONCRETE_BUTTON.get(), Blocks.PINK_CONCRETE);

        makePressurePlateBlock(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get(), Blocks.WHITE_CONCRETE);
        makePressurePlateBlock(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIGHT_GRAY_CONCRETE);
        makePressurePlateBlock(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get(), Blocks.GRAY_CONCRETE);
        makePressurePlateBlock(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get(), Blocks.BLACK_CONCRETE);
        makePressurePlateBlock(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get(), Blocks.BROWN_CONCRETE);
        makePressurePlateBlock(ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get(), Blocks.RED_CONCRETE);
        makePressurePlateBlock(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get(), Blocks.ORANGE_CONCRETE);
        makePressurePlateBlock(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get(), Blocks.YELLOW_CONCRETE);
        makePressurePlateBlock(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIME_CONCRETE);
        makePressurePlateBlock(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get(), Blocks.GREEN_CONCRETE);
        makePressurePlateBlock(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get(), Blocks.CYAN_CONCRETE);
        makePressurePlateBlock(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIGHT_BLUE_CONCRETE);
        makePressurePlateBlock(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get(), Blocks.BLUE_CONCRETE);
        makePressurePlateBlock(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get(), Blocks.PURPLE_CONCRETE);
        makePressurePlateBlock(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get(), Blocks.MAGENTA_CONCRETE);
        makePressurePlateBlock(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get(), Blocks.PINK_CONCRETE);

        makeLever(ModBlocks.WHITE_CONCRETE_LEVER.get(), Blocks.WHITE_CONCRETE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/white_concrete_lever"));
        makeLever(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.get(), Blocks.LIGHT_GRAY_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/light_gray_concrete_lever"));
        makeLever(ModBlocks.GRAY_CONCRETE_LEVER.get(), Blocks.GRAY_CONCRETE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/gray_concrete_lever"));
        makeLever(ModBlocks.BLACK_CONCRETE_LEVER.get(), Blocks.BLACK_CONCRETE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/black_concrete_lever"));
        makeLever(ModBlocks.BROWN_CONCRETE_LEVER.get(), Blocks.BROWN_CONCRETE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/brown_concrete_lever"));
        makeLever(ModBlocks.RED_CONCRETE_LEVER.get(), Blocks.RED_CONCRETE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/red_concrete_lever"));
        makeLever(ModBlocks.ORANGE_CONCRETE_LEVER.get(), Blocks.ORANGE_CONCRETE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/orange_concrete_lever"));
        makeLever(ModBlocks.YELLOW_CONCRETE_LEVER.get(), Blocks.YELLOW_CONCRETE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/yellow_concrete_lever"));
        makeLever(ModBlocks.LIME_CONCRETE_LEVER.get(), Blocks.LIME_CONCRETE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/lime_concrete_lever"));
        makeLever(ModBlocks.GREEN_CONCRETE_LEVER.get(), Blocks.GREEN_CONCRETE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/green_concrete_lever"));
        makeLever(ModBlocks.CYAN_CONCRETE_LEVER.get(), Blocks.CYAN_CONCRETE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/cyan_concrete_lever"));
        makeLever(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.get(), Blocks.LIGHT_BLUE_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/light_blue_concrete_lever"));
        makeLever(ModBlocks.BLUE_CONCRETE_LEVER.get(), Blocks.BLUE_CONCRETE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/blue_concrete_lever"));
        makeLever(ModBlocks.PURPLE_CONCRETE_LEVER.get(), Blocks.PURPLE_CONCRETE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/purple_concrete_lever"));
        makeLever(ModBlocks.MAGENTA_CONCRETE_LEVER.get(), Blocks.MAGENTA_CONCRETE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/magenta_concrete_lever"));
        makeLever(ModBlocks.PINK_CONCRETE_LEVER.get(), Blocks.PINK_CONCRETE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/pink_concrete_lever"));

        pillarBlockWithOverlay(ModBlocks.REINFORCED_WHITE_CONCRETE.get(), Blocks.WHITE_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));
        pillarBlockWithOverlay(ModBlocks.REINFORCED_LIGHT_GRAY_CONCRETE.get(), Blocks.LIGHT_GRAY_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));
        pillarBlockWithOverlay(ModBlocks.REINFORCED_GRAY_CONCRETE.get(), Blocks.GRAY_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));
        pillarBlockWithOverlay(ModBlocks.REINFORCED_BLACK_CONCRETE.get(), Blocks.BLACK_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));
        pillarBlockWithOverlay(ModBlocks.REINFORCED_BROWN_CONCRETE.get(), Blocks.BROWN_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));
        pillarBlockWithOverlay(ModBlocks.REINFORCED_RED_CONCRETE.get(), Blocks.RED_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));
        pillarBlockWithOverlay(ModBlocks.REINFORCED_ORANGE_CONCRETE.get(), Blocks.ORANGE_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));
        pillarBlockWithOverlay(ModBlocks.REINFORCED_YELLOW_CONCRETE.get(), Blocks.YELLOW_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));
        pillarBlockWithOverlay(ModBlocks.REINFORCED_LIME_CONCRETE.get(), Blocks.LIME_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));
        pillarBlockWithOverlay(ModBlocks.REINFORCED_GREEN_CONCRETE.get(), Blocks.GREEN_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));
        pillarBlockWithOverlay(ModBlocks.REINFORCED_CYAN_CONCRETE.get(), Blocks.CYAN_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));
        pillarBlockWithOverlay(ModBlocks.REINFORCED_LIGHT_BLUE_CONCRETE.get(), Blocks.LIGHT_BLUE_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));
        pillarBlockWithOverlay(ModBlocks.REINFORCED_BLUE_CONCRETE.get(), Blocks.BLUE_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));
        pillarBlockWithOverlay(ModBlocks.REINFORCED_PURPLE_CONCRETE.get(), Blocks.PURPLE_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));
        pillarBlockWithOverlay(ModBlocks.REINFORCED_MAGENTA_CONCRETE.get(), Blocks.MAGENTA_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));
        pillarBlockWithOverlay(ModBlocks.REINFORCED_PINK_CONCRETE.get(), Blocks.PINK_CONCRETE,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/reinforced_concrete_overlay"));

        pillarBlockWithOverlay(ModBlocks.STONE_CHIMNEY.get(), Blocks.STONE_BRICKS, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.MOSSY_STONE_CHIMNEY.get(), Blocks.MOSSY_STONE_BRICKS, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.CRACKED_STONE_CHIMNEY.get(), Blocks.CRACKED_STONE_BRICKS,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.DEEPSLATE_CHIMNEY.get(), Blocks.DEEPSLATE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.CRACKED_DEEPSLATE_CHIMNEY.get(), Blocks.CRACKED_DEEPSLATE_BRICKS,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.BRICKS_CHIMNEY.get(), Blocks.BRICKS, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.MUD_CHIMNEY.get(), Blocks.MUD_BRICKS, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.BLACKSTONE_CHIMNEY.get(), Blocks.POLISHED_BLACKSTONE_BRICKS,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.CRACKED_BLACKSTONE_CHIMNEY.get(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.BLACK_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_BLACK_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.WHITE_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_WHITE_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.ORANGE_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_ORANGE_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.MAGENTA_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_MAGENTA_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.LIGHT_BLUE_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_LIGHT_BLUE_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.YELLOW_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_YELLOW_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.LIME_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_LIME_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.PINK_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_PINK_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.GRAY_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_GRAY_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.LIGHT_GRAY_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_LIGHT_GRAY_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.CYAN_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_CYAN_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.PURPLE_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_PURPLE_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.BLUE_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_BLUE_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.BROWN_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_BROWN_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.GREEN_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_GREEN_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));
        pillarBlockWithOverlay(ModBlocks.RED_CONCRETE_CHIMNEY.get(), ModBlocks.POLISHED_RED_CONCRETE.get(),
                ResourceLocation.fromNamespaceAndPath(References.MODID, "block/chimney_overlay"));

        makeBlockFromParentModel(ModBlocks.IRON_FLUE.get(), "flue");
        makeBlockFromParentModel(ModBlocks.COPPER_FLUE.get(), "flue");

        flowerBoxBlock(ModBlocks.BLACKSTONE_FLOWER_BOX.get(), Blocks.CHISELED_POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE);
        flowerBoxBlock(ModBlocks.TUFF_FLOWER_BOX.get(), Blocks.CHISELED_TUFF_BRICKS, Blocks.POLISHED_TUFF);
        flowerBoxBlock(ModBlocks.NETHER_FLOWER_BOX.get(), Blocks.CHISELED_NETHER_BRICKS, Blocks.NETHER_BRICKS);
        flowerBoxBlock(ModBlocks.SANDSTONE_FLOWER_BOX.get(), Blocks.CHISELED_SANDSTONE, Blocks.CUT_SANDSTONE);
        flowerBoxBlock(ModBlocks.RED_SANDSTONE_FLOWER_BOX.get(), Blocks.CHISELED_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE);
        flowerBoxBlock(ModBlocks.DEEPSLATE_FLOWER_BOX.get(), Blocks.CHISELED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE);
        flowerBoxBlock(ModBlocks.STONE_FLOWER_BOX.get(), Blocks.CHISELED_STONE_BRICKS, Blocks.SMOOTH_STONE);
        flowerBoxBlock(ModBlocks.QUARTZ_FLOWER_BOX.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_PILLAR);
        flowerBoxBlock(ModBlocks.BLACK_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_BLACK_CONCRETE.get(), ModBlocks.POLISHED_BLACK_CONCRETE.get());
        flowerBoxBlock(ModBlocks.WHITE_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_WHITE_CONCRETE.get(), ModBlocks.POLISHED_WHITE_CONCRETE.get());
        flowerBoxBlock(ModBlocks.ORANGE_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_ORANGE_CONCRETE.get(), ModBlocks.POLISHED_ORANGE_CONCRETE.get());
        flowerBoxBlock(ModBlocks.MAGENTA_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_MAGENTA_CONCRETE.get(), ModBlocks.POLISHED_MAGENTA_CONCRETE.get());
        flowerBoxBlock(ModBlocks.LIGHT_BLUE_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_LIGHT_BLUE_CONCRETE.get(), ModBlocks.POLISHED_LIGHT_BLUE_CONCRETE.get());
        flowerBoxBlock(ModBlocks.YELLOW_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_YELLOW_CONCRETE.get(), ModBlocks.POLISHED_YELLOW_CONCRETE.get());
        flowerBoxBlock(ModBlocks.LIME_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_LIME_CONCRETE.get(), ModBlocks.POLISHED_LIME_CONCRETE.get());
        flowerBoxBlock(ModBlocks.PINK_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_PINK_CONCRETE.get(), ModBlocks.POLISHED_PINK_CONCRETE.get());
        flowerBoxBlock(ModBlocks.GRAY_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_GRAY_CONCRETE.get(), ModBlocks.POLISHED_GRAY_CONCRETE.get());
        flowerBoxBlock(ModBlocks.LIGHT_GRAY_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_LIGHT_GRAY_CONCRETE.get(), ModBlocks.POLISHED_LIGHT_GRAY_CONCRETE.get());
        flowerBoxBlock(ModBlocks.CYAN_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_CYAN_CONCRETE.get(), ModBlocks.POLISHED_CYAN_CONCRETE.get());
        flowerBoxBlock(ModBlocks.PURPLE_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_PURPLE_CONCRETE.get(), ModBlocks.POLISHED_PURPLE_CONCRETE.get());
        flowerBoxBlock(ModBlocks.BLUE_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_BLUE_CONCRETE.get(), ModBlocks.POLISHED_BLUE_CONCRETE.get());
        flowerBoxBlock(ModBlocks.BROWN_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_BROWN_CONCRETE.get(), ModBlocks.POLISHED_BROWN_CONCRETE.get());
        flowerBoxBlock(ModBlocks.GREEN_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_GREEN_CONCRETE.get(), ModBlocks.POLISHED_GREEN_CONCRETE.get());
        flowerBoxBlock(ModBlocks.RED_CONCRETE_FLOWER_BOX.get(), ModBlocks.CHISELED_RED_CONCRETE.get(), ModBlocks.POLISHED_RED_CONCRETE.get());

        makeSimpleBlock(ModBlocks.BLACK_BRICKS.get());
        makeSimpleBlock(ModBlocks.WHITE_BRICKS.get());
        makeSimpleBlock(ModBlocks.ORANGE_BRICKS.get());
        makeSimpleBlock(ModBlocks.MAGENTA_BRICKS.get());
        makeSimpleBlock(ModBlocks.LIGHT_BLUE_BRICKS.get());
        makeSimpleBlock(ModBlocks.YELLOW_BRICKS.get());
        makeSimpleBlock(ModBlocks.LIME_BRICKS.get());
        makeSimpleBlock(ModBlocks.PINK_BRICKS.get());
        makeSimpleBlock(ModBlocks.GRAY_BRICKS.get());
        makeSimpleBlock(ModBlocks.LIGHT_GRAY_BRICKS.get());
        makeSimpleBlock(ModBlocks.CYAN_BRICKS.get());
        makeSimpleBlock(ModBlocks.PURPLE_BRICKS.get());
        makeSimpleBlock(ModBlocks.BLUE_BRICKS.get());
        makeSimpleBlock(ModBlocks.BROWN_BRICKS.get());
        makeSimpleBlock(ModBlocks.GREEN_BRICKS.get());
        makeSimpleBlock(ModBlocks.RED_BRICKS.get());

        makeStairsBlock(ModBlocks.WHITE_BRICK_STAIRS.get(), ModBlocks.WHITE_BRICKS.get());
        makeStairsBlock(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get(), ModBlocks.LIGHT_GRAY_BRICKS.get());
        makeStairsBlock(ModBlocks.GRAY_BRICK_STAIRS.get(), ModBlocks.GRAY_BRICKS.get());
        makeStairsBlock(ModBlocks.BLACK_BRICK_STAIRS.get(), ModBlocks.BLACK_BRICKS.get());
        makeStairsBlock(ModBlocks.BROWN_BRICK_STAIRS.get(), ModBlocks.BROWN_BRICKS.get());
        makeStairsBlock(ModBlocks.RED_BRICK_STAIRS.get(), ModBlocks.RED_BRICKS.get());
        makeStairsBlock(ModBlocks.ORANGE_BRICK_STAIRS.get(), ModBlocks.ORANGE_BRICKS.get());
        makeStairsBlock(ModBlocks.YELLOW_BRICK_STAIRS.get(), ModBlocks.YELLOW_BRICKS.get());
        makeStairsBlock(ModBlocks.LIME_BRICK_STAIRS.get(), ModBlocks.LIME_BRICKS.get());
        makeStairsBlock(ModBlocks.GREEN_BRICK_STAIRS.get(), ModBlocks.GREEN_BRICKS.get());
        makeStairsBlock(ModBlocks.CYAN_BRICK_STAIRS.get(), ModBlocks.CYAN_BRICKS.get());
        makeStairsBlock(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get(), ModBlocks.LIGHT_BLUE_BRICKS.get());
        makeStairsBlock(ModBlocks.BLUE_BRICK_STAIRS.get(), ModBlocks.BLUE_BRICKS.get());
        makeStairsBlock(ModBlocks.PURPLE_BRICK_STAIRS.get(), ModBlocks.PURPLE_BRICKS.get());
        makeStairsBlock(ModBlocks.MAGENTA_BRICK_STAIRS.get(), ModBlocks.MAGENTA_BRICKS.get());
        makeStairsBlock(ModBlocks.PINK_BRICK_STAIRS.get(), ModBlocks.PINK_BRICKS.get());

        makeSlabBlock(ModBlocks.WHITE_BRICK_SLAB.get(), ModBlocks.WHITE_BRICKS.get());
        makeSlabBlock(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get(), ModBlocks.LIGHT_GRAY_BRICKS.get());
        makeSlabBlock(ModBlocks.GRAY_BRICK_SLAB.get(), ModBlocks.GRAY_BRICKS.get());
        makeSlabBlock(ModBlocks.BLACK_BRICK_SLAB.get(), ModBlocks.BLACK_BRICKS.get());
        makeSlabBlock(ModBlocks.BROWN_BRICK_SLAB.get(), ModBlocks.BROWN_BRICKS.get());
        makeSlabBlock(ModBlocks.RED_BRICK_SLAB.get(), ModBlocks.RED_BRICKS.get());
        makeSlabBlock(ModBlocks.ORANGE_BRICK_SLAB.get(), ModBlocks.ORANGE_BRICKS.get());
        makeSlabBlock(ModBlocks.YELLOW_BRICK_SLAB.get(), ModBlocks.YELLOW_BRICKS.get());
        makeSlabBlock(ModBlocks.LIME_BRICK_SLAB.get(), ModBlocks.LIME_BRICKS.get());
        makeSlabBlock(ModBlocks.GREEN_BRICK_SLAB.get(), ModBlocks.GREEN_BRICKS.get());
        makeSlabBlock(ModBlocks.CYAN_BRICK_SLAB.get(), ModBlocks.CYAN_BRICKS.get());
        makeSlabBlock(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get(), ModBlocks.LIGHT_BLUE_BRICKS.get());
        makeSlabBlock(ModBlocks.BLUE_BRICK_SLAB.get(), ModBlocks.BLUE_BRICKS.get());
        makeSlabBlock(ModBlocks.PURPLE_BRICK_SLAB.get(), ModBlocks.PURPLE_BRICKS.get());
        makeSlabBlock(ModBlocks.MAGENTA_BRICK_SLAB.get(), ModBlocks.MAGENTA_BRICKS.get());
        makeSlabBlock(ModBlocks.PINK_BRICK_SLAB.get(), ModBlocks.PINK_BRICKS.get());

        wallBlock(((WallBlock) ModBlocks.BLACK_BRICK_WALL.get()), blockTexture(ModBlocks.BLACK_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.WHITE_BRICK_WALL.get()), blockTexture(ModBlocks.WHITE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.ORANGE_BRICK_WALL.get()), blockTexture(ModBlocks.ORANGE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.MAGENTA_BRICK_WALL.get()), blockTexture(ModBlocks.MAGENTA_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_BLUE_BRICK_WALL.get()), blockTexture(ModBlocks.LIGHT_BLUE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.YELLOW_BRICK_WALL.get()), blockTexture(ModBlocks.YELLOW_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.LIME_BRICK_WALL.get()), blockTexture(ModBlocks.LIME_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.PINK_BRICK_WALL.get()), blockTexture(ModBlocks.PINK_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.GRAY_BRICK_WALL.get()), blockTexture(ModBlocks.GRAY_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_GRAY_BRICK_WALL.get()), blockTexture(ModBlocks.LIGHT_GRAY_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.CYAN_BRICK_WALL.get()), blockTexture(ModBlocks.CYAN_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.PURPLE_BRICK_WALL.get()), blockTexture(ModBlocks.PURPLE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.BLUE_BRICK_WALL.get()), blockTexture(ModBlocks.BLUE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.BROWN_BRICK_WALL.get()), blockTexture(ModBlocks.BROWN_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.GREEN_BRICK_WALL.get()), blockTexture(ModBlocks.GREEN_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.RED_BRICK_WALL.get()), blockTexture(ModBlocks.RED_BRICKS.get()));

        makeBlockFromParentModel(ModBlocks.LIGHTING_ROD.get(), "torch_like");
        makeHorizontalBlock(ModBlocks.WALL_LIGHTING_ROD.get(), "wall_torch_like", ResourceLocation.fromNamespaceAndPath(References.MODID, "block/lighting_rod"));

        makeBarsBlock(ModBlocks.WIRE_FENCE.get());
        makeBarsBlock(ModBlocks.CHAIN_LINK_FENCE.get());
        makeBarsBlock(ModBlocks.MESH_FENCE.get());
        makeBarsBlock(ModBlocks.BARBED_WIRE_FENCE.get());

        makeSimpleBlockWithRenderType(ModBlocks.IRON_GRATE.get(), RenderType.cutoutMipped());

        blockWithFaceOverlays(ModBlocks.STONE_GABION_FENCE.get(), Blocks.COBBLESTONE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/iron_grate"));
        blockWithFaceOverlays(ModBlocks.MOSSY_STONE_GABION_FENCE.get(), Blocks.MOSSY_COBBLESTONE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/iron_grate"));
        blockWithFaceOverlays(ModBlocks.DEEPSLATE_GABION_FENCE.get(), Blocks.COBBLED_DEEPSLATE, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/iron_grate"));
    }

    private final String emissiveTexturesSuffix = "_e";

    private void makeBlockItemFromExistingModel(Block block) {
        final ModelFile model = models().getExistingFile(BuiltInRegistries.BLOCK.getKey(block));
        simpleBlockItem(block, model);
    }


    private void makeBlockFromParentModel(Block block, String parentModel) {
        String blockTexture = BuiltInRegistries.BLOCK.getKey(block).getPath();

        ModelFile model = models().withExistingParent(blockTexture, References.MODID + ":block/" + parentModel).texture("texture", "block/" + blockTexture);

        simpleBlock(block, model);
        makeBlockItemFromExistingModel(block);
    }


    private void makeLever(LeverBlock block, Block baseBlock, ResourceLocation leverTexture) {
        String blockPath = BuiltInRegistries.BLOCK.getKey(block).getPath();
        ResourceLocation baseTexture = BuiltInRegistries.BLOCK.getKey(baseBlock);

        BlockModelBuilder leverOffModel = models().withExistingParent(blockPath + "_off", mcLoc("block/lever"))
                .texture("base", ResourceLocation.fromNamespaceAndPath(baseTexture.getNamespace(), "block/" + baseTexture.getPath())).texture("lever", leverTexture.toString())
                .texture("particle", ResourceLocation.fromNamespaceAndPath(baseTexture.getNamespace(), "block/" + baseTexture.getPath()));

        BlockModelBuilder leverOnModel = models().withExistingParent(blockPath + "_on", mcLoc("block/lever_on"))
                .texture("base", ResourceLocation.fromNamespaceAndPath(baseTexture.getNamespace(), "block/" + baseTexture.getPath())).texture("lever", leverTexture.toString())
                .texture("particle", ResourceLocation.fromNamespaceAndPath(baseTexture.getNamespace(), "block/" + baseTexture.getPath()));

        EnumProperty<AttachFace> FACE = BlockStateProperties.ATTACH_FACE; // values: floor, wall, ceiling
        DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING; // north,east,south,west
        BooleanProperty POWERED = BlockStateProperties.POWERED;

        getVariantBuilder(block).forAllStates(state -> {
            boolean powered = state.getValue(POWERED);
            AttachFace face = state.getValue(FACE);
            Direction facing = state.getValue(FACING);

            BlockModelBuilder modelFile = powered ? leverOnModel : leverOffModel;

            int xRot = 0;
            int yRot = 0;

            switch (face) {
                case FLOOR -> xRot = 0;
                case CEILING -> xRot = 180;
                case WALL -> xRot = 90;
            }

            switch (face) {
                case FLOOR -> {
                    yRot = switch (facing) {
                        case NORTH -> 0;
                        case EAST -> 90;
                        case SOUTH -> 180;
                        case WEST -> 270;
                        default -> 0;
                    };
                }
                case WALL -> {
                    yRot = switch (facing) {
                        case NORTH -> 0;
                        case EAST -> 90;
                        case SOUTH -> 180;
                        case WEST -> 270;
                        default -> 0;
                    };
                }
                case CEILING -> {
                    yRot = switch (facing) {
                        case NORTH -> 180;
                        case EAST -> 270;
                        case SOUTH -> 0;
                        case WEST -> 90;
                        default -> 0;
                    };
                }
            }

            return ConfiguredModel.builder().modelFile(modelFile).rotationX(xRot).rotationY(yRot).uvLock(false).build();
        });
    }


    private void makeSimpleBlock(Block block) {
        simpleBlock(block);
        makeBlockItemFromExistingModel(block);
    }


    private void makeHorizontalBlock(Block block, String parentModel) {
        String blockTexture = BuiltInRegistries.BLOCK.getKey(block).getPath();
        ModelFile model = models().withExistingParent(blockTexture, References.MODID + ":block/" + parentModel).texture("texture", "block/" + blockTexture);

        horizontalBlock(block, model);
        makeBlockItemFromExistingModel(block);
    }


    private void makeHorizontalBlock(Block block, String parentModel, ResourceLocation texture) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        ModelFile model = models().withExistingParent(name, References.MODID + ":block/" + parentModel).texture("texture", texture);

        horizontalBlock(block, model);
        makeBlockItemFromExistingModel(block);
    }


    private void makePillarBlock(RotatedPillarBlock block) {
        axisBlock(block);
        makeBlockItemFromExistingModel(block);
    }


    private void makeBarsBlock(IronBarsBlock block) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();

        paneBlockWithRenderType(block, modLoc("block/" + name), modLoc("block/" + name), ResourceLocation.withDefaultNamespace(RenderType.CUTOUT_MIPPED.name));
    }


    private void makeSimpleBlockWithRenderType(Block block, RenderType renderType) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();

        BlockModelBuilder builder = models().getBuilder(name).parent(new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace("block/cube_all")))
                .texture("all", ResourceLocation.fromNamespaceAndPath(References.MODID, "block/" + name)).renderType(mcLoc(renderType.name));

        simpleBlock(block, builder);
        makeBlockItemFromExistingModel(block);
    }


    private void makeStairsBlock(StairBlock block, Block baseBlock) {
        ResourceLocation location = BuiltInRegistries.BLOCK.getKey(baseBlock);
        String texture = location.getPath();

        stairsBlock(block, ResourceLocation.fromNamespaceAndPath(location.getNamespace(), "block/" + texture));
        makeBlockItemFromExistingModel(block);
    }


    private void makeButtonBlock(ButtonBlock block, Block baseBlock) {
        ResourceLocation location = BuiltInRegistries.BLOCK.getKey(baseBlock);
        String texture = location.getPath();

        buttonBlock(block, ResourceLocation.fromNamespaceAndPath(location.getNamespace(), "block/" + texture));
        makeBlockItemFromExistingModel(block);
    }


    private void blockWithFaceOverlays(Block block, Block baseBlock, ResourceLocation overlayTexture) {
        ResourceLocation baseKey = BuiltInRegistries.BLOCK.getKey(baseBlock);
        String path = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String texture = baseKey.getPath();
        ResourceLocation baseTexture = ResourceLocation.fromNamespaceAndPath(baseKey.getNamespace(), "block/" + texture);

        BlockModelBuilder model = models().withExistingParent(path, mcLoc("block/cube_all")).texture("all", baseTexture).texture("overlay", overlayTexture)
                .texture("particle", baseTexture).renderType(mcLoc("cutout"));

        model.element().from(0, 0, 0).to(16, 16, 16).face(Direction.UP).uvs(0, 0, 16, 16).texture("#all").end().face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#all").end()
                .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#all").end().face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#all").end().face(Direction.EAST).uvs(0, 0, 16, 16)
                .texture("#all").end().face(Direction.WEST).uvs(0, 0, 16, 16).texture("#all").end().end();

        model.element().from(0, 15.5F, 0).to(16, 16, 16).face(Direction.UP).uvs(0, 0, 16, 16).texture("#overlay").end().end();
        model.element().from(0, 0, 0).to(16, 0.5F, 16).face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#overlay").end().end();
        model.element().from(0, 0, 0).to(16, 16, 0.5F).face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#overlay").end().end();
        model.element().from(0, 0, 15.5F).to(16, 16, 16).face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#overlay").end().end();
        model.element().from(0, 0, 0).to(0.5F, 16, 16).face(Direction.WEST).uvs(0, 0, 16, 16).texture("#overlay").end().end();
        model.element().from(15.5F, 0, 0).to(16, 16, 16).face(Direction.EAST).uvs(0, 0, 16, 16).texture("#overlay").end().end();

        simpleBlockItem(block, models().getExistingFile(modLoc("block/" + path)));
        simpleBlock(block, models().getExistingFile(modLoc("block/" + path)));
    }


    private void makePressurePlateBlock(PressurePlateBlock block, Block baseBlock) {
        ResourceLocation location = BuiltInRegistries.BLOCK.getKey(baseBlock);
        String texture = location.getPath();

        pressurePlateBlock(block, ResourceLocation.fromNamespaceAndPath(location.getNamespace(), "block/" + texture));
        makeBlockItemFromExistingModel(block);
    }


    private void makeSlabBlock(SlabBlock block, Block baseBlock) {
        ResourceLocation location = BuiltInRegistries.BLOCK.getKey(baseBlock);
        String texture = location.getPath();

        slabBlock(block, ResourceLocation.fromNamespaceAndPath(location.getNamespace(), "block/" + texture),
                ResourceLocation.fromNamespaceAndPath(location.getNamespace(), "block/" + texture));
        makeBlockItemFromExistingModel(block);
    }


    private void makeBlockFromParentModel(Block block, ResourceLocation location) {
        String blockTexture = BuiltInRegistries.BLOCK.getKey(block).getPath();

        ModelFile model = models().withExistingParent(blockTexture, location);

        simpleBlock(block, model);
        makeBlockItemFromExistingModel(block);
    }


    private void customLamp(Block block) {
        String texture = BuiltInRegistries.BLOCK.getKey(block).getPath();

        getVariantBuilder(block).forAllStates(state -> {
            if (state.getValue(RedstoneLampBlock.LIT)) {
                return new ConfiguredModel[]{
                        new ConfiguredModel(models().cubeAll(texture + "_on", ResourceLocation.fromNamespaceAndPath(References.MODID, "block/" + texture + "_on")))};
            } else {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll(texture + "_off", ResourceLocation.fromNamespaceAndPath(References.MODID, "block/" + texture)))};
            }
        });

        simpleBlockItem(block, models().cubeAll(texture, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/" + texture)));
    }


    private void customTranslucentLamp(Block block) {
        String texture = BuiltInRegistries.BLOCK.getKey(block).getPath();
        ResourceLocation translucent = ResourceLocation.fromNamespaceAndPath(ResourceLocation.DEFAULT_NAMESPACE, "translucent");

        getVariantBuilder(block).forAllStates(state -> {
            if (state.getValue(RedstoneLampBlock.LIT)) {
                return new ConfiguredModel[]{new ConfiguredModel(
                        models().cubeAll(texture + "_on", ResourceLocation.fromNamespaceAndPath(References.MODID, "block/" + texture + "_on")).renderType(translucent))};
            } else {
                return new ConfiguredModel[]{
                        new ConfiguredModel(models().cubeAll(texture, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/" + texture)).renderType(translucent))};
            }
        });

        simpleBlockItem(block, models().cubeAll(texture, ResourceLocation.fromNamespaceAndPath(References.MODID, "block/" + texture)).renderType(translucent));
    }


    private void customLantern(Block block) {
        String texture = BuiltInRegistries.BLOCK.getKey(block).getPath();
        ResourceLocation sideOn = ResourceLocation.fromNamespaceAndPath(References.MODID, "block/" + texture + "_on");
        ResourceLocation sideOff = ResourceLocation.fromNamespaceAndPath(References.MODID, "block/" + texture);
        ResourceLocation end = ResourceLocation.fromNamespaceAndPath(References.MODID, "block/" + texture + "_end");

        getVariantBuilder(block).forAllStates(state -> {
            if (state.getValue(RedstoneLampBlock.LIT)) {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeColumnHorizontal(texture + "_on", sideOn, end))};
            } else {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeColumnHorizontal(texture, sideOff, end))};
            }
        });

        simpleBlockItem(block, models().cubeColumnHorizontal(texture, sideOff, end));
    }


    private void pillarBlockWithOverlay(RotatedPillarBlock block, Block baseBlock, ResourceLocation overlayTexture) {
        ResourceLocation baseKey = BuiltInRegistries.BLOCK.getKey(baseBlock);
        String path = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String texture = baseKey.getPath();
        ResourceLocation baseTexture = ResourceLocation.fromNamespaceAndPath(baseKey.getNamespace(), "block/" + texture);

        BlockModelBuilder model = models().withExistingParent(path, mcLoc("block/cube_all")).texture("all", baseTexture).texture("overlay", overlayTexture)
                .texture("particle", baseTexture).renderType(mcLoc("cutout"));

        model.element().from(0, 0, 0).to(16, 16, 16).face(Direction.UP).uvs(0, 0, 16, 16).texture("#all").end().face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#all").end()
                .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#all").end().face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#all").end().face(Direction.EAST).uvs(0, 0, 16, 16)
                .texture("#all").end().face(Direction.WEST).uvs(0, 0, 16, 16).texture("#all").end().end();

        model.element().from(0, 15.5F, 0).to(16, 16, 16).face(Direction.UP).uvs(0, 0, 16, 16).texture("#overlay").end().end();

        model.element().from(0, 0, 0).to(16, 0.5F, 16).face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#overlay").end().end();

        simpleBlockItem(block, models().getExistingFile(modLoc("block/" + path)));

        getVariantBuilder(block).forAllStates(state -> {
            Direction.Axis axis = state.getValue(RotatedPillarBlock.AXIS);

            ConfiguredModel.Builder cfg = ConfiguredModel.builder().modelFile(models().getExistingFile(modLoc("block/" + path)));

            if (axis == Direction.Axis.Y) {
                return cfg.build();
            } else if (axis == Direction.Axis.Z) {
                return cfg.rotationX(90).build();
            } else { // Axis.X
                return cfg.rotationX(90).rotationY(90).build();
            }
        });
    }


    private void trafficSignBlock(TrafficSignBlock block, SignShape shape) {
        String frontTexture = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String backTexture = shape.toString() + "_sign_back";

        getVariantBuilder(block).forAllStates(state -> {
            ModelFile model = models().withExistingParent(frontTexture, References.MODID + ":block/traffic_sign").texture("front", "block/" + frontTexture).texture("back",
                    modLoc("block/" + backTexture));

            Direction dir = state.getValue(AsphaltBlock.FACING);
            int x = 0;
            int y = 0;

            switch (dir) {
                case EAST :
                    y = 270;
                    break;
                case NORTH :
                    y = 180;
                    break;
                case SOUTH :
                    break;
                case WEST :
                    y = 90;
                    break;
                default :
                    break;
            }

            return ConfiguredModel.builder().modelFile(model).rotationX(x).rotationY(y).build();
        });

        makeBlockItemFromExistingModel(block);
    }


    private void wallSignBlock(WallSignBlock block, SignShape shape) {
        String frontTexture = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String backTexture = shape.toString() + "_sign_back";

        getVariantBuilder(block).forAllStates(state -> {
            ModelFile model = models().withExistingParent(frontTexture, References.MODID + ":block/wall_sign").texture("front", "block/" + frontTexture).texture("back",
                    modLoc("block/" + backTexture));

            Direction dir = state.getValue(AsphaltBlock.FACING);
            int x = 0;
            int y = 0;

            switch (dir) {
                case EAST :
                    y = 270;
                    break;
                case NORTH :
                    y = 180;
                    break;
                case SOUTH :
                    break;
                case WEST :
                    y = 90;
                    break;
                default :
                    break;
            }

            return ConfiguredModel.builder().modelFile(model).rotationX(x).rotationY(y).build();
        });

        makeBlockItemFromExistingModel(block);
    }


    private void flowerBoxBlock(Block block, Block baseBlock, Block endBlock) {
        String blockTexture = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String sideTexture = BuiltInRegistries.BLOCK.getKey(baseBlock).getPath();
        String endTexture = BuiltInRegistries.BLOCK.getKey(endBlock).getPath();
        ResourceLocation overlayTexture = ResourceLocation.fromNamespaceAndPath(References.MODID, "block/flower_box_top");

        BlockModelBuilder base = models().withExistingParent(blockTexture, modLoc("block/flower_box")).texture("side", getLoc(baseBlock) + sideTexture)
                .texture("top", getLoc(endBlock) + endTexture).texture("bottom", getLoc(endBlock) + endTexture).texture("overlay", overlayTexture)
                .texture("particle", getLoc(baseBlock) + sideTexture).renderType(mcLoc(RenderType.CUTOUT.name));

        simpleBlock(block, base);
        makeBlockItemFromExistingModel(block);
    }


    private void directionalAsphaltBlock(AsphaltBlock block) {
        String asphaltTexture = BuiltInRegistries.BLOCK.getKey(ModBlocks.ASPHALT_BLOCK.get()).getPath();
        String blockTexture = BuiltInRegistries.BLOCK.getKey(block).getPath();

        getVariantBuilder(block).forAllStates(state -> {
            ModelFile model = models().withExistingParent(blockTexture, References.MODID + ":block/directional_cube").texture("down", "block/" + blockTexture) // down
                    .texture("up", "block/" + blockTexture) // up
                    .texture("north", "block/" + blockTexture) // north
                    .texture("south", "block/" + blockTexture) // south
                    .texture("east", "block/" + asphaltTexture) // east
                    .texture("west", "block/" + asphaltTexture) // west
                    .texture("particle", modLoc("block/" + asphaltTexture));

            Direction dir = state.getValue(AsphaltBlock.FACING);
            int x = 0;
            int y = 0;

            switch (dir) {
                case EAST :
                    y = 270;
                    break;
                case NORTH :
                    y = 180;
                    break;
                case SOUTH :
                    break;
                case WEST :
                    y = 90;
                    break;
                default :
                    break;
            }

            return ConfiguredModel.builder().modelFile(model).rotationX(x).rotationY(y).build();
        });

        makeBlockItemFromExistingModel(block);
    }


    private void asphaltSlab(AsphaltSlabBlock block) {
        String blockTexture = BuiltInRegistries.BLOCK.getKey(block).getPath().replace("_slab", "");

        slabBlock((SlabBlock) block, modLoc("block/" + blockTexture), modLoc("block/" + blockTexture));
        makeBlockItemFromExistingModel(block);
    }


    private void directionalAsphaltSlab(AsphaltSlabBlock block) {
        String asphaltTexture = BuiltInRegistries.BLOCK.getKey(ModBlocks.ASPHALT_BLOCK.get()).getPath();
        String blockTexture = BuiltInRegistries.BLOCK.getKey(block).getPath().replace("_slab", "");

        ModelFile bottom = models().withExistingParent(blockTexture + "_slab", References.MODID + ":block/directional_slab").texture("down", "block/" + blockTexture) // down
                .texture("up", "block/" + blockTexture) // up
                .texture("north", "block/" + blockTexture) // north
                .texture("south", "block/" + blockTexture) // south
                .texture("east", "block/" + asphaltTexture) // east
                .texture("west", "block/" + asphaltTexture) // west
                .texture("particle", modLoc("block/" + asphaltTexture));

        ModelFile top = models().withExistingParent(blockTexture + "_slab_top", References.MODID + ":block/directional_slab_top").texture("down", "block/" + blockTexture) // down
                .texture("up", "block/" + blockTexture) // up
                .texture("north", "block/" + blockTexture) // north
                .texture("south", "block/" + blockTexture) // south
                .texture("east", "block/" + asphaltTexture) // east
                .texture("west", "block/" + asphaltTexture) // west
                .texture("particle", modLoc("block/" + asphaltTexture));

        ModelFile full = models().withExistingParent(blockTexture, References.MODID + ":block/directional_cube").texture("down", "block/" + blockTexture) // down
                .texture("up", "block/" + blockTexture) // up
                .texture("north", "block/" + blockTexture) // north
                .texture("south", "block/" + blockTexture) // south
                .texture("east", "block/" + asphaltTexture) // east
                .texture("west", "block/" + asphaltTexture) // west
                .texture("particle", modLoc("block/" + asphaltTexture));

        getVariantBuilder(block).forAllStates(state -> {
            SlabType type = state.getValue(AsphaltSlabBlock.TYPE);
            Direction dir = state.getValue(AsphaltSlabBlock.FACING);
            int x = 0;
            int y = 0;

            switch (dir) {
                case EAST :
                    y = 270;
                    break;
                case NORTH :
                    y = 180;
                    break;
                case SOUTH :
                    break;
                case WEST :
                    y = 90;
                    break;
                default :
                    break;
            }

            return ConfiguredModel.builder().modelFile(type == SlabType.BOTTOM ? bottom : type == SlabType.TOP ? top : full).rotationX(x).rotationY(y).build();
        });

        makeBlockItemFromExistingModel(block);
    }


    private void variableTrafficSign(VariableTrafficSignBlock block) {
        String blockTexture = BuiltInRegistries.BLOCK.getKey(block).getPath();

        ModelFile model = models().withExistingParent(blockTexture, References.MODID + ":block/variable_traffic_signs").texture("texture",
                "block/" + blockTexture + emissiveTexturesSuffix);
        ModelFile model_off = models().withExistingParent(blockTexture + "_off", References.MODID + ":block/variable_traffic_signs_off");

        getVariantBuilder(block).forAllStates(state -> {
            Boolean lit = state.getValue(VariableTrafficSignBlock.LIT);
            Direction dir = state.getValue(VariableTrafficSignBlock.FACING);
            int x = 0;
            int y = 0;

            switch (dir) {
                case EAST :
                    y = 270;
                    break;
                case NORTH :
                    y = 180;
                    break;
                case SOUTH :
                    break;
                case WEST :
                    y = 90;
                    break;
                default :
                    break;
            }

            return ConfiguredModel.builder().modelFile(lit == true ? model : model_off).rotationX(x).rotationY(y).build();
        });

        makeBlockItemFromExistingModel(block);
    }


    private void trafficLights(TrafficLightBlock block) {
        String blockTexture = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String modelType = Helper.getTrafficLightModelType(block);

        ModelFile model_red = models().withExistingParent(blockTexture + "_red", References.MODID + ":block/" + modelType).texture("texture", "block/" + blockTexture + "_red");
        ModelFile model_red_yellow = models().withExistingParent(blockTexture + "_yellow_red", References.MODID + ":block/" + modelType).texture("texture",
                "block/" + blockTexture + "_yellow_red");
        ModelFile model_green = models().withExistingParent(blockTexture + "_green", References.MODID + ":block/" + modelType).texture("texture",
                "block/" + blockTexture + "_green");
        ModelFile model_yellow = models().withExistingParent(blockTexture + "_yellow", References.MODID + ":block/" + modelType).texture("texture",
                "block/" + blockTexture + "_yellow");

        getVariantBuilder(block).forAllStates(state -> {
            LightPhase phase = state.getValue(TrafficLightBlock.PHASE);
            Direction dir = state.getValue(TrafficLightBlock.FACING);
            Boolean powered = state.getValue(TrafficLightBlock.POWERED);
            Boolean waterlogged = state.getValue(TrafficLightBlock.WATERLOGGED);

            int x = 0;
            int y = 0;

            switch (dir) {
                case EAST :
                    y = 270;
                    break;
                case NORTH :
                    y = 180;
                    break;
                case SOUTH :
                    y = 0;
                    break;
                case WEST :
                    y = 90;
                    break;
                default :
                    break;
            }

            ModelFile selectedModel;
            if (powered) {
                selectedModel = model_red;
            } else {
                selectedModel = switch (phase) {
                    case RED -> model_red;
                    case RED_YELLOW -> model_red_yellow;
                    case GREEN -> model_green;
                    case YELLOW -> model_yellow;
                };
            }

            return ConfiguredModel.builder().modelFile(selectedModel).rotationX(x).rotationY(y).build();
        });

        itemModels().withExistingParent(blockTexture, References.MODID + ":block/" + blockTexture + "_green");
    }


    private void signalLights(SignalLightBlock block) {
        String blockTexture = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String modelType = Helper.getTrafficLightModelType(block);

        ModelFile model = models().withExistingParent(blockTexture, References.MODID + ":block/" + modelType).texture("texture", "block/" + blockTexture);
        ModelFile model_off = models().withExistingParent(blockTexture + "_off", References.MODID + ":block/" + modelType).texture("texture", "block/" + blockTexture + "_off");

        getVariantBuilder(block).forAllStates(state -> {

            Boolean lit = state.getValue(VariableTrafficSignBlock.LIT);
            Direction dir = state.getValue(VariableTrafficSignBlock.FACING);
            int x = 0;
            int y = 0;

            switch (dir) {
                case EAST :
                    y = 270;
                    break;
                case NORTH :
                    y = 180;
                    break;
                case SOUTH :
                    break;
                case WEST :
                    y = 90;
                    break;
                default :
                    break;
            }


            return ConfiguredModel.builder().modelFile(lit == true ? model : model_off).rotationX(x).rotationY(y).build();
        });

        makeBlockItemFromExistingModel(block);
    }


    public static String getLoc(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block).getNamespace() + ":block/";
    }
}

// >
// https://github.com/Beethoven92/BetterEndForge/blob/master/src/main/java/mod/beethoven92/betterendforge/data/client/ModBlockStates.java
