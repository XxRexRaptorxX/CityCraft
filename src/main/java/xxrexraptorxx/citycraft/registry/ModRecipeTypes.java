package xxrexraptorxx.citycraft.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.utils.Helper;
import xxrexraptorxx.citycraft.utils.PaintingRecipe;

public class ModRecipeTypes {

    public static RecipeType<PaintingRecipe> PAINTING = Helper.unsafeNullCast();


    static void onRegister(final RegisterEvent event) {
        PAINTING = new RecipeType<>() {
            public String toString() {
                return References.MODID + ":" + "painting";
            }
        };

        event.register(ForgeRegistries.Keys.RECIPE_TYPES, new ResourceLocation(References.MODID, "painting"), () -> PAINTING);
    }

}