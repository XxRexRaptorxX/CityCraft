package xxrexraptorxx.citycraft.recipes;

import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeInput;

public class RecipeInputWrapper implements RecipeInput {
    private final Container inventory;

    public RecipeInputWrapper(Container inventory) {
        this.inventory = inventory;
    }

    @Override
    public ItemStack getItem(int slot) {
        return inventory.getItem(slot);
    }

    @Override
    public int size() {
        return inventory.getContainerSize();
    }
}