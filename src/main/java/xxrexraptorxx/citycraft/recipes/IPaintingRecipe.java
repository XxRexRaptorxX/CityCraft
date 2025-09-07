package xxrexraptorxx.citycraft.recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeInput;
import xxrexraptorxx.citycraft.registry.ModBlocks;

public interface IPaintingRecipe extends Recipe<RecipeInput> {

    /**
     * Used to determine if this recipe can fit in a grid of the given width/height
     */
    default boolean canCraftInDimensions(int width, int height) {
        return width >= 2 && height >= 1;
    }

    default ItemStack getToastSymbol() {
        return new ItemStack(ModBlocks.BLOCK_PAINTER.get());
    }

    boolean isColorIngredient(ItemStack stack);

    boolean isBaseIngredient(ItemStack stack);

    Ingredient getIngredients(Integer id);
}
