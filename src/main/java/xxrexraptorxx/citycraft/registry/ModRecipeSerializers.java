package xxrexraptorxx.citycraft.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.recipes.PaintingRecipe;

public class ModRecipeSerializers {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, References.MODID);

    public static void init(IEventBus bus) {
        SERIALIZERS.register(bus);
    }

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<?>> PAINTING =
            SERIALIZERS.register("painting", () -> new PaintingRecipe.Serializer().INSTANCE);
}
