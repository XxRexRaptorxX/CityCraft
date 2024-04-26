package xxrexraptorxx.citycraft.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import xxrexraptorxx.citycraft.main.References;

public class ModTags {

    public static final TagKey<Item> ROUND_SIGN_TAG = createItemTag("forge", "traffic_signs/round");
    public static final TagKey<Item> TRIANGLE_SIGN_TAG = createItemTag("forge", "traffic_signs/triangle");
    public static final TagKey<Item> RECTANGLE_SIGN_TAG = createItemTag("forge", "traffic_signs/rectangle");
    public static final TagKey<Item> SQUARE_SIGN_TAG = createItemTag("forge", "traffic_signs/square");
    public static final TagKey<Item> RHOMBUS_SIGN_TAG = createItemTag("forge", "traffic_signs/rhombus");
    public static final TagKey<Item> CROSS_SIGN_TAG = createItemTag("forge", "traffic_signs/cross");
    public static final TagKey<Item> BAKE_SIGN_TAG = createItemTag("forge", "traffic_signs/bake");
    public static final TagKey<Item> OCTAGON_SIGN_TAG = createItemTag("forge", "traffic_signs/octagon");
    public static final TagKey<Item> UPSIDE_DOWN_TRIANGLE_SIGN_TAG = createItemTag("forge", "traffic_signs/upside_down_triangle");

    public static final TagKey<Item> CHAINS_TAG = createItemTag("forge", "chains");
    public static final TagKey<Item> IRON_POLES_TAG = createItemTag("forge", "poles/iron");
    public static final TagKey<Item> STONE_POSTS_TAG = createItemTag("forge", "posts/stone");
    public static final TagKey<Item> CONCRETE_WALLS_TAG = createItemTag("forge", "walls/concrete");
    public static final TagKey<Item> BLANK_ASPHALT_TAG = createItemTag(References.MODID, "blank_asphalt");
    public static final TagKey<Item> BLANK_ASPHALT_SLABS_TAG = createItemTag(References.MODID, "blank_asphalt_slabs");
    public static final TagKey<Item> ASPHALT_WITH_WHITE_MARKINGS_TAG = createItemTag(References.MODID, "asphalt_with_white_markings");
    public static final TagKey<Item> ASPHALT_SLABS_WITH_WHITE_MARKINGS_TAG = createItemTag(References.MODID, "asphalt_slabs_with_white_markings");
    public static final TagKey<Item> ASPHALT_WITH_YELLOW_MARKINGS_TAG = createItemTag(References.MODID, "asphalt_with_yellow_markings");
    public static final TagKey<Item> ASPHALT_SLABS_WITH_YELLOW_MARKINGS_TAG = createItemTag(References.MODID, "asphalt_slabs_with_yellow_markings");


    private static TagKey<Item> createItemTag(String id, String name) {
        return ItemTags.create(new ResourceLocation(id, name));
    }

    private static TagKey<Block> createBlockTag(String id, String name) {
        return BlockTags.create(new ResourceLocation(id, name));
    }
}