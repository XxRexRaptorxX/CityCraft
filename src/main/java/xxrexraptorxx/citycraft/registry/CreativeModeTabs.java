package xxrexraptorxx.citycraft.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.utils.Config;

public class CreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, References.MODID);

    public static void init() { CREATIVE_MODE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus()); }


    public static final RegistryObject<CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register(References.MODID + ".main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + References.MODID + ".main_tab"))
            .icon(() -> new ItemStack(ModBlocks.YELLOW_BLACK_POST.get()))
            .displayItems((params, output) -> {

                output.accept(ModBlocks.ROAD_EDGE_POST.get());

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

                output.accept(ModBlocks.WHITE_CHAIN.get());
                output.accept(ModBlocks.RED_CHAIN.get());
                output.accept(ModBlocks.YELLOW_CHAIN.get());
                output.accept(ModBlocks.BLACK_CHAIN.get());

                output.accept(ModItems.COAL_COKE.get());
                output.accept(ModItems.ASPHALT_MIXTURE.get());
                output.accept(ModItems.COAL_TAR.get());

            }).build());


    public static final RegistryObject<CreativeModeTab> SIGN_TAB = CREATIVE_MODE_TABS.register(References.MODID + ".signs", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + References.MODID + ".signs_tab"))
            .icon(() -> new ItemStack(ModBlocks.CREEPER_US_SIGN.get()))
            .withTabsBefore(MAIN_TAB.getId())
            .displayItems((params, output) -> {
                //if (!Config.SPLIT_TRAFFIC_SIGN_TAB.get()) {

                    // EU
                    output.accept(ModBlocks.IRON_POLE.get());

                    output.accept(ModBlocks.DANGER_EU_SIGN.get());
                    output.accept(ModBlocks.ROADWORKS_EU_SIGN.get());
                    output.accept(ModBlocks.CREEPER_EU_SIGN.get());
                    output.accept(ModBlocks.CHILDREN_EU_SIGN.get());
                    output.accept(ModBlocks.CROSSWALK_EU_SIGN.get());
                    output.accept(ModBlocks.ROCKFALL_EU_SIGN.get());
                    output.accept(ModBlocks.SLIPPERINESS_EU_SIGN.get());
                    output.accept(ModBlocks.SIGNAL_EU_SIGN.get());
                    output.accept(ModBlocks.SNOW_EU_SIGN.get());
                    output.accept(ModBlocks.ONCOMING_TRAFFIC_EU_SIGN.get());
                    output.accept(ModBlocks.LEFT_CURVE_EU_SIGN.get());
                    output.accept(ModBlocks.RIGHT_CURVE_EU_SIGN.get());
                    output.accept(ModBlocks.LEFT_DOUBLE_CURVE_EU_SIGN.get());
                    output.accept(ModBlocks.RIGHT_DOUBLE_CURVE_EU_SIGN.get());
                    output.accept(ModBlocks.GATE_EU_SIGN.get());
                    output.accept(ModBlocks.NARROWING_EU_SIGN.get());
                    output.accept(ModBlocks.LEFT_NARROWING_EU_SIGN.get());
                    output.accept(ModBlocks.RIGHT_NARROWING_EU_SIGN.get());
                    output.accept(ModBlocks.CATTLE_EU_SIGN.get());
                    output.accept(ModBlocks.ASCEND_EU_SIGN.get());
                    output.accept(ModBlocks.DESCEND_EU_SIGN.get());
                    output.accept(ModBlocks.JAMS_EU_SIGN.get());
                    output.accept(ModBlocks.PRIORITY_EU_SIGN.get());
                    output.accept(ModBlocks.RAILROAD_EU_SIGN.get());
                    output.accept(ModBlocks.UNEVEN_EU_SIGN.get());
                    output.accept(ModBlocks.CYCLES_EU_SIGN.get());
                    output.accept(ModBlocks.PEDESTRIANS_EU_SIGN.get());
                    output.accept(ModBlocks.INTERSECTION_EU_SIGN.get());

                    output.accept(ModBlocks.TEN_SPEED_EU_SIGN.get());
                    output.accept(ModBlocks.THIRTY_SPEED_EU_SIGN.get());
                    output.accept(ModBlocks.SIXTY_SPEED_EU_SIGN.get());
                    output.accept(ModBlocks.EIGHTY_SPEED_EU_SIGN.get());
                    output.accept(ModBlocks.HUNDRED_SPEED_EU_SIGN.get());
                    output.accept(ModBlocks.HUNDRED_TWENTY_SPEED_EU_SIGN.get());
                    output.accept(ModBlocks.NO_VEHICLES_EU_SIGN.get());
                    output.accept(ModBlocks.NO_CARS_EU_SIGN.get());
                    output.accept(ModBlocks.NO_TRUCKS_EU_SIGN.get());
                    output.accept(ModBlocks.NO_PEDESTRIANS_EU_SIGN.get());
                    output.accept(ModBlocks.NO_BICYCLES_EU_SIGN.get());
                    output.accept(ModBlocks.NO_PASSING_EU_SIGN.get());
                    output.accept(ModBlocks.NO_TRUCK_PASSING_EU_SIGN.get());
                    output.accept(ModBlocks.ONGOING_TRAFFIC_EU_SIGN.get());

                    output.accept(ModBlocks.NO_ENTER_EU_SIGN.get());
                    output.accept(ModBlocks.NO_PARKING_ALONG_CARRIAGEWAY_EU_SIGN.get());
                    output.accept(ModBlocks.NO_PARKING_EU_SIGN.get());
                    output.accept(ModBlocks.NO_U_TURN_EU_SIGN.get());

                    output.accept(ModBlocks.END_ALL_LIMITS_EU_SIGN.get());
                    output.accept(ModBlocks.NO_PASSING_END_EU_SIGN.get());
                    output.accept(ModBlocks.NO_TRUCK_PASSING_END_EU_SIGN.get());

                    output.accept(ModBlocks.SIDEWALK_EU_SIGN.get());
                    output.accept(ModBlocks.BICYCLE_PATH_EU_SIGN.get());
                    output.accept(ModBlocks.BUS_EU_SIGN.get());

                    output.accept(ModBlocks.STRAIGHT_AHEAD_EU_SIGN.get());
                    output.accept(ModBlocks.LEFT_HERE_EU_SIGN.get());
                    output.accept(ModBlocks.RIGHT_HERE_EU_SIGN.get());
                    output.accept(ModBlocks.PASS_LEFT_EU_SIGN.get());
                    output.accept(ModBlocks.PASS_RIGHT_EU_SIGN.get());
                    output.accept(ModBlocks.LEFT_AHEAD_EU_SIGN.get());
                    output.accept(ModBlocks.RIGHT_AHEAD_EU_SIGN.get());
                    output.accept(ModBlocks.LEFT_RIGHT_EU_SIGN.get());
                    output.accept(ModBlocks.STRAIGHT_LEFT_EU_SIGN.get());
                    output.accept(ModBlocks.STRAIGHT_RIGHT_EU_SIGN.get());
                    output.accept(ModBlocks.ROUNDABOUT_EU_SIGN.get());
                    output.accept(ModBlocks.BUS_STOP_EU_SIGN.get());

                    output.accept(ModBlocks.DETOUR_AHEAD_EU_SIGN.get());
                    output.accept(ModBlocks.DETOUR_LEFT_EU_SIGN.get());
                    output.accept(ModBlocks.DETOUR_RIGHT_EU_SIGN.get());
                    output.accept(ModBlocks.CRAFT_CITY_EU_SIGN.get());
                    output.accept(ModBlocks.CRAFT_CITY_END_EU_SIGN.get());

                    output.accept(ModBlocks.PRIORITY_ROAD_EU_SIGN.get());
                    output.accept(ModBlocks.PRIORITY_ROAD_END_EU_SIGN.get());
                    output.accept(ModBlocks.STOP_EU_SIGN.get());
                    output.accept(ModBlocks.YIELD_RIGHT_OF_WAY_EU_SIGN.get());
                    output.accept(ModBlocks.NATURE_RESERVE_EU_SIGN.get());
                    output.accept(ModBlocks.CROSSBUCK_EU_SIGN.get());

                    output.accept(ModBlocks.LEFT_ARROW_EU_SIGN.get());
                    output.accept(ModBlocks.RIGHT_ARROW_EU_SIGN.get());
                    output.accept(ModBlocks.LEFT_TURN_ARROW_EU_SIGN.get());
                    output.accept(ModBlocks.RIGHT_TURN_ARROW_EU_SIGN.get());
                    output.accept(ModBlocks.KM_AHEAD_EU_SIGN.get());
                    output.accept(ModBlocks.WEIGHT_EU_SIGN.get());
                    output.accept(ModBlocks.TAXI_EU_SIGN.get());

                    output.accept(ModBlocks.DISABLED_EU_SIGN.get());
                    output.accept(ModBlocks.WET_EU_SIGN.get());
                    output.accept(ModBlocks.END_LINE_EU_SIGN.get());

                    output.accept(ModBlocks.HIGHWAY_EU_SIGN.get());
                    output.accept(ModBlocks.HIGHWAY_END_EU_SIGN.get());
                    output.accept(ModBlocks.MOTORWAY_EU_SIGN.get());
                    output.accept(ModBlocks.MOTORWAY_END_EU_SIGN.get());
                    output.accept(ModBlocks.CALMING_AREA_EU_SIGN.get());
                    output.accept(ModBlocks.END_CALMING_AREA_EU_SIGN.get());
                    output.accept(ModBlocks.ONE_WAY_EU_SIGN.get());
                    output.accept(ModBlocks.PRIORITY_OVER_ONCOMING_TRAFFIC_EU_SIGN.get());
                    output.accept(ModBlocks.NO_THROUGH_ROAD_EU_SIGN.get());
                    output.accept(ModBlocks.PARKING_EU_SIGN.get());
                    output.accept(ModBlocks.PARKING_GARAGE_EU_EU_SIGN.get());
                    output.accept(ModBlocks.PEDESTRIAN_CROSSING_EU_SIGN.get());

                    output.accept(ModBlocks.CAMPING_EU_SIGN.get());
                    output.accept(ModBlocks.PR_EU_SIGN.get());
                    output.accept(ModBlocks.CHURCH_EU_SIGN.get());
                    output.accept(ModBlocks.HOTEL_EU_SIGN.get());
                    output.accept(ModBlocks.PETROL_STATION_EU_SIGN.get());
                    output.accept(ModBlocks.CAFE_EU_SIGN.get());
                    output.accept(ModBlocks.INFO_EU_SIGN.get());
                    output.accept(ModBlocks.WC_EU_SIGN.get());
                    output.accept(ModBlocks.TELEPHONE_EU_SIGN.get());
                    output.accept(ModBlocks.RESTAURANT_EU_SIGN.get());
                    output.accept(ModBlocks.REPAIR_EU_SIGN.get());
                    output.accept(ModBlocks.FIRST_AID_EU_SIGN.get());
                    output.accept(ModBlocks.WATER_PROTECTION_AREA_EU_SIGN.get());
                    output.accept(ModBlocks.EMERGENCY_BAY_EU_SIGN.get());

                    output.accept(ModBlocks.WARN_EU_SIGN.get());
                    output.accept(ModBlocks.GUIDE_EU_SIGN.get());
                    output.accept(ModBlocks.LEFT_DIRECTION_EU_SIGN.get());
                    output.accept(ModBlocks.RIGHT_DIRECTION_EU_SIGN.get());
                    output.accept(ModBlocks.WARNING_BEACON_LEFT_EU_SIGN.get());
                    output.accept(ModBlocks.WARNING_BEACON_RIGHT_EU_SIGN.get());
                    output.accept(ModBlocks.WARNING_BEACON_ALT_EU_SIGN.get());

                    // US
                    output.accept(ModBlocks.GUIDE_US_SIGN.get());
                    output.accept(ModBlocks.LEFT_DIRECTION_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_DIRECTION_US_SIGN.get());

                    output.accept(ModBlocks.T_INTERSECTION_US_SIGN.get());
                    output.accept(ModBlocks.Y_INTERSECTION_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_SIDE_ROAD_US_SIGN.get());
                    output.accept(ModBlocks.LEFT_SIDE_ROAD_US_SIGN.get());
                    output.accept(ModBlocks.CROSS_ROAD_US_SIGN.get());
                    output.accept(ModBlocks.SIDE_ROAD_AT_ANGLE_LEFT_US_SIGN.get());
                    output.accept(ModBlocks.SIDE_ROAD_AT_ANGLE_RIGHT_US_SIGN.get());
                    output.accept(ModBlocks.LEFT_TURN_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_TURN_US_SIGN.get());
                    output.accept(ModBlocks.LEFT_CURVE_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_CURVE_US_SIGN.get());
                    output.accept(ModBlocks.LEFT_REVERSE_TURN_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_REVERSE_TURN_US_SIGN.get());
                    output.accept(ModBlocks.LEFT_MERGING_TRAFFIC_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_MERGING_TRAFFIC_US_SIGN.get());
                    output.accept(ModBlocks.LEFT_ENTERING_ROADWAY_MERGE_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_ENTERING_ROADWAY_MERGE_US_SIGN.get());
                    output.accept(ModBlocks.LEFT_ADDED_LINE_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_ADDED_LINE_US_SIGN.get());
                    output.accept(ModBlocks.LEFT_LANE_ENDS_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_LANE_ENDS_US_SIGN.get());
                    output.accept(ModBlocks.TWO_WAY_TRAFFIC_US_SIGN.get());
                    output.accept(ModBlocks.VERY_SHARP_CURVE_US_SIGN.get());
                    output.accept(ModBlocks.WINDING_ROAD_US_SIGN.get());
                    output.accept(ModBlocks.HAIRPIN_CURVE_US_SIGN.get());
                    output.accept(ModBlocks.CIRCULAR_INTERSECTION_US_SIGN.get());
                    output.accept(ModBlocks.DIVIDED_HIGHWAY_US_SIGN.get());

                    output.accept(ModBlocks.CREEPER_US_SIGN.get());
                    output.accept(ModBlocks.TRUCK_CROSSING_US_SIGN.get());
                    output.accept(ModBlocks.HILL_US_SIGN.get());
                    output.accept(ModBlocks.TRUCK_ROLLOVER_WARNING_US_SIGN.get());
                    output.accept(ModBlocks.SLIPPERY_US_SIGN.get());
                    output.accept(ModBlocks.ROAD_NARROWS_US_SIGN.get());
                    output.accept(ModBlocks.CATTLE_US_SIGN.get());
                    output.accept(ModBlocks.SIGNAL_US_SIGN.get());

                    output.accept(ModBlocks.WORKERS_US_SIGN.get());

                    output.accept(ModBlocks.PEDESTRIANS_CROSSING_US_SIGN.get());
                    output.accept(ModBlocks.HANDICAPED_CROSSING_US_SIGN.get());
                    output.accept(ModBlocks.BICYCLE_CROSSING_US_SIGN.get());
                    output.accept(ModBlocks.PLAYGROUND_AHEAD_US_SIGN.get());

                    output.accept(ModBlocks.TWENTYFIVE_ADVISORY_SPEED_US_SIGN.get());
                    output.accept(ModBlocks.THIRTYFIVE_ADVISORY_SPEED_US_SIGN.get());
                    output.accept(ModBlocks.FORTYFIVE_ADVISORY_SPEED_US_SIGN.get());

                    output.accept(ModBlocks.NO_PEDESTRIANS_US_SIGN.get());
                    output.accept(ModBlocks.NO_BICYCLE_US_SIGN.get());
                    output.accept(ModBlocks.NO_TRUCKS_US_SIGN.get());
                    output.accept(ModBlocks.NO_PARKING_US_SIGN.get());
                    output.accept(ModBlocks.NO_LEFT_TURN_US_SIGN.get());
                    output.accept(ModBlocks.NO_RIGHT_TURN_US_SIGN.get());
                    output.accept(ModBlocks.NO_U_TURN_US_SIGN.get());
                    output.accept(ModBlocks.STRAIGHT_AHEAD_ONLY_US_SIGN.get());
                    output.accept(ModBlocks.LEFT_TURN_ONLY_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_TURN_ONLY_US_SIGN.get());

                    output.accept(ModBlocks.LEFT_ARROW_YELLOW_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_ARROW_YELLOW_US_SIGN.get());
                    output.accept(ModBlocks.LEFT_DIAGONAL_ARROW_YELLOW_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_DIAGONAL_ARROW_YELLOW_US_SIGN.get());
                    output.accept(ModBlocks.DOUBLE_ARROW_YELLOW_US_SIGN.get());
                    output.accept(ModBlocks.LEFT_ARROW_ORANGE_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_ARROW_ORANGE_US_SIGN.get());
                    output.accept(ModBlocks.LEFT_DIAGONAL_ARROW_ORANGE_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_DIAGONAL_ARROW_ORANGE_US_SIGN.get());
                    output.accept(ModBlocks.DOUBLE_ARROW_ORANGE_US_SIGN.get());
                    output.accept(ModBlocks.LEFT_ARROW_GREEN_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_ARROW_GREEN_US_SIGN.get());
                    output.accept(ModBlocks.LEFT_DIAGONAL_ARROW_GREEN_US_SIGN.get());
                    output.accept(ModBlocks.RIGHT_DIAGONAL_ARROW_GREEN_US_SIGN.get());
                    output.accept(ModBlocks.DOUBLE_ARROW_GREEN_US_SIGN.get());

                    output.accept(ModBlocks.INFO_US_SIGN.get());
                    output.accept(ModBlocks.HANDICAPPED_ACCESSIBLE_US_SIGN.get());
                    output.accept(ModBlocks.HOTEL_US_SIGN.get());
                    output.accept(ModBlocks.RESTAURANT_US_SIGN.get());
                    output.accept(ModBlocks.HOSPITAL_US_SIGN.get());
                    output.accept(ModBlocks.GAS_STATION_US_SIGN.get());
                    output.accept(ModBlocks.DIESEL_STATION_US_SIGN.get());
                    output.accept(ModBlocks.ELECTRIC_STATION_US_SIGN.get());
                    output.accept(ModBlocks.CAMPING_US_SIGN.get());
                    output.accept(ModBlocks.MEDICAL_SERVICE_US_SIGN.get());
                    output.accept(ModBlocks.TELEPHONE_US_SIGN.get());
                    output.accept(ModBlocks.AIRPORT_US_SIGN.get());
                    output.accept(ModBlocks.LIGHT_RAIL_TRANSIT_STATION_US_SIGN.get());
                    output.accept(ModBlocks.WINTER_RECREATION_AREA_US_SIGN.get());
                    output.accept(ModBlocks.SWIMMING_AREA_US_SIGN.get());
                    output.accept(ModBlocks.PICNIC_AREA_US_SIGN.get());
                    output.accept(ModBlocks.REPAIR_US_SIGN.get());
                    output.accept(ModBlocks.DRINKING_WATER_US_SIGN.get());
                    output.accept(ModBlocks.BATHROOMS_US_SIGN.get());
                    output.accept(ModBlocks.LITTER_BARREL_US_SIGN.get());
                    output.accept(ModBlocks.LOUNDRY_FACILITY_US_SIGN.get());

                    output.accept(ModBlocks.RAILROAD_CROSSING_US_SIGN.get());
                    output.accept(ModBlocks.CROSSBUCK_US_SIGN.get());
                //}
            }).build());


    //public static final RegistryObject<CreativeModeTab> EU_SIGN_TAB = CREATIVE_MODE_TABS.register(References.MODID + ".eu_signs", () -> CreativeModeTab.builder()
    //        .title(Component.translatable("itemGroup." + References.MODID + ".eu_signs_tab"))
    //        .icon(() -> new ItemStack(ModBlocks.CREEPER_EU_SIGN.get()))
    //        .withTabsBefore(MAIN_TAB.getId())
    //        .displayItems((params, output) -> {
    //            if (Config.SPLIT_TRAFFIC_SIGN_TAB.get()) {
//
    //                // EU
    //                output.accept(ModBlocks.IRON_POLE.get());
//
    //                output.accept(ModBlocks.DANGER_EU_SIGN.get());
    //                output.accept(ModBlocks.ROADWORKS_EU_SIGN.get());
    //                output.accept(ModBlocks.CREEPER_EU_SIGN.get());
    //                output.accept(ModBlocks.CHILDREN_EU_SIGN.get());
    //                output.accept(ModBlocks.CROSSWALK_EU_SIGN.get());
    //                output.accept(ModBlocks.ROCKFALL_EU_SIGN.get());
    //                output.accept(ModBlocks.SLIPPERINESS_EU_SIGN.get());
    //                output.accept(ModBlocks.SIGNAL_EU_SIGN.get());
    //                output.accept(ModBlocks.SNOW_EU_SIGN.get());
    //                output.accept(ModBlocks.ONCOMING_TRAFFIC_EU_SIGN.get());
    //                output.accept(ModBlocks.LEFT_CURVE_EU_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_CURVE_EU_SIGN.get());
    //                output.accept(ModBlocks.LEFT_DOUBLE_CURVE_EU_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_DOUBLE_CURVE_EU_SIGN.get());
    //                output.accept(ModBlocks.GATE_EU_SIGN.get());
    //                output.accept(ModBlocks.NARROWING_EU_SIGN.get());
    //                output.accept(ModBlocks.LEFT_NARROWING_EU_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_NARROWING_EU_SIGN.get());
    //                output.accept(ModBlocks.CATTLE_EU_SIGN.get());
    //                output.accept(ModBlocks.ASCEND_EU_SIGN.get());
    //                output.accept(ModBlocks.DESCEND_EU_SIGN.get());
    //                output.accept(ModBlocks.JAMS_EU_SIGN.get());
    //                output.accept(ModBlocks.PRIORITY_EU_SIGN.get());
    //                output.accept(ModBlocks.RAILROAD_EU_SIGN.get());
    //                output.accept(ModBlocks.UNEVEN_EU_SIGN.get());
    //                output.accept(ModBlocks.CYCLES_EU_SIGN.get());
    //                output.accept(ModBlocks.PEDESTRIANS_EU_SIGN.get());
    //                output.accept(ModBlocks.INTERSECTION_EU_SIGN.get());
//
    //                output.accept(ModBlocks.TEN_SPEED_EU_SIGN.get());
    //                output.accept(ModBlocks.THIRTY_SPEED_EU_SIGN.get());
    //                output.accept(ModBlocks.SIXTY_SPEED_EU_SIGN.get());
    //                output.accept(ModBlocks.EIGHTY_SPEED_EU_SIGN.get());
    //                output.accept(ModBlocks.HUNDRED_SPEED_EU_SIGN.get());
    //                output.accept(ModBlocks.HUNDRED_TWENTY_SPEED_EU_SIGN.get());
    //                output.accept(ModBlocks.NO_VEHICLES_EU_SIGN.get());
    //                output.accept(ModBlocks.NO_CARS_EU_SIGN.get());
    //                output.accept(ModBlocks.NO_TRUCKS_EU_SIGN.get());
    //                output.accept(ModBlocks.NO_PEDESTRIANS_EU_SIGN.get());
    //                output.accept(ModBlocks.NO_BICYCLES_EU_SIGN.get());
    //                output.accept(ModBlocks.NO_PASSING_EU_SIGN.get());
    //                output.accept(ModBlocks.NO_TRUCK_PASSING_EU_SIGN.get());
    //                output.accept(ModBlocks.ONGOING_TRAFFIC_EU_SIGN.get());
//
    //                output.accept(ModBlocks.NO_ENTER_EU_SIGN.get());
    //                output.accept(ModBlocks.NO_PARKING_ALONG_CARRIAGEWAY_EU_SIGN.get());
    //                output.accept(ModBlocks.NO_PARKING_EU_SIGN.get());
    //                output.accept(ModBlocks.NO_U_TURN_EU_SIGN.get());
//
    //                output.accept(ModBlocks.END_ALL_LIMITS_EU_SIGN.get());
    //                output.accept(ModBlocks.NO_PASSING_END_EU_SIGN.get());
    //                output.accept(ModBlocks.NO_TRUCK_PASSING_END_EU_SIGN.get());
//
    //                output.accept(ModBlocks.SIDEWALK_EU_SIGN.get());
    //                output.accept(ModBlocks.BICYCLE_PATH_EU_SIGN.get());
    //                output.accept(ModBlocks.BUS_EU_SIGN.get());
//
    //                output.accept(ModBlocks.STRAIGHT_AHEAD_EU_SIGN.get());
    //                output.accept(ModBlocks.LEFT_HERE_EU_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_HERE_EU_SIGN.get());
    //                output.accept(ModBlocks.PASS_LEFT_EU_SIGN.get());
    //                output.accept(ModBlocks.PASS_RIGHT_EU_SIGN.get());
    //                output.accept(ModBlocks.LEFT_AHEAD_EU_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_AHEAD_EU_SIGN.get());
    //                output.accept(ModBlocks.LEFT_RIGHT_EU_SIGN.get());
    //                output.accept(ModBlocks.STRAIGHT_LEFT_EU_SIGN.get());
    //                output.accept(ModBlocks.STRAIGHT_RIGHT_EU_SIGN.get());
    //                output.accept(ModBlocks.ROUNDABOUT_EU_SIGN.get());
    //                output.accept(ModBlocks.BUS_STOP_EU_SIGN.get());
//
    //                output.accept(ModBlocks.DETOUR_AHEAD_EU_SIGN.get());
    //                output.accept(ModBlocks.DETOUR_LEFT_EU_SIGN.get());
    //                output.accept(ModBlocks.DETOUR_RIGHT_EU_SIGN.get());
    //                output.accept(ModBlocks.CRAFT_CITY_EU_SIGN.get());
    //                output.accept(ModBlocks.CRAFT_CITY_END_EU_SIGN.get());
//
    //                output.accept(ModBlocks.PRIORITY_ROAD_EU_SIGN.get());
    //                output.accept(ModBlocks.PRIORITY_ROAD_END_EU_SIGN.get());
    //                output.accept(ModBlocks.STOP_EU_SIGN.get());
    //                output.accept(ModBlocks.YIELD_RIGHT_OF_WAY_EU_SIGN.get());
    //                output.accept(ModBlocks.NATURE_RESERVE_EU_SIGN.get());
    //                output.accept(ModBlocks.CROSSBUCK_EU_SIGN.get());
//
    //                output.accept(ModBlocks.LEFT_ARROW_EU_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_ARROW_EU_SIGN.get());
    //                output.accept(ModBlocks.LEFT_TURN_ARROW_EU_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_TURN_ARROW_EU_SIGN.get());
    //                output.accept(ModBlocks.KM_AHEAD_EU_SIGN.get());
    //                output.accept(ModBlocks.WEIGHT_EU_SIGN.get());
    //                output.accept(ModBlocks.TAXI_EU_SIGN.get());
//
    //                output.accept(ModBlocks.DISABLED_EU_SIGN.get());
    //                output.accept(ModBlocks.WET_EU_SIGN.get());
    //                output.accept(ModBlocks.END_LINE_EU_SIGN.get());
//
    //                output.accept(ModBlocks.HIGHWAY_EU_SIGN.get());
    //                output.accept(ModBlocks.HIGHWAY_END_EU_SIGN.get());
    //                output.accept(ModBlocks.MOTORWAY_EU_SIGN.get());
    //                output.accept(ModBlocks.MOTORWAY_END_EU_SIGN.get());
    //                output.accept(ModBlocks.CALMING_AREA_EU_SIGN.get());
    //                output.accept(ModBlocks.END_CALMING_AREA_EU_SIGN.get());
    //                output.accept(ModBlocks.ONE_WAY_EU_SIGN.get());
    //                output.accept(ModBlocks.PRIORITY_OVER_ONCOMING_TRAFFIC_EU_SIGN.get());
    //                output.accept(ModBlocks.NO_THROUGH_ROAD_EU_SIGN.get());
    //                output.accept(ModBlocks.PARKING_EU_SIGN.get());
    //                output.accept(ModBlocks.PARKING_GARAGE_EU_EU_SIGN.get());
    //                output.accept(ModBlocks.PEDESTRIAN_CROSSING_EU_SIGN.get());
//
    //                output.accept(ModBlocks.CAMPING_EU_SIGN.get());
    //                output.accept(ModBlocks.PR_EU_SIGN.get());
    //                output.accept(ModBlocks.CHURCH_EU_SIGN.get());
    //                output.accept(ModBlocks.HOTEL_EU_SIGN.get());
    //                output.accept(ModBlocks.PETROL_STATION_EU_SIGN.get());
    //                output.accept(ModBlocks.CAFE_EU_SIGN.get());
    //                output.accept(ModBlocks.INFO_EU_SIGN.get());
    //                output.accept(ModBlocks.WC_EU_SIGN.get());
    //                output.accept(ModBlocks.TELEPHONE_EU_SIGN.get());
    //                output.accept(ModBlocks.RESTAURANT_EU_SIGN.get());
    //                output.accept(ModBlocks.REPAIR_EU_SIGN.get());
    //                output.accept(ModBlocks.FIRST_AID_EU_SIGN.get());
    //                output.accept(ModBlocks.WATER_PROTECTION_AREA_EU_SIGN.get());
    //                output.accept(ModBlocks.EMERGENCY_BAY_EU_SIGN.get());
//
    //                output.accept(ModBlocks.WARN_EU_SIGN.get());
    //                output.accept(ModBlocks.GUIDE_EU_SIGN.get());
    //                output.accept(ModBlocks.LEFT_DIRECTION_EU_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_DIRECTION_EU_SIGN.get());
    //                output.accept(ModBlocks.WARNING_BEACON_LEFT_EU_SIGN.get());
    //                output.accept(ModBlocks.WARNING_BEACON_RIGHT_EU_SIGN.get());
    //                output.accept(ModBlocks.WARNING_BEACON_ALT_EU_SIGN.get());
    //            }
    //        }).build());
//
//
    //public static final RegistryObject<CreativeModeTab> US_SIGN_TAB = CREATIVE_MODE_TABS.register(References.MODID + ".us_signs", () -> CreativeModeTab.builder()
    //        .title(Component.translatable("itemGroup." + References.MODID + ".us_signs_tab"))
    //        .icon(() -> new ItemStack(ModBlocks.CREEPER_US_SIGN.get()))
    //        .withTabsBefore(MAIN_TAB.getId())
    //        .displayItems((params, output) -> {
    //            if (Config.SPLIT_TRAFFIC_SIGN_TAB.get()) {
//
    //                // US
    //                output.accept(ModBlocks.IRON_POLE.get());
//
    //                output.accept(ModBlocks.T_INTERSECTION_US_SIGN.get());
    //                output.accept(ModBlocks.Y_INTERSECTION_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_SIDE_ROAD_US_SIGN.get());
    //                output.accept(ModBlocks.LEFT_SIDE_ROAD_US_SIGN.get());
    //                output.accept(ModBlocks.CROSS_ROAD_US_SIGN.get());
    //                output.accept(ModBlocks.SIDE_ROAD_AT_ANGLE_LEFT_US_SIGN.get());
    //                output.accept(ModBlocks.SIDE_ROAD_AT_ANGLE_RIGHT_US_SIGN.get());
    //                output.accept(ModBlocks.LEFT_TURN_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_TURN_US_SIGN.get());
    //                output.accept(ModBlocks.LEFT_CURVE_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_CURVE_US_SIGN.get());
    //                output.accept(ModBlocks.LEFT_REVERSE_TURN_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_REVERSE_TURN_US_SIGN.get());
    //                output.accept(ModBlocks.LEFT_MERGING_TRAFFIC_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_MERGING_TRAFFIC_US_SIGN.get());
    //                output.accept(ModBlocks.LEFT_ENTERING_ROADWAY_MERGE_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_ENTERING_ROADWAY_MERGE_US_SIGN.get());
    //                output.accept(ModBlocks.LEFT_ADDED_LINE_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_ADDED_LINE_US_SIGN.get());
    //                output.accept(ModBlocks.LEFT_LANE_ENDS_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_LANE_ENDS_US_SIGN.get());
    //                output.accept(ModBlocks.TWO_WAY_TRAFFIC_US_SIGN.get());
    //                output.accept(ModBlocks.VERY_SHARP_CURVE_US_SIGN.get());
    //                output.accept(ModBlocks.WINDING_ROAD_US_SIGN.get());
    //                output.accept(ModBlocks.HAIRPIN_CURVE_US_SIGN.get());
    //                output.accept(ModBlocks.CIRCULAR_INTERSECTION_US_SIGN.get());
    //                output.accept(ModBlocks.DIVIDED_HIGHWAY_US_SIGN.get());
//
    //                output.accept(ModBlocks.CREEPER_US_SIGN.get());
    //                output.accept(ModBlocks.TRUCK_CROSSING_US_SIGN.get());
    //                output.accept(ModBlocks.HILL_US_SIGN.get());
    //                output.accept(ModBlocks.TRUCK_ROLLOVER_WARNING_US_SIGN.get());
    //                output.accept(ModBlocks.SLIPPERY_US_SIGN.get());
    //                output.accept(ModBlocks.ROAD_NARROWS_US_SIGN.get());
    //                output.accept(ModBlocks.CATTLE_US_SIGN.get());
    //                output.accept(ModBlocks.SIGNAL_US_SIGN.get());
//
    //                output.accept(ModBlocks.WORKERS_US_SIGN.get());
//
    //                output.accept(ModBlocks.PEDESTRIANS_CROSSING_US_SIGN.get());
    //                output.accept(ModBlocks.HANDICAPED_CROSSING_US_SIGN.get());
    //                output.accept(ModBlocks.BICYCLE_CROSSING_US_SIGN.get());
    //                output.accept(ModBlocks.PLAYGROUND_AHEAD_US_SIGN.get());
//
    //                output.accept(ModBlocks.TWENTYFIVE_ADVISORY_SPEED_US_SIGN.get());
    //                output.accept(ModBlocks.THIRTYFIVE_ADVISORY_SPEED_US_SIGN.get());
    //                output.accept(ModBlocks.FORTYFIVE_ADVISORY_SPEED_US_SIGN.get());
//
    //                output.accept(ModBlocks.NO_PEDESTRIANS_US_SIGN.get());
    //                output.accept(ModBlocks.NO_BICYCLE_US_SIGN.get());
    //                output.accept(ModBlocks.NO_TRUCKS_US_SIGN.get());
    //                output.accept(ModBlocks.NO_PARKING_US_SIGN.get());
    //                output.accept(ModBlocks.NO_LEFT_TURN_US_SIGN.get());
    //                output.accept(ModBlocks.NO_RIGHT_TURN_US_SIGN.get());
    //                output.accept(ModBlocks.NO_U_TURN_US_SIGN.get());
    //                output.accept(ModBlocks.STRAIGHT_AHEAD_ONLY_US_SIGN.get());
    //                output.accept(ModBlocks.LEFT_TURN_ONLY_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_TURN_ONLY_US_SIGN.get());
//
    //                output.accept(ModBlocks.LEFT_ARROW_YELLOW_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_ARROW_YELLOW_US_SIGN.get());
    //                output.accept(ModBlocks.LEFT_DIAGONAL_ARROW_YELLOW_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_DIAGONAL_ARROW_YELLOW_US_SIGN.get());
    //                output.accept(ModBlocks.DOUBLE_ARROW_YELLOW_US_SIGN.get());
    //                output.accept(ModBlocks.LEFT_ARROW_ORANGE_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_ARROW_ORANGE_US_SIGN.get());
    //                output.accept(ModBlocks.LEFT_DIAGONAL_ARROW_ORANGE_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_DIAGONAL_ARROW_ORANGE_US_SIGN.get());
    //                output.accept(ModBlocks.DOUBLE_ARROW_ORANGE_US_SIGN.get());
    //                output.accept(ModBlocks.LEFT_ARROW_GREEN_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_ARROW_GREEN_US_SIGN.get());
    //                output.accept(ModBlocks.LEFT_DIAGONAL_ARROW_GREEN_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_DIAGONAL_ARROW_GREEN_US_SIGN.get());
    //                output.accept(ModBlocks.DOUBLE_ARROW_GREEN_US_SIGN.get());
//
    //                output.accept(ModBlocks.INFO_US_SIGN.get());
    //                output.accept(ModBlocks.HANDICAPPED_ACCESSIBLE_US_SIGN.get());
    //                output.accept(ModBlocks.HOTEL_US_SIGN.get());
    //                output.accept(ModBlocks.RESTAURANT_US_SIGN.get());
    //                output.accept(ModBlocks.HOSPITAL_US_SIGN.get());
    //                output.accept(ModBlocks.GAS_STATION_US_SIGN.get());
    //                output.accept(ModBlocks.DIESEL_STATION_US_SIGN.get());
    //                output.accept(ModBlocks.ELECTRIC_STATION_US_SIGN.get());
    //                output.accept(ModBlocks.CAMPING_US_SIGN.get());
    //                output.accept(ModBlocks.MEDICAL_SERVICE_US_SIGN.get());
    //                output.accept(ModBlocks.TELEPHONE_US_SIGN.get());
    //                output.accept(ModBlocks.AIRPORT_US_SIGN.get());
    //                output.accept(ModBlocks.LIGHT_RAIL_TRANSIT_STATION_US_SIGN.get());
    //                output.accept(ModBlocks.WINTER_RECREATION_AREA_US_SIGN.get());
    //                output.accept(ModBlocks.SWIMMING_AREA_US_SIGN.get());
    //                output.accept(ModBlocks.PICNIC_AREA_US_SIGN.get());
    //                output.accept(ModBlocks.REPAIR_US_SIGN.get());
    //                output.accept(ModBlocks.DRINKING_WATER_US_SIGN.get());
    //                output.accept(ModBlocks.BATHROOMS_US_SIGN.get());
    //                output.accept(ModBlocks.LITTER_BARREL_US_SIGN.get());
    //                output.accept(ModBlocks.LOUNDRY_FACILITY_US_SIGN.get());
//
    //                output.accept(ModBlocks.GUIDE_US_SIGN.get());
    //                output.accept(ModBlocks.LEFT_DIRECTION_US_SIGN.get());
    //                output.accept(ModBlocks.RIGHT_DIRECTION_US_SIGN.get());
//
    //                output.accept(ModBlocks.RAILROAD_CROSSING_US_SIGN.get());
    //                output.accept(ModBlocks.CROSSBUCK_US_SIGN.get());
    //            }
    //        }).build());


    public static final RegistryObject<CreativeModeTab> ROAD_TAB = CREATIVE_MODE_TABS.register(References.MODID + ".roads", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + References.MODID + ".roads_tab"))
            .icon(() -> new ItemStack(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE.get()))
            .withTabsBefore(MAIN_TAB.getId())
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
