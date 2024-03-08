package xxrexraptorxx.citycraft.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;
import xxrexraptorxx.citycraft.registry.ModItems;

public class ItemBasic extends Item {

    public ItemBasic() {
        super(new Properties()
        );
    }


    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        if (this == ModItems.COAL_COKE.get()) {
            return 3200;
        } else {
            return 0;
        }
    }


    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        if (this == ModItems.COAL_TAR.get()) {
            return new ItemStack(Items.BUCKET);
        }

        return super.getCraftingRemainingItem(stack);
    }
}
