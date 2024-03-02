package xxrexraptorxx.citycraft.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.citycraft.main.References;

public class CreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, References.MODID);

    public static void init() { CREATIVE_MODE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus()); }


    public static final RegistryObject<CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register(References.MODID, () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + References.MODID + ".main_tab"))
            .icon(() -> new ItemStack(ModBlocks.ASPHALT_BLOCK.get()))
            .displayItems((params, output) -> {

            }).build());

    public static final RegistryObject<CreativeModeTab> ROAD_TAB = CREATIVE_MODE_TABS.register(References.MODID, () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + References.MODID + ".road_tab"))
            .icon(() -> new ItemStack(ModBlocks.ASPHALT_BLOCK.get()))
            .displayItems((params, output) -> {

                output.accept(ModBlocks.ASPHALT_BLOCK.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_HATCHING.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_FRAME.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_EDGE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_SIDE_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_SIDE_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW.get());

            }).build());
}
