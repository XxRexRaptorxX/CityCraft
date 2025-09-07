package xxrexraptorxx.citycraft.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.citycraft.blocks.container.PainterMenu;
import xxrexraptorxx.citycraft.main.References;

public class ModMenuTypes {

    public static final DeferredRegister<MenuType<?>> MENU_TYPES =
            DeferredRegister.create(BuiltInRegistries.MENU, References.MODID);

    public static void init(IEventBus bus) {
        MENU_TYPES.register(bus);
    }

    public static final DeferredHolder<MenuType<?>, MenuType<PainterMenu>> PAINTER =
            MENU_TYPES.register("painting", () -> new MenuType<>(PainterMenu::new, FeatureFlags.DEFAULT_FLAGS));
}
