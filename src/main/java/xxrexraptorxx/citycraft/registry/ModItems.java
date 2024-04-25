package xxrexraptorxx.citycraft.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.citycraft.items.ItemBasic;
import xxrexraptorxx.citycraft.main.References;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.MODID);


    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

    public static final TagKey<Item> ROUND_SIGN_TAG = ItemTags.create(new ResourceLocation("forge", "traffic_signs/round"));
    public static final TagKey<Item> TRIANGLE_SIGN_TAG = ItemTags.create(new ResourceLocation("forge", "traffic_signs/triangle"));
    public static final TagKey<Item> RECTANGLE_SIGN_TAG = ItemTags.create(new ResourceLocation("forge", "traffic_signs/rectangle"));
    public static final TagKey<Item> SQUARE_SIGN_TAG = ItemTags.create(new ResourceLocation("forge", "traffic_signs/square"));
    public static final TagKey<Item> CROSS_SIGN_TAG = ItemTags.create(new ResourceLocation("forge", "traffic_signs/cross"));
    public static final TagKey<Item> UPSIDE_DOWN_TRIANGLE_SIGN_TAG = ItemTags.create(new ResourceLocation("forge", "traffic_signs/upside_down_triangle"));


    public static final RegistryObject<ItemBasic> COAL_COKE = ITEMS.register("coal_coke", ItemBasic::new);
    public static final RegistryObject<ItemBasic> COAL_TAR = ITEMS.register("coal_tar", ItemBasic::new);
    public static final RegistryObject<ItemBasic> ASPHALT_MIXTURE = ITEMS.register("asphalt_mixture", ItemBasic::new);
    public static final RegistryObject<ItemBasic> DYE_MIX = ITEMS.register("dye_mix", ItemBasic::new);

}