package xxrexraptorxx.citycraft.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.citycraft.main.References;

public class CreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, References.MODID);

    public static void init() { CREATIVE_MODE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus()); }


    public static final RegistryObject<CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register(References.MODID + ".main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + References.MODID + ".main_tab"))
            .icon(() -> new ItemStack(ModBlocks.ASPHALT_BLOCK.get()))
            .displayItems((params, output) -> {

                output.accept(ModItems.COAL_COKE.get());
                output.accept(ModItems.ASPHALT_MIXTURE.get());
                output.accept(ModItems.COAL_TAR.get());

            }).build());


    public static final RegistryObject<CreativeModeTab> ROAD_TAB = CREATIVE_MODE_TABS.register(References.MODID + ".road", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + References.MODID + ".road_tab"))
            .icon(() -> new ItemStack(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE.get()))
            .displayItems((params, output) -> {

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_HATCHING.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_FRAME.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_FRAME.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_EDGE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_EDGE.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE.get());


                output.accept(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW.get());


                output.accept(ModBlocks.ASPHALT_BLOCK.get());
                output.accept(ModBlocks.CRACKED_ASPHALT.get());
                output.accept(ModBlocks.POTHOLE_ASPHALT.get());
                output.accept(ModBlocks.MOSSY_ASPHALT.get());
                output.accept(ModBlocks.DIRTY_ASPHALT.get());
                output.accept(ModBlocks.WHITE_ASPHALT.get());

                output.accept(ModBlocks.LIGHT_GRAY_ASPHALT.get());
                output.accept(ModBlocks.GRAY_ASPHALT.get());
                output.accept(ModBlocks.BROWN_ASPHALT.get());
                output.accept(ModBlocks.RED_ASPHALT.get());
                output.accept(ModBlocks.ORANGE_ASPHALT.get());
                output.accept(ModBlocks.YELLOW_ASPHALT.get());
                output.accept(ModBlocks.LIME_ASPHALT.get());
                output.accept(ModBlocks.GREEN_ASPHALT.get());
                output.accept(ModBlocks.CYAN_ASPHALT.get());
                output.accept(ModBlocks.LIGHT_BLUE_ASPHALT.get());
                output.accept(ModBlocks.BLUE_ASPHALT.get());
                output.accept(ModBlocks.PURPLE_ASPHALT.get());
                output.accept(ModBlocks.MAGENTA_ASPHALT.get());
                output.accept(ModBlocks.PINK_ASPHALT.get());

            }).build());
}
