package xxrexraptorxx.citycraft.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import xxrexraptorxx.citycraft.main.References;

public class ModTags {

    public static final TagKey<Item> ROUND_SIGN_TAG = createItemTag("c", "traffic_signs/round");
    public static final TagKey<Item> TRIANGLE_SIGN_TAG = createItemTag("c", "traffic_signs/triangle");
    public static final TagKey<Item> RECTANGLE_SIGN_TAG = createItemTag("c", "traffic_signs/rectangle");
    public static final TagKey<Item> SQUARE_SIGN_TAG = createItemTag("c", "traffic_signs/square");
    public static final TagKey<Item> RHOMBUS_SIGN_TAG = createItemTag("c", "traffic_signs/rhombus");
    public static final TagKey<Item> CROSS_SIGN_TAG = createItemTag("c", "traffic_signs/cross");
    public static final TagKey<Item> BAKE_SIGN_TAG = createItemTag("c", "traffic_signs/bake");
    public static final TagKey<Item> OCTAGON_SIGN_TAG = createItemTag("c", "traffic_signs/octagon");
    public static final TagKey<Item> UPSIDE_DOWN_TRIANGLE_SIGN_TAG =
            createItemTag("c", "traffic_signs/upside_down_triangle");

    public static final TagKey<Item> CHAINS_TAG = createItemTag("c", "chains");
    public static final TagKey<Item> IRON_POLES_TAG = createItemTag("c", "poles/iron");
    public static final TagKey<Item> STONE_POSTS_TAG = createItemTag("c", "posts/stone");
    public static final TagKey<Item> CONCRETE_WALLS_TAG = createItemTag("c", "walls/concrete");
    public static final TagKey<Item> BLANK_ASPHALT_TAG = createItemTag(References.MODID, "blank_asphalt");
    public static final TagKey<Item> BLANK_ASPHALT_SLABS_TAG = createItemTag(References.MODID, "blank_asphalt_slabs");
    public static final TagKey<Item> ASPHALT_WITH_WHITE_MARKINGS_TAG =
            createItemTag(References.MODID, "white_marked_asphalt");
    public static final TagKey<Item> ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG =
            createItemTag(References.MODID, "white_marked_asphalt_slabs");
    public static final TagKey<Item> ASPHALT_WITH_YELLOW_MARKINGS_TAG =
            createItemTag(References.MODID, "yellow_marked_asphalt");
    public static final TagKey<Item> ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG =
            createItemTag(References.MODID, "yellow_marked_asphalt_slabs");
    public static final TagKey<Item> CONCRETE_TAG = createItemTag("c", "concrete");
    public static final TagKey<Item> CONCRETE_POWDER_TAG = createItemTag("c", "concrete_powder");
    public static final TagKey<Item> GLAZED_TERRACOTTA_TAG = createItemTag("c", "glazed_terracotta");
    public static final TagKey<Item> SHULKER_BOXES_TAG = createItemTag("c", "shulker_boxes");
    public static final TagKey<Item> SIGNS_TAG = createItemTag("c", "signs");
    public static final TagKey<Item> SIGNS_WOOD_TAG = createItemTag("c", "signs/wood");
    public static final TagKey<Item> HANGING_WOOD_SIGNS_TAG = createItemTag("c", "hanging_signs/wood");

    public static final TagKey<Item> COLORED_LAMPS_TAG = createItemTag(References.MODID, "colored_lamps");
    public static final TagKey<Item> NEON_LIGHTS_TAG = createItemTag(References.MODID, "neon_lights");

    public static final TagKey<Block> TRAFFIC_BARRIERS_TAG = createBlockTag("c", "traffic_barriers");

    private static TagKey<Item> createItemTag(String id, String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(id, name));
    }

    private static TagKey<Block> createBlockTag(String id, String name) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(id, name));
    }
}
