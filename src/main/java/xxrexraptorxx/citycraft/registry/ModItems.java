package xxrexraptorxx.citycraft.registry;

import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
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
    public static final DeferredItem<ItemBasic> IRON_ROD = ITEMS.register("iron_rod", ItemBasic::new);

    public static final DeferredItem LIGHTING_ROD_BLOCK_ITEM = ModItems.ITEMS.register("lighting_rod",
            () -> new StandingAndWallBlockItem(ModBlocks.LIGHTING_ROD.get(), ModBlocks.WALL_LIGHTING_ROD.get(), new Item.Properties(), Direction.DOWN));
}
