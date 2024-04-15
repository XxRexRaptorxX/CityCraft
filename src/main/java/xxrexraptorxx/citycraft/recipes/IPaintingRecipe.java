package xxrexraptorxx.citycraft.recipes;

import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.registry.ModRecipeTypes;

public interface IPaintingRecipe extends Recipe<Container> {

        default RecipeType<?> getType() {
            return ModRecipeTypes.PAINTING;
        }

        /**
         * Used to determine if this recipe can fit in a grid of the given width/height
         */
        default boolean canCraftInDimensions(int pWidth, int pHeight) {
            return pWidth >= 2 && pHeight >= 1;
        }

        default ItemStack getToastSymbol() {
            return new ItemStack(ModBlocks.BLOCK_PAINTER.get());
        }

        boolean isColorIngredient(ItemStack pStack);

        boolean isBaseIngredient(ItemStack pStack);
 }