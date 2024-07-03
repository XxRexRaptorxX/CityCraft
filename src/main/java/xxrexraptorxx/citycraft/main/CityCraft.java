package xxrexraptorxx.citycraft.main;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
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

    public CityCraft(IEventBus bus, ModContainer container) {

        ModBlocks.init(bus);
        ModItems.init(bus);
        Config.init(container);
        CreativeModeTabs.init(bus);
        ModRecipeSerializers.init(bus);
        ModRecipeTypes.init(bus);
        ModMenuTypes.init(bus);
        bus.addListener(this::registerScreens);
    }


    private void registerScreens(RegisterMenuScreensEvent event) {
        event.register(ModMenuTypes.PAINTER.get(), PainterScreen::new);
    }

}