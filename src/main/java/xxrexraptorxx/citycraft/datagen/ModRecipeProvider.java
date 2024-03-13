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
    }


    protected static void slabRecipes(Block output, Block input, Consumer<FinishedRecipe> writer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .pattern("###")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(writer);
    }

}