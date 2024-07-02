package xxrexraptorxx.citycraft.registry;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.citycraft.items.ItemBasic;
import xxrexraptorxx.citycraft.main.References;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(References.MODID);


    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }


    public static final DeferredItem<ItemBasic> COAL_COKE = ITEMS.register("coal_coke", ItemBasic::new);
    public static final DeferredItem<ItemBasic> COAL_TAR = ITEMS.register("coal_tar", ItemBasic::new);
    public static final DeferredItem<ItemBasic> ASPHALT_MIXTURE = ITEMS.register("asphalt_mixture", ItemBasic::new);
    public static final DeferredItem<ItemBasic> DYE_MIX = ITEMS.register("dye_mix", ItemBasic::new);

}