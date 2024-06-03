package xxrexraptorxx.citycraft.recipes;

import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import xxrexraptorxx.citycraft.registry.ModBlocks;

public interface IPaintingRecipe extends Recipe<Container> {

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

        Ingredient getIngredients(Integer id);

    }