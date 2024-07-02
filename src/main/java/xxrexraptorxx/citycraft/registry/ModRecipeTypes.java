package xxrexraptorxx.citycraft.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.recipes.IPaintingRecipe;

public class ModRecipeTypes {

    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(BuiltInRegistries.RECIPE_TYPE, References.MODID);

    public static void init(IEventBus bus) {
        RECIPE_TYPES.register(bus);
    }

    public static final DeferredHolder<RecipeType<?>, RecipeType<IPaintingRecipe>> PAINTING = RECIPE_TYPES.register("painting", () -> new RecipeType<>() {
    });
}