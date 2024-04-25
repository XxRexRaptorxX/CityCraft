package xxrexraptorxx.citycraft.datagen;

import com.google.gson.JsonObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.recipes.PaintingRecipe;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.registry.ModItems;

import javax.annotation.Nullable;
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

        wallRecipes(ModBlocks.BLACK_CONCRETE_WALL.get(), Blocks.BLACK_CONCRETE, writer);
        wallRecipes(ModBlocks.WHITE_CONCRETE_WALL.get(), Blocks.WHITE_CONCRETE, writer);
        wallRecipes(ModBlocks.ORANGE_CONCRETE_WALL.get(), Blocks.ORANGE_CONCRETE, writer);
        wallRecipes(ModBlocks.MAGENTA_CONCRETE_WALL.get(), Blocks.MAGENTA_CONCRETE, writer);
        wallRecipes(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Blocks.LIGHT_BLUE_CONCRETE, writer);
        wallRecipes(ModBlocks.YELLOW_CONCRETE_WALL.get(), Blocks.YELLOW_CONCRETE, writer);
        wallRecipes(ModBlocks.LIME_CONCRETE_WALL.get(), Blocks.LIME_CONCRETE, writer);
        wallRecipes(ModBlocks.PINK_CONCRETE_WALL.get(), Blocks.PINK_CONCRETE, writer);
        wallRecipes(ModBlocks.GRAY_CONCRETE_WALL.get(), Blocks.GRAY_CONCRETE, writer);
        wallRecipes(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Blocks.LIGHT_GRAY_CONCRETE, writer);
        wallRecipes(ModBlocks.CYAN_CONCRETE_WALL.get(), Blocks.CYAN_CONCRETE, writer);
        wallRecipes(ModBlocks.PURPLE_CONCRETE_WALL.get(), Blocks.PURPLE_CONCRETE, writer);
        wallRecipes(ModBlocks.BLUE_CONCRETE_WALL.get(), Blocks.BLUE_CONCRETE, writer);
        wallRecipes(ModBlocks.BROWN_CONCRETE_WALL.get(), Blocks.BROWN_CONCRETE, writer);
        wallRecipes(ModBlocks.GREEN_CONCRETE_WALL.get(), Blocks.GREEN_CONCRETE, writer);
        wallRecipes(ModBlocks.RED_CONCRETE_WALL.get(), Blocks.RED_CONCRETE, writer);

        paintingRecipes(ModBlocks.WARNING_BEACON_LEFT_EU_SIGN.get(), 1, ModBlocks.BAKE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.WARNING_BEACON_RIGHT_EU_SIGN.get(), 1, ModBlocks.BAKE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.WARNING_BEACON_ALT_EU_SIGN.get(), 1, ModBlocks.BAKE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CROSSBUCK_EU_SIGN.get(), 1, ModBlocks.CROSS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CROSSBUCK_US_SIGN.get(), 1, ModBlocks.CROSS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.STOP_EU_SIGN.get(), 1, ModBlocks.OCTAGON_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_ARROW_EU_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_ARROW_EU_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_TURN_ARROW_EU_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_TURN_ARROW_EU_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.KM_AHEAD_EU_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.WEIGHT_EU_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.TAXI_EU_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.WARN_EU_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_ARROW_YELLOW_US_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_ARROW_YELLOW_US_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_DIAGONAL_ARROW_YELLOW_US_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_DIAGONAL_ARROW_YELLOW_US_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.DOUBLE_ARROW_YELLOW_US_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_ARROW_GREEN_US_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_ARROW_GREEN_US_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_DIAGONAL_ARROW_GREEN_US_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_DIAGONAL_ARROW_GREEN_US_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.DOUBLE_ARROW_GREEN_US_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_ARROW_ORANGE_US_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_ARROW_ORANGE_US_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_DIAGONAL_ARROW_ORANGE_US_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_DIAGONAL_ARROW_ORANGE_US_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.DOUBLE_ARROW_ORANGE_US_SIGN.get(), 1, ModBlocks.RECTANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.PRIORITY_ROAD_EU_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.PRIORITY_ROAD_END_EU_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.T_INTERSECTION_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.Y_INTERSECTION_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_SIDE_ROAD_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_SIDE_ROAD_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CROSS_ROAD_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.SIDE_ROAD_AT_ANGLE_LEFT_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.SIDE_ROAD_AT_ANGLE_RIGHT_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_TURN_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_TURN_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_CURVE_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_CURVE_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_REVERSE_TURN_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_REVERSE_TURN_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_MERGING_TRAFFIC_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_MERGING_TRAFFIC_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_ENTERING_ROADWAY_MERGE_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_ENTERING_ROADWAY_MERGE_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_ADDED_LINE_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_ADDED_LINE_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_LANE_ENDS_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_LANE_ENDS_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.TWO_WAY_TRAFFIC_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.VERY_SHARP_CURVE_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.WINDING_ROAD_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.HAIRPIN_CURVE_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CIRCULAR_INTERSECTION_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.DIVIDED_HIGHWAY_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CREEPER_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.TRUCK_CROSSING_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.HILL_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.TRUCK_ROLLOVER_WARNING_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.SLIPPERY_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.ROAD_NARROWS_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CATTLE_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.SIGNAL_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.WORKERS_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.PEDESTRIANS_CROSSING_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.HANDICAPED_CROSSING_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.BICYCLE_CROSSING_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.PLAYGROUND_AHEAD_US_SIGN.get(), 1, ModBlocks.RHOMBUS_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.TEN_SPEED_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.THIRTY_SPEED_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.SIXTY_SPEED_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.EIGHTY_SPEED_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.HUNDRED_SPEED_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.HUNDRED_TWENTY_SPEED_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_VEHICLES_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_CARS_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_TRUCKS_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_PEDESTRIANS_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_BICYCLES_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_PASSING_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_TRUCK_PASSING_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.ONGOING_TRAFFIC_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_ENTER_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_PARKING_ALONG_CARRIAGEWAY_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_PARKING_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_U_TURN_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.END_ALL_LIMITS_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_PASSING_END_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_TRUCK_PASSING_END_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.SIDEWALK_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.BICYCLE_PATH_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.BUS_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.STRAIGHT_AHEAD_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_HERE_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_HERE_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.PASS_LEFT_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.PASS_RIGHT_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_AHEAD_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_AHEAD_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_RIGHT_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.STRAIGHT_LEFT_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.STRAIGHT_RIGHT_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.ROUNDABOUT_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.BUS_STOP_EU_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RAILROAD_CROSSING_US_SIGN.get(), 1, ModBlocks.ROUND_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.DETOUR_AHEAD_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.DETOUR_LEFT_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.DETOUR_RIGHT_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CRAFT_CITY_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CRAFT_CITY_END_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.DISABLED_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.WET_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.END_LINE_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.HIGHWAY_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.HIGHWAY_END_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.MOTORWAY_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.MOTORWAY_END_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CALMING_AREA_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.END_CALMING_AREA_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.ONE_WAY_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.PRIORITY_OVER_ONCOMING_TRAFFIC_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_THROUGH_ROAD_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.PARKING_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.PARKING_GARAGE_EU_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.PEDESTRIAN_CROSSING_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CAMPING_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.PR_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CHURCH_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.HOTEL_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.PETROL_STATION_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CAFE_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.INFO_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.WC_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.TELEPHONE_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RESTAURANT_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.REPAIR_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.FIRST_AID_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.WATER_PROTECTION_AREA_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.EMERGENCY_BAY_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.GUIDE_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_DIRECTION_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_DIRECTION_EU_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.GUIDE_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_DIRECTION_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_DIRECTION_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.TWENTYFIVE_ADVISORY_SPEED_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.THIRTYFIVE_ADVISORY_SPEED_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.FORTYFIVE_ADVISORY_SPEED_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_PEDESTRIANS_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_BICYCLE_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_TRUCKS_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_PARKING_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_LEFT_TURN_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_RIGHT_TURN_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NO_U_TURN_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.STRAIGHT_AHEAD_ONLY_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_TURN_ONLY_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_TURN_ONLY_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.INFO_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.HANDICAPPED_ACCESSIBLE_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.HOTEL_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RESTAURANT_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.HOSPITAL_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.GAS_STATION_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.DIESEL_STATION_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.ELECTRIC_STATION_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CAMPING_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.MEDICAL_SERVICE_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.TELEPHONE_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.AIRPORT_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LIGHT_RAIL_TRANSIT_STATION_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.WINTER_RECREATION_AREA_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.SWIMMING_AREA_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.PICNIC_AREA_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.REPAIR_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.DRINKING_WATER_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.BATHROOMS_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LITTER_BARREL_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LOUNDRY_FACILITY_US_SIGN.get(), 1, ModBlocks.SQUARE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.DANGER_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.ROADWORKS_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CREEPER_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CHILDREN_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CROSSWALK_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.ROCKFALL_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.SLIPPERINESS_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.SIGNAL_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.SNOW_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.ONCOMING_TRAFFIC_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_CURVE_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_CURVE_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_DOUBLE_CURVE_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_DOUBLE_CURVE_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.GATE_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NARROWING_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.LEFT_NARROWING_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RIGHT_NARROWING_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CATTLE_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.ASCEND_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.DESCEND_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.JAMS_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.PRIORITY_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.RAILROAD_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.UNEVEN_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.CYCLES_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.PEDESTRIANS_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.INTERSECTION_EU_SIGN.get(), 1, ModBlocks.TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.YIELD_RIGHT_OF_WAY_EU_SIGN.get(), 1, ModBlocks.UPSIDE_DOWN_TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
        paintingRecipes(ModBlocks.NATURE_RESERVE_EU_SIGN.get(), 1, ModBlocks.UPSIDE_DOWN_TRIANGLE_SIGN.get(), ModItems.DYE_MIX.get(), writer);
    }


    protected static void slabRecipes(Block output, Block input, Consumer<FinishedRecipe> writer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .pattern("###")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(writer);
    }


    protected static void wallRecipes(Block output, Block input, Consumer<FinishedRecipe> writer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .pattern("###")
                .pattern("###")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(writer);
    }


    protected static void stoneCuttingRecipes(Block output, Integer outputCount, Block input, Consumer<FinishedRecipe> writer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output, outputCount)
                .unlockedBy(getHasName(input), has(input))
                .save(writer);
    }


    protected static void stoneCuttingRecipes(Block output, Integer outputCount, TagKey<Item> input, Consumer<FinishedRecipe> writer) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output, outputCount)
                .unlockedBy("has_" + input, has(input))
                .save(writer);
    }


    protected static void paintingRecipes(Block output, Integer outputCount, Block input, Item color, Consumer<FinishedRecipe> writer) {
        JsonObject json = new JsonObject();
        json.addProperty("type", References.MODID + ":painting");

        JsonObject baseObject = new JsonObject();
        baseObject.addProperty("item", ForgeRegistries.BLOCKS.getKey(input).toString());
        json.add("base", baseObject);

        JsonObject colorObject = new JsonObject();
        colorObject.addProperty("item", ForgeRegistries.ITEMS.getKey(color).toString());
        json.add("color", colorObject);

        JsonObject resultObject = new JsonObject();
        resultObject.addProperty("item", ForgeRegistries.ITEMS.getKey(output.asItem()).toString());
        resultObject.addProperty("count", outputCount);
        json.add("result", resultObject);

        ResourceLocation id = new ResourceLocation(References.MODID, "painting/" + output.asItem().toString());

        FinishedRecipe finishedRecipe = new FinishedRecipe() {
            @Override
            public void serializeRecipeData(JsonObject recipeJson) {
                recipeJson.add("type", json.get("type"));
                recipeJson.add("base", json.get("base"));
                recipeJson.add("color", json.get("color"));
                recipeJson.add("result", json.get("result"));
            }

            @Override
            public ResourceLocation getId() {
                return id;
            }

            @Override
            public RecipeSerializer<?> getType() {
                return PaintingRecipe.Serializer.INSTANCE;
            }

            @Nullable
            @Override
            public JsonObject serializeAdvancement() {
                return null;
            }

            @Nullable
            @Override
            public ResourceLocation getAdvancementId() {
                return null;
            }
        };

        writer.accept(finishedRecipe);
    }


    protected static void paintingRecipes(Block output, Integer outputCount, TagKey<Item> input, Item color, Consumer<FinishedRecipe> writer) {
        JsonObject json = new JsonObject();
        json.addProperty("type", References.MODID + ":painting");

        JsonObject baseObject = new JsonObject();
        baseObject.addProperty("tag", input.location().toString());
        json.add("base", baseObject);

        JsonObject colorObject = new JsonObject();
        colorObject.addProperty("item", BuiltInRegistries.ITEM.getKey(color).toString());
        json.add("color", colorObject);

        JsonObject resultObject = new JsonObject();
        resultObject.addProperty("item", BuiltInRegistries.ITEM.getKey(output.asItem()).toString());
        resultObject.addProperty("count", outputCount);
        json.add("result", resultObject);

        ResourceLocation id = new ResourceLocation(References.MODID, "painting/" + output.asItem().toString());

        FinishedRecipe finishedRecipe = new FinishedRecipe() {
            @Override
            public void serializeRecipeData(JsonObject recipeJson) {
                recipeJson.add("type", json.get("type"));
                recipeJson.add("base", json.get("base"));
                recipeJson.add("color", json.get("color"));
                recipeJson.add("result", json.get("result"));
            }

            @Override
            public ResourceLocation getId() {
                return id;
            }

            @Override
            public RecipeSerializer<?> getType() {
                return PaintingRecipe.Serializer.INSTANCE;
            }

            @Nullable
            @Override
            public JsonObject serializeAdvancement() {
                return null;
            }

            @Nullable
            @Override
            public ResourceLocation getAdvancementId() {
                return null;
            }
        };

        writer.accept(finishedRecipe);
    }


}