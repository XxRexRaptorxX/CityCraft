package xxrexraptorxx.citycraft.datagen;


import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.recipes.PaintingRecipe;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.registry.ModItems;
import xxrexraptorxx.citycraft.registry.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        slabRecipes(ModBlocks.ASPHALT_SLAB.get(), ModBlocks.ASPHALT_BLOCK.get(), output);
        slabRecipes(ModBlocks.CRACKED_ASPHALT_SLAB.get(), ModBlocks.CRACKED_ASPHALT.get(), output);
        slabRecipes(ModBlocks.POTHOLE_ASPHALT_SLAB.get(), ModBlocks.POTHOLE_ASPHALT.get(), output);
        slabRecipes(ModBlocks.MOSSY_ASPHALT_SLAB.get(), ModBlocks.MOSSY_ASPHALT.get(), output);
        slabRecipes(ModBlocks.DIRTY_ASPHALT_SLAB.get(), ModBlocks.DIRTY_ASPHALT.get(), output);
        slabRecipes(ModBlocks.WHITE_ASPHALT_SLAB.get(), ModBlocks.WHITE_ASPHALT.get(), output);
        slabRecipes(ModBlocks.ORANGE_ASPHALT_SLAB.get(), ModBlocks.ORANGE_ASPHALT.get(), output);
        slabRecipes(ModBlocks.MAGENTA_ASPHALT_SLAB.get(), ModBlocks.MAGENTA_ASPHALT.get(), output);
        slabRecipes(ModBlocks.LIGHT_BLUE_ASPHALT_SLAB.get(), ModBlocks.LIGHT_BLUE_ASPHALT.get(), output);
        slabRecipes(ModBlocks.YELLOW_ASPHALT_SLAB.get(), ModBlocks.YELLOW_ASPHALT.get(), output);
        slabRecipes(ModBlocks.LIME_ASPHALT_SLAB.get(), ModBlocks.LIME_ASPHALT.get(), output);
        slabRecipes(ModBlocks.RED_ASPHALT_SLAB.get(), ModBlocks.RED_ASPHALT.get(), output);
        slabRecipes(ModBlocks.PINK_ASPHALT_SLAB.get(), ModBlocks.PINK_ASPHALT.get(), output);
        slabRecipes(ModBlocks.GRAY_ASPHALT_SLAB.get(), ModBlocks.GRAY_ASPHALT.get(), output);
        slabRecipes(ModBlocks.LIGHT_GRAY_ASPHALT_SLAB.get(), ModBlocks.LIGHT_GRAY_ASPHALT.get(), output);
        slabRecipes(ModBlocks.CYAN_ASPHALT_SLAB.get(), ModBlocks.CYAN_ASPHALT.get(), output);
        slabRecipes(ModBlocks.PURPLE_ASPHALT_SLAB.get(), ModBlocks.PURPLE_ASPHALT.get(), output);
        slabRecipes(ModBlocks.BLUE_ASPHALT_SLAB.get(), ModBlocks.BLUE_ASPHALT.get(), output);
        slabRecipes(ModBlocks.BROWN_ASPHALT_SLAB.get(), ModBlocks.BROWN_ASPHALT.get(), output);
        slabRecipes(ModBlocks.GREEN_ASPHALT_SLAB.get(), ModBlocks.GREEN_ASPHALT.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_HATCHING_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_HATCHING.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_FRAME_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_FRAME.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_EDGE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_HATCHING.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_FRAME_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_FRAME.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_EDGE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING.get(), output);

        slabRecipes(ModBlocks.BOOST_ASPHALT_SLAB.get(), ModBlocks.BOOST_ASPHALT.get(), output);

        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_A_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_A.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_B_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_B.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_C_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_C.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_D_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_D.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_E_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_E.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_F_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_F.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_G_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_G.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_H_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_H.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_I_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_I.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_J_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_J.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_K_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_K.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_L_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_L.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_M_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_M.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_N_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_N.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_O_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_O.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_P_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_P.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_Q_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_Q.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_R_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_R.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_S_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_S.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_T_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_T.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_U_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_U.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_V_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_V.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_W_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_W.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_X_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_X.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_Y_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_Y.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_Z_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_Z.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_A_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_A.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_B_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_B.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_C_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_C.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_D_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_D.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_E_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_E.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_F_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_F.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_G_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_G.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_H_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_H.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_I_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_I.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_J_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_J.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_K_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_K.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_L_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_L.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_M_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_M.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_N_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_N.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_O_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_O.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_P_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_P.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Q_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_Q.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_R_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_R.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_S_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_S.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_T_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_T.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_U_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_U.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_V_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_V.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_W_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_W.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_X_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_X.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Y_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_Y.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Z_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_Z.get(), output);

        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_BICYCLE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_BICYCLE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LEFT_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_RIGHT_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_HANDICAPPED_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_HANDICAPPED.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_PEDESTRIAN_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_PEDESTRIAN.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_WHITE_TRIANGLE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_TRIANGLE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BICYCLE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_BICYCLE.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LEFT_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_RIGHT_ARROW.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_HANDICAPPED_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_HANDICAPPED.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_PEDESTRIAN_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_PEDESTRIAN.get(), output);
        slabRecipes(ModBlocks.ASPHALT_WITH_YELLOW_TRIANGLE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_TRIANGLE.get(), output);

        wallRecipes(ModBlocks.BLACK_CONCRETE_WALL.get(), Blocks.BLACK_CONCRETE, output);
        wallRecipes(ModBlocks.WHITE_CONCRETE_WALL.get(), Blocks.WHITE_CONCRETE, output);
        wallRecipes(ModBlocks.ORANGE_CONCRETE_WALL.get(), Blocks.ORANGE_CONCRETE, output);
        wallRecipes(ModBlocks.MAGENTA_CONCRETE_WALL.get(), Blocks.MAGENTA_CONCRETE, output);
        wallRecipes(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Blocks.LIGHT_BLUE_CONCRETE, output);
        wallRecipes(ModBlocks.YELLOW_CONCRETE_WALL.get(), Blocks.YELLOW_CONCRETE, output);
        wallRecipes(ModBlocks.LIME_CONCRETE_WALL.get(), Blocks.LIME_CONCRETE, output);
        wallRecipes(ModBlocks.PINK_CONCRETE_WALL.get(), Blocks.PINK_CONCRETE, output);
        wallRecipes(ModBlocks.GRAY_CONCRETE_WALL.get(), Blocks.GRAY_CONCRETE, output);
        wallRecipes(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Blocks.LIGHT_GRAY_CONCRETE, output);
        wallRecipes(ModBlocks.CYAN_CONCRETE_WALL.get(), Blocks.CYAN_CONCRETE, output);
        wallRecipes(ModBlocks.PURPLE_CONCRETE_WALL.get(), Blocks.PURPLE_CONCRETE, output);
        wallRecipes(ModBlocks.BLUE_CONCRETE_WALL.get(), Blocks.BLUE_CONCRETE, output);
        wallRecipes(ModBlocks.BROWN_CONCRETE_WALL.get(), Blocks.BROWN_CONCRETE, output);
        wallRecipes(ModBlocks.GREEN_CONCRETE_WALL.get(), Blocks.GREEN_CONCRETE, output);
        wallRecipes(ModBlocks.RED_CONCRETE_WALL.get(), Blocks.RED_CONCRETE, output);//

        paintingRecipes(ModBlocks.WARNING_BEACON_LEFT_EU_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WARNING_BEACON_RIGHT_EU_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WARNING_BEACON_ALT_EU_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CROSSBUCK_EU_SIGN.get(), ModTags.CROSS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CROSSBUCK_US_SIGN.get(), ModTags.CROSS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.STOP_EU_SIGN.get(), ModTags.OCTAGON_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_ARROW_EU_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_ARROW_EU_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_TURN_ARROW_EU_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_TURN_ARROW_EU_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.KM_AHEAD_EU_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WEIGHT_EU_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TAXI_EU_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WARN_EU_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_ARROW_YELLOW_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_ARROW_YELLOW_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DIAGONAL_ARROW_YELLOW_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DIAGONAL_ARROW_YELLOW_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DOUBLE_ARROW_YELLOW_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_ARROW_GREEN_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_ARROW_GREEN_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DIAGONAL_ARROW_GREEN_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DIAGONAL_ARROW_GREEN_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DOUBLE_ARROW_GREEN_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_ARROW_ORANGE_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_ARROW_ORANGE_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DIAGONAL_ARROW_ORANGE_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DIAGONAL_ARROW_ORANGE_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DOUBLE_ARROW_ORANGE_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PRIORITY_ROAD_EU_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PRIORITY_ROAD_END_EU_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.T_INTERSECTION_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.Y_INTERSECTION_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_SIDE_ROAD_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_SIDE_ROAD_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CROSS_ROAD_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIDE_ROAD_AT_ANGLE_LEFT_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIDE_ROAD_AT_ANGLE_RIGHT_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_TURN_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_TURN_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_CURVE_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_CURVE_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_REVERSE_TURN_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_REVERSE_TURN_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_MERGING_TRAFFIC_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_MERGING_TRAFFIC_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_ENTERING_ROADWAY_MERGE_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_ENTERING_ROADWAY_MERGE_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_ADDED_LINE_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_ADDED_LINE_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_LANE_ENDS_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_LANE_ENDS_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TWO_WAY_TRAFFIC_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.VERY_SHARP_CURVE_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WINDING_ROAD_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HAIRPIN_CURVE_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CIRCULAR_INTERSECTION_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DIVIDED_HIGHWAY_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CREEPER_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TRUCK_CROSSING_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HILL_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TRUCK_ROLLOVER_WARNING_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SLIPPERY_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ROAD_NARROWS_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CATTLE_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIGNAL_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WORKERS_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PEDESTRIANS_CROSSING_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HANDICAPED_CROSSING_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_CROSSING_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PLAYGROUND_AHEAD_US_SIGN.get(), ModTags.RHOMBUS_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TEN_SPEED_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.THIRTY_SPEED_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIXTY_SPEED_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EIGHTY_SPEED_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HUNDRED_SPEED_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HUNDRED_TWENTY_SPEED_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_VEHICLES_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_CARS_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_TRUCKS_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_PEDESTRIANS_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_BICYCLES_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_PASSING_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_TRUCK_PASSING_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ONGOING_TRAFFIC_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_ENTER_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_PARKING_ALONG_CARRIAGEWAY_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_PARKING_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_U_TURN_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.END_ALL_LIMITS_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_PASSING_END_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_TRUCK_PASSING_END_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIDEWALK_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_PATH_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BUS_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.STRAIGHT_AHEAD_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_HERE_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_HERE_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PASS_LEFT_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PASS_RIGHT_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_AHEAD_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_AHEAD_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_RIGHT_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.STRAIGHT_LEFT_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.STRAIGHT_RIGHT_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ROUNDABOUT_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BUS_STOP_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RAILROAD_CROSSING_US_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_AHEAD_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_LEFT_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_RIGHT_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CRAFT_CITY_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CRAFT_CITY_END_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DISABLED_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WET_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.END_LINE_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HIGHWAY_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HIGHWAY_END_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.MOTORWAY_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.MOTORWAY_END_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CALMING_AREA_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.END_CALMING_AREA_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ONE_WAY_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PRIORITY_OVER_ONCOMING_TRAFFIC_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_THROUGH_ROAD_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PARKING_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PARKING_GARAGE_EU_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PEDESTRIAN_CROSSING_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CAMPING_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PR_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CHURCH_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HOTEL_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PETROL_STATION_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CAFE_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.INFO_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WC_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TELEPHONE_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RESTAURANT_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.REPAIR_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FIRST_AID_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WATER_PROTECTION_AREA_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_BAY_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GUIDE_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DIRECTION_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DIRECTION_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GUIDE_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DIRECTION_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DIRECTION_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TWENTYFIVE_ADVISORY_SPEED_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.THIRTYFIVE_ADVISORY_SPEED_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FORTYFIVE_ADVISORY_SPEED_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_PEDESTRIANS_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_BICYCLE_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_TRUCKS_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_PARKING_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_LEFT_TURN_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_RIGHT_TURN_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_U_TURN_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.STRAIGHT_AHEAD_ONLY_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_TURN_ONLY_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_TURN_ONLY_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.INFO_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HANDICAPPED_ACCESSIBLE_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HOTEL_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RESTAURANT_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HOSPITAL_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GAS_STATION_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DIESEL_STATION_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ELECTRIC_STATION_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CAMPING_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.MEDICAL_SERVICE_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TELEPHONE_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.AIRPORT_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LIGHT_RAIL_TRANSIT_STATION_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WINTER_RECREATION_AREA_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SWIMMING_AREA_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PICNIC_AREA_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.REPAIR_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DRINKING_WATER_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BATHROOMS_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LITTER_BARREL_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LOUNDRY_FACILITY_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DANGER_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ROADWORKS_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CREEPER_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CHILDREN_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CROSSWALK_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ROCKFALL_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SLIPPERINESS_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIGNAL_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SNOW_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ONCOMING_TRAFFIC_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_CURVE_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_CURVE_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DOUBLE_CURVE_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DOUBLE_CURVE_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GATE_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NARROWING_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_NARROWING_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_NARROWING_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CATTLE_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ASCEND_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DESCEND_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.JAMS_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PRIORITY_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RAILROAD_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.UNEVEN_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CYCLES_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PEDESTRIANS_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.INTERSECTION_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.YIELD_RIGHT_OF_WAY_EU_SIGN.get(), ModTags.UPSIDE_DOWN_TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NATURE_RESERVE_EU_SIGN.get(), ModTags.UPSIDE_DOWN_TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);

        paintingRecipes(ModBlocks.EXIT_CLOSED_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_HAZARDOUS_CARGO_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.M_AHEAD_EU_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.AHEAD_YELLOW_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_PATH_RIGHT_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_HIGHWAY_END_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TEN_MINIMUM_SPEED_SIGN_EU.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HIGHWAY_COUNTDOWN_MARKER_200_EU_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_PATH_LEFT_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_ROUTE_AHEAD_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FEDERAL_HIGHWAY_COUNTDOWN_MARKER_100_EU_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HIGHWAY_COUNTDOWN_MARKER_300_EU_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BRIDLE_PATH_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_END_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_LEFT_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FEDERAL_HIGHWAY_COUNTDOWN_MARKER_200_EU_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_RIGHT_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.AHEAD_GREEN_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.MOVABLE_BRIDGE_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HIGHWAY_COUNTDOWN_MARKER_100_EU_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_PATH_US_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.THIRTY_MINIMUM_SPEED_SIGN_EU.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CHARGING_STATION_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_ROUTE_LEFT_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LOOSE_GRAVEL_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FEDERAL_HIGHWAY_COUNTDOWN_MARKER_300_EU_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_HIGHWAY_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PARKING_AREA_END_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_PATH_AHEAD_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_MONSTER_EU_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.AHEAD_ORANGE_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_ROUTE_RIGHT_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_PRIORITY_ROAD_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PARKING_AREA_START_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PRIORITY_ROAD_FROM_LEFT_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PRIORITY_ROAD_FROM_RIGHT_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RAILWAY_COUNTDOWN_MARKER_80_EU_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RAILWAY_COUNTDOWN_MARKER_160_EU_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RAILWAY_COUNTDOWN_MARKER_240_EU_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_PRIORITY_ROAD_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SHORE_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TREE_OVERHANG_EU_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TRUCK_ROUTE_AHEAD_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TRUCK_ROUTE_RIGHT_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TRUCK_ROUTE_LEFT_EU_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WARN_US_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WARNING_BEACON_ALT_US_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WARNING_BEACON_LEFT_US_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WARNING_BEACON_RIGHT_US_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);//

        paintingRecipes(ModBlocks.ONCOMING_TRAFFIC_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.INTERSECTION_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_LEFT_OR_RIGHT_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PEDESTRIAN_CROSSING_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_BAY_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CATTLE_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NARROWING_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DESCEND_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CHILDREN_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FIFTY_ADVISORY_SPEED_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.JAMS_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DANGER_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DOUBLE_CURVE_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RAILROAD_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_LEFT_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CREEPER_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ASCEND_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GAS_STATION_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PARKING_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BUMP_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DIRECTION_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_NARROWING_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.INFO_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CYCLES_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PRIORITY_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CAMPING_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ROUNDABOUT_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SHORE_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HIGHWAY_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_CURVE_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_NARROWING_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NATURE_RESERVE_AREA_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_MERGING_TRAFFIC_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HIGHWAY_END_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DOUBLE_CURVE_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GATE_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ROCKFALL_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PARKING_GARAGE_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_RIGHT_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.THIRTY_ADVISORY_SPEED_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DIRECTION_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NARROW_BRIDGE_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FORTY_ADVISORY_SPEED_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ONE_WAY_CN_SIGN.get(), ModTags.BAKE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ROADWORKS_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_MERGING_TRAFFIC_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_CURVE_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GUIDE_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIDE_ROAD_AT_ANGLE_LEFT_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIDE_ROAD_AT_ANGLE_RIGHT_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIDE_ROAD_AT_LEFT_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIDE_ROAD_AT_RIGHT_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIGNAL_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SLIPPERINESS_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SLOW_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SNOW_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.STOP_CN_SIGN.get(), ModTags.OCTAGON_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.T_INTERSECTION_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TELEPHONE_CN_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.UNEVEN_ROAD_CN_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);

        paintingRecipes(ModBlocks.WARNING_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.MONSTER_WARNING_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TOXIC_WARNING_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.VOLTAGE_WARNING_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FIRE_WARNING_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LASER_WARNING_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HOT_WARNING_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.MAGNETIC_WARNING_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EXPLOSION_WARNING_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GAS_CYLINDER_WARNING_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RADIATION_WARNING_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BIOHAZARD_WARNING_SIGN.get(), ModTags.TRIANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PROHIBITION_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ENTERING_PROHIBITED_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HEAVY_LOAD_PROHIBITED_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DRINKING_PROHIBITED_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PHONES_PROHIBITED_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PEDESTRIANS_PROHIBITED_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.UNAUTHORISED_PROHIBITED_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SMOKING_PROHIBITED_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EATING_PROHIBITED_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.MANDATORY_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HELMET_MANDATORY_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GLOVES_MANDATORY_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ARMOR_MANDATORY_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BOOTS_MANDATORY_SIGN.get(), ModTags.ROUND_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FIRST_AID_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FIRE_ALARM_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FIRE_TELEPHONE_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FIRE_EXTINGUISHER_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ASSEMBLY_POINT_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_TELEFONE_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_EXIT_SIGN.get(), ModTags.SQUARE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_EXIT_LEFT_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_EXIT_RIGHT_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_EXIT_AHEAD_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_EXIT_DOWNWARDS_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EXIT_SIGN.get(), ModTags.RECTANGLE_SIGN_TAG, ModItems.DYE_MIX.get(), output);

        paintingRecipes(ModBlocks.RED_CHAIN.get(), ModTags.CHAINS_TAG, Tags.Items.DYES_RED, output);
        paintingRecipes(ModBlocks.WHITE_CHAIN.get(), ModTags.CHAINS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.YELLOW_CHAIN.get(), ModTags.CHAINS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.BLACK_CHAIN.get(), ModTags.CHAINS_TAG, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHAIN, ModTags.CHAINS_TAG, Tags.Items.DYES_GRAY, output);
        paintingRecipes(ModBlocks.RED_POLE.get(), ModTags.IRON_POLES_TAG, Tags.Items.DYES_RED, output);
        paintingRecipes(ModBlocks.WHITE_POLE.get(), ModTags.IRON_POLES_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.YELLOW_POLE.get(), ModTags.IRON_POLES_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.BLACK_POLE.get(), ModTags.IRON_POLES_TAG, Tags.Items.DYES_BLACK, output);//

        paintingRecipes(ModBlocks.RED_POST.get(), ModTags.STONE_POSTS_TAG, Tags.Items.DYES_RED, output);
        paintingRecipes(ModBlocks.WHITE_POST.get(), ModTags.STONE_POSTS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.YELLOW_POST.get(), ModTags.STONE_POSTS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.BLACK_POST.get(), ModTags.STONE_POSTS_TAG, Tags.Items.DYES_BLACK, output);//

        paintingRecipes(ModBlocks.BLACK_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_BLACK, output);
        paintingRecipes(ModBlocks.WHITE_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ORANGE_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(ModBlocks.MAGENTA_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(ModBlocks.YELLOW_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.LIME_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_LIME, output);
        paintingRecipes(ModBlocks.PINK_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_PINK, output);
        paintingRecipes(ModBlocks.GRAY_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_GRAY, output);
        paintingRecipes(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(ModBlocks.CYAN_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_CYAN, output);
        paintingRecipes(ModBlocks.PURPLE_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(ModBlocks.BLUE_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_BLUE, output);
        paintingRecipes(ModBlocks.BROWN_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_BROWN, output);
        paintingRecipes(ModBlocks.GREEN_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_GREEN, output);
        paintingRecipes(ModBlocks.RED_CONCRETE_WALL.get(), ModTags.CONCRETE_WALLS_TAG, Tags.Items.DYES_RED, output);//

        paintingRecipes(ModBlocks.ASPHALT_BLOCK.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_BLACK, output);
        paintingRecipes(ModBlocks.WHITE_ASPHALT.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ORANGE_ASPHALT.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(ModBlocks.MAGENTA_ASPHALT.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(ModBlocks.LIGHT_BLUE_ASPHALT.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(ModBlocks.YELLOW_ASPHALT.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.LIME_ASPHALT.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_LIME, output);
        paintingRecipes(ModBlocks.PINK_ASPHALT.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_PINK, output);
        paintingRecipes(ModBlocks.GRAY_ASPHALT.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_GRAY, output);
        paintingRecipes(ModBlocks.LIGHT_GRAY_ASPHALT.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(ModBlocks.CYAN_ASPHALT.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_CYAN, output);
        paintingRecipes(ModBlocks.PURPLE_ASPHALT.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(ModBlocks.BLUE_ASPHALT.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_BLUE, output);
        paintingRecipes(ModBlocks.BROWN_ASPHALT.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_BROWN, output);
        paintingRecipes(ModBlocks.GREEN_ASPHALT.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_GREEN, output);
        paintingRecipes(ModBlocks.RED_ASPHALT.get(), ModTags.BLANK_ASPHALT_TAG, Tags.Items.DYES_RED, output);//

        paintingRecipes(ModBlocks.ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_BLACK, output);
        paintingRecipes(ModBlocks.WHITE_ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ORANGE_ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(ModBlocks.MAGENTA_ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(ModBlocks.LIGHT_BLUE_ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(ModBlocks.YELLOW_ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.LIME_ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_LIME, output);
        paintingRecipes(ModBlocks.PINK_ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_PINK, output);
        paintingRecipes(ModBlocks.GRAY_ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_GRAY, output);
        paintingRecipes(ModBlocks.LIGHT_GRAY_ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(ModBlocks.CYAN_ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_CYAN, output);
        paintingRecipes(ModBlocks.PURPLE_ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(ModBlocks.BLUE_ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_BLUE, output);
        paintingRecipes(ModBlocks.BROWN_ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_BROWN, output);
        paintingRecipes(ModBlocks.GREEN_ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_GREEN, output);
        paintingRecipes(ModBlocks.RED_ASPHALT_SLAB.get(), ModTags.BLANK_ASPHALT_SLABS_TAG, Tags.Items.DYES_RED, output);//

        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_HATCHING.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_FRAME.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_EDGE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_A.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_B.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_C.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_D.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_E.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_F.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_G.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_H.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_I.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_J.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_K.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_L.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_M.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_N.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_O.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_P.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_Q.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_R.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_S.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_T.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_U.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_V.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_W.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_X.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_Y.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_Z.get(), ModTags.ASPHALT_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);//

        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_HATCHING.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_FRAME.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_EDGE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_A.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_B.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_C.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_D.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_E.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_F.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_G.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_H.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_I.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_J.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_K.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_L.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_M.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_N.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_O.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_P.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_Q.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_R.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_S.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_T.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_U.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_V.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_W.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_X.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_Y.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_Z.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);

        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_FRAME.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_EDGE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_A.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_B.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_C.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_D.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_E.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_F.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_G.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_H.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_I.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_J.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_K.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_L.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_M.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_N.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_O.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_P.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Q.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_R.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_S.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_T.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_U.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_V.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_W.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_X.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Y.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Z.get(), ModTags.ASPHALT_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);//

        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_FRAME.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_EDGE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_A.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_B.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_C.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_D.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_E.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_F.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_G.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_H.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_I.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_J.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_K.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_L.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_M.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_N.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_O.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_P.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Q.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_R.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_S.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_T.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_U.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_V.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_W.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_X.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Y.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Z.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);

        ////SLABS
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_HATCHING_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_FRAME_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_EDGE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_A_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_B_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_C_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_D_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_E_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_F_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_G_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_H_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_I_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_J_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_K_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_L_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_M_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_N_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_O_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_P_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_Q_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_R_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_S_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_T_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_U_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_V_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_W_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_X_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_Y_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_Z_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG, Tags.Items.DYES_WHITE, output);

        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_HATCHING_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_FRAME_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_EDGE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_A_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_B_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_C_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_D_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_E_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_F_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_G_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_H_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_I_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_J_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_K_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_L_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_M_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_N_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_O_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_P_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_Q_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_R_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_S_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_T_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_U_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_V_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_W_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_X_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_Y_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_Z_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);

        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_FRAME_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG,  Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_EDGE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG,  Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_A_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_B_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_C_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_D_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_E_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_F_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_G_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_H_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_I_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_J_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_K_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_L_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_M_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_N_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_O_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_P_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Q_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_R_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_S_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_T_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_U_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_V_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_W_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_X_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Y_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Z_SLAB.get(), ModTags.ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG, Tags.Items.DYES_YELLOW, output);

        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_FRAME_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_EDGE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_A_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_B_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_C_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_D_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_E_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_F_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_G_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_H_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_I_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_J_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_K_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_L_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_M_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_N_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_O_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_P_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Q_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_R_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_S_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_T_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_U_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_V_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_W_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_X_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Y_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_Z_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);

        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_BICYCLE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LEFT_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_RIGHT_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_HANDICAPPED.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_PEDESTRIAN.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_TRIANGLE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_BICYCLE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_HANDICAPPED_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_PEDESTRIAN_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_WHITE_TRIANGLE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BICYCLE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LEFT_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_RIGHT_ARROW.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_HANDICAPPED.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_PEDESTRIAN.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_TRIANGLE.get(), ModBlocks.ASPHALT_BLOCK.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_BICYCLE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_HANDICAPPED_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_PEDESTRIAN_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.ASPHALT_WITH_YELLOW_TRIANGLE_SLAB.get(), ModBlocks.ASPHALT_SLAB.get(), Tags.Items.DYES_YELLOW, output);

        paintingRecipes(Blocks.BLACK_WOOL, ItemTags.WOOL, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.WHITE_WOOL, ItemTags.WOOL, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.ORANGE_WOOL, ItemTags.WOOL, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.MAGENTA_WOOL, ItemTags.WOOL, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(Blocks.LIGHT_BLUE_WOOL, ItemTags.WOOL, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(Blocks.YELLOW_WOOL, ItemTags.WOOL, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.LIME_WOOL, ItemTags.WOOL, Tags.Items.DYES_LIME, output);
        paintingRecipes(Blocks.PINK_WOOL, ItemTags.WOOL, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.GRAY_WOOL, ItemTags.WOOL, Tags.Items.DYES_GRAY, output);
        paintingRecipes(Blocks.LIGHT_GRAY_WOOL, ItemTags.WOOL, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(Blocks.CYAN_WOOL, ItemTags.WOOL, Tags.Items.DYES_CYAN, output);
        paintingRecipes(Blocks.PURPLE_WOOL, ItemTags.WOOL, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.BLUE_WOOL, ItemTags.WOOL, Tags.Items.DYES_BLUE, output);
        paintingRecipes(Blocks.BROWN_WOOL, ItemTags.WOOL, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.GREEN_WOOL, ItemTags.WOOL, Tags.Items.DYES_GREEN, output);
        paintingRecipes(Blocks.RED_WOOL, ItemTags.WOOL, Tags.Items.DYES_RED, output);

        paintingRecipes(Blocks.BLACK_BANNER, ItemTags.BANNERS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.WHITE_BANNER, ItemTags.BANNERS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.ORANGE_BANNER, ItemTags.BANNERS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.MAGENTA_BANNER, ItemTags.BANNERS, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(Blocks.LIGHT_BLUE_BANNER, ItemTags.BANNERS, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(Blocks.YELLOW_BANNER, ItemTags.BANNERS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.LIME_BANNER, ItemTags.BANNERS, Tags.Items.DYES_LIME, output);
        paintingRecipes(Blocks.PINK_BANNER, ItemTags.BANNERS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.GRAY_BANNER, ItemTags.BANNERS, Tags.Items.DYES_GRAY, output);
        paintingRecipes(Blocks.LIGHT_GRAY_BANNER, ItemTags.BANNERS, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(Blocks.CYAN_BANNER, ItemTags.BANNERS, Tags.Items.DYES_CYAN, output);
        paintingRecipes(Blocks.PURPLE_BANNER, ItemTags.BANNERS, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.BLUE_BANNER, ItemTags.BANNERS, Tags.Items.DYES_BLUE, output);
        paintingRecipes(Blocks.BROWN_BANNER, ItemTags.BANNERS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.GREEN_BANNER, ItemTags.BANNERS, Tags.Items.DYES_GREEN, output);
        paintingRecipes(Blocks.RED_BANNER, ItemTags.BANNERS, Tags.Items.DYES_RED, output);

        paintingRecipes(Blocks.BLACK_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.WHITE_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.ORANGE_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.MAGENTA_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(Blocks.LIGHT_BLUE_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(Blocks.YELLOW_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.LIME_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_LIME, output);
        paintingRecipes(Blocks.PINK_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.GRAY_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_GRAY, output);
        paintingRecipes(Blocks.LIGHT_GRAY_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(Blocks.CYAN_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_CYAN, output);
        paintingRecipes(Blocks.PURPLE_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.BLUE_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_BLUE, output);
        paintingRecipes(Blocks.BROWN_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.GREEN_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_GREEN, output);
        paintingRecipes(Blocks.RED_CONCRETE, ModTags.CONCRETE_TAG, Tags.Items.DYES_RED, output);

        paintingRecipes(Blocks.BLACK_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.WHITE_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.ORANGE_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.MAGENTA_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(Blocks.LIGHT_BLUE_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(Blocks.YELLOW_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.LIME_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_LIME, output);
        paintingRecipes(Blocks.PINK_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.GRAY_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_GRAY, output);
        paintingRecipes(Blocks.LIGHT_GRAY_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(Blocks.CYAN_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_CYAN, output);
        paintingRecipes(Blocks.PURPLE_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.BLUE_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_BLUE, output);
        paintingRecipes(Blocks.BROWN_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.GREEN_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_GREEN, output);
        paintingRecipes(Blocks.RED_CANDLE, ItemTags.CANDLES, Tags.Items.DYES_RED, output);

        paintingRecipes(Blocks.BLACK_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.WHITE_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.ORANGE_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.MAGENTA_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(Blocks.LIGHT_BLUE_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(Blocks.YELLOW_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.LIME_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_LIME, output);
        paintingRecipes(Blocks.PINK_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.GRAY_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_GRAY, output);
        paintingRecipes(Blocks.LIGHT_GRAY_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(Blocks.CYAN_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_CYAN, output);
        paintingRecipes(Blocks.PURPLE_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.BLUE_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_BLUE, output);
        paintingRecipes(Blocks.BROWN_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.GREEN_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_GREEN, output);
        paintingRecipes(Blocks.RED_CARPET, ItemTags.WOOL_CARPETS, Tags.Items.DYES_RED, output);

        paintingRecipes(Blocks.BLACK_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.WHITE_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.ORANGE_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.MAGENTA_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(Blocks.LIGHT_BLUE_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(Blocks.YELLOW_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.LIME_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_LIME, output);
        paintingRecipes(Blocks.PINK_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.GRAY_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_GRAY, output);
        paintingRecipes(Blocks.LIGHT_GRAY_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(Blocks.CYAN_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_CYAN, output);
        paintingRecipes(Blocks.PURPLE_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.BLUE_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_BLUE, output);
        paintingRecipes(Blocks.BROWN_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.GREEN_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_GREEN, output);
        paintingRecipes(Blocks.RED_CONCRETE_POWDER, ModTags.CONCRETE_POWDER_TAG, Tags.Items.DYES_RED, output);

        paintingRecipes(Blocks.BLACK_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.WHITE_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.ORANGE_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.MAGENTA_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(Blocks.YELLOW_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.LIME_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_LIME, output);
        paintingRecipes(Blocks.PINK_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.GRAY_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_GRAY, output);
        paintingRecipes(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(Blocks.CYAN_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_CYAN, output);
        paintingRecipes(Blocks.PURPLE_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.BLUE_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_BLUE, output);
        paintingRecipes(Blocks.BROWN_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.GREEN_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_GREEN, output);
        paintingRecipes(Blocks.RED_GLAZED_TERRACOTTA, ModTags.GLAZED_TERRACOTTA_TAG, Tags.Items.DYES_RED, output);

        paintingRecipes(Blocks.BLACK_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.WHITE_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.ORANGE_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.MAGENTA_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(Blocks.LIGHT_BLUE_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(Blocks.YELLOW_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.LIME_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_LIME, output);
        paintingRecipes(Blocks.PINK_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.GRAY_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_GRAY, output);
        paintingRecipes(Blocks.LIGHT_GRAY_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(Blocks.CYAN_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_CYAN, output);
        paintingRecipes(Blocks.PURPLE_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.BLUE_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_BLUE, output);
        paintingRecipes(Blocks.BROWN_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.GREEN_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_GREEN, output);
        paintingRecipes(Blocks.RED_TERRACOTTA, ItemTags.TERRACOTTA, Tags.Items.DYES_RED, output);

        paintingRecipes(Blocks.BLACK_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.WHITE_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.ORANGE_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.MAGENTA_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(Blocks.LIGHT_BLUE_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(Blocks.YELLOW_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.LIME_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_LIME, output);
        paintingRecipes(Blocks.PINK_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.GRAY_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_GRAY, output);
        paintingRecipes(Blocks.LIGHT_GRAY_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(Blocks.CYAN_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_CYAN, output);
        paintingRecipes(Blocks.PURPLE_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.BLUE_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_BLUE, output);
        paintingRecipes(Blocks.BROWN_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.GREEN_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_GREEN, output);
        paintingRecipes(Blocks.RED_SHULKER_BOX, ModTags.SHULKER_BOXES_TAG, Tags.Items.DYES_RED, output);

        paintingRecipes(Blocks.BLACK_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.WHITE_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.ORANGE_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.MAGENTA_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(Blocks.LIGHT_BLUE_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(Blocks.YELLOW_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.LIME_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_LIME, output);
        paintingRecipes(Blocks.PINK_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.GRAY_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_GRAY, output);
        paintingRecipes(Blocks.LIGHT_GRAY_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(Blocks.CYAN_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_CYAN, output);
        paintingRecipes(Blocks.PURPLE_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.BLUE_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_BLUE, output);
        paintingRecipes(Blocks.BROWN_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.GREEN_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_GREEN, output);
        paintingRecipes(Blocks.RED_STAINED_GLASS, Tags.Items.GLASS_BLOCKS, Tags.Items.DYES_RED, output);

        paintingRecipes(Blocks.BLACK_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.WHITE_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.ORANGE_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.MAGENTA_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(Blocks.YELLOW_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.LIME_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_LIME, output);
        paintingRecipes(Blocks.PINK_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.GRAY_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_GRAY, output);
        paintingRecipes(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(Blocks.CYAN_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_CYAN, output);
        paintingRecipes(Blocks.PURPLE_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.BLUE_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_BLUE, output);
        paintingRecipes(Blocks.BROWN_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.GREEN_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_GREEN, output);
        paintingRecipes(Blocks.RED_STAINED_GLASS_PANE, Tags.Items.GLASS_PANES, Tags.Items.DYES_RED, output);

        paintingRecipes(Blocks.BLACK_BED, ItemTags.BEDS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.WHITE_BED, ItemTags.BEDS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.ORANGE_BED, ItemTags.BEDS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.MAGENTA_BED, ItemTags.BEDS, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(Blocks.LIGHT_BLUE_BED, ItemTags.BEDS, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(Blocks.YELLOW_BED, ItemTags.BEDS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.LIME_BED, ItemTags.BEDS, Tags.Items.DYES_LIME, output);
        paintingRecipes(Blocks.PINK_BED, ItemTags.BEDS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.GRAY_BED, ItemTags.BEDS, Tags.Items.DYES_GRAY, output);
        paintingRecipes(Blocks.LIGHT_GRAY_BED, ItemTags.BEDS, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(Blocks.CYAN_BED, ItemTags.BEDS, Tags.Items.DYES_CYAN, output);
        paintingRecipes(Blocks.PURPLE_BED, ItemTags.BEDS, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.BLUE_BED, ItemTags.BEDS, Tags.Items.DYES_BLUE, output);
        paintingRecipes(Blocks.BROWN_BED, ItemTags.BEDS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.GREEN_BED, ItemTags.BEDS, Tags.Items.DYES_GREEN, output);
        paintingRecipes(Blocks.RED_BED, ItemTags.BEDS, Tags.Items.DYES_RED, output);

        paintingRecipes(Blocks.OAK_PLANKS, ItemTags.PLANKS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_PLANKS, ItemTags.PLANKS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_PLANKS, ItemTags.PLANKS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_PLANKS, ItemTags.PLANKS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_PLANKS, ItemTags.PLANKS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_PLANKS, ItemTags.PLANKS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_PLANKS, ItemTags.PLANKS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_PLANKS, Blocks.WARPED_PLANKS, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_PLANKS, Blocks.CRIMSON_PLANKS, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_SLAB, ItemTags.WOODEN_SLABS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_SLAB, ItemTags.WOODEN_SLABS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_SLAB, ItemTags.WOODEN_SLABS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_SLAB, ItemTags.WOODEN_SLABS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_SLAB, ItemTags.WOODEN_SLABS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_SLAB, ItemTags.WOODEN_SLABS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_SLAB, ItemTags.WOODEN_SLABS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_SLAB, Blocks.WARPED_SLAB, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_SLAB, Blocks.CRIMSON_SLAB, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_STAIRS, ItemTags.WOODEN_STAIRS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_STAIRS, ItemTags.WOODEN_STAIRS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_STAIRS, ItemTags.WOODEN_STAIRS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_STAIRS, ItemTags.WOODEN_STAIRS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_STAIRS, ItemTags.WOODEN_STAIRS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_STAIRS, ItemTags.WOODEN_STAIRS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_STAIRS, ItemTags.WOODEN_STAIRS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_STAIRS, Blocks.WARPED_STAIRS, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_STAIRS, Blocks.CRIMSON_STAIRS, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_BUTTON, ItemTags.WOODEN_BUTTONS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_BUTTON, ItemTags.WOODEN_BUTTONS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_BUTTON, ItemTags.WOODEN_BUTTONS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_BUTTON, ItemTags.WOODEN_BUTTONS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_BUTTON, ItemTags.WOODEN_BUTTONS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_BUTTON, ItemTags.WOODEN_BUTTONS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_BUTTON, ItemTags.WOODEN_BUTTONS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_BUTTON, Blocks.WARPED_BUTTON, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_BUTTON, Blocks.CRIMSON_BUTTON, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_DOOR, ItemTags.WOODEN_DOORS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_DOOR, ItemTags.WOODEN_DOORS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_DOOR, ItemTags.WOODEN_DOORS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_DOOR, ItemTags.WOODEN_DOORS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_DOOR, ItemTags.WOODEN_DOORS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_DOOR, ItemTags.WOODEN_DOORS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_DOOR, ItemTags.WOODEN_DOORS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_DOOR, Blocks.WARPED_DOOR, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_DOOR, Blocks.CRIMSON_DOOR, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_FENCE, ItemTags.WOODEN_FENCES, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_FENCE, ItemTags.WOODEN_FENCES, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_FENCE, ItemTags.WOODEN_FENCES, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_FENCE, ItemTags.WOODEN_FENCES, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_FENCE, ItemTags.WOODEN_FENCES, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_FENCE, ItemTags.WOODEN_FENCES, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_FENCE, ItemTags.WOODEN_FENCES, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_FENCE, Blocks.WARPED_FENCE, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_FENCE, Blocks.CRIMSON_FENCE, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_FENCE_GATE, Tags.Items.FENCE_GATES_WOODEN, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_FENCE_GATE, Tags.Items.FENCE_GATES_WOODEN, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_FENCE_GATE, Tags.Items.FENCE_GATES_WOODEN, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_FENCE_GATE, Tags.Items.FENCE_GATES_WOODEN, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_FENCE_GATE, Tags.Items.FENCE_GATES_WOODEN, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_FENCE_GATE, Tags.Items.FENCE_GATES_WOODEN, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_FENCE_GATE, Tags.Items.FENCE_GATES_WOODEN, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_FENCE_GATE, Blocks.WARPED_FENCE_GATE, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_FENCE_GATE, Blocks.CRIMSON_FENCE_GATE, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_PRESSURE_PLATE, ItemTags.WOODEN_PRESSURE_PLATES, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_PRESSURE_PLATE, ItemTags.WOODEN_PRESSURE_PLATES, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_PRESSURE_PLATE, ItemTags.WOODEN_PRESSURE_PLATES, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_PRESSURE_PLATE, ItemTags.WOODEN_PRESSURE_PLATES, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_PRESSURE_PLATE, ItemTags.WOODEN_PRESSURE_PLATES, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_PRESSURE_PLATE, ItemTags.WOODEN_PRESSURE_PLATES, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_PRESSURE_PLATE, ItemTags.WOODEN_PRESSURE_PLATES, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_PRESSURE_PLATE, Blocks.WARPED_PRESSURE_PLATE, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_PRESSURE_PLATE, Blocks.CRIMSON_PRESSURE_PLATE, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_TRAPDOOR, ItemTags.WOODEN_TRAPDOORS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_TRAPDOOR, ItemTags.WOODEN_TRAPDOORS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_TRAPDOOR, ItemTags.WOODEN_TRAPDOORS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_TRAPDOOR, ItemTags.WOODEN_TRAPDOORS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_TRAPDOOR, ItemTags.WOODEN_TRAPDOORS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_TRAPDOOR, ItemTags.WOODEN_TRAPDOORS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_TRAPDOOR, ItemTags.WOODEN_TRAPDOORS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_TRAPDOOR, Blocks.WARPED_TRAPDOOR, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_TRAPDOOR, Blocks.CRIMSON_TRAPDOOR, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_SIGN, ModTags.SIGNS_WOOD_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_SIGN, ModTags.SIGNS_WOOD_TAG, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_SIGN, ModTags.SIGNS_WOOD_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_SIGN, ModTags.SIGNS_WOOD_TAG, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_SIGN, ModTags.SIGNS_WOOD_TAG, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_SIGN, ModTags.SIGNS_WOOD_TAG, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_SIGN, ModTags.SIGNS_WOOD_TAG, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_SIGN, Blocks.WARPED_SIGN, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_SIGN, Blocks.CRIMSON_SIGN, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_HANGING_SIGN, ModTags.HANGING_WOOD_SIGNS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_HANGING_SIGN, ModTags.HANGING_WOOD_SIGNS_TAG, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_HANGING_SIGN, ModTags.HANGING_WOOD_SIGNS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_HANGING_SIGN, ModTags.HANGING_WOOD_SIGNS_TAG, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_HANGING_SIGN, ModTags.HANGING_WOOD_SIGNS_TAG, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_HANGING_SIGN, ModTags.HANGING_WOOD_SIGNS_TAG, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_HANGING_SIGN, ModTags.HANGING_WOOD_SIGNS_TAG, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_HANGING_SIGN, Blocks.WARPED_HANGING_SIGN, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_HANGING_SIGN, Blocks.CRIMSON_HANGING_SIGN, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.RED_SANDSTONE, Blocks.SANDSTONE, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.SANDSTONE_STAIRS, Blocks.RED_SANDSTONE_STAIRS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.RED_SANDSTONE_STAIRS, Blocks.SANDSTONE_STAIRS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.SANDSTONE_SLAB, Blocks.RED_SANDSTONE_SLAB, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.RED_SANDSTONE_SLAB, Blocks.SANDSTONE_SLAB, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.SANDSTONE_WALL, Blocks.RED_SANDSTONE_WALL, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.RED_SANDSTONE_WALL, Blocks.SANDSTONE_WALL, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.CHISELED_SANDSTONE, Blocks.CHISELED_RED_SANDSTONE, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.CHISELED_RED_SANDSTONE, Blocks.CHISELED_SANDSTONE, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SMOOTH_RED_SANDSTONE, Blocks.SMOOTH_SANDSTONE, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.SMOOTH_SANDSTONE_STAIRS, Blocks.SMOOTH_RED_SANDSTONE_STAIRS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SMOOTH_RED_SANDSTONE_STAIRS, Blocks.SMOOTH_SANDSTONE_STAIRS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_RED_SANDSTONE_SLAB, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SMOOTH_RED_SANDSTONE_SLAB, Blocks.SMOOTH_SANDSTONE_SLAB, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.CUT_SANDSTONE, Blocks.CUT_RED_SANDSTONE, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.CUT_RED_SANDSTONE, Blocks.CUT_SANDSTONE, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.CUT_SANDSTONE_SLAB, Blocks.CUT_RED_SANDSTONE_SLAB, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.CUT_RED_SANDSTONE_SLAB, Blocks.CUT_SANDSTONE_SLAB, Tags.Items.DYES_RED, output);

        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_OPEN.get(), ModBlocks.STRAIGHT_AHEAD_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_CLOSED.get(), ModBlocks.CROSS_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_CHANGE_LEFT.get(), ModBlocks.PASS_LEFT_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_CHANGE_RIGHT.get(), ModBlocks.PASS_RIGHT_EU_SIGN.get(), output);

        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_SIXTY_SPEED_LIMIT.get(), ModBlocks.SIXTY_SPEED_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_EIGHTY_SPEED_LIMIT.get(), ModBlocks.EIGHTY_SPEED_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_HUNDRED_SPEED_LIMIT.get(), ModBlocks.HUNDRED_SPEED_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_HUNDRED_TWENTY_SPEED_LIMIT.get(), ModBlocks.HUNDRED_TWENTY_SPEED_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_CREEPER.get(), ModBlocks.CREEPER_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_DANGER.get(), ModBlocks.DANGER_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_END_ALL_LIMITS.get(), ModBlocks.END_ALL_LIMITS_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_JAMS.get(), ModBlocks.JAMS_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_NO_PASSING.get(), ModBlocks.NO_PASSING_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_NO_TRUCK_PASSING.get(), ModBlocks.NO_TRUCK_PASSING_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_ROADWORKS.get(), ModBlocks.ROADWORKS_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_SLIPPERINESS.get(), ModBlocks.SLIPPERINESS_EU_SIGN.get(), output);

        paintingRecipes(ModBlocks.BLACK_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_BLACK, output);
        paintingRecipes(ModBlocks.WHITE_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.ORANGE_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(ModBlocks.MAGENTA_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_MAGENTA, output);
        paintingRecipes(ModBlocks.LIGHT_BLUE_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_LIGHT_BLUE, output);
        paintingRecipes(ModBlocks.YELLOW_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.LIME_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_LIME, output);
        paintingRecipes(ModBlocks.PINK_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_PINK, output);
        paintingRecipes(ModBlocks.GRAY_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_GRAY, output);
        paintingRecipes(ModBlocks.LIGHT_GRAY_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_LIGHT_GRAY, output);
        paintingRecipes(ModBlocks.CYAN_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_CYAN, output);
        paintingRecipes(ModBlocks.PURPLE_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(ModBlocks.BLUE_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_BLUE, output);
        paintingRecipes(ModBlocks.BROWN_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_BROWN, output);
        paintingRecipes(ModBlocks.GREEN_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_GREEN, output);
        paintingRecipes(ModBlocks.RED_LAMP.get(), ModTags.COLORED_LAMPS_TAG, Tags.Items.DYES_RED, output);

        lampRecipes(ModBlocks.BLACK_LAMP.get(), Blocks.BLACK_STAINED_GLASS_PANE, output);
        lampRecipes(ModBlocks.WHITE_LAMP.get(), Blocks.WHITE_STAINED_GLASS_PANE, output);
        lampRecipes(ModBlocks.ORANGE_LAMP.get(), Blocks.ORANGE_STAINED_GLASS_PANE, output);
        lampRecipes(ModBlocks.MAGENTA_LAMP.get(), Blocks.MAGENTA_STAINED_GLASS_PANE, output);
        lampRecipes(ModBlocks.LIGHT_BLUE_LAMP.get(), Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, output);
        lampRecipes(ModBlocks.YELLOW_LAMP.get(), Blocks.YELLOW_STAINED_GLASS_PANE, output);
        lampRecipes(ModBlocks.LIME_LAMP.get(), Blocks.LIME_STAINED_GLASS_PANE, output);
        lampRecipes(ModBlocks.PINK_LAMP.get(), Blocks.PINK_STAINED_GLASS_PANE, output);
        lampRecipes(ModBlocks.GRAY_LAMP.get(), Blocks.GRAY_STAINED_GLASS_PANE, output);
        lampRecipes(ModBlocks.LIGHT_GRAY_LAMP.get(), Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, output);
        lampRecipes(ModBlocks.CYAN_LAMP.get(), Blocks.CYAN_STAINED_GLASS_PANE, output);
        lampRecipes(ModBlocks.PURPLE_LAMP.get(), Blocks.PURPLE_STAINED_GLASS_PANE, output);
        lampRecipes(ModBlocks.BLUE_LAMP.get(), Blocks.BLUE_STAINED_GLASS_PANE, output);
        lampRecipes(ModBlocks.BROWN_LAMP.get(), Blocks.BROWN_STAINED_GLASS_PANE, output);
        lampRecipes(ModBlocks.GREEN_LAMP.get(), Blocks.GREEN_STAINED_GLASS_PANE, output);
        lampRecipes(ModBlocks.RED_LAMP.get(), Blocks.RED_STAINED_GLASS_PANE, output);
    }


    protected static void slabRecipes(Block result, Block input, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
                .pattern("###")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(output);
    }


    protected static void wallRecipes(Block result, Block input, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
                .pattern("###")
                .pattern("###")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(output);
    }


    protected static void lampRecipes(Block result, Block glassInput, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 1)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .define('X', Blocks.REDSTONE_LAMP)
                .define('#', glassInput)
                .unlockedBy(getHasName(Blocks.REDSTONE_LAMP), has(Blocks.REDSTONE_LAMP))
                .save(output);
    }


    protected static void variableTrafficSignRecipes(Block result, Block input, RecipeOutput output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result, 1)
                .requires(input)
                .requires(ModBlocks.VARIABLE_TRAFFIC_SIGN.get())
                .unlockedBy(getHasName(input), has(input))
                .group("variable_traffic_signs")
                .save(output);
    }


    protected static void simpleColorRecipes(Block result, TagKey<Item> input, RecipeOutput output) {
        for (DyeColor color : DyeColor.values()) {
            Item dye = DyeItem.byColor(color);
            ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result, 1)
                    .requires(input)
                    .requires(dye)
                    .group(input.toString())
                    .save(output);
        }
    }



    protected static void simpleShapelessRecipes(Block result, TagKey<Item> firstInput, Item secondInput, RecipeOutput output, String group) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result, 1)
                .requires(firstInput)
                .requires(secondInput)
                .unlockedBy(getHasName(secondInput), has(secondInput))
                .group(group)
                .save(output);
    }

    protected static void stoneCuttingRecipes(Block result, Integer resultCount, Item input, RecipeOutput output) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, result, resultCount)
                .unlockedBy(getHasName(input), has(input))
                .save(output);
    }


    protected static void stoneCuttingRecipes(Block result, Integer resultCount, TagKey<Item> input, RecipeOutput output) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, result, resultCount)
                .unlockedBy("has_" + input, has(input))
                .save(output);
    }


    protected static void paintingRecipes(Block result, Object input, Object color, RecipeOutput output) {
        String resultName = BuiltInRegistries.ITEM.getKey(result.asItem()).getPath();
        String inputName;
        Ingredient inputIngredient;
        Ingredient colorIngredient;

        if (input instanceof Item itemInput) {
            inputName = BuiltInRegistries.ITEM.getKey(itemInput).getPath();
            inputIngredient = Ingredient.of(itemInput);

        } else if (input instanceof Block blockInput) {
            inputName = BuiltInRegistries.ITEM.getKey(blockInput.asItem()).getPath();
            inputIngredient = Ingredient.of(blockInput.asItem());

        } else if (input instanceof TagKey<?> tagInput) {
            inputName = ((TagKey<Item>) tagInput).location().getPath().replace("/", "_") + "_tag";
            inputIngredient = Ingredient.of((TagKey<Item>) tagInput);

        } else {
            throw new IllegalArgumentException("Invalid input type: " + input.getClass().getSimpleName());
        }

        if (color instanceof Item itemColor) {
            colorIngredient = Ingredient.of(itemColor);

        } else if (color instanceof TagKey<?> tagColor) {
            colorIngredient = Ingredient.of((TagKey<Item>) tagColor);

        } else {
            throw new IllegalArgumentException("Invalid color type: " + color.getClass().getSimpleName());
        }

        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(References.MODID, "painting/" + resultName + "_from_" + inputName);
        PaintingRecipe recipe = new PaintingRecipe(id, inputIngredient, colorIngredient, new ItemStack(result));
        output.accept(id, recipe, null);
    }

}

