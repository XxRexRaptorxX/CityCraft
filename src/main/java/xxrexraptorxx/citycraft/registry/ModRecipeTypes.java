package xxrexraptorxx.citycraft.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.recipes.IPaintingRecipe;
import xxrexraptorxx.citycraft.recipes.PaintingRecipe;
import xxrexraptorxx.citycraft.utils.Helper;

public class ModRecipeTypes {

    public static RecipeType<IPaintingRecipe> PAINTING = Helper.unsafeNullCast();
    public static final String PAINTING_RECIPE_TYPE = References.MODID + ":painting";


    static void onRegister(final RegisterEvent event) {
        PAINTING = new RecipeType<>() {
            public String toString() {
                return PAINTING_RECIPE_TYPE;
            }
        };

        event.register(ForgeRegistries.Keys.RECIPE_TYPES, new ResourceLocation(PAINTING_RECIPE_TYPE), () -> PAINTING);
    }

}