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
            .icon(() -> new ItemStack(ModItems.ASPHALT_MIXTURE.get()))
            .displayItems((params, output) -> {

                output.accept(ModItems.COAL_COKE.get());
                output.accept(ModItems.ASPHALT_MIXTURE.get());
                output.accept(ModItems.COAL_TAR.get());

                output.accept(ModBlocks.WHITE_CHAIN.get());
                output.accept(ModBlocks.RED_CHAIN.get());
                output.accept(ModBlocks.YELLOW_CHAIN.get());
                output.accept(ModBlocks.BLACK_CHAIN.get());

            }).build());


    public static final RegistryObject<CreativeModeTab> SIGN_TAB = CREATIVE_MODE_TABS.register(References.MODID + ".sign", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + References.MODID + ".sign_tab"))
            .icon(() -> new ItemStack(ModBlocks.ROAD_EDGE_POST.get()))
            .displayItems((params, output) -> {

                output.accept(ModBlocks.ROAD_EDGE_POST.get());
                output.accept(ModBlocks.IRON_POLE.get());
                output.accept(ModBlocks.STONE_POST.get());
                output.accept(ModBlocks.WHITE_POLE.get());
                output.accept(ModBlocks.WHITE_POST.get());
                output.accept(ModBlocks.RED_POLE.get());
                output.accept(ModBlocks.RED_POST.get());
                output.accept(ModBlocks.RED_WHITE_POLE.get());
                output.accept(ModBlocks.RED_WHITE_POST.get());
                output.accept(ModBlocks.YELLOW_POLE.get());
                output.accept(ModBlocks.YELLOW_POST.get());
                output.accept(ModBlocks.BLACK_POLE.get());
                output.accept(ModBlocks.BLACK_POST.get());
                output.accept(ModBlocks.YELLOW_BLACK_POLE.get());
                output.accept(ModBlocks.YELLOW_BLACK_POST.get());

            }).build());


    public static final RegistryObject<CreativeModeTab> ROAD_TAB = CREATIVE_MODE_TABS.register(References.MODID + ".road", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + References.MODID + ".road_tab"))
            .icon(() -> new ItemStack(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE.get()))
            .displayItems((params, output) -> {

                output.accept(ModBlocks.ASPHALT_BLOCK.get());
                output.accept(ModBlocks.ASPHALT_SLAB.get());
                output.accept(ModBlocks.CRACKED_ASPHALT.get());
                output.accept(ModBlocks.CRACKED_ASPHALT_SLAB.get());
                output.accept(ModBlocks.POTHOLE_ASPHALT.get());
                output.accept(ModBlocks.POTHOLE_ASPHALT_SLAB.get());
                output.accept(ModBlocks.MOSSY_ASPHALT.get());
                output.accept(ModBlocks.MOSSY_ASPHALT_SLAB.get());
                output.accept(ModBlocks.DIRTY_ASPHALT.get());
                output.accept(ModBlocks.DIRTY_ASPHALT_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_HATCHING.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_HATCHING_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_FRAME.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_FRAME_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_FRAME.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_FRAME_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_EDGE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_EDGE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_EDGE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_EDGE_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE_SLAB.get());


                output.accept(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW_SLAB.get());

                output.accept(ModBlocks.BOOST_ASPHALT.get());
                output.accept(ModBlocks.BOOST_ASPHALT_SLAB.get());
                output.accept(ModBlocks.YELLOW_BUMPER_SLAB.get());
                output.accept(ModBlocks.RED_BUMPER_SLAB.get());

                output.accept(ModBlocks.WHITE_ASPHALT.get());
                output.accept(ModBlocks.WHITE_ASPHALT_SLAB.get());
                output.accept(ModBlocks.LIGHT_GRAY_ASPHALT.get());
                output.accept(ModBlocks.LIGHT_GRAY_ASPHALT_SLAB.get());
                output.accept(ModBlocks.GRAY_ASPHALT.get());
                output.accept(ModBlocks.GRAY_ASPHALT_SLAB.get());
                output.accept(ModBlocks.BROWN_ASPHALT.get());
                output.accept(ModBlocks.BROWN_ASPHALT_SLAB.get());
                output.accept(ModBlocks.RED_ASPHALT.get());
                output.accept(ModBlocks.RED_ASPHALT_SLAB.get());
                output.accept(ModBlocks.ORANGE_ASPHALT.get());
                output.accept(ModBlocks.ORANGE_ASPHALT_SLAB.get());
                output.accept(ModBlocks.YELLOW_ASPHALT.get());
                output.accept(ModBlocks.YELLOW_ASPHALT_SLAB.get());
                output.accept(ModBlocks.LIME_ASPHALT.get());
                output.accept(ModBlocks.LIME_ASPHALT_SLAB.get());
                output.accept(ModBlocks.GREEN_ASPHALT.get());
                output.accept(ModBlocks.GREEN_ASPHALT_SLAB.get());
                output.accept(ModBlocks.CYAN_ASPHALT.get());
                output.accept(ModBlocks.CYAN_ASPHALT_SLAB.get());
                output.accept(ModBlocks.LIGHT_BLUE_ASPHALT.get());
                output.accept(ModBlocks.LIGHT_BLUE_ASPHALT_SLAB.get());
                output.accept(ModBlocks.BLUE_ASPHALT.get());
                output.accept(ModBlocks.BLUE_ASPHALT_SLAB.get());
                output.accept(ModBlocks.PURPLE_ASPHALT.get());
                output.accept(ModBlocks.PURPLE_ASPHALT_SLAB.get());
                output.accept(ModBlocks.MAGENTA_ASPHALT.get());
                output.accept(ModBlocks.MAGENTA_ASPHALT_SLAB.get());
                output.accept(ModBlocks.PINK_ASPHALT.get());
                output.accept(ModBlocks.PINK_ASPHALT_SLAB.get());

                output.accept(ModBlocks.ASPHALT_WITH_WHITE_A.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_A_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_A.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_A_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_B.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_B_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_B.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_B_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_C.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_C_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_C.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_C_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_D.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_D_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_D.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_D_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_E.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_E_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_E.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_E_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_F.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_F_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_F.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_F_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_G.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_G_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_G.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_G_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_H.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_H_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_H.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_H_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_I.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_I_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_I.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_I_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_J.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_J_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_J.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_J_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_K.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_K_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_K.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_K_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_L.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_L_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_L.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_L_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_M.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_M_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_M.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_M_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_N.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_N_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_N.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_N_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_O.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_O_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_O.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_O_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_P.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_P_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_P.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_P_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_Q.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_Q_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_Q.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_Q_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_R.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_R_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_R.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_R_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_S.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_S_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_S.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_S_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_T.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_T_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_T.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_T_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_U.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_U_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_U.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_U_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_V.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_V_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_V.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_V_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_W.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_W_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_W.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_W_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_X.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_X_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_X.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_X_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_Y.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_Y_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_Y.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_Y_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_Z.get());
                output.accept(ModBlocks.ASPHALT_WITH_WHITE_Z_SLAB.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_Z.get());
                output.accept(ModBlocks.ASPHALT_WITH_YELLOW_Z_SLAB.get());

            }).build());
}
