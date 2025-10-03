package xxrexraptorxx.citycraft.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import xxrexraptorxx.citycraft.main.References;

public class ModItemTags {

    public static final TagKey<Item> ROUND_SIGN = createItemTag("c", "traffic_signs/round");
    public static final TagKey<Item> TRIANGLE_SIGN = createItemTag("c", "traffic_signs/triangle");
    public static final TagKey<Item> RECTANGLE_SIGN = createItemTag("c", "traffic_signs/rectangle");
    public static final TagKey<Item> SQUARE_SIGN = createItemTag("c", "traffic_signs/square");
    public static final TagKey<Item> RHOMBUS_SIGN = createItemTag("c", "traffic_signs/rhombus");
    public static final TagKey<Item> CROSS_SIGN = createItemTag("c", "traffic_signs/cross");
    public static final TagKey<Item> BAKE_SIGN = createItemTag("c", "traffic_signs/bake");
    public static final TagKey<Item> OCTAGON_SIGN = createItemTag("c", "traffic_signs/octagon");
    public static final TagKey<Item> UPSIDE_DOWN_TRIANGLE_SIGN = createItemTag("c", "traffic_signs/upside_down_triangle");

    public static final TagKey<Item> CHAINS = createItemTag("c", "chains");
    public static final TagKey<Item> IRON_POLES = createItemTag("c", "poles/iron");
    public static final TagKey<Item> STONE_POSTS = createItemTag("c", "posts/stone");
    public static final TagKey<Item> CONCRETE_WALLS = createItemTag("c", "walls/concrete");
    public static final TagKey<Item> ASPHALT = createItemTag(References.MODID, "asphalt");
    public static final TagKey<Item> BLANK_ASPHALT = createItemTag(References.MODID, "blank_asphalt");
    public static final TagKey<Item> BLANK_ASPHALT_SLABS = createItemTag(References.MODID, "blank_asphalt_slabs");
    public static final TagKey<Item> ASPHALT_WITH_MARKINGS = createItemTag(References.MODID, "asphalt_with_markings");
    public static final TagKey<Item> ASPHALT_SLABS_WITH_MARKINGS = createItemTag(References.MODID, "asphalt_slabs_with_markings");
    public static final TagKey<Item> WHITE_MARKED_ASPHALT = createItemTag(References.MODID, "white_marked_asphalt");
    public static final TagKey<Item> WHITE_MARKED_ASPHALT_SLABS = createItemTag(References.MODID, "white_marked_asphalt_slabs");
    public static final TagKey<Item> YELLOW_MARKED_ASPHALT = createItemTag(References.MODID, "yellow_marked_asphalt");
    public static final TagKey<Item> YELLOW_MARKED_ASPHALT_SLABS = createItemTag(References.MODID, "yellow_marked_asphalt_slabs");

    public static final TagKey<Item> MARKED_ASPHALT_CRAFTING_MATERIALS = createItemTag(References.MODID, "marked_asphalt_crafting_materials");
    public static final TagKey<Item> MARKED_ASPHALT_SLAB_CRAFTING_MATERIALS = createItemTag(References.MODID, "marked_asphalt_crafting_materials");

    public static final TagKey<Item> SIGNS_WOOD = createItemTag("c", "signs/wood");
    public static final TagKey<Item> HANGING_WOOD_SIGNS = createItemTag("c", "hanging_signs/wood");
    public static final TagKey<Item> TRAFFIC_BARRIERS = createItemTag(References.MODID, "traffic_barriers");
    public static final TagKey<Item> POLES = createItemTag("c", "poles/iron");
    public static final TagKey<Item> POSTS = createItemTag("c", "posts/stone");
    public static final TagKey<Item> IRON_RODS = createItemTag("c", "rods/iron");
    public static final TagKey<Item> GABION_FENCES = createItemTag("c", "fences/gabion");
    public static final TagKey<Item> THIN_FENCES = createItemTag("c", "fences/thin");

    public static final TagKey<Item> CHIMNEYS = createItemTag(References.MODID, "chimneys");
    public static final TagKey<Item> FLUES = createItemTag(References.MODID, "flues");
    public static final TagKey<Item> FLOWER_BOXES = createItemTag(References.MODID, "flower_boxes");
    public static final TagKey<Item> COLORED_LAMPS = createItemTag(References.MODID, "colored_lamps");
    public static final TagKey<Item> COLORED_CHISELED_CONCRETE = createItemTag(References.MODID, "colored_chiseled_concrete");
    public static final TagKey<Item> COLORED_CRACKED_CONCRETE = createItemTag(References.MODID, "colored_cracked_concrete");
    public static final TagKey<Item> COLORED_CONCRETE_BUTTONS = createItemTag(References.MODID, "colored_concrete_buttons");
    public static final TagKey<Item> COLORED_MOSSY_CONCRETE = createItemTag(References.MODID, "colored_mossy_concrete");
    public static final TagKey<Item> COLORED_POLISHED_CONCRETE = createItemTag(References.MODID, "colored_polished_concrete");
    public static final TagKey<Item> COLORED_CONCRETE_WALLS = createItemTag(References.MODID, "colored_concrete_walls");
    public static final TagKey<Item> COLORED_CONCRETE_BRICKS = createItemTag(References.MODID, "colored_concrete_bricks");
    public static final TagKey<Item> COLORED_CONCRETE_CRACKED_BRICKS = createItemTag(References.MODID, "colored_cracked_concrete_bricks");
    public static final TagKey<Item> COLORED_CONCRETE_PILLARS = createItemTag(References.MODID, "colored_concrete_pillars");
    public static final TagKey<Item> COLORED_REINFORCED_CONCRETE = createItemTag(References.MODID, "colored_reinforced_concrete");
    public static final TagKey<Item> COLORED_CONCRETE_STAIRS = createItemTag(References.MODID, "colored_concrete_stairs");
    public static final TagKey<Item> COLORED_CONCRETE_SLABS = createItemTag(References.MODID, "colored_concrete_slabs");
    public static final TagKey<Item> COLORED_CONCRETE_PRESSURE_PLATES = createItemTag(References.MODID, "colored_concrete_pressure_plates");
    public static final TagKey<Item> COLORED_CONCRETE_LEVERS = createItemTag(References.MODID, "colored_concrete_levers");
    public static final TagKey<Item> COLORED_CONCRETE_CHIMNEYS = createItemTag(References.MODID, "colored_concrete_chimneys");
    public static final TagKey<Item> COLORED_CONCRETE_FLOWER_BOXES = createItemTag(References.MODID, "colored_concrete_flower_boxes");
    public static final TagKey<Item> COLORED_BRICK_SLABS = createItemTag(References.MODID, "colored_brick_slabs");
    public static final TagKey<Item> COLORED_BRICK_STAIRS = createItemTag(References.MODID, "colored_brick_stairs");
    public static final TagKey<Item> COLORED_BRICK_WALLS = createItemTag(References.MODID, "colored_brick_walls");
    public static final TagKey<Item> COLORED_BRICKS = createItemTag(References.MODID, "colored_bricks");
    public static final TagKey<Item> NEON_LIGHTS = createItemTag(References.MODID, "neon_lights");
    public static final TagKey<Item> SPEED_BOOST_BLOCKS = createItemTag(References.MODID, "blocks_with_speed_boost");


    public static TagKey<Item> createItemTag(String id, String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(id, name));
    }
}
