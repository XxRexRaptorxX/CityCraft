package xxrexraptorxx.citycraft.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import xxrexraptorxx.citycraft.main.References;

public class ModBlockTags {

    public static final TagKey<Block> BLANK_ASPHALT = createBlockTag(References.MODID, "blank_asphalt");
    public static final TagKey<Block> BLANK_ASPHALT_SLABS = createBlockTag(References.MODID, "blank_asphalt_slabs");
    public static final TagKey<Block> WHITE_MARKED_ASPHALT = createBlockTag(References.MODID, "white_marked_asphalt");
    public static final TagKey<Block> WHITE_MARKED_ASPHALT_SLABS = createBlockTag(References.MODID, "white_marked_asphalt_slabs");
    public static final TagKey<Block> YELLOW_MARKED_ASPHALT = createBlockTag(References.MODID, "yellow_marked_asphalt");
    public static final TagKey<Block> YELLOW_MARKED_ASPHALT_SLABS = createBlockTag(References.MODID, "yellow_marked_asphalt_slabs");
    public static final TagKey<Block> ASPHALT_WITH_MARKINGS = createBlockTag(References.MODID, "asphalt_with_markings");
    public static final TagKey<Block> ASPHALT_SLABS_WITH_MARKINGS = createBlockTag(References.MODID, "asphalt_slabs_with_markings");
    public static final TagKey<Block> ASPHALT = createBlockTag(References.MODID, "asphalt");
    public static final TagKey<Block> TRAFFIC_BARRIERS = createBlockTag(References.MODID, "traffic_barriers");
    public static final TagKey<Block> SPEED_BOOST_BLOCKS = createBlockTag(References.MODID, "blocks_with_speed_boost");
    public static final TagKey<Block> CHIMNEYS = createBlockTag(References.MODID, "chimneys");
    public static final TagKey<Block> FLUES = createBlockTag(References.MODID, "flues");
    public static final TagKey<Block> FLOWER_BOXES = createBlockTag(References.MODID, "flower_boxes");
    public static final TagKey<Block> CHIMNEYS_BOOSTER = createBlockTag(References.MODID, "boost_chimneys");

    public static final TagKey<Block> CONCRETES = createBlockTag("c", "concretes");
    public static final TagKey<Block> LEVERS = createBlockTag("c", "levers");
    public static final TagKey<Block> LAMPS = createBlockTag("c", "lamps");
    public static final TagKey<Block> POLES = createBlockTag("c", "poles/iron");
    public static final TagKey<Block> POSTS = createBlockTag("c", "posts/stone");
    public static final TagKey<Block> BRICKS = createBlockTag("c", "bricks");

    public static TagKey<Block> createBlockTag(String id, String name) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(id, name));
    }
}
