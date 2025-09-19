package xxrexraptorxx.citycraft.main;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.citycraft.blocks.container.PainterScreen;
import xxrexraptorxx.citycraft.registry.*;
import xxrexraptorxx.citycraft.utils.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage <a href="https://www.curseforge.com/minecraft/mc-mods/city-craft">...</a>
 **/
@Mod(References.MODID)
public class CityCraft {

    public static final Logger LOGGER = LogManager.getLogger();

    public CityCraft(IEventBus bus, ModContainer container) {

        ModBlocks.init(bus);
        ModItems.init(bus);
        Config.init(container);
        CreativeTabs.init(bus);
        ModRecipeSerializers.init(bus);
        ModRecipeTypes.init(bus);
        ModMenuTypes.init(bus);
        bus.addListener(this::registerScreens);
        bus.addListener(this::addCreative);
    }


    private void registerScreens(RegisterMenuScreensEvent event) {
        event.register(ModMenuTypes.PAINTER.get(), PainterScreen::new);
    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.accept(ModBlocks.REDSTONE_POLE);
        }
    }
}
