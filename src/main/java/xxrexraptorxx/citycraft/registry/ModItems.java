package xxrexraptorxx.citycraft.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.citycraft.items.ItemBasic;
import xxrexraptorxx.citycraft.items.ItemTar;
import xxrexraptorxx.citycraft.main.References;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.MODID);


    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }


    public static final RegistryObject<ItemBasic> COAL_COKE = ITEMS.register("coal_coke", ItemBasic::new);
    public static final RegistryObject<ItemTar> COAL_TAR = ITEMS.register("coal_tar", ItemTar::new);
    public static final RegistryObject<ItemBasic> ASPHALT_MIXTURE = ITEMS.register("asphalt_mixture", ItemBasic::new);
    public static final RegistryObject<ItemBasic> DYE_MIX = ITEMS.register("dye_mix", ItemBasic::new);

}