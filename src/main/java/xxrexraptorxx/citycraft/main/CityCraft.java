package xxrexraptorxx.citycraft.main;

import net.minecraft.client.gui.screens.MenuScreens;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.citycraft.blocks.container.PainterScreen;
import xxrexraptorxx.citycraft.registry.*;
import xxrexraptorxx.citycraft.utils.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://www.curseforge.com/minecraft/mc-mods/city-craft
 **/
@Mod(References.MODID)
public class CityCraft {

    public static final Logger LOGGER = LogManager.getLogger();

    public CityCraft(IEventBus bus) {

        ModBlocks.init(bus);
        ModItems.init(bus);
        Config.init();
        CreativeModeTabs.init(bus);
        ModRecipeSerializers.init(bus);
        ModRecipeTypes.init(bus);
        ModMenuTypes.init(bus);
        bus.addListener(this::clientSetup);
    }

    private void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> MenuScreens.register(ModMenuTypes.PAINTER.get(), PainterScreen::new));
    }

}