package xxrexraptorxx.citycraft.utils;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.minecraft.world.level.Level;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.registry.ModRecipeSerializers;
import xxrexraptorxx.citycraft.registry.ModRecipeTypes;

public class PaintingRecipe extends SingleItemRecipe {

    public PaintingRecipe(ResourceLocation id, String group, Ingredient ingredient, ItemStack result) {
        super(ModRecipeTypes.PAINTING, ModRecipeSerializers.PAINTING, id, group, ingredient, result);
    }


    @Override
    public boolean matches(Container inv, Level worldIn) {
        return this.ingredient.test(inv.getItem(0));
    }


    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(ModBlocks.BLOCK_PAINTER.get());
    }


    @Override
    public boolean isSpecial() {
        return true;
    }


    public Ingredient getIngredient() {
        return this.ingredient;
    }


    public ResourceLocation getId() {
        return this.id;
    }
}