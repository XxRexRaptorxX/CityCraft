package xxrexraptorxx.citycraft.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.utils.Helper;
import xxrexraptorxx.citycraft.utils.PaintingRecipe;

public class ModRecipeSerializers {

    public static RecipeSerializer<PaintingRecipe> PAINTING = Helper.unsafeNullCast();


    static void onRegister(final RegisterEvent event) {
        PAINTING = new SingleItemRecipe.Serializer<>(PaintingRecipe::new) {};
        event.register(ForgeRegistries.Keys.RECIPE_SERIALIZERS, new ResourceLocation(References.MODID, "painting"), () -> PAINTING);
    }

}
