package xxrexraptorxx.citycraft.registry;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.recipes.PaintingRecipe;

public class ModRecipeSerializers {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, References.MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        SERIALIZERS.register(bus);
    }


    public static final RegistryObject<RecipeSerializer<?>> PAINTING = SERIALIZERS.register("painting", () -> new PaintingRecipe.Serializer().INSTANCE);



    // OLD
    //public static RecipeSerializer<PaintingRecipe> PAINTING = Helper.unsafeNullCast();

    //static void onRegister(final RegisterEvent event) {
    //    PAINTING = new SingleItemRecipe.Serializer<>(PaintingRecipe::new) {};
    //    event.register(ForgeRegistries.Keys.RECIPE_SERIALIZERS, new ResourceLocation(References.MODID, "painting"), () -> PAINTING);
    //}
}
