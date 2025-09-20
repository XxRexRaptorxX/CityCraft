package xxrexraptorxx.citycraft.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.citycraft.main.References;

public class CreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, References.MODID);

    public static void init(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register(References.MODID + ".main",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup." + References.MODID + ".main_tab"))
                    .icon(() -> new ItemStack(ModBlocks.YELLOW_BLACK_POST.get())).displayItems((params, output) -> {
                        output.accept(ModBlocks.ROAD_EDGE_POST.get());
                        output.accept(ModBlocks.ORANGE_ROAD_EDGE_POST.get());

                        output.accept(ModBlocks.WHITE_POLE.get());
                        output.accept(ModBlocks.RED_POLE.get());
                        output.accept(ModBlocks.RED_WHITE_POLE.get());
                        output.accept(ModBlocks.YELLOW_POLE.get());
                        output.accept(ModBlocks.BLACK_POLE.get());
                        output.accept(ModBlocks.YELLOW_BLACK_POLE.get());

                        output.accept(ModBlocks.IRON_FENCE.get());

                        output.accept(ModBlocks.TRAFFIC_BARRIER.get());
                        output.accept(ModBlocks.RED_WHITE_TRAFFIC_BARRIER.get());
                        output.accept(ModBlocks.YELLOW_BLACK_TRAFFIC_BARRIER.get());

                        output.accept(ModBlocks.DOUBLE_TRAFFIC_BARRIER.get());
                        output.accept(ModBlocks.DOUBLE_RED_WHITE_TRAFFIC_BARRIER.get());
                        output.accept(ModBlocks.DOUBLE_YELLOW_BLACK_TRAFFIC_BARRIER.get());

                        output.accept(ModBlocks.STONE_POST.get());
                        output.accept(ModBlocks.WHITE_POST.get());
                        output.accept(ModBlocks.RED_POST.get());
                        output.accept(ModBlocks.RED_WHITE_POST.get());
                        output.accept(ModBlocks.YELLOW_POST.get());
                        output.accept(ModBlocks.BLACK_POST.get());
                        output.accept(ModBlocks.YELLOW_BLACK_POST.get());

                        output.accept(ModBlocks.DRAIN_COVER.get());
                        output.accept(ModBlocks.DRAIN_COVER_GRID.get());

                        output.accept(ModBlocks.WHITE_CHAIN.get());
                        output.accept(ModBlocks.RED_CHAIN.get());
                        output.accept(ModBlocks.YELLOW_CHAIN.get());
                        output.accept(ModBlocks.BLACK_CHAIN.get());

                        output.accept(ModBlocks.RED_WHITE_BARRIER_TAPE.get());
                        output.accept(ModBlocks.YELLOW_BLACK_BARRIER_TAPE.get());

                        output.accept(ModBlocks.BLOCK_PAINTER.get());

                        output.accept(ModItems.COAL_COKE.get());
                        output.accept(ModItems.ASPHALT_MIXTURE.get());
                        output.accept(ModItems.DYE_MIX.get());
                        output.accept(ModItems.COAL_TAR.get());
                    }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SIGN_TAB = CREATIVE_MODE_TABS.register(References.MODID + ".signs",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup." + References.MODID + ".signs_tab"))
                    .icon(() -> new ItemStack(ModBlocks.LEFT_DIAGONAL_ARROW_YELLOW_US_SIGN.get())).withTabsBefore(MAIN_TAB.getId()).displayItems((params, output) -> {
                        // if (!Config.SPLIT_TRAFFIC_SIGN_TAB.get()) {

                        // EU
                        output.accept(ModBlocks.IRON_POLE.get());
                        output.accept(ModBlocks.REDSTONE_POLE.get());

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
                        output.accept(ModBlocks.MOVABLE_BRIDGE_EU_SIGN.get());
                        output.accept(ModBlocks.SHORE_EU_SIGN.get());
                        output.accept(ModBlocks.TREE_OVERHANG_EU_SIGN.get());
                        output.accept(ModBlocks.LOOSE_GRAVEL_EU_SIGN.get());
                        output.accept(ModBlocks.INTERSECTION_EU_SIGN.get());

                        output.accept(ModBlocks.TEN_SPEED_EU_SIGN.get());
                        output.accept(ModBlocks.THIRTY_SPEED_EU_SIGN.get());
                        output.accept(ModBlocks.SIXTY_SPEED_EU_SIGN.get());
                        output.accept(ModBlocks.EIGHTY_SPEED_EU_SIGN.get());
                        output.accept(ModBlocks.HUNDRED_SPEED_EU_SIGN.get());
                        output.accept(ModBlocks.HUNDRED_TWENTY_SPEED_EU_SIGN.get());
                        output.accept(ModBlocks.NO_VEHICLES_EU_SIGN.get());
                        output.accept(ModBlocks.NO_MONSTER_EU_SIGN.get());
                        output.accept(ModBlocks.NO_CARS_EU_SIGN.get());
                        output.accept(ModBlocks.NO_TRUCKS_EU_SIGN.get());
                        output.accept(ModBlocks.NO_PEDESTRIANS_EU_SIGN.get());
                        output.accept(ModBlocks.NO_BICYCLES_EU_SIGN.get());
                        output.accept(ModBlocks.NO_HAZARDOUS_CARGO_EU_SIGN.get());
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

                        output.accept(ModBlocks.TEN_MINIMUM_SPEED_SIGN_EU.get());
                        output.accept(ModBlocks.THIRTY_MINIMUM_SPEED_SIGN_EU.get());
                        output.accept(ModBlocks.SIDEWALK_EU_SIGN.get());
                        output.accept(ModBlocks.BICYCLE_PATH_EU_SIGN.get());
                        output.accept(ModBlocks.BRIDLE_PATH_EU_SIGN.get());
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

                        output.accept(ModBlocks.DETOUR_END_EU_SIGN.get());
                        output.accept(ModBlocks.DETOUR_AHEAD_EU_SIGN.get());
                        output.accept(ModBlocks.DETOUR_LEFT_EU_SIGN.get());
                        output.accept(ModBlocks.DETOUR_RIGHT_EU_SIGN.get());
                        output.accept(ModBlocks.TRUCK_ROUTE_AHEAD_EU_SIGN.get());
                        output.accept(ModBlocks.TRUCK_ROUTE_LEFT_EU_SIGN.get());
                        output.accept(ModBlocks.TRUCK_ROUTE_RIGHT_EU_SIGN.get());
                        output.accept(ModBlocks.BICYCLE_ROUTE_AHEAD_EU_SIGN.get());
                        output.accept(ModBlocks.BICYCLE_ROUTE_LEFT_EU_SIGN.get());
                        output.accept(ModBlocks.BICYCLE_ROUTE_RIGHT_EU_SIGN.get());
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
                        output.accept(ModBlocks.M_AHEAD_EU_SIGN.get());
                        output.accept(ModBlocks.KM_AHEAD_EU_SIGN.get());
                        output.accept(ModBlocks.WEIGHT_EU_SIGN.get());
                        output.accept(ModBlocks.TAXI_EU_SIGN.get());

                        output.accept(ModBlocks.LEFT_PRIORITY_ROAD_EU_SIGN.get());
                        output.accept(ModBlocks.RIGHT_PRIORITY_ROAD_EU_SIGN.get());
                        output.accept(ModBlocks.PRIORITY_ROAD_FROM_LEFT_EU_SIGN.get());
                        output.accept(ModBlocks.PRIORITY_ROAD_FROM_RIGHT_EU_SIGN.get());
                        output.accept(ModBlocks.DISABLED_EU_SIGN.get());
                        output.accept(ModBlocks.WET_EU_SIGN.get());
                        output.accept(ModBlocks.END_LINE_EU_SIGN.get());

                        output.accept(ModBlocks.BICYCLE_PATH_AHEAD_EU_SIGN.get());
                        output.accept(ModBlocks.BICYCLE_PATH_LEFT_EU_SIGN.get());
                        output.accept(ModBlocks.BICYCLE_PATH_RIGHT_EU_SIGN.get());

                        output.accept(ModBlocks.BICYCLE_HIGHWAY_EU_SIGN.get());
                        output.accept(ModBlocks.BICYCLE_HIGHWAY_END_EU_SIGN.get());
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
                        output.accept(ModBlocks.PARKING_AREA_START_EU_SIGN.get());
                        output.accept(ModBlocks.PARKING_AREA_END_EU_SIGN.get());
                        output.accept(ModBlocks.PARKING_GARAGE_EU_EU_SIGN.get());
                        output.accept(ModBlocks.PEDESTRIAN_CROSSING_EU_SIGN.get());

                        output.accept(ModBlocks.CAMPING_EU_SIGN.get());
                        output.accept(ModBlocks.PR_EU_SIGN.get());
                        output.accept(ModBlocks.CHURCH_EU_SIGN.get());
                        output.accept(ModBlocks.HOTEL_EU_SIGN.get());
                        output.accept(ModBlocks.PETROL_STATION_EU_SIGN.get());
                        output.accept(ModBlocks.CHARGING_STATION_EU_SIGN.get());
                        output.accept(ModBlocks.CAFE_EU_SIGN.get());
                        output.accept(ModBlocks.INFO_EU_SIGN.get());
                        output.accept(ModBlocks.WC_EU_SIGN.get());
                        output.accept(ModBlocks.TELEPHONE_EU_SIGN.get());
                        output.accept(ModBlocks.RESTAURANT_EU_SIGN.get());
                        output.accept(ModBlocks.REPAIR_EU_SIGN.get());
                        output.accept(ModBlocks.FIRST_AID_EU_SIGN.get());
                        output.accept(ModBlocks.WATER_PROTECTION_AREA_EU_SIGN.get());
                        output.accept(ModBlocks.EMERGENCY_BAY_EU_SIGN.get());

                        output.accept(ModBlocks.HIGHWAY_COUNTDOWN_MARKER_100_EU_SIGN.get());
                        output.accept(ModBlocks.HIGHWAY_COUNTDOWN_MARKER_200_EU_SIGN.get());
                        output.accept(ModBlocks.HIGHWAY_COUNTDOWN_MARKER_300_EU_SIGN.get());
                        output.accept(ModBlocks.FEDERAL_HIGHWAY_COUNTDOWN_MARKER_100_EU_SIGN.get());
                        output.accept(ModBlocks.FEDERAL_HIGHWAY_COUNTDOWN_MARKER_200_EU_SIGN.get());
                        output.accept(ModBlocks.FEDERAL_HIGHWAY_COUNTDOWN_MARKER_300_EU_SIGN.get());
                        output.accept(ModBlocks.RAILWAY_COUNTDOWN_MARKER_80_EU_SIGN.get());
                        output.accept(ModBlocks.RAILWAY_COUNTDOWN_MARKER_160_EU_SIGN.get());
                        output.accept(ModBlocks.RAILWAY_COUNTDOWN_MARKER_240_EU_SIGN.get());

                        output.accept(ModBlocks.WARN_EU_SIGN.get());
                        output.accept(ModBlocks.GUIDE_EU_SIGN.get());
                        output.accept(ModBlocks.LEFT_DIRECTION_EU_SIGN.get());
                        output.accept(ModBlocks.RIGHT_DIRECTION_EU_SIGN.get());
                        output.accept(ModBlocks.WARNING_BEACON_LEFT_EU_SIGN.get());
                        output.accept(ModBlocks.WARNING_BEACON_RIGHT_EU_SIGN.get());
                        output.accept(ModBlocks.WARNING_BEACON_ALT_EU_SIGN.get());

                        // US
                        output.accept(ModBlocks.WARN_US_SIGN.get());
                        output.accept(ModBlocks.GUIDE_US_SIGN.get());
                        output.accept(ModBlocks.LEFT_DIRECTION_US_SIGN.get());
                        output.accept(ModBlocks.RIGHT_DIRECTION_US_SIGN.get());
                        output.accept(ModBlocks.WARNING_BEACON_LEFT_US_SIGN.get());
                        output.accept(ModBlocks.WARNING_BEACON_RIGHT_US_SIGN.get());
                        output.accept(ModBlocks.WARNING_BEACON_ALT_US_SIGN.get());
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

                        output.accept(ModBlocks.DETOUR_LEFT_US_SIGN.get());
                        output.accept(ModBlocks.DETOUR_RIGHT_US_SIGN.get());

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

                        output.accept(ModBlocks.AHEAD_YELLOW_US_SIGN.get());
                        output.accept(ModBlocks.LEFT_ARROW_YELLOW_US_SIGN.get());
                        output.accept(ModBlocks.RIGHT_ARROW_YELLOW_US_SIGN.get());
                        output.accept(ModBlocks.LEFT_DIAGONAL_ARROW_YELLOW_US_SIGN.get());
                        output.accept(ModBlocks.RIGHT_DIAGONAL_ARROW_YELLOW_US_SIGN.get());
                        output.accept(ModBlocks.DOUBLE_ARROW_YELLOW_US_SIGN.get());
                        output.accept(ModBlocks.AHEAD_ORANGE_US_SIGN.get());
                        output.accept(ModBlocks.EXIT_CLOSED_US_SIGN.get());
                        output.accept(ModBlocks.LEFT_ARROW_ORANGE_US_SIGN.get());
                        output.accept(ModBlocks.RIGHT_ARROW_ORANGE_US_SIGN.get());
                        output.accept(ModBlocks.LEFT_DIAGONAL_ARROW_ORANGE_US_SIGN.get());
                        output.accept(ModBlocks.RIGHT_DIAGONAL_ARROW_ORANGE_US_SIGN.get());
                        output.accept(ModBlocks.DOUBLE_ARROW_ORANGE_US_SIGN.get());
                        output.accept(ModBlocks.AHEAD_GREEN_US_SIGN.get());
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
                        output.accept(ModBlocks.BICYCLE_PATH_US_SIGN.get());
                        output.accept(ModBlocks.WINTER_RECREATION_AREA_US_SIGN.get());
                        output.accept(ModBlocks.SWIMMING_AREA_US_SIGN.get());
                        output.accept(ModBlocks.PICNIC_AREA_US_SIGN.get());
                        output.accept(ModBlocks.REPAIR_US_SIGN.get());
                        output.accept(ModBlocks.DRINKING_WATER_US_SIGN.get());
                        output.accept(ModBlocks.BATHROOMS_US_SIGN.get());
                        output.accept(ModBlocks.LITTER_BARREL_US_SIGN.get());
                        output.accept(ModBlocks.LOUNDRY_FACILITY_US_SIGN.get());

                        output.accept(ModBlocks.CROSSBUCK_US_SIGN.get());
                        output.accept(ModBlocks.RAILROAD_CROSSING_US_SIGN.get());

                        // CN
                        output.accept(ModBlocks.INTERSECTION_CN_SIGN.get());
                        output.accept(ModBlocks.SIDE_ROAD_AT_LEFT_CN_SIGN.get());
                        output.accept(ModBlocks.SIDE_ROAD_AT_RIGHT_CN_SIGN.get());
                        output.accept(ModBlocks.SIDE_ROAD_AT_ANGLE_LEFT_CN_SIGN.get());
                        output.accept(ModBlocks.SIDE_ROAD_AT_ANGLE_RIGHT_CN_SIGN.get());
                        output.accept(ModBlocks.LEFT_CURVE_CN_SIGN.get());
                        output.accept(ModBlocks.RIGHT_CURVE_CN_SIGN.get());
                        output.accept(ModBlocks.LEFT_DOUBLE_CURVE_CN_SIGN.get());
                        output.accept(ModBlocks.RIGHT_DOUBLE_CURVE_CN_SIGN.get());
                        output.accept(ModBlocks.LEFT_MERGING_TRAFFIC_CN_SIGN.get());
                        output.accept(ModBlocks.RIGHT_MERGING_TRAFFIC_CN_SIGN.get());
                        output.accept(ModBlocks.DETOUR_LEFT_OR_RIGHT_CN_SIGN.get());
                        output.accept(ModBlocks.DETOUR_LEFT_CN_SIGN.get());
                        output.accept(ModBlocks.DETOUR_RIGHT_CN_SIGN.get());
                        output.accept(ModBlocks.LEFT_NARROWING_CN_SIGN.get());
                        output.accept(ModBlocks.RIGHT_NARROWING_CN_SIGN.get());
                        output.accept(ModBlocks.NARROWING_CN_SIGN.get());
                        output.accept(ModBlocks.NARROW_BRIDGE_CN_SIGN.get());
                        output.accept(ModBlocks.ONCOMING_TRAFFIC_CN_SIGN.get());
                        output.accept(ModBlocks.DANGER_CN_SIGN.get());
                        output.accept(ModBlocks.CREEPER_CN_SIGN.get());
                        output.accept(ModBlocks.ROCKFALL_CN_SIGN.get());
                        output.accept(ModBlocks.ASCEND_CN_SIGN.get());
                        output.accept(ModBlocks.DESCEND_CN_SIGN.get());
                        output.accept(ModBlocks.SHORE_CN_SIGN.get());
                        output.accept(ModBlocks.ROUNDABOUT_CN_SIGN.get());
                        output.accept(ModBlocks.BUMP_CN_SIGN.get());
                        output.accept(ModBlocks.UNEVEN_ROAD_CN_SIGN.get());
                        output.accept(ModBlocks.RAILROAD_CN_SIGN.get());
                        output.accept(ModBlocks.SIGNAL_CN_SIGN.get());
                        output.accept(ModBlocks.SLIPPERINESS_CN_SIGN.get());
                        output.accept(ModBlocks.PEDESTRIAN_CROSSING_CN_SIGN.get());
                        output.accept(ModBlocks.CHILDREN_CN_SIGN.get());
                        output.accept(ModBlocks.CYCLES_CN_SIGN.get());
                        output.accept(ModBlocks.CATTLE_CN_SIGN.get());
                        output.accept(ModBlocks.GATE_CN_SIGN.get());
                        output.accept(ModBlocks.SLOW_CN_SIGN.get());

                        output.accept(ModBlocks.JAMS_CN_SIGN.get());
                        output.accept(ModBlocks.SNOW_CN_SIGN.get());
                        output.accept(ModBlocks.NATURE_RESERVE_AREA_CN_SIGN.get());
                        output.accept(ModBlocks.ROADWORKS_CN_SIGN.get());

                        output.accept(ModBlocks.STOP_CN_SIGN.get());
                        output.accept(ModBlocks.GUIDE_CN_SIGN.get());
                        output.accept(ModBlocks.LEFT_DIRECTION_CN_SIGN.get());
                        output.accept(ModBlocks.RIGHT_DIRECTION_CN_SIGN.get());
                        output.accept(ModBlocks.THIRTY_ADVISORY_SPEED_CN_SIGN.get());
                        output.accept(ModBlocks.FORTY_ADVISORY_SPEED_CN_SIGN.get());
                        output.accept(ModBlocks.FIFTY_ADVISORY_SPEED_CN_SIGN.get());
                        output.accept(ModBlocks.PARKING_CN_SIGN.get());
                        output.accept(ModBlocks.PARKING_GARAGE_CN_SIGN.get());
                        output.accept(ModBlocks.HIGHWAY_CN_SIGN.get());
                        output.accept(ModBlocks.HIGHWAY_END_CN_SIGN.get());
                        output.accept(ModBlocks.TELEPHONE_CN_SIGN.get());
                        output.accept(ModBlocks.EMERGENCY_BAY_CN_SIGN.get());
                        output.accept(ModBlocks.GAS_STATION_CN_SIGN.get());
                        output.accept(ModBlocks.INFO_CN_SIGN.get());
                        output.accept(ModBlocks.CAMPING_CN_SIGN.get());
                        output.accept(ModBlocks.PRIORITY_CN_SIGN.get());
                        output.accept(ModBlocks.ONE_WAY_CN_SIGN.get());

                        // BASE
                        output.accept(ModBlocks.ROUND_SIGN.get());
                        output.accept(ModBlocks.TRIANGLE_SIGN.get());
                        output.accept(ModBlocks.RECTANGLE_SIGN.get());
                        output.accept(ModBlocks.SQUARE_SIGN.get());
                        output.accept(ModBlocks.CROSS_SIGN.get());
                        output.accept(ModBlocks.UPSIDE_DOWN_TRIANGLE_SIGN.get());
                        output.accept(ModBlocks.RHOMBUS_SIGN.get());
                        output.accept(ModBlocks.OCTAGON_SIGN.get());
                        output.accept(ModBlocks.BAKE_SIGN.get());

                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_OPEN.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_CLOSED.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_CHANGE_LEFT.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_CHANGE_RIGHT.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_SIXTY_SPEED_LIMIT.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_EIGHTY_SPEED_LIMIT.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_HUNDRED_SPEED_LIMIT.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_HUNDRED_TWENTY_SPEED_LIMIT.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_NO_PASSING.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_NO_TRUCK_PASSING.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_END_ALL_LIMITS.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_CREEPER.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_DANGER.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_JAMS.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_ROADWORKS.get());
                        output.accept(ModBlocks.VARIABLE_TRAFFIC_SIGN_SLIPPERINESS.get());
                    }).build());

    // public static final RegistryObject<CreativeModeTab> EU_SIGN_TAB = CREATIVE_MODE_TABS.register(References.MODID +
    // ".eu_signs", () -> CreativeModeTab.builder()
    // .title(Component.translatable("itemGroup." + References.MODID + ".eu_signs_tab"))
    // .icon(() -> new ItemStack(ModBlocks.CREEPER_EU_SIGN.get()))
    // .withTabsBefore(MAIN_TAB.getId())
    // .displayItems((params, output) -> {
    // if (Config.SPLIT_TRAFFIC_SIGN_TAB.get()) {
    //
    // // EU
    // output.accept(ModBlocks.IRON_POLE.get());
    //
    // output.accept(ModBlocks.DANGER_EU_SIGN.get());
    // output.accept(ModBlocks.ROADWORKS_EU_SIGN.get());
    // output.accept(ModBlocks.CREEPER_EU_SIGN.get());
    // output.accept(ModBlocks.CHILDREN_EU_SIGN.get());
    // output.accept(ModBlocks.CROSSWALK_EU_SIGN.get());
    // output.accept(ModBlocks.ROCKFALL_EU_SIGN.get());
    // output.accept(ModBlocks.SLIPPERINESS_EU_SIGN.get());
    // output.accept(ModBlocks.SIGNAL_EU_SIGN.get());
    // output.accept(ModBlocks.SNOW_EU_SIGN.get());
    // output.accept(ModBlocks.ONCOMING_TRAFFIC_EU_SIGN.get());
    // output.accept(ModBlocks.LEFT_CURVE_EU_SIGN.get());
    // output.accept(ModBlocks.RIGHT_CURVE_EU_SIGN.get());
    // output.accept(ModBlocks.LEFT_DOUBLE_CURVE_EU_SIGN.get());
    // output.accept(ModBlocks.RIGHT_DOUBLE_CURVE_EU_SIGN.get());
    // output.accept(ModBlocks.GATE_EU_SIGN.get());
    // output.accept(ModBlocks.NARROWING_EU_SIGN.get());
    // output.accept(ModBlocks.LEFT_NARROWING_EU_SIGN.get());
    // output.accept(ModBlocks.RIGHT_NARROWING_EU_SIGN.get());
    // output.accept(ModBlocks.CATTLE_EU_SIGN.get());
    // output.accept(ModBlocks.ASCEND_EU_SIGN.get());
    // output.accept(ModBlocks.DESCEND_EU_SIGN.get());
    // output.accept(ModBlocks.JAMS_EU_SIGN.get());
    // output.accept(ModBlocks.PRIORITY_EU_SIGN.get());
    // output.accept(ModBlocks.RAILROAD_EU_SIGN.get());
    // output.accept(ModBlocks.UNEVEN_EU_SIGN.get());
    // output.accept(ModBlocks.CYCLES_EU_SIGN.get());
    // output.accept(ModBlocks.PEDESTRIANS_EU_SIGN.get());
    // output.accept(ModBlocks.INTERSECTION_EU_SIGN.get());
    //
    // output.accept(ModBlocks.TEN_SPEED_EU_SIGN.get());
    // output.accept(ModBlocks.THIRTY_SPEED_EU_SIGN.get());
    // output.accept(ModBlocks.SIXTY_SPEED_EU_SIGN.get());
    // output.accept(ModBlocks.EIGHTY_SPEED_EU_SIGN.get());
    // output.accept(ModBlocks.HUNDRED_SPEED_EU_SIGN.get());
    // output.accept(ModBlocks.HUNDRED_TWENTY_SPEED_EU_SIGN.get());
    // output.accept(ModBlocks.NO_VEHICLES_EU_SIGN.get());
    // output.accept(ModBlocks.NO_CARS_EU_SIGN.get());
    // output.accept(ModBlocks.NO_TRUCKS_EU_SIGN.get());
    // output.accept(ModBlocks.NO_PEDESTRIANS_EU_SIGN.get());
    // output.accept(ModBlocks.NO_BICYCLES_EU_SIGN.get());
    // output.accept(ModBlocks.NO_PASSING_EU_SIGN.get());
    // output.accept(ModBlocks.NO_TRUCK_PASSING_EU_SIGN.get());
    // output.accept(ModBlocks.ONGOING_TRAFFIC_EU_SIGN.get());
    //
    // output.accept(ModBlocks.NO_ENTER_EU_SIGN.get());
    // output.accept(ModBlocks.NO_PARKING_ALONG_CARRIAGEWAY_EU_SIGN.get());
    // output.accept(ModBlocks.NO_PARKING_EU_SIGN.get());
    // output.accept(ModBlocks.NO_U_TURN_EU_SIGN.get());
    //
    // output.accept(ModBlocks.END_ALL_LIMITS_EU_SIGN.get());
    // output.accept(ModBlocks.NO_PASSING_END_EU_SIGN.get());
    // output.accept(ModBlocks.NO_TRUCK_PASSING_END_EU_SIGN.get());
    //
    // output.accept(ModBlocks.SIDEWALK_EU_SIGN.get());
    // output.accept(ModBlocks.BICYCLE_PATH_EU_SIGN.get());
    // output.accept(ModBlocks.BUS_EU_SIGN.get());
    //
    // output.accept(ModBlocks.STRAIGHT_AHEAD_EU_SIGN.get());
    // output.accept(ModBlocks.LEFT_HERE_EU_SIGN.get());
    // output.accept(ModBlocks.RIGHT_HERE_EU_SIGN.get());
    // output.accept(ModBlocks.PASS_LEFT_EU_SIGN.get());
    // output.accept(ModBlocks.PASS_RIGHT_EU_SIGN.get());
    // output.accept(ModBlocks.LEFT_AHEAD_EU_SIGN.get());
    // output.accept(ModBlocks.RIGHT_AHEAD_EU_SIGN.get());
    // output.accept(ModBlocks.LEFT_RIGHT_EU_SIGN.get());
    // output.accept(ModBlocks.STRAIGHT_LEFT_EU_SIGN.get());
    // output.accept(ModBlocks.STRAIGHT_RIGHT_EU_SIGN.get());
    // output.accept(ModBlocks.ROUNDABOUT_EU_SIGN.get());
    // output.accept(ModBlocks.BUS_STOP_EU_SIGN.get());
    //
    // output.accept(ModBlocks.DETOUR_AHEAD_EU_SIGN.get());
    // output.accept(ModBlocks.DETOUR_LEFT_EU_SIGN.get());
    // output.accept(ModBlocks.DETOUR_RIGHT_EU_SIGN.get());
    // output.accept(ModBlocks.CRAFT_CITY_EU_SIGN.get());
    // output.accept(ModBlocks.CRAFT_CITY_END_EU_SIGN.get());
    //
    // output.accept(ModBlocks.PRIORITY_ROAD_EU_SIGN.get());
    // output.accept(ModBlocks.PRIORITY_ROAD_END_EU_SIGN.get());
    // output.accept(ModBlocks.STOP_EU_SIGN.get());
    // output.accept(ModBlocks.YIELD_RIGHT_OF_WAY_EU_SIGN.get());
    // output.accept(ModBlocks.NATURE_RESERVE_EU_SIGN.get());
    // output.accept(ModBlocks.CROSSBUCK_EU_SIGN.get());
    //
    // output.accept(ModBlocks.LEFT_ARROW_EU_SIGN.get());
    // output.accept(ModBlocks.RIGHT_ARROW_EU_SIGN.get());
    // output.accept(ModBlocks.LEFT_TURN_ARROW_EU_SIGN.get());
    // output.accept(ModBlocks.RIGHT_TURN_ARROW_EU_SIGN.get());
    // output.accept(ModBlocks.KM_AHEAD_EU_SIGN.get());
    // output.accept(ModBlocks.WEIGHT_EU_SIGN.get());
    // output.accept(ModBlocks.TAXI_EU_SIGN.get());
    //
    // output.accept(ModBlocks.DISABLED_EU_SIGN.get());
    // output.accept(ModBlocks.WET_EU_SIGN.get());
    // output.accept(ModBlocks.END_LINE_EU_SIGN.get());
    //
    // output.accept(ModBlocks.HIGHWAY_EU_SIGN.get());
    // output.accept(ModBlocks.HIGHWAY_END_EU_SIGN.get());
    // output.accept(ModBlocks.MOTORWAY_EU_SIGN.get());
    // output.accept(ModBlocks.MOTORWAY_END_EU_SIGN.get());
    // output.accept(ModBlocks.CALMING_AREA_EU_SIGN.get());
    // output.accept(ModBlocks.END_CALMING_AREA_EU_SIGN.get());
    // output.accept(ModBlocks.ONE_WAY_EU_SIGN.get());
    // output.accept(ModBlocks.PRIORITY_OVER_ONCOMING_TRAFFIC_EU_SIGN.get());
    // output.accept(ModBlocks.NO_THROUGH_ROAD_EU_SIGN.get());
    // output.accept(ModBlocks.PARKING_EU_SIGN.get());
    // output.accept(ModBlocks.PARKING_GARAGE_EU_EU_SIGN.get());
    // output.accept(ModBlocks.PEDESTRIAN_CROSSING_EU_SIGN.get());
    //
    // output.accept(ModBlocks.CAMPING_EU_SIGN.get());
    // output.accept(ModBlocks.PR_EU_SIGN.get());
    // output.accept(ModBlocks.CHURCH_EU_SIGN.get());
    // output.accept(ModBlocks.HOTEL_EU_SIGN.get());
    // output.accept(ModBlocks.PETROL_STATION_EU_SIGN.get());
    // output.accept(ModBlocks.CAFE_EU_SIGN.get());
    // output.accept(ModBlocks.INFO_EU_SIGN.get());
    // output.accept(ModBlocks.WC_EU_SIGN.get());
    // output.accept(ModBlocks.TELEPHONE_EU_SIGN.get());
    // output.accept(ModBlocks.RESTAURANT_EU_SIGN.get());
    // output.accept(ModBlocks.REPAIR_EU_SIGN.get());
    // output.accept(ModBlocks.FIRST_AID_EU_SIGN.get());
    // output.accept(ModBlocks.WATER_PROTECTION_AREA_EU_SIGN.get());
    // output.accept(ModBlocks.EMERGENCY_BAY_EU_SIGN.get());
    //
    // output.accept(ModBlocks.WARN_EU_SIGN.get());
    // output.accept(ModBlocks.GUIDE_EU_SIGN.get());
    // output.accept(ModBlocks.LEFT_DIRECTION_EU_SIGN.get());
    // output.accept(ModBlocks.RIGHT_DIRECTION_EU_SIGN.get());
    // output.accept(ModBlocks.WARNING_BEACON_LEFT_EU_SIGN.get());
    // output.accept(ModBlocks.WARNING_BEACON_RIGHT_EU_SIGN.get());
    // output.accept(ModBlocks.WARNING_BEACON_ALT_EU_SIGN.get());
    // }
    // }).build());
    //
    //
    // public static final RegistryObject<CreativeModeTab> US_SIGN_TAB = CREATIVE_MODE_TABS.register(References.MODID +
    // ".us_signs", () -> CreativeModeTab.builder()
    // .title(Component.translatable("itemGroup." + References.MODID + ".us_signs_tab"))
    // .icon(() -> new ItemStack(ModBlocks.CREEPER_US_SIGN.get()))
    // .withTabsBefore(MAIN_TAB.getId())
    // .displayItems((params, output) -> {
    // if (Config.SPLIT_TRAFFIC_SIGN_TAB.get()) {
    //
    // // US
    // output.accept(ModBlocks.IRON_POLE.get());
    //
    // output.accept(ModBlocks.T_INTERSECTION_US_SIGN.get());
    // output.accept(ModBlocks.Y_INTERSECTION_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_SIDE_ROAD_US_SIGN.get());
    // output.accept(ModBlocks.LEFT_SIDE_ROAD_US_SIGN.get());
    // output.accept(ModBlocks.CROSS_ROAD_US_SIGN.get());
    // output.accept(ModBlocks.SIDE_ROAD_AT_ANGLE_LEFT_US_SIGN.get());
    // output.accept(ModBlocks.SIDE_ROAD_AT_ANGLE_RIGHT_US_SIGN.get());
    // output.accept(ModBlocks.LEFT_TURN_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_TURN_US_SIGN.get());
    // output.accept(ModBlocks.LEFT_CURVE_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_CURVE_US_SIGN.get());
    // output.accept(ModBlocks.LEFT_REVERSE_TURN_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_REVERSE_TURN_US_SIGN.get());
    // output.accept(ModBlocks.LEFT_MERGING_TRAFFIC_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_MERGING_TRAFFIC_US_SIGN.get());
    // output.accept(ModBlocks.LEFT_ENTERING_ROADWAY_MERGE_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_ENTERING_ROADWAY_MERGE_US_SIGN.get());
    // output.accept(ModBlocks.LEFT_ADDED_LINE_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_ADDED_LINE_US_SIGN.get());
    // output.accept(ModBlocks.LEFT_LANE_ENDS_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_LANE_ENDS_US_SIGN.get());
    // output.accept(ModBlocks.TWO_WAY_TRAFFIC_US_SIGN.get());
    // output.accept(ModBlocks.VERY_SHARP_CURVE_US_SIGN.get());
    // output.accept(ModBlocks.WINDING_ROAD_US_SIGN.get());
    // output.accept(ModBlocks.HAIRPIN_CURVE_US_SIGN.get());
    // output.accept(ModBlocks.CIRCULAR_INTERSECTION_US_SIGN.get());
    // output.accept(ModBlocks.DIVIDED_HIGHWAY_US_SIGN.get());
    //
    // output.accept(ModBlocks.CREEPER_US_SIGN.get());
    // output.accept(ModBlocks.TRUCK_CROSSING_US_SIGN.get());
    // output.accept(ModBlocks.HILL_US_SIGN.get());
    // output.accept(ModBlocks.TRUCK_ROLLOVER_WARNING_US_SIGN.get());
    // output.accept(ModBlocks.SLIPPERY_US_SIGN.get());
    // output.accept(ModBlocks.ROAD_NARROWS_US_SIGN.get());
    // output.accept(ModBlocks.CATTLE_US_SIGN.get());
    // output.accept(ModBlocks.SIGNAL_US_SIGN.get());
    //
    // output.accept(ModBlocks.WORKERS_US_SIGN.get());
    //
    // output.accept(ModBlocks.PEDESTRIANS_CROSSING_US_SIGN.get());
    // output.accept(ModBlocks.HANDICAPED_CROSSING_US_SIGN.get());
    // output.accept(ModBlocks.BICYCLE_CROSSING_US_SIGN.get());
    // output.accept(ModBlocks.PLAYGROUND_AHEAD_US_SIGN.get());
    //
    // output.accept(ModBlocks.TWENTYFIVE_ADVISORY_SPEED_US_SIGN.get());
    // output.accept(ModBlocks.THIRTYFIVE_ADVISORY_SPEED_US_SIGN.get());
    // output.accept(ModBlocks.FORTYFIVE_ADVISORY_SPEED_US_SIGN.get());
    //
    // output.accept(ModBlocks.NO_PEDESTRIANS_US_SIGN.get());
    // output.accept(ModBlocks.NO_BICYCLE_US_SIGN.get());
    // output.accept(ModBlocks.NO_TRUCKS_US_SIGN.get());
    // output.accept(ModBlocks.NO_PARKING_US_SIGN.get());
    // output.accept(ModBlocks.NO_LEFT_TURN_US_SIGN.get());
    // output.accept(ModBlocks.NO_RIGHT_TURN_US_SIGN.get());
    // output.accept(ModBlocks.NO_U_TURN_US_SIGN.get());
    // output.accept(ModBlocks.STRAIGHT_AHEAD_ONLY_US_SIGN.get());
    // output.accept(ModBlocks.LEFT_TURN_ONLY_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_TURN_ONLY_US_SIGN.get());
    //
    // output.accept(ModBlocks.LEFT_ARROW_YELLOW_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_ARROW_YELLOW_US_SIGN.get());
    // output.accept(ModBlocks.LEFT_DIAGONAL_ARROW_YELLOW_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_DIAGONAL_ARROW_YELLOW_US_SIGN.get());
    // output.accept(ModBlocks.DOUBLE_ARROW_YELLOW_US_SIGN.get());
    // output.accept(ModBlocks.LEFT_ARROW_ORANGE_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_ARROW_ORANGE_US_SIGN.get());
    // output.accept(ModBlocks.LEFT_DIAGONAL_ARROW_ORANGE_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_DIAGONAL_ARROW_ORANGE_US_SIGN.get());
    // output.accept(ModBlocks.DOUBLE_ARROW_ORANGE_US_SIGN.get());
    // output.accept(ModBlocks.LEFT_ARROW_GREEN_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_ARROW_GREEN_US_SIGN.get());
    // output.accept(ModBlocks.LEFT_DIAGONAL_ARROW_GREEN_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_DIAGONAL_ARROW_GREEN_US_SIGN.get());
    // output.accept(ModBlocks.DOUBLE_ARROW_GREEN_US_SIGN.get());
    //
    // output.accept(ModBlocks.INFO_US_SIGN.get());
    // output.accept(ModBlocks.HANDICAPPED_ACCESSIBLE_US_SIGN.get());
    // output.accept(ModBlocks.HOTEL_US_SIGN.get());
    // output.accept(ModBlocks.RESTAURANT_US_SIGN.get());
    // output.accept(ModBlocks.HOSPITAL_US_SIGN.get());
    // output.accept(ModBlocks.GAS_STATION_US_SIGN.get());
    // output.accept(ModBlocks.DIESEL_STATION_US_SIGN.get());
    // output.accept(ModBlocks.ELECTRIC_STATION_US_SIGN.get());
    // output.accept(ModBlocks.CAMPING_US_SIGN.get());
    // output.accept(ModBlocks.MEDICAL_SERVICE_US_SIGN.get());
    // output.accept(ModBlocks.TELEPHONE_US_SIGN.get());
    // output.accept(ModBlocks.AIRPORT_US_SIGN.get());
    // output.accept(ModBlocks.LIGHT_RAIL_TRANSIT_STATION_US_SIGN.get());
    // output.accept(ModBlocks.WINTER_RECREATION_AREA_US_SIGN.get());
    // output.accept(ModBlocks.SWIMMING_AREA_US_SIGN.get());
    // output.accept(ModBlocks.PICNIC_AREA_US_SIGN.get());
    // output.accept(ModBlocks.REPAIR_US_SIGN.get());
    // output.accept(ModBlocks.DRINKING_WATER_US_SIGN.get());
    // output.accept(ModBlocks.BATHROOMS_US_SIGN.get());
    // output.accept(ModBlocks.LITTER_BARREL_US_SIGN.get());
    // output.accept(ModBlocks.LOUNDRY_FACILITY_US_SIGN.get());
    //
    // output.accept(ModBlocks.GUIDE_US_SIGN.get());
    // output.accept(ModBlocks.LEFT_DIRECTION_US_SIGN.get());
    // output.accept(ModBlocks.RIGHT_DIRECTION_US_SIGN.get());
    //
    // output.accept(ModBlocks.RAILROAD_CROSSING_US_SIGN.get());
    // output.accept(ModBlocks.CROSSBUCK_US_SIGN.get());
    // }
    // }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WALL_SIGNS_TAB = CREATIVE_MODE_TABS.register(References.MODID + ".wall_signs_tab",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup." + References.MODID + ".wall_signs_tab"))
                    .icon(() -> new ItemStack(ModBlocks.MONSTER_WARNING_SIGN.get())).displayItems((params, output) -> {
                        output.accept(ModBlocks.WARNING_SIGN.get());
                        output.accept(ModBlocks.MONSTER_WARNING_SIGN.get());
                        output.accept(ModBlocks.TOXIC_WARNING_SIGN.get());
                        output.accept(ModBlocks.VOLTAGE_WARNING_SIGN.get());
                        output.accept(ModBlocks.FIRE_WARNING_SIGN.get());
                        output.accept(ModBlocks.LASER_WARNING_SIGN.get());
                        output.accept(ModBlocks.HOT_WARNING_SIGN.get());
                        output.accept(ModBlocks.MAGNETIC_WARNING_SIGN.get());
                        output.accept(ModBlocks.EXPLOSION_WARNING_SIGN.get());
                        output.accept(ModBlocks.GAS_CYLINDER_WARNING_SIGN.get());
                        output.accept(ModBlocks.RADIATION_WARNING_SIGN.get());
                        output.accept(ModBlocks.BIOHAZARD_WARNING_SIGN.get());

                        output.accept(ModBlocks.MANDATORY_SIGN.get());
                        output.accept(ModBlocks.HELMET_MANDATORY_SIGN.get());
                        output.accept(ModBlocks.GLOVES_MANDATORY_SIGN.get());
                        output.accept(ModBlocks.ARMOR_MANDATORY_SIGN.get());
                        output.accept(ModBlocks.BOOTS_MANDATORY_SIGN.get());

                        output.accept(ModBlocks.PROHIBITION_SIGN.get());
                        output.accept(ModBlocks.ENTERING_PROHIBITED_SIGN.get());
                        output.accept(ModBlocks.HEAVY_LOAD_PROHIBITED_SIGN.get());
                        output.accept(ModBlocks.DRINKING_PROHIBITED_SIGN.get());
                        output.accept(ModBlocks.PHONES_PROHIBITED_SIGN.get());
                        output.accept(ModBlocks.PEDESTRIANS_PROHIBITED_SIGN.get());
                        output.accept(ModBlocks.UNAUTHORISED_PROHIBITED_SIGN.get());
                        output.accept(ModBlocks.SMOKING_PROHIBITED_SIGN.get());
                        output.accept(ModBlocks.EATING_PROHIBITED_SIGN.get());

                        output.accept(ModBlocks.FIRE_ALARM_SIGN.get());
                        output.accept(ModBlocks.FIRE_TELEPHONE_SIGN.get());
                        output.accept(ModBlocks.FIRE_EXTINGUISHER_SIGN.get());
                        output.accept(ModBlocks.FIRST_AID_SIGN.get());
                        output.accept(ModBlocks.ASSEMBLY_POINT_SIGN.get());
                        output.accept(ModBlocks.EMERGENCY_TELEFONE_SIGN.get());

                        output.accept(ModBlocks.EMERGENCY_EXIT_SIGN.get());
                        output.accept(ModBlocks.EMERGENCY_EXIT_LEFT_SIGN.get());
                        output.accept(ModBlocks.EMERGENCY_EXIT_RIGHT_SIGN.get());
                        output.accept(ModBlocks.EMERGENCY_EXIT_AHEAD_SIGN.get());
                        output.accept(ModBlocks.EMERGENCY_EXIT_DOWNWARDS_SIGN.get());
                        output.accept(ModBlocks.EXIT_SIGN.get());

                        output.accept(ModBlocks.SIGN_0.get());
                        output.accept(ModBlocks.SIGN_1.get());
                        output.accept(ModBlocks.SIGN_2.get());
                        output.accept(ModBlocks.SIGN_3.get());
                        output.accept(ModBlocks.SIGN_4.get());
                        output.accept(ModBlocks.SIGN_5.get());
                        output.accept(ModBlocks.SIGN_6.get());
                        output.accept(ModBlocks.SIGN_7.get());
                        output.accept(ModBlocks.SIGN_8.get());
                        output.accept(ModBlocks.SIGN_9.get());
                        output.accept(ModBlocks.A_SIGN.get());
                        output.accept(ModBlocks.B_SIGN.get());
                        output.accept(ModBlocks.C_SIGN.get());
                        output.accept(ModBlocks.D_SIGN.get());
                        output.accept(ModBlocks.E_SIGN.get());
                        output.accept(ModBlocks.F_SIGN.get());
                        output.accept(ModBlocks.G_SIGN.get());
                        output.accept(ModBlocks.H_SIGN.get());
                        output.accept(ModBlocks.I_SIGN.get());
                        output.accept(ModBlocks.J_SIGN.get());
                        output.accept(ModBlocks.K_SIGN.get());
                        output.accept(ModBlocks.L_SIGN.get());
                        output.accept(ModBlocks.M_SIGN.get());
                        output.accept(ModBlocks.N_SIGN.get());
                        output.accept(ModBlocks.O_SIGN.get());
                        output.accept(ModBlocks.P_SIGN.get());
                        output.accept(ModBlocks.Q_SIGN.get());
                        output.accept(ModBlocks.R_SIGN.get());
                        output.accept(ModBlocks.S_SIGN.get());
                        output.accept(ModBlocks.T_SIGN.get());
                        output.accept(ModBlocks.U_SIGN.get());
                        output.accept(ModBlocks.V_SIGN.get());
                        output.accept(ModBlocks.W_SIGN.get());
                        output.accept(ModBlocks.X_SIGN.get());
                        output.accept(ModBlocks.Y_SIGN.get());
                        output.accept(ModBlocks.Z_SIGN.get());
                        output.accept(ModBlocks.EXCLAMATION_SIGN.get());
                        output.accept(ModBlocks.QUESTION_SIGN.get());
                    }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TRAFFIC_LIGHTS_TAB = CREATIVE_MODE_TABS.register(References.MODID + ".traffic_lights_tab",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup." + References.MODID + ".traffic_lights_tab"))
                    .icon(() -> new ItemStack(ModBlocks.TRIPLE_TRAFFIC_LIGHT.get())).displayItems((params, output) -> {
                        output.accept(ModBlocks.IRON_POLE.get());
                        output.accept(ModBlocks.REDSTONE_POLE.get());

                        output.accept(ModBlocks.DOUBLE_TRAFFIC_LIGHT.get());
                        output.accept(ModBlocks.TRIPLE_TRAFFIC_LIGHT.get());
                        output.accept(ModBlocks.STRAIGHT_DOUBLE_TRAFFIC_LIGHT.get());
                        output.accept(ModBlocks.STRAIGHT_TRIPLE_TRAFFIC_LIGHT.get());
                        output.accept(ModBlocks.LEFT_TURN_DOUBLE_TRAFFIC_LIGHT.get());
                        output.accept(ModBlocks.LEFT_TURN_TRIPLE_TRAFFIC_LIGHT.get());
                        output.accept(ModBlocks.RIGHT_TURN_DOUBLE_TRAFFIC_LIGHT.get());
                        output.accept(ModBlocks.RIGHT_TURN_TRIPLE_TRAFFIC_LIGHT.get());
                        output.accept(ModBlocks.BICYCLE_DOUBLE_TRAFFIC_LIGHT.get());
                        output.accept(ModBlocks.BICYCLE_TRIPLE_TRAFFIC_LIGHT.get());
                        output.accept(ModBlocks.PEDESTRIAN_DOUBLE_TRAFFIC_LIGHT.get());
                        output.accept(ModBlocks.PEDESTRIAN_TRIPLE_TRAFFIC_LIGHT.get());
                        output.accept(ModBlocks.PEDESTRIAN_SIGNAL_LIGHT.get());
                        output.accept(ModBlocks.SIGNAL_LIGHT.get());
                        output.accept(ModBlocks.DANGER_SIGNAL_LIGHT.get());
                        output.accept(ModBlocks.TRAIN_SIGNAL_LIGHT.get());

                        output.accept(ModBlocks.MODERN_STREET_LANTERN.get());
                        output.accept(ModBlocks.STREET_LANTERN.get());
                        output.accept(ModBlocks.STREET_LANTERN_PANEL.get());

                        output.accept(ModBlocks.WHITE_LAMP.get());
                        output.accept(ModBlocks.LIGHT_GRAY_LAMP.get());
                        output.accept(ModBlocks.GRAY_LAMP.get());
                        output.accept(ModBlocks.BLACK_LAMP.get());
                        output.accept(ModBlocks.BROWN_LAMP.get());
                        output.accept(ModBlocks.RED_LAMP.get());
                        output.accept(ModBlocks.ORANGE_LAMP.get());
                        output.accept(ModBlocks.YELLOW_LAMP.get());
                        output.accept(ModBlocks.LIME_LAMP.get());
                        output.accept(ModBlocks.GREEN_LAMP.get());
                        output.accept(ModBlocks.CYAN_LAMP.get());
                        output.accept(ModBlocks.LIGHT_BLUE_LAMP.get());
                        output.accept(ModBlocks.BLUE_LAMP.get());
                        output.accept(ModBlocks.PURPLE_LAMP.get());
                        output.accept(ModBlocks.MAGENTA_LAMP.get());
                        output.accept(ModBlocks.PINK_LAMP.get());

                        output.accept(ModBlocks.WHITE_NEON_LIGHT.get());
                        output.accept(ModBlocks.LIGHT_GRAY_NEON_LIGHT.get());
                        output.accept(ModBlocks.GRAY_NEON_LIGHT.get());
                        output.accept(ModBlocks.BLACK_NEON_LIGHT.get());
                        output.accept(ModBlocks.BROWN_NEON_LIGHT.get());
                        output.accept(ModBlocks.RED_NEON_LIGHT.get());
                        output.accept(ModBlocks.ORANGE_NEON_LIGHT.get());
                        output.accept(ModBlocks.YELLOW_NEON_LIGHT.get());
                        output.accept(ModBlocks.LIME_NEON_LIGHT.get());
                        output.accept(ModBlocks.GREEN_NEON_LIGHT.get());
                        output.accept(ModBlocks.CYAN_NEON_LIGHT.get());
                        output.accept(ModBlocks.LIGHT_BLUE_NEON_LIGHT.get());
                        output.accept(ModBlocks.BLUE_NEON_LIGHT.get());
                        output.accept(ModBlocks.PURPLE_NEON_LIGHT.get());
                        output.accept(ModBlocks.MAGENTA_NEON_LIGHT.get());
                        output.accept(ModBlocks.PINK_NEON_LIGHT.get());
                    }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ROAD_TAB = CREATIVE_MODE_TABS.register(References.MODID + ".roads",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup." + References.MODID + ".roads_tab"))
                    .icon(() -> new ItemStack(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE.get())).withTabsBefore(MAIN_TAB.getId()).displayItems((params, output) -> {
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

                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LEFT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LEFT_EDGE_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LEFT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LEFT_EDGE_SLAB.get());

                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LEFT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LEFT_EDGE_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LEFT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LEFT_EDGE_SLAB.get());

                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_RIGHT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_RIGHT_EDGE_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_RIGHT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_RIGHT_EDGE_SLAB.get());

                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_RIGHT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_RIGHT_EDGE_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_RIGHT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_RIGHT_EDGE_SLAB.get());

                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LEFT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LEFT_EDGE_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LEFT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LEFT_EDGE_SLAB.get());

                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LEFT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LEFT_EDGE_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LEFT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LEFT_EDGE_SLAB.get());

                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_RIGHT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_RIGHT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB.get());

                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_RIGHT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_RIGHT_EDGE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB.get());

                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_TRIANGLE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_TRIANGLE_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_TRIANGLE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_TRIANGLE_SLAB.get());

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

                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LEFT_ARROW.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LEFT_ARROW_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LEFT_ARROW.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LEFT_ARROW_SLAB.get());

                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_RIGHT_ARROW.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_RIGHT_ARROW_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_RIGHT_ARROW.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_RIGHT_ARROW_SLAB.get());

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

                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_0.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_0_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_0.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_0_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_1.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_1_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_1.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_1_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_2.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_2_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_2.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_2_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_3.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_3_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_3.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_3_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_4.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_4_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_4.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_4_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_5.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_5_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_5.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_5_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_6.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_6_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_6.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_6_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_7.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_7_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_7.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_7_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_8.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_8_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_8.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_8_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_9.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_9_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_9.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_9_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_COMMA.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_COMMA_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_COMMA.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_COMMA_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_DASH.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_DASH_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DASH.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DASH_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_DOT.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_DOT_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DOT.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_DOT_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_EXCLAMATION.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_EXCLAMATION_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_EXCLAMATION.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_EXCLAMATION_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_QUESTION.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_QUESTION_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_QUESTION.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_QUESTION_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_SLASH.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_SLASH_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_SLASH.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_SLASH_SLAB.get());

                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_PEDESTRIAN.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_PEDESTRIAN_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_PEDESTRIAN.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_PEDESTRIAN_SLAB.get());

                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_BICYCLE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_BICYCLE_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_BICYCLE.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_BICYCLE_SLAB.get());

                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_HANDICAPPED.get());
                        output.accept(ModBlocks.ASPHALT_WITH_WHITE_HANDICAPPED_SLAB.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_HANDICAPPED.get());
                        output.accept(ModBlocks.ASPHALT_WITH_YELLOW_HANDICAPPED_SLAB.get());
                    }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CONCRETE_TAB = CREATIVE_MODE_TABS.register(References.MODID + ".concrete",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup." + References.MODID + ".concrete_tab")).withTabsBefore(MAIN_TAB.getId())
                    .icon(() -> new ItemStack(ModBlocks.CHISELED_LIGHT_GRAY_CONCRETE.get())).displayItems((params, output) -> {
                        output.accept(Blocks.WHITE_CONCRETE);
                        output.accept(Blocks.LIGHT_GRAY_CONCRETE);
                        output.accept(Blocks.GRAY_CONCRETE);
                        output.accept(Blocks.BLACK_CONCRETE);
                        output.accept(Blocks.BROWN_CONCRETE);
                        output.accept(Blocks.RED_CONCRETE);
                        output.accept(Blocks.ORANGE_CONCRETE);
                        output.accept(Blocks.YELLOW_CONCRETE);
                        output.accept(Blocks.LIME_CONCRETE);
                        output.accept(Blocks.GREEN_CONCRETE);
                        output.accept(Blocks.CYAN_CONCRETE);
                        output.accept(Blocks.LIGHT_BLUE_CONCRETE);
                        output.accept(Blocks.BLUE_CONCRETE);
                        output.accept(Blocks.PURPLE_CONCRETE);
                        output.accept(Blocks.MAGENTA_CONCRETE);
                        output.accept(Blocks.PINK_CONCRETE);

                        output.accept(ModBlocks.POLISHED_WHITE_CONCRETE.get());
                        output.accept(ModBlocks.POLISHED_LIGHT_GRAY_CONCRETE.get());
                        output.accept(ModBlocks.POLISHED_GRAY_CONCRETE.get());
                        output.accept(ModBlocks.POLISHED_BLACK_CONCRETE.get());
                        output.accept(ModBlocks.POLISHED_BROWN_CONCRETE.get());
                        output.accept(ModBlocks.POLISHED_RED_CONCRETE.get());
                        output.accept(ModBlocks.POLISHED_ORANGE_CONCRETE.get());
                        output.accept(ModBlocks.POLISHED_YELLOW_CONCRETE.get());
                        output.accept(ModBlocks.POLISHED_LIME_CONCRETE.get());
                        output.accept(ModBlocks.POLISHED_GREEN_CONCRETE.get());
                        output.accept(ModBlocks.POLISHED_CYAN_CONCRETE.get());
                        output.accept(ModBlocks.POLISHED_LIGHT_BLUE_CONCRETE.get());
                        output.accept(ModBlocks.POLISHED_BLUE_CONCRETE.get());
                        output.accept(ModBlocks.POLISHED_PURPLE_CONCRETE.get());
                        output.accept(ModBlocks.POLISHED_MAGENTA_CONCRETE.get());
                        output.accept(ModBlocks.POLISHED_PINK_CONCRETE.get());

                        output.accept(ModBlocks.CHISELED_WHITE_CONCRETE.get());
                        output.accept(ModBlocks.CHISELED_LIGHT_GRAY_CONCRETE.get());
                        output.accept(ModBlocks.CHISELED_GRAY_CONCRETE.get());
                        output.accept(ModBlocks.CHISELED_BLACK_CONCRETE.get());
                        output.accept(ModBlocks.CHISELED_BROWN_CONCRETE.get());
                        output.accept(ModBlocks.CHISELED_RED_CONCRETE.get());
                        output.accept(ModBlocks.CHISELED_ORANGE_CONCRETE.get());
                        output.accept(ModBlocks.CHISELED_YELLOW_CONCRETE.get());
                        output.accept(ModBlocks.CHISELED_LIME_CONCRETE.get());
                        output.accept(ModBlocks.CHISELED_GREEN_CONCRETE.get());
                        output.accept(ModBlocks.CHISELED_CYAN_CONCRETE.get());
                        output.accept(ModBlocks.CHISELED_LIGHT_BLUE_CONCRETE.get());
                        output.accept(ModBlocks.CHISELED_BLUE_CONCRETE.get());
                        output.accept(ModBlocks.CHISELED_PURPLE_CONCRETE.get());
                        output.accept(ModBlocks.CHISELED_MAGENTA_CONCRETE.get());
                        output.accept(ModBlocks.CHISELED_PINK_CONCRETE.get());

                        output.accept(ModBlocks.WHITE_CONCRETE_PILLAR.get());
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_PILLAR.get());
                        output.accept(ModBlocks.GRAY_CONCRETE_PILLAR.get());
                        output.accept(ModBlocks.BLACK_CONCRETE_PILLAR.get());
                        output.accept(ModBlocks.BROWN_CONCRETE_PILLAR.get());
                        output.accept(ModBlocks.RED_CONCRETE_PILLAR.get());
                        output.accept(ModBlocks.ORANGE_CONCRETE_PILLAR.get());
                        output.accept(ModBlocks.YELLOW_CONCRETE_PILLAR.get());
                        output.accept(ModBlocks.LIME_CONCRETE_PILLAR.get());
                        output.accept(ModBlocks.GREEN_CONCRETE_PILLAR.get());
                        output.accept(ModBlocks.CYAN_CONCRETE_PILLAR.get());
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_PILLAR.get());
                        output.accept(ModBlocks.BLUE_CONCRETE_PILLAR.get());
                        output.accept(ModBlocks.PURPLE_CONCRETE_PILLAR.get());
                        output.accept(ModBlocks.MAGENTA_CONCRETE_PILLAR.get());
                        output.accept(ModBlocks.PINK_CONCRETE_PILLAR.get());

                        output.accept(ModBlocks.WHITE_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.GRAY_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.BLACK_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.BROWN_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.RED_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.LIME_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.GREEN_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.CYAN_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.BLUE_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.PINK_CONCRETE_STAIRS.get());

                        output.accept(ModBlocks.WHITE_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.GRAY_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.BLACK_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.BROWN_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.RED_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.ORANGE_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.YELLOW_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.LIME_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.GREEN_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.CYAN_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.BLUE_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.PURPLE_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.MAGENTA_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.PINK_CONCRETE_SLAB.get());

                        output.accept(ModBlocks.WHITE_CONCRETE_WALL.get());
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get());
                        output.accept(ModBlocks.GRAY_CONCRETE_WALL.get());
                        output.accept(ModBlocks.BLACK_CONCRETE_WALL.get());
                        output.accept(ModBlocks.BROWN_CONCRETE_WALL.get());
                        output.accept(ModBlocks.RED_CONCRETE_WALL.get());
                        output.accept(ModBlocks.ORANGE_CONCRETE_WALL.get());
                        output.accept(ModBlocks.YELLOW_CONCRETE_WALL.get());
                        output.accept(ModBlocks.LIME_CONCRETE_WALL.get());
                        output.accept(ModBlocks.GREEN_CONCRETE_WALL.get());
                        output.accept(ModBlocks.CYAN_CONCRETE_WALL.get());
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get());
                        output.accept(ModBlocks.BLUE_CONCRETE_WALL.get());
                        output.accept(ModBlocks.PURPLE_CONCRETE_WALL.get());
                        output.accept(ModBlocks.MAGENTA_CONCRETE_WALL.get());
                        output.accept(ModBlocks.PINK_CONCRETE_WALL.get());

                        output.accept(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get());

                        output.accept(ModBlocks.WHITE_CONCRETE_BUTTON.get());
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get());
                        output.accept(ModBlocks.GRAY_CONCRETE_BUTTON.get());
                        output.accept(ModBlocks.BLACK_CONCRETE_BUTTON.get());
                        output.accept(ModBlocks.BROWN_CONCRETE_BUTTON.get());
                        output.accept(ModBlocks.RED_CONCRETE_BUTTON.get());
                        output.accept(ModBlocks.ORANGE_CONCRETE_BUTTON.get());
                        output.accept(ModBlocks.YELLOW_CONCRETE_BUTTON.get());
                        output.accept(ModBlocks.LIME_CONCRETE_BUTTON.get());
                        output.accept(ModBlocks.GREEN_CONCRETE_BUTTON.get());
                        output.accept(ModBlocks.CYAN_CONCRETE_BUTTON.get());
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get());
                        output.accept(ModBlocks.BLUE_CONCRETE_BUTTON.get());
                        output.accept(ModBlocks.PURPLE_CONCRETE_BUTTON.get());
                        output.accept(ModBlocks.MAGENTA_CONCRETE_BUTTON.get());
                        output.accept(ModBlocks.PINK_CONCRETE_BUTTON.get());

                        output.accept(ModBlocks.WHITE_CONCRETE_LEVER.get());
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.get());
                        output.accept(ModBlocks.GRAY_CONCRETE_LEVER.get());
                        output.accept(ModBlocks.BLACK_CONCRETE_LEVER.get());
                        output.accept(ModBlocks.BROWN_CONCRETE_LEVER.get());
                        output.accept(ModBlocks.RED_CONCRETE_LEVER.get());
                        output.accept(ModBlocks.ORANGE_CONCRETE_LEVER.get());
                        output.accept(ModBlocks.YELLOW_CONCRETE_LEVER.get());
                        output.accept(ModBlocks.LIME_CONCRETE_LEVER.get());
                        output.accept(ModBlocks.GREEN_CONCRETE_LEVER.get());
                        output.accept(ModBlocks.CYAN_CONCRETE_LEVER.get());
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.get());
                        output.accept(ModBlocks.BLUE_CONCRETE_LEVER.get());
                        output.accept(ModBlocks.PURPLE_CONCRETE_LEVER.get());
                        output.accept(ModBlocks.MAGENTA_CONCRETE_LEVER.get());
                        output.accept(ModBlocks.PINK_CONCRETE_LEVER.get());

                        output.accept(ModBlocks.CRACKED_WHITE_CONCRETE.get());
                        output.accept(ModBlocks.CRACKED_LIGHT_GRAY_CONCRETE.get());
                        output.accept(ModBlocks.CRACKED_GRAY_CONCRETE.get());
                        output.accept(ModBlocks.CRACKED_BLACK_CONCRETE.get());
                        output.accept(ModBlocks.CRACKED_BROWN_CONCRETE.get());
                        output.accept(ModBlocks.CRACKED_RED_CONCRETE.get());
                        output.accept(ModBlocks.CRACKED_ORANGE_CONCRETE.get());
                        output.accept(ModBlocks.CRACKED_YELLOW_CONCRETE.get());
                        output.accept(ModBlocks.CRACKED_LIME_CONCRETE.get());
                        output.accept(ModBlocks.CRACKED_GREEN_CONCRETE.get());
                        output.accept(ModBlocks.CRACKED_CYAN_CONCRETE.get());
                        output.accept(ModBlocks.CRACKED_LIGHT_BLUE_CONCRETE.get());
                        output.accept(ModBlocks.CRACKED_BLUE_CONCRETE.get());
                        output.accept(ModBlocks.CRACKED_PURPLE_CONCRETE.get());
                        output.accept(ModBlocks.CRACKED_MAGENTA_CONCRETE.get());
                        output.accept(ModBlocks.CRACKED_PINK_CONCRETE.get());

                        output.accept(ModBlocks.MOSSY_WHITE_CONCRETE.get());
                        output.accept(ModBlocks.MOSSY_LIGHT_GRAY_CONCRETE.get());
                        output.accept(ModBlocks.MOSSY_GRAY_CONCRETE.get());
                        output.accept(ModBlocks.MOSSY_BLACK_CONCRETE.get());
                        output.accept(ModBlocks.MOSSY_BROWN_CONCRETE.get());
                        output.accept(ModBlocks.MOSSY_RED_CONCRETE.get());
                        output.accept(ModBlocks.MOSSY_ORANGE_CONCRETE.get());
                        output.accept(ModBlocks.MOSSY_YELLOW_CONCRETE.get());
                        output.accept(ModBlocks.MOSSY_LIME_CONCRETE.get());
                        output.accept(ModBlocks.MOSSY_GREEN_CONCRETE.get());
                        output.accept(ModBlocks.MOSSY_CYAN_CONCRETE.get());
                        output.accept(ModBlocks.MOSSY_LIGHT_BLUE_CONCRETE.get());
                        output.accept(ModBlocks.MOSSY_BLUE_CONCRETE.get());
                        output.accept(ModBlocks.MOSSY_PURPLE_CONCRETE.get());
                        output.accept(ModBlocks.MOSSY_MAGENTA_CONCRETE.get());
                        output.accept(ModBlocks.MOSSY_PINK_CONCRETE.get());

                        output.accept(ModBlocks.INFESTED_BLACK_CONCRETE.get());
                        output.accept(ModBlocks.INFESTED_WHITE_CONCRETE.get());
                        output.accept(ModBlocks.INFESTED_GRAY_CONCRETE.get());
                        output.accept(ModBlocks.INFESTED_LIGHT_GRAY_CONCRETE.get());
                    }).build());
}
