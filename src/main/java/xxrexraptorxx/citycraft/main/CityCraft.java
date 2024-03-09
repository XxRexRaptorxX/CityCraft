package xxrexraptorxx.citycraft.main;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.citycraft.registry.CreativeModeTabs;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.registry.ModItems;
import xxrexraptorxx.citycraft.utils.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://www.curseforge.com/minecraft/mc-mods/city-craft
 **/
@Mod(References.MODID)
public class CityCraft {

    public static final Logger LOGGER = LogManager.getLogger();

    public CityCraft() {

        ModBlocks.init();
        ModItems.init();
        Config.init();
        CreativeModeTabs.init();
    }

}