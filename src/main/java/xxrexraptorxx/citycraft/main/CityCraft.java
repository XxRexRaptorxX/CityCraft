package xxrexraptorxx.citycraft.main;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;
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

    public CityCraft() {
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.init();
        ModItems.init();
        Config.init();
        CreativeModeTabs.init();
        ModRecipeSerializers.init();
        modBus.addListener(this::clientSetup);

    }

    private void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> MenuScreens.register(ModMenuTypes.PAINTER, PainterScreen::new));
    }

}