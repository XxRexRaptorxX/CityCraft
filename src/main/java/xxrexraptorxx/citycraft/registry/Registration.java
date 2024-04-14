package xxrexraptorxx.citycraft.registry;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import xxrexraptorxx.citycraft.main.References;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = References.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Registration {

    @SubscribeEvent
    public static void onRegistration(final RegisterEvent event) {
        if (event.getRegistryKey().equals(ForgeRegistries.Keys.MENU_TYPES)) {
            ModMenuTypes.onRegister(event);

        } else if (event.getRegistryKey().equals(ForgeRegistries.Keys.RECIPE_SERIALIZERS)) {
            ModRecipeSerializers.onRegister(event);

        } else if (event.getRegistryKey().equals(ForgeRegistries.Keys.RECIPE_TYPES)) {
            ModRecipeTypes.onRegister(event);
        }
    }

}
