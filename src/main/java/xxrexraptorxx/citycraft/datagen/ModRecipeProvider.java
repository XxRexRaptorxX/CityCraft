package xxrexraptorxx.citycraft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import xxrexraptorxx.citycraft.registry.ModBlocks;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output) {
        super(output);
    }


    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> writer) {
        slabRecipes(ModBlocks.ASPHALT_SLAB.get(), ModBlocks.ASPHALT_BLOCK.get(), writer);
        slabRecipes(ModBlocks.CRACKED_ASPHALT_SLAB.get(), ModBlocks.CRACKED_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.POTHOLE_ASPHALT_SLAB.get(), ModBlocks.POTHOLE_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.MOSSY_ASPHALT_SLAB.get(), ModBlocks.MOSSY_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.DIRTY_ASPHALT_SLAB.get(), ModBlocks.DIRTY_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.WHITE_ASPHALT_SLAB.get(), ModBlocks.WHITE_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.ORANGE_ASPHALT_SLAB.get(), ModBlocks.ORANGE_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.MAGENTA_ASPHALT_SLAB.get(), ModBlocks.MAGENTA_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.LIGHT_BLUE_ASPHALT_SLAB.get(), ModBlocks.LIGHT_BLUE_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.YELLOW_ASPHALT_SLAB.get(), ModBlocks.YELLOW_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.LIME_ASPHALT_SLAB.get(), ModBlocks.LIME_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.RED_ASPHALT_SLAB.get(), ModBlocks.RED_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.PINK_ASPHALT_SLAB.get(), ModBlocks.PINK_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.GRAY_ASPHALT_SLAB.get(), ModBlocks.GRAY_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.LIGHT_GRAY_ASPHALT_SLAB.get(), ModBlocks.LIGHT_GRAY_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.CYAN_ASPHALT_SLAB.get(), ModBlocks.CYAN_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.PURPLE_ASPHALT_SLAB.get(), ModBlocks.PURPLE_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.BLUE_ASPHALT_SLAB.get(), ModBlocks.BLUE_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.BROWN_ASPHALT_SLAB.get(), ModBlocks.BROWN_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.GREEN_ASPHALT_SLAB.get(), ModBlocks.GREEN_ASPHALT.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_HATCHING_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_HATCHING.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_FRAME_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_FRAME.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_EDGE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_HATCHING.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_FRAME_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_FRAME.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_EDGE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING.get(), writer);

        slabRecipes(ModBlocks.BOOST_ASPHALT_SLAB.get(), ModBlocks.BOOST_ASPHALT.get(), writer);

        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_A_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_A.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_B_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_B.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_C_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_C.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_D_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_D.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_E_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_E.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_F_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_F.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_G_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_G.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_H_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_H.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_I_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_I.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_J_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_J.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_K_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_K.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_L_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_L.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_M_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_M.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_N_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_N.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_O_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_O.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_P_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_P.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_Q_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_Q.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_R_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_R.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_S_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_S.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_T_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_T.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_U_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_U.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_V_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_V.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_W_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_W.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_X_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_X.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_Y_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_Y.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_Z_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_Z.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_A_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_A.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_B_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_B.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_C_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_C.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_D_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_D.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_E_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_E.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_F_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_F.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_G_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_G.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_H_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_H.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_I_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_I.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_J_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_J.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_K_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_K.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_L_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_L.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_M_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_M.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_N_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_N.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_O_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_O.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_P_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_P.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Q_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_Q.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_R_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_R.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_S_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_S.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_T_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_T.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_U_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_U.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_V_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_V.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_W_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_W.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_X_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_X.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Y_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_Y.get(), writer);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Z_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_Z.get(), writer);

    }


    protected static void slabRecipes(Block output, Block input, Consumer<FinishedRecipe> writer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .pattern("###")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(writer);
    }

}