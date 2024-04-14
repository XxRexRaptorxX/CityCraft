package xxrexraptorxx.citycraft.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import xxrexraptorxx.citycraft.blocks.container.PainterMenu;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.utils.Helper;


public class ModMenuTypes {

    public static MenuType<PainterMenu> PAINTER = Helper.unsafeNullCast();


    static void onRegister(final RegisterEvent event) {
        PAINTER = new MenuType<>(PainterMenu::new, FeatureFlags.DEFAULT_FLAGS);
        event.register(ForgeRegistries.Keys.MENU_TYPES, new ResourceLocation(References.MODID, "painter"), () -> PAINTER);
    }

}