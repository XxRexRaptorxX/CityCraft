package xxrexraptorxx.citycraft.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import xxrexraptorxx.citycraft.main.CityCraft;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.recipes.PaintingRecipe;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.registry.ModItemTags;
import xxrexraptorxx.citycraft.registry.ModItems;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }


    @Override
    protected void buildRecipes(RecipeOutput output) {
        paintingRecipes(ModBlocks.WARNING_BEACON_LEFT_EU_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WARNING_BEACON_RIGHT_EU_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WARNING_BEACON_ALT_EU_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CROSSBUCK_EU_SIGN.get(), ModItemTags.CROSS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CROSSBUCK_US_SIGN.get(), ModItemTags.CROSS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.STOP_EU_SIGN.get(), ModItemTags.OCTAGON_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_ARROW_EU_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_ARROW_EU_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_TURN_ARROW_EU_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_TURN_ARROW_EU_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.KM_AHEAD_EU_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WEIGHT_EU_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TAXI_EU_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WARN_EU_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_ARROW_YELLOW_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_ARROW_YELLOW_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DIAGONAL_ARROW_YELLOW_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DIAGONAL_ARROW_YELLOW_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DOUBLE_ARROW_YELLOW_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_ARROW_GREEN_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_ARROW_GREEN_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DIAGONAL_ARROW_GREEN_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DIAGONAL_ARROW_GREEN_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DOUBLE_ARROW_GREEN_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_ARROW_ORANGE_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_ARROW_ORANGE_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DIAGONAL_ARROW_ORANGE_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DIAGONAL_ARROW_ORANGE_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DOUBLE_ARROW_ORANGE_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PRIORITY_ROAD_EU_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PRIORITY_ROAD_END_EU_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.T_INTERSECTION_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.Y_INTERSECTION_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_SIDE_ROAD_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_SIDE_ROAD_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CROSS_ROAD_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIDE_ROAD_AT_ANGLE_LEFT_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIDE_ROAD_AT_ANGLE_RIGHT_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_TURN_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_TURN_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_CURVE_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_CURVE_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_REVERSE_TURN_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_REVERSE_TURN_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_MERGING_TRAFFIC_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_MERGING_TRAFFIC_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_ENTERING_ROADWAY_MERGE_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_ENTERING_ROADWAY_MERGE_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_ADDED_LINE_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_ADDED_LINE_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_LANE_ENDS_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_LANE_ENDS_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TWO_WAY_TRAFFIC_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.VERY_SHARP_CURVE_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WINDING_ROAD_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HAIRPIN_CURVE_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CIRCULAR_INTERSECTION_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DIVIDED_HIGHWAY_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CREEPER_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TRUCK_CROSSING_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HILL_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TRUCK_ROLLOVER_WARNING_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SLIPPERY_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ROAD_NARROWS_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CATTLE_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIGNAL_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WORKERS_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PEDESTRIANS_CROSSING_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HANDICAPED_CROSSING_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_CROSSING_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PLAYGROUND_AHEAD_US_SIGN.get(), ModItemTags.RHOMBUS_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TEN_SPEED_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.THIRTY_SPEED_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIXTY_SPEED_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EIGHTY_SPEED_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HUNDRED_SPEED_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HUNDRED_TWENTY_SPEED_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_VEHICLES_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_CARS_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_TRUCKS_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_PEDESTRIANS_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_BICYCLES_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_PASSING_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_TRUCK_PASSING_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ONGOING_TRAFFIC_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_ENTER_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_PARKING_ALONG_CARRIAGEWAY_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_PARKING_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_U_TURN_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.END_ALL_LIMITS_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_PASSING_END_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_TRUCK_PASSING_END_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIDEWALK_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_PATH_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BUS_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.STRAIGHT_AHEAD_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_HERE_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_HERE_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PASS_LEFT_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PASS_RIGHT_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_AHEAD_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_AHEAD_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_RIGHT_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.STRAIGHT_LEFT_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.STRAIGHT_RIGHT_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ROUNDABOUT_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BUS_STOP_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RAILROAD_CROSSING_US_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_AHEAD_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_LEFT_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_RIGHT_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CRAFT_CITY_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CRAFT_CITY_END_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DISABLED_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WET_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.END_LINE_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HIGHWAY_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HIGHWAY_END_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.MOTORWAY_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.MOTORWAY_END_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CALMING_AREA_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.END_CALMING_AREA_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ONE_WAY_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PRIORITY_OVER_ONCOMING_TRAFFIC_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_THROUGH_ROAD_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PARKING_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PARKING_GARAGE_EU_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PEDESTRIAN_CROSSING_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CAMPING_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PR_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CHURCH_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HOTEL_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PETROL_STATION_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CAFE_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.INFO_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WC_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TELEPHONE_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RESTAURANT_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.REPAIR_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FIRST_AID_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WATER_PROTECTION_AREA_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_BAY_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GUIDE_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DIRECTION_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DIRECTION_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GUIDE_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DIRECTION_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DIRECTION_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TWENTYFIVE_ADVISORY_SPEED_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.THIRTYFIVE_ADVISORY_SPEED_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FORTYFIVE_ADVISORY_SPEED_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_PEDESTRIANS_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_BICYCLE_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_TRUCKS_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_PARKING_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_LEFT_TURN_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_RIGHT_TURN_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_U_TURN_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.STRAIGHT_AHEAD_ONLY_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_TURN_ONLY_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_TURN_ONLY_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.INFO_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HANDICAPPED_ACCESSIBLE_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HOTEL_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RESTAURANT_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HOSPITAL_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GAS_STATION_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DIESEL_STATION_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ELECTRIC_STATION_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CAMPING_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.MEDICAL_SERVICE_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TELEPHONE_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.AIRPORT_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LIGHT_RAIL_TRANSIT_STATION_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WINTER_RECREATION_AREA_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SWIMMING_AREA_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PICNIC_AREA_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.REPAIR_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DRINKING_WATER_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BATHROOMS_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LITTER_BARREL_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LOUNDRY_FACILITY_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DANGER_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ROADWORKS_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CREEPER_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CHILDREN_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CROSSWALK_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ROCKFALL_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SLIPPERINESS_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIGNAL_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SNOW_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ONCOMING_TRAFFIC_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_CURVE_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_CURVE_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DOUBLE_CURVE_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DOUBLE_CURVE_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GATE_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NARROWING_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_NARROWING_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_NARROWING_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CATTLE_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ASCEND_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DESCEND_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.JAMS_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PRIORITY_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RAILROAD_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.UNEVEN_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CYCLES_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PEDESTRIANS_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.INTERSECTION_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.YIELD_RIGHT_OF_WAY_EU_SIGN.get(), ModItemTags.UPSIDE_DOWN_TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NATURE_RESERVE_EU_SIGN.get(), ModItemTags.UPSIDE_DOWN_TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);

        paintingRecipes(ModBlocks.EXIT_CLOSED_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_HAZARDOUS_CARGO_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.M_AHEAD_EU_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.AHEAD_YELLOW_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_PATH_RIGHT_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_HIGHWAY_END_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TEN_MINIMUM_SPEED_SIGN_EU.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HIGHWAY_COUNTDOWN_MARKER_200_EU_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_PATH_LEFT_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_ROUTE_AHEAD_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FEDERAL_HIGHWAY_COUNTDOWN_MARKER_100_EU_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HIGHWAY_COUNTDOWN_MARKER_300_EU_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BRIDLE_PATH_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_END_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_LEFT_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FEDERAL_HIGHWAY_COUNTDOWN_MARKER_200_EU_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_RIGHT_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.AHEAD_GREEN_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.MOVABLE_BRIDGE_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HIGHWAY_COUNTDOWN_MARKER_100_EU_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_PATH_US_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.THIRTY_MINIMUM_SPEED_SIGN_EU.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CHARGING_STATION_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_ROUTE_LEFT_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LOOSE_GRAVEL_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FEDERAL_HIGHWAY_COUNTDOWN_MARKER_300_EU_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_HIGHWAY_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PARKING_AREA_END_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_PATH_AHEAD_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NO_MONSTER_EU_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.AHEAD_ORANGE_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BICYCLE_ROUTE_RIGHT_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_PRIORITY_ROAD_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PARKING_AREA_START_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PRIORITY_ROAD_FROM_LEFT_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PRIORITY_ROAD_FROM_RIGHT_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RAILWAY_COUNTDOWN_MARKER_80_EU_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RAILWAY_COUNTDOWN_MARKER_160_EU_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RAILWAY_COUNTDOWN_MARKER_240_EU_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_PRIORITY_ROAD_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SHORE_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TREE_OVERHANG_EU_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TRUCK_ROUTE_AHEAD_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TRUCK_ROUTE_RIGHT_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TRUCK_ROUTE_LEFT_EU_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WARN_US_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WARNING_BEACON_ALT_US_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WARNING_BEACON_LEFT_US_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.WARNING_BEACON_RIGHT_US_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);

        paintingRecipes(ModBlocks.ONCOMING_TRAFFIC_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.INTERSECTION_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_LEFT_OR_RIGHT_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PEDESTRIAN_CROSSING_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_BAY_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CATTLE_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NARROWING_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DESCEND_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CHILDREN_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FIFTY_ADVISORY_SPEED_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.JAMS_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DANGER_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DOUBLE_CURVE_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RAILROAD_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_LEFT_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CREEPER_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ASCEND_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GAS_STATION_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PARKING_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BUMP_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DIRECTION_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_NARROWING_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.INFO_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CYCLES_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PRIORITY_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.CAMPING_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ROUNDABOUT_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SHORE_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HIGHWAY_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_CURVE_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_NARROWING_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NATURE_RESERVE_AREA_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_MERGING_TRAFFIC_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HIGHWAY_END_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_DOUBLE_CURVE_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GATE_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ROCKFALL_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PARKING_GARAGE_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DETOUR_RIGHT_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.THIRTY_ADVISORY_SPEED_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_DIRECTION_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.NARROW_BRIDGE_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FORTY_ADVISORY_SPEED_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ONE_WAY_CN_SIGN.get(), ModItemTags.BAKE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ROADWORKS_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RIGHT_MERGING_TRAFFIC_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LEFT_CURVE_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GUIDE_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIDE_ROAD_AT_ANGLE_LEFT_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIDE_ROAD_AT_ANGLE_RIGHT_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIDE_ROAD_AT_LEFT_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIDE_ROAD_AT_RIGHT_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIGNAL_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SLIPPERINESS_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SLOW_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SNOW_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.STOP_CN_SIGN.get(), ModItemTags.OCTAGON_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.T_INTERSECTION_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TELEPHONE_CN_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.UNEVEN_ROAD_CN_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);

        paintingRecipes(ModBlocks.WARNING_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.MONSTER_WARNING_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.TOXIC_WARNING_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.VOLTAGE_WARNING_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FIRE_WARNING_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.LASER_WARNING_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HOT_WARNING_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.MAGNETIC_WARNING_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EXPLOSION_WARNING_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GAS_CYLINDER_WARNING_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.RADIATION_WARNING_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BIOHAZARD_WARNING_SIGN.get(), ModItemTags.TRIANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PROHIBITION_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ENTERING_PROHIBITED_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HEAVY_LOAD_PROHIBITED_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.DRINKING_PROHIBITED_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PHONES_PROHIBITED_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.PEDESTRIANS_PROHIBITED_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.UNAUTHORISED_PROHIBITED_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SMOKING_PROHIBITED_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EATING_PROHIBITED_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.MANDATORY_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.HELMET_MANDATORY_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.GLOVES_MANDATORY_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ARMOR_MANDATORY_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.BOOTS_MANDATORY_SIGN.get(), ModItemTags.ROUND_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FIRST_AID_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FIRE_ALARM_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FIRE_TELEPHONE_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.FIRE_EXTINGUISHER_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.ASSEMBLY_POINT_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_TELEFONE_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_EXIT_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_EXIT_LEFT_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_EXIT_RIGHT_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_EXIT_AHEAD_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EMERGENCY_EXIT_DOWNWARDS_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EXIT_SIGN.get(), ModItemTags.RECTANGLE_SIGN, ModItems.DYE_MIX.get(), output);

        paintingRecipes(ModBlocks.SIGN_0.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIGN_1.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIGN_2.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIGN_3.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIGN_4.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIGN_5.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIGN_6.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIGN_7.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIGN_8.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.SIGN_9.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.A_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.B_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.C_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.D_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.E_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.F_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.G_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.H_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.I_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.J_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.K_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.L_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.M_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.N_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.O_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.P_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.Q_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.R_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.S_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.T_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.U_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.V_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.W_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.X_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.Y_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.Z_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.EXCLAMATION_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);
        paintingRecipes(ModBlocks.QUESTION_SIGN.get(), ModItemTags.SQUARE_SIGN, ModItems.DYE_MIX.get(), output);

        paintingRecipes(ModBlocks.RED_CHAIN.get(), ModItemTags.CHAINS, Tags.Items.DYES_RED, output);
        paintingRecipes(ModBlocks.WHITE_CHAIN.get(), ModItemTags.CHAINS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.YELLOW_CHAIN.get(), ModItemTags.CHAINS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.BLACK_CHAIN.get(), ModItemTags.CHAINS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHAIN, ModItemTags.CHAINS, Tags.Items.DYES_GRAY, output);
        paintingRecipes(ModBlocks.RED_POLE.get(), ModItemTags.IRON_POLES, Tags.Items.DYES_RED, output);
        paintingRecipes(ModBlocks.WHITE_POLE.get(), ModItemTags.IRON_POLES, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.YELLOW_POLE.get(), ModItemTags.IRON_POLES, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.BLACK_POLE.get(), ModItemTags.IRON_POLES, Tags.Items.DYES_BLACK, output); //

        paintingRecipes(ModBlocks.RED_POST.get(), ModItemTags.STONE_POSTS, Tags.Items.DYES_RED, output);
        paintingRecipes(ModBlocks.WHITE_POST.get(), ModItemTags.STONE_POSTS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(ModBlocks.YELLOW_POST.get(), ModItemTags.STONE_POSTS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(ModBlocks.BLACK_POST.get(), ModItemTags.STONE_POSTS, Tags.Items.DYES_BLACK, output); //

        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_OPEN.get(), ModBlocks.STRAIGHT_AHEAD_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_CLOSED.get(), ModBlocks.CROSS_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_CHANGE_LEFT.get(), ModBlocks.PASS_LEFT_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_CHANGE_RIGHT.get(), ModBlocks.PASS_RIGHT_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_SIXTY_SPEED_LIMIT.get(), ModBlocks.SIXTY_SPEED_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_EIGHTY_SPEED_LIMIT.get(), ModBlocks.EIGHTY_SPEED_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_HUNDRED_SPEED_LIMIT.get(), ModBlocks.HUNDRED_SPEED_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_HUNDRED_TWENTY_SPEED_LIMIT.get(), ModBlocks.HUNDRED_TWENTY_SPEED_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_CREEPER.get(), ModBlocks.CREEPER_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_DANGER.get(), ModBlocks.DANGER_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_END_ALL_LIMITS.get(), ModBlocks.END_ALL_LIMITS_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_JAMS.get(), ModBlocks.JAMS_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_NO_PASSING.get(), ModBlocks.NO_PASSING_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_NO_TRUCK_PASSING.get(), ModBlocks.NO_TRUCK_PASSING_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_ROADWORKS.get(), ModBlocks.ROADWORKS_EU_SIGN.get(), output);
        variableTrafficSignRecipes(ModBlocks.VARIABLE_TRAFFIC_SIGN_SLIPPERINESS.get(), ModBlocks.SLIPPERINESS_EU_SIGN.get(), output);

        paintingRecipes(Blocks.OAK_PLANKS, ItemTags.PLANKS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_PLANKS, ItemTags.PLANKS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_PLANKS, ItemTags.PLANKS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_PLANKS, ItemTags.PLANKS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_PLANKS, ItemTags.PLANKS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_PLANKS, ItemTags.PLANKS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_PLANKS, ItemTags.PLANKS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_PLANKS, Blocks.WARPED_PLANKS, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_PLANKS, Blocks.CRIMSON_PLANKS, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_SLAB, ItemTags.WOODEN_SLABS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_SLAB, ItemTags.WOODEN_SLABS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_SLAB, ItemTags.WOODEN_SLABS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_SLAB, ItemTags.WOODEN_SLABS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_SLAB, ItemTags.WOODEN_SLABS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_SLAB, ItemTags.WOODEN_SLABS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_SLAB, ItemTags.WOODEN_SLABS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_SLAB, Blocks.WARPED_SLAB, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_SLAB, Blocks.CRIMSON_SLAB, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_STAIRS, ItemTags.WOODEN_STAIRS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_STAIRS, ItemTags.WOODEN_STAIRS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_STAIRS, ItemTags.WOODEN_STAIRS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_STAIRS, ItemTags.WOODEN_STAIRS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_STAIRS, ItemTags.WOODEN_STAIRS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_STAIRS, ItemTags.WOODEN_STAIRS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_STAIRS, ItemTags.WOODEN_STAIRS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_STAIRS, Blocks.WARPED_STAIRS, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_STAIRS, Blocks.CRIMSON_STAIRS, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_BUTTON, ItemTags.WOODEN_BUTTONS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_BUTTON, ItemTags.WOODEN_BUTTONS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_BUTTON, ItemTags.WOODEN_BUTTONS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_BUTTON, ItemTags.WOODEN_BUTTONS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_BUTTON, ItemTags.WOODEN_BUTTONS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_BUTTON, ItemTags.WOODEN_BUTTONS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_BUTTON, ItemTags.WOODEN_BUTTONS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_BUTTON, Blocks.WARPED_BUTTON, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_BUTTON, Blocks.CRIMSON_BUTTON, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_DOOR, ItemTags.WOODEN_DOORS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_DOOR, ItemTags.WOODEN_DOORS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_DOOR, ItemTags.WOODEN_DOORS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_DOOR, ItemTags.WOODEN_DOORS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_DOOR, ItemTags.WOODEN_DOORS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_DOOR, ItemTags.WOODEN_DOORS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_DOOR, ItemTags.WOODEN_DOORS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_DOOR, Blocks.WARPED_DOOR, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_DOOR, Blocks.CRIMSON_DOOR, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_FENCE, ItemTags.WOODEN_FENCES, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_FENCE, ItemTags.WOODEN_FENCES, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_FENCE, ItemTags.WOODEN_FENCES, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_FENCE, ItemTags.WOODEN_FENCES, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_FENCE, ItemTags.WOODEN_FENCES, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_FENCE, ItemTags.WOODEN_FENCES, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_FENCE, ItemTags.WOODEN_FENCES, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_FENCE, Blocks.WARPED_FENCE, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_FENCE, Blocks.CRIMSON_FENCE, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_FENCE_GATE, Tags.Items.FENCE_GATES_WOODEN, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_FENCE_GATE, Tags.Items.FENCE_GATES_WOODEN, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_FENCE_GATE, Tags.Items.FENCE_GATES_WOODEN, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_FENCE_GATE, Tags.Items.FENCE_GATES_WOODEN, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_FENCE_GATE, Tags.Items.FENCE_GATES_WOODEN, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_FENCE_GATE, Tags.Items.FENCE_GATES_WOODEN, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_FENCE_GATE, Tags.Items.FENCE_GATES_WOODEN, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_FENCE_GATE, Blocks.WARPED_FENCE_GATE, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_FENCE_GATE, Blocks.CRIMSON_FENCE_GATE, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_PRESSURE_PLATE, ItemTags.WOODEN_PRESSURE_PLATES, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_PRESSURE_PLATE, ItemTags.WOODEN_PRESSURE_PLATES, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_PRESSURE_PLATE, ItemTags.WOODEN_PRESSURE_PLATES, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_PRESSURE_PLATE, ItemTags.WOODEN_PRESSURE_PLATES, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_PRESSURE_PLATE, ItemTags.WOODEN_PRESSURE_PLATES, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_PRESSURE_PLATE, ItemTags.WOODEN_PRESSURE_PLATES, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_PRESSURE_PLATE, ItemTags.WOODEN_PRESSURE_PLATES, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_PRESSURE_PLATE, Blocks.WARPED_PRESSURE_PLATE, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_PRESSURE_PLATE, Blocks.CRIMSON_PRESSURE_PLATE, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_TRAPDOOR, ItemTags.WOODEN_TRAPDOORS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_TRAPDOOR, ItemTags.WOODEN_TRAPDOORS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_TRAPDOOR, ItemTags.WOODEN_TRAPDOORS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_TRAPDOOR, ItemTags.WOODEN_TRAPDOORS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_TRAPDOOR, ItemTags.WOODEN_TRAPDOORS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_TRAPDOOR, ItemTags.WOODEN_TRAPDOORS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_TRAPDOOR, ItemTags.WOODEN_TRAPDOORS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_TRAPDOOR, Blocks.WARPED_TRAPDOOR, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_TRAPDOOR, Blocks.CRIMSON_TRAPDOOR, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_SIGN, ModItemTags.SIGNS_WOOD, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_SIGN, ModItemTags.SIGNS_WOOD, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_SIGN, ModItemTags.SIGNS_WOOD, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_SIGN, ModItemTags.SIGNS_WOOD, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_SIGN, ModItemTags.SIGNS_WOOD, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_SIGN, ModItemTags.SIGNS_WOOD, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_SIGN, ModItemTags.SIGNS_WOOD, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_SIGN, Blocks.WARPED_SIGN, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_SIGN, Blocks.CRIMSON_SIGN, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.OAK_HANGING_SIGN, ModItemTags.HANGING_WOOD_SIGNS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SPRUCE_HANGING_SIGN, ModItemTags.HANGING_WOOD_SIGNS, Tags.Items.DYES_BROWN, output);
        paintingRecipes(Blocks.BIRCH_HANGING_SIGN, ModItemTags.HANGING_WOOD_SIGNS, Tags.Items.DYES_WHITE, output);
        paintingRecipes(Blocks.JUNGLE_HANGING_SIGN, ModItemTags.HANGING_WOOD_SIGNS, Tags.Items.DYES_ORANGE, output);
        paintingRecipes(Blocks.ACACIA_HANGING_SIGN, ModItemTags.HANGING_WOOD_SIGNS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.DARK_OAK_HANGING_SIGN, ModItemTags.HANGING_WOOD_SIGNS, Tags.Items.DYES_BLACK, output);
        paintingRecipes(Blocks.CHERRY_HANGING_SIGN, ModItemTags.HANGING_WOOD_SIGNS, Tags.Items.DYES_PINK, output);
        paintingRecipes(Blocks.CRIMSON_HANGING_SIGN, Blocks.WARPED_HANGING_SIGN, Tags.Items.DYES_PURPLE, output);
        paintingRecipes(Blocks.WARPED_HANGING_SIGN, Blocks.CRIMSON_HANGING_SIGN, Tags.Items.DYES_GREEN, output);

        paintingRecipes(Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.RED_SANDSTONE, Blocks.SANDSTONE, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.SANDSTONE_STAIRS, Blocks.RED_SANDSTONE_STAIRS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.RED_SANDSTONE_STAIRS, Blocks.SANDSTONE_STAIRS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.SANDSTONE_SLAB, Blocks.RED_SANDSTONE_SLAB, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.RED_SANDSTONE_SLAB, Blocks.SANDSTONE_SLAB, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.SANDSTONE_WALL, Blocks.RED_SANDSTONE_WALL, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.RED_SANDSTONE_WALL, Blocks.SANDSTONE_WALL, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.CHISELED_SANDSTONE, Blocks.CHISELED_RED_SANDSTONE, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.CHISELED_RED_SANDSTONE, Blocks.CHISELED_SANDSTONE, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SMOOTH_RED_SANDSTONE, Blocks.SMOOTH_SANDSTONE, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.SMOOTH_SANDSTONE_STAIRS, Blocks.SMOOTH_RED_SANDSTONE_STAIRS, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SMOOTH_RED_SANDSTONE_STAIRS, Blocks.SMOOTH_SANDSTONE_STAIRS, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_RED_SANDSTONE_SLAB, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.SMOOTH_RED_SANDSTONE_SLAB, Blocks.SMOOTH_SANDSTONE_SLAB, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.CUT_SANDSTONE, Blocks.CUT_RED_SANDSTONE, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.CUT_RED_SANDSTONE, Blocks.CUT_SANDSTONE, Tags.Items.DYES_RED, output);
        paintingRecipes(Blocks.CUT_SANDSTONE_SLAB, Blocks.CUT_RED_SANDSTONE_SLAB, Tags.Items.DYES_YELLOW, output);
        paintingRecipes(Blocks.CUT_RED_SANDSTONE_SLAB, Blocks.CUT_SANDSTONE_SLAB, Tags.Items.DYES_RED, output);

        chimneyRecipes(ModBlocks.STONE_CHIMNEY.get(), Blocks.STONE_BRICKS, output);
        chimneyRecipes(ModBlocks.MOSSY_STONE_CHIMNEY.get(), Blocks.MOSSY_STONE_BRICKS, output);
        chimneyRecipes(ModBlocks.CRACKED_STONE_CHIMNEY.get(), Blocks.CRACKED_STONE_BRICKS, output);
        chimneyRecipes(ModBlocks.DEEPSLATE_CHIMNEY.get(), Blocks.DEEPSLATE, output);
        chimneyRecipes(ModBlocks.CRACKED_DEEPSLATE_CHIMNEY.get(), Blocks.CRACKED_DEEPSLATE_BRICKS, output);
        chimneyRecipes(ModBlocks.BRICKS_CHIMNEY.get(), Blocks.BRICKS, output);
        chimneyRecipes(ModBlocks.MUD_CHIMNEY.get(), Blocks.MUD_BRICKS, output);
        chimneyRecipes(ModBlocks.BLACKSTONE_CHIMNEY.get(), Blocks.POLISHED_BLACKSTONE_BRICKS, output);
        chimneyRecipes(ModBlocks.CRACKED_BLACKSTONE_CHIMNEY.get(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, output);
        flueRecipes(ModBlocks.IRON_FLUE.get(), Tags.Items.INGOTS_IRON, output);
        flueRecipes(ModBlocks.COPPER_FLUE.get(), Tags.Items.INGOTS_COPPER, output);

        simpleSmeltingRecipes(ModBlocks.CRACKED_STONE_CHIMNEY.get(), ModBlocks.STONE_CHIMNEY.get(), output);
        simpleSmeltingRecipes(ModBlocks.CRACKED_BLACKSTONE_CHIMNEY.get(), ModBlocks.BLACKSTONE_CHIMNEY.get(), output);
        simpleSmeltingRecipes(ModBlocks.CRACKED_DEEPSLATE_CHIMNEY.get(), ModBlocks.DEEPSLATE_CHIMNEY.get(), output);
        mossyRecipes(ModBlocks.MOSSY_STONE_CHIMNEY.get(), ModBlocks.STONE_CHIMNEY.get(), output);

        flowerBoxRecipes(ModBlocks.BLACKSTONE_FLOWER_BOX.get(), Blocks.CHISELED_POLISHED_BLACKSTONE, output);
        flowerBoxRecipes(ModBlocks.NETHER_FLOWER_BOX.get(), Blocks.CHISELED_NETHER_BRICKS, output);
        flowerBoxRecipes(ModBlocks.SANDSTONE_FLOWER_BOX.get(), Blocks.CHISELED_SANDSTONE, output);
        flowerBoxRecipes(ModBlocks.RED_SANDSTONE_FLOWER_BOX.get(), Blocks.CHISELED_RED_SANDSTONE, output);
        flowerBoxRecipes(ModBlocks.DEEPSLATE_FLOWER_BOX.get(), Blocks.CHISELED_DEEPSLATE, output);
        flowerBoxRecipes(ModBlocks.STONE_FLOWER_BOX.get(), Blocks.CHISELED_STONE_BRICKS, output);
        flowerBoxRecipes(ModBlocks.QUARTZ_FLOWER_BOX.get(), Blocks.CHISELED_QUARTZ_BLOCK, output);
        flowerBoxRecipes(ModBlocks.TUFF_FLOWER_BOX.get(), Blocks.CHISELED_TUFF_BRICKS, output);

        grateRecipes(ModBlocks.IRON_GRATE.get(), Tags.Items.STORAGE_BLOCKS_IRON, output);

        simpleShapelessRecipes(ModBlocks.STONE_GABION_FENCE.get(), Blocks.COBBLESTONE, ModBlocks.IRON_GRATE.get(), output, "gabion");
        simpleShapelessRecipes(ModBlocks.MOSSY_STONE_GABION_FENCE.get(), Blocks.MOSSY_COBBLESTONE, ModBlocks.IRON_GRATE.get(), output, "gabion");
        simpleShapelessRecipes(ModBlocks.DEEPSLATE_GABION_FENCE.get(), Blocks.COBBLED_DEEPSLATE, ModBlocks.IRON_GRATE.get(), output, "gabion");

        mossyRecipes(ModBlocks.MOSSY_STONE_GABION_FENCE.get(), ModBlocks.STONE_GABION_FENCE, output);

        registerConcreteRecipes(output);
        registerBrickRecipes(output);
        registerBasicColorRecipes(output);
        registerAsphaltPaintingRecipes(output);
        registerSlabRecipes(output);
    }


    public static void registerBasicColorRecipes(RecipeOutput output) {
        for (DyeColor dye : DyeColor.values()) {
            String color = dye.getName();

            CityCraft.LOGGER.info("Create basic color recipes for " + color + " dye");

            String neonLightPath = color + "_neon_light";
            String asphaltPath = color + "_asphalt";
            String asphaltSlabPath = color + "_asphalt_slab";
            String lampPath = color + "_lamp";
            String panePath = color + "_stained_glass_pane";
            String woolPath = color + "_wool";
            String bannerPath = color + "_banner";
            String candlePath = color + "_candle";
            String carpetPath = color + "_carpet";
            String terracottaPath = color + "_terracotta";
            String shulkerPath = color + "_shulker_box";
            String glassPath = color + "_stained_glass";
            String bedPath = color + "_bed";
            String bricksPath = color + "_bricks";

            // name fix
            if (asphaltPath.equals("black_asphalt")) {
                asphaltPath = "asphalt";
            }
            if (asphaltSlabPath.equals("black_asphalt_slab")) {
                asphaltSlabPath = "asphalt_slab";
            }

            Block paneBlock = getBlockOrThrow(ResourceLocation.DEFAULT_NAMESPACE, panePath);
            Block woolBlock = getBlockOrThrow(ResourceLocation.DEFAULT_NAMESPACE, woolPath);
            Block bannerBlock = getBlockOrThrow(ResourceLocation.DEFAULT_NAMESPACE, bannerPath);
            Block candleBlock = getBlockOrThrow(ResourceLocation.DEFAULT_NAMESPACE, candlePath);
            Block carpetBlock = getBlockOrThrow(ResourceLocation.DEFAULT_NAMESPACE, carpetPath);
            Block terracottaBlock = getBlockOrThrow(ResourceLocation.DEFAULT_NAMESPACE, terracottaPath);
            Block shulkerBlock = getBlockOrThrow(ResourceLocation.DEFAULT_NAMESPACE, shulkerPath);
            Block glassBlock = getBlockOrThrow(ResourceLocation.DEFAULT_NAMESPACE, glassPath);
            Block bedBlock = getBlockOrThrow(ResourceLocation.DEFAULT_NAMESPACE, bedPath);
            Block bricksBlock = getBlockOrThrow(References.MODID, bricksPath);
            Block neonLightBlock = getBlockOrThrow(References.MODID, neonLightPath);
            Block lampBlock = getBlockOrThrow(References.MODID, lampPath);
            Block asphaltBlock = getBlockOrThrow(References.MODID, asphaltPath);
            Block asphaltSlab = getBlockOrThrow(References.MODID, asphaltSlabPath);

            paintingRecipes(neonLightBlock, ModItemTags.NEON_LIGHTS, dye.getTag(), output);
            paintingRecipes(lampBlock, ModItemTags.COLORED_LAMPS, dye.getTag(), output);
            paintingRecipes(woolBlock, ItemTags.WOOL, dye.getTag(), output);
            paintingRecipes(bannerBlock, ItemTags.BANNERS, dye.getTag(), output);
            paintingRecipes(candleBlock, ItemTags.CANDLES, dye.getTag(), output);
            paintingRecipes(carpetBlock, ItemTags.WOOL_CARPETS, dye.getTag(), output);
            paintingRecipes(terracottaBlock, ItemTags.TERRACOTTA, dye.getTag(), output);
            paintingRecipes(bedBlock, ItemTags.BEDS, dye.getTag(), output);
            paintingRecipes(shulkerBlock, Tags.Items.SHULKER_BOXES, dye.getTag(), output);
            paintingRecipes(glassBlock, Tags.Items.GLASS_BLOCKS_TINTED, dye.getTag(), output);
            paintingRecipes(asphaltBlock, ModItemTags.BLANK_ASPHALT, dye.getTag(), output);
            paintingRecipes(asphaltSlab, ModItemTags.BLANK_ASPHALT_SLABS, dye.getTag(), output);
            paintingRecipes(bricksBlock, Tags.Items.BRICKS_NORMAL, dye.getTag(), output);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, lampBlock, 1).pattern(" # ").pattern("#X#").pattern(" # ").define('X', Blocks.REDSTONE_LAMP)
                    .define('#', paneBlock).unlockedBy(getHasName(Blocks.REDSTONE_LAMP), has(Blocks.REDSTONE_LAMP)).save(output);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, neonLightBlock, 1).requires(lampBlock).requires(Tags.Items.DUSTS_GLOWSTONE)
                    .requires(Items.BLAZE_POWDER).unlockedBy(getHasName(lampBlock), has(lampBlock)).group("neon_lights").save(output);
        }
    }


    public static void registerAsphaltPaintingRecipes(RecipeOutput output) {
        for (Block block : BuiltInRegistries.BLOCK) {
            ResourceLocation id = BuiltInRegistries.BLOCK.getKey(block);
            CityCraft.LOGGER.info("Create asphalt painting recipes for " + id);

            if (id.getNamespace().equals(References.MODID)) {
                if (id.getPath().contains("asphalt_with_white") && !id.getPath().contains("slab")) {
                    paintingRecipes(block, ModItemTags.MARKED_ASPHALT_CRAFTING_MATERIALS, Tags.Items.DYES_WHITE, output);
                } else if (id.getPath().contains("asphalt_with_white") && id.getPath().contains("slab")) {
                    paintingRecipes(block, ModItemTags.MARKED_ASPHALT_SLAB_CRAFTING_MATERIALS, Tags.Items.DYES_WHITE, output);

                } else if (id.getPath().contains("asphalt_with_yellow") && !id.getPath().contains("slab")) {
                    paintingRecipes(block, ModItemTags.MARKED_ASPHALT_CRAFTING_MATERIALS, Tags.Items.DYED_YELLOW, output);
                } else if (id.getPath().contains("asphalt_with_yellow") && id.getPath().contains("slab")) {
                    paintingRecipes(block, ModItemTags.MARKED_ASPHALT_SLAB_CRAFTING_MATERIALS, Tags.Items.DYED_YELLOW, output);
                }
            }
        }
    }


    public static void registerSlabRecipes(RecipeOutput output) {
        for (Block block : BuiltInRegistries.BLOCK) {
            ResourceLocation id = BuiltInRegistries.BLOCK.getKey(block);

            if (id.getNamespace().equals(References.MODID)) {
                if (BuiltInRegistries.BLOCK.getOptional(ResourceLocation.parse(id + "_slab")).isPresent()) {
                    CityCraft.LOGGER.info("Create slab recipes for " + id);

                    Block slab = BuiltInRegistries.BLOCK.getOptional(ResourceLocation.parse(id + "_slab")).get();

                    slabRecipes(slab, block, output);
                    stoneCuttingRecipes(slab, 2, block, output);
                    ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block, 2).pattern("#").pattern("#").define('#', slab).unlockedBy(getHasName(block), has(block))
                            .save(output, References.MODID + ":" + id.getPath() + "_from_slabs");
                }
            }
        }
    }


    public static void registerConcreteRecipes(RecipeOutput output) {
        for (DyeColor dye : DyeColor.values()) {
            String color = dye.getName();

            CityCraft.LOGGER.info("Create concrete color recipes for " + color + " dye");
            String concrete = "_concrete";

            String basePath = color + concrete;
            String powderPath = color + "_concrete_powder";
            String crackedPath = "cracked_" + color + concrete;
            String mossyPath = "mossy_" + color + concrete;
            String chiseledPath = "chiseled_" + color + concrete;
            String polishedPath = "polished_" + color + concrete;
            String pillarPath = color + concrete + "_pillar";
            String wallPath = color + concrete + "_wall";
            String stairsPath = color + concrete + "_stairs";
            String slabPath = color + concrete + "_slab";
            String buttonPath = color + concrete + "_button";
            String pressurePath = color + concrete + "_pressure_plate";
            String leverPath = color + concrete + "_lever";
            String bricksPath = color + concrete + "_bricks";
            String crackedBricksPath = color + concrete + "_cracked_bricks";
            String reinforcedPath = "reinforced_" + color + concrete;
            String chimneyPath = color + concrete + "_chimney";
            String flowerBoxPath = color + concrete + "_flower_box";

            Block baseBlock = getBlockOrThrow(ResourceLocation.DEFAULT_NAMESPACE, basePath);
            Block powderBlock = getBlockOrThrow(ResourceLocation.DEFAULT_NAMESPACE, powderPath);
            Block crackedBlock = getBlockOrThrow(References.MODID, crackedPath);
            Block mossyBlock = getBlockOrThrow(References.MODID, mossyPath);
            Block chiseledBlock = getBlockOrThrow(References.MODID, chiseledPath);
            Block polishedBlock = getBlockOrThrow(References.MODID, polishedPath);
            Block pillarBlock = getBlockOrThrow(References.MODID, pillarPath);
            Block wallBlock = getBlockOrThrow(References.MODID, wallPath);
            Block stairsBlock = getBlockOrThrow(References.MODID, stairsPath);
            Block slabBlock = getBlockOrThrow(References.MODID, slabPath);
            Block buttonBlock = getBlockOrThrow(References.MODID, buttonPath);
            Block pressureBlock = getBlockOrThrow(References.MODID, pressurePath);
            Block leverBlock = getBlockOrThrow(References.MODID, leverPath);
            Block bricksBlock = getBlockOrThrow(References.MODID, bricksPath);
            Block crackedBricksBlock = getBlockOrThrow(References.MODID, crackedBricksPath);
            Block reinforcedBlock = getBlockOrThrow(References.MODID, reinforcedPath);
            Block chimneyBlock = getBlockOrThrow(References.MODID, chimneyPath);
            Block flowerBoxBlock = getBlockOrThrow(References.MODID, flowerBoxPath);

            simpleSmeltingRecipes(crackedBlock, baseBlock, output);
            simpleSmeltingRecipes(crackedBricksBlock, bricksBlock, output);

            stoneCuttingRecipes(chiseledBlock, 1, baseBlock, output);
            stoneCuttingRecipes(polishedBlock, 1, baseBlock, output);
            stoneCuttingRecipes(pillarBlock, 1, baseBlock, output);
            stoneCuttingRecipes(stairsBlock, 1, baseBlock, output);
            stoneCuttingRecipes(slabBlock, 2, baseBlock, output);
            stoneCuttingRecipes(bricksBlock, 1, baseBlock, output);

            slabRecipes(slabBlock, baseBlock, output);
            stairsRecipes(stairsBlock, baseBlock, output);
            wallRecipes(wallBlock, baseBlock, output);
            mossyRecipes(mossyBlock, baseBlock, output);
            chimneyRecipes(chimneyBlock, baseBlock, output);
            flowerBoxRecipes(flowerBoxBlock, chiseledBlock, output);

            paintingRecipes(baseBlock, Tags.Items.CONCRETES, dye.getTag(), output);
            paintingRecipes(powderBlock, Tags.Items.CONCRETE_POWDERS, dye.getTag(), output);
            paintingRecipes(chiseledBlock, ModItemTags.COLORED_CHISELED_CONCRETE, dye.getTag(), output);
            paintingRecipes(polishedBlock, ModItemTags.COLORED_POLISHED_CONCRETE, dye.getTag(), output);
            paintingRecipes(wallBlock, ModItemTags.COLORED_CONCRETE_WALLS, dye.getTag(), output);
            paintingRecipes(pillarBlock, ModItemTags.COLORED_CONCRETE_PILLARS, dye.getTag(), output);
            paintingRecipes(stairsBlock, ModItemTags.COLORED_CONCRETE_STAIRS, dye.getTag(), output);
            paintingRecipes(slabBlock, ModItemTags.COLORED_CONCRETE_SLABS, dye.getTag(), output);
            paintingRecipes(buttonBlock, ModItemTags.COLORED_CONCRETE_BUTTONS, dye.getTag(), output);
            paintingRecipes(pressureBlock, ModItemTags.COLORED_CONCRETE_PRESSURE_PLATES, dye.getTag(), output);
            paintingRecipes(leverBlock, ModItemTags.COLORED_CONCRETE_LEVERS, dye.getTag(), output);
            paintingRecipes(bricksBlock, ModItemTags.COLORED_CONCRETE_BRICKS, dye.getTag(), output);
            paintingRecipes(crackedBricksBlock, ModItemTags.COLORED_CONCRETE_CRACKED_BRICKS, dye.getTag(), output);
            paintingRecipes(reinforcedBlock, ModItemTags.COLORED_REINFORCED_CONCRETE, dye.getTag(), output);
            paintingRecipes(chimneyBlock, ModItemTags.COLORED_CONCRETE_CHIMNEYS, dye.getTag(), output);
            paintingRecipes(flowerBoxBlock, ModItemTags.COLORED_CONCRETE_FLOWER_BOXES, dye.getTag(), output);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, baseBlock, 1).requires(powderBlock).requires(Tags.Items.BUCKETS_WATER)
                    .unlockedBy("has_" + powderBlock, has(powderBlock)).group("concrete_with_bucket").save(output);
            ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, reinforcedBlock, 1).requires(powderBlock).requires(Items.IRON_BARS).requires(Tags.Items.BUCKETS_WATER)
                    .unlockedBy("has_" + powderBlock, has(powderBlock)).group("reinforced_concrete_with_bucket").save(output);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, polishedBlock, 4).pattern("##").pattern("##").define('#', polishedBlock)
                    .unlockedBy(getHasName(polishedBlock), has(polishedBlock)).save(output);
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bricksBlock, 4).pattern("##").pattern("##").define('#', baseBlock)
                    .unlockedBy(getHasName(baseBlock), has(baseBlock)).save(output);
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pillarBlock, 2).pattern("#").pattern("#").define('#', baseBlock)
                    .unlockedBy(getHasName(baseBlock), has(baseBlock)).save(output);
            ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, buttonBlock, 1).pattern("#").define('#', baseBlock).unlockedBy(getHasName(baseBlock), has(baseBlock)).save(output);
            ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, leverBlock, 1).pattern("I").pattern("#").define('I', Tags.Items.RODS_WOODEN).define('#', baseBlock)
                    .unlockedBy(getHasName(baseBlock), has(baseBlock)).save(output);
            ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pressureBlock, 1).pattern("##").define('#', baseBlock).unlockedBy(getHasName(baseBlock), has(baseBlock))
                    .save(output);
        }
    }


    public static void registerBrickRecipes(RecipeOutput output) {
        for (DyeColor dye : DyeColor.values()) {
            String color = dye.getName();

            CityCraft.LOGGER.info("Create brick color recipes for " + color + " dye");
            String brick = "_brick";

            String basePath = color + brick + "s";
            String stairsPath = color + brick + "_stairs";
            String slabPath = color + brick + "_slab";
            String wallPath = color + brick + "_wall";

            Block baseBlock = getBlockOrThrow(References.MODID, basePath);
            Block stairsBlock = getBlockOrThrow(References.MODID, stairsPath);
            Block slabBlock = getBlockOrThrow(References.MODID, slabPath);
            Block wallBlock = getBlockOrThrow(References.MODID, wallPath);

            stoneCuttingRecipes(stairsBlock, 1, baseBlock, output);
            stoneCuttingRecipes(slabBlock, 2, baseBlock, output);

            slabRecipes(slabBlock, baseBlock, output);
            stairsRecipes(stairsBlock, baseBlock, output);
            wallRecipes(wallBlock, baseBlock, output);

            paintingRecipes(stairsBlock, ModItemTags.COLORED_BRICK_STAIRS, dye.getTag(), output);
            paintingRecipes(slabBlock, ModItemTags.COLORED_BRICK_SLABS, dye.getTag(), output);
            paintingRecipes(wallBlock, ModItemTags.COLORED_BRICK_WALLS, dye.getTag(), output);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, baseBlock, 1).requires(Items.BRICK).requires(Items.BRICK).requires(Items.BRICK).requires(Items.BRICK)
                    .requires(dye.getTag()).unlockedBy(getHasName(Items.BRICK), has(Items.BRICK)).group("colored_bricks_from_dye").save(output);
        }
    }


    private static Block getBlockOrThrow(String namespace, String path) {
        ResourceLocation location = ResourceLocation.parse(namespace + ":" + path);
        Optional<Holder.Reference<Block>> holder = BuiltInRegistries.BLOCK.getHolder(location);
        return holder.map(Holder::value).orElseThrow(() -> new IllegalStateException("Missing required Block in registry: " + location));
    }


    private static Item getItemOrThrow(String namespace, String path) {
        ResourceLocation location = ResourceLocation.parse(namespace + ":" + path);
        Optional<Holder.Reference<Item>> holder = BuiltInRegistries.ITEM.getHolder(location);
        return holder.map(Holder::value).orElseThrow(() -> new IllegalStateException("Missing required Item in registry: " + location));
    }

    private static final String STONE_CUTTING_PATH = References.MODID + ":stonecutting/";


    protected static void slabRecipes(Block result, ItemLike input, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6).pattern("###").define('#', input).unlockedBy(getHasName(input), has(input)).save(output,
                References.MODID + ":slabs/" + BuiltInRegistries.BLOCK.getKey(result).getPath());
    }


    protected static void dyeRecipes(Block result, TagKey<Item> input, TagKey<Item> dye, RecipeOutput output) {
        ResourceLocation location = BuiltInRegistries.BLOCK.getKey(result);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result, 1).requires(input).requires(dye).unlockedBy("has_" + input, has(input))
                .group(location.getPath() + "_dyed").save(output, location + "_from_dye");
    }


    protected static void dyeRecipes(Block result, ItemLike input, TagKey<Item> dye, RecipeOutput output) {
        ResourceLocation location = BuiltInRegistries.BLOCK.getKey(result);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result, 1).requires(input).requires(dye).unlockedBy(getHasName(input), has(input))
                .group(location.getPath() + "_dyed").save(output, location + "_from_dye");
    }


    protected static void stairsRecipes(Block result, ItemLike input, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 4).pattern("#  ").pattern("## ").pattern("###").define('#', input)
                .unlockedBy(getHasName(input), has(input)).save(output, References.MODID + ":stairs/" + BuiltInRegistries.BLOCK.getKey(result).getPath());
    }


    protected static void wallRecipes(Block result, ItemLike input, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6).pattern("###").pattern("###").define('#', input).unlockedBy(getHasName(input), has(input))
                .save(output);
    }


    protected static void grateRecipes(Block result, TagKey<Item> input, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 4).pattern(" # ").pattern("# #").pattern(" # ").define('#', input).unlockedBy("has_" + input, has(input))
                .save(output);
    }


    protected static void mossyRecipes(Block result, ItemLike input, RecipeOutput output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result, 1).requires(input).requires(Blocks.MOSS_BLOCK).unlockedBy(getHasName(input), has(input))
                .group("mossy").save(output, BuiltInRegistries.BLOCK.getKey(result) + "_with_moss");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result, 1).requires(input).requires(Blocks.VINE).unlockedBy(getHasName(input), has(input)).group("mossy")
                .save(output, BuiltInRegistries.BLOCK.getKey(result) + "_with_vines");
    }


    protected static void chimneyRecipes(Block result, ItemLike input, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 3).pattern("# #").pattern("# #").pattern("# #").define('#', input)
                .unlockedBy(getHasName(input), has(input)).save(output);
    }


    protected static void flowerBoxRecipes(Block result, ItemLike input, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 2).pattern("#X#").pattern("###").define('#', input).define('X', ItemTags.DIRT)
                .unlockedBy(getHasName(input), has(input)).save(output);
    }


    protected static void flueRecipes(Block result, TagKey<Item> input, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 3).pattern("# #").pattern("# #").pattern("# #").define('#', input).unlockedBy("has_" + input, has(input))
                .save(output);
    }


    protected static void variableTrafficSignRecipes(Block result, ItemLike input, RecipeOutput output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result, 1).requires(input).requires(ModBlocks.VARIABLE_TRAFFIC_SIGN.get())
                .unlockedBy(getHasName(input), has(input)).group("variable_traffic_signs").save(output);
    }


    protected static void simpleColorRecipes(Block result, TagKey<Item> input, RecipeOutput output) {
        for (DyeColor color : DyeColor.values()) {
            Item dye = DyeItem.byColor(color);
            ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result, 1).requires(input).requires(dye).group(input.toString()).save(output);
        }
    }


    protected static void simpleShapelessRecipes(Block result, ItemLike firstInput, TagKey<Item> secondInput, RecipeOutput output, String group) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result, 1).requires(firstInput).requires(secondInput).unlockedBy("has_" + secondInput, has(secondInput))
                .group(group).save(output);
    }


    protected static void simpleShapelessRecipes(Block result, ItemLike firstInput, ItemLike secondInput, TagKey<Item> thirdInput, RecipeOutput output, String group) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result, 1).requires(firstInput).requires(secondInput).requires(thirdInput)
                .unlockedBy("has_" + secondInput, has(secondInput)).group(group).save(output);
    }


    protected static void simpleShapelessRecipes(Block result, ItemLike firstInput, ItemLike secondInput, RecipeOutput output, String group) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result, 1).requires(firstInput).requires(secondInput).unlockedBy(getHasName(secondInput), has(secondInput))
                .group(group).save(output);
    }


    protected static void simpleSmeltingRecipes(ItemLike result, ItemLike input, RecipeOutput output) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(new ItemLike[]{input}), RecipeCategory.BUILDING_BLOCKS, result, 0.1F, 200).unlockedBy(getHasName(input), has(input))
                .save(output, References.MODID + ":smelting/" + BuiltInRegistries.ITEM.getKey(result.asItem()).getPath());
    }


    protected static void stoneCuttingRecipes(Block result, Integer resultCount, Item input, RecipeOutput output) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, result, resultCount).unlockedBy(getHasName(input), has(input)).save(output,
                STONE_CUTTING_PATH + BuiltInRegistries.BLOCK.getKey(result).getPath());
    }


    protected static void stoneCuttingRecipes(Block result, Integer resultCount, Block input, RecipeOutput output) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, result, resultCount).unlockedBy(getHasName(input), has(input)).save(output,
                STONE_CUTTING_PATH + BuiltInRegistries.BLOCK.getKey(result).getPath());
    }


    protected static void stoneCuttingRecipes(Block result, Integer resultCount, TagKey<Item> input, RecipeOutput output) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, result, resultCount).unlockedBy("has_" + input, has(input)).save(output,
                STONE_CUTTING_PATH + BuiltInRegistries.BLOCK.getKey(result).getPath());
    }


    protected static void paintingRecipes(Block result, Object input, Object color, RecipeOutput output) {
        String resultName = BuiltInRegistries.ITEM.getKey(result.asItem()).getPath();
        String inputName;
        Ingredient inputIngredient;
        Ingredient colorIngredient;

        if (input instanceof Item itemInput) {
            inputName = BuiltInRegistries.ITEM.getKey(itemInput).getPath();
            inputIngredient = Ingredient.of(itemInput);

        } else if (input instanceof Block blockInput) {
            inputName = BuiltInRegistries.ITEM.getKey(blockInput.asItem()).getPath();
            inputIngredient = Ingredient.of(blockInput.asItem());

        } else if (input instanceof TagKey<?> tagInput) {
            inputName = ((TagKey<Item>) tagInput).location().getPath().replace("/", "_") + "_tag";
            inputIngredient = Ingredient.of((TagKey<Item>) tagInput);

        } else {
            throw new IllegalArgumentException("Invalid input type: " + input.getClass().getSimpleName());
        }

        if (color instanceof Item itemColor) {
            colorIngredient = Ingredient.of(itemColor);

        } else if (color instanceof TagKey<?> tagColor) {
            colorIngredient = Ingredient.of((TagKey<Item>) tagColor);

        } else {
            throw new IllegalArgumentException("Invalid color type: " + color.getClass().getSimpleName());
        }

        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(References.MODID, "painting/" + resultName + "_from_" + inputName);
        PaintingRecipe recipe = new PaintingRecipe(id, inputIngredient, colorIngredient, new ItemStack(result));
        output.accept(id, recipe, null);
    }
}
