package xxrexraptorxx.citycraft.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;
import xxrexraptorxx.citycraft.registry.ModCreativeTabs;
import xxrexraptorxx.citycraft.registry.ModItems;

public class ItemTar extends Item {

    public ItemTar() {
        super(new Properties().tab(ModCreativeTabs.MAIN_TAB).craftRemainder(Items.BUCKET)
        );
    }


    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        if (this == ModItems.COAL_TAR.get()) {
                return 800;
        } else {
            return 0;
        }
    }
}
