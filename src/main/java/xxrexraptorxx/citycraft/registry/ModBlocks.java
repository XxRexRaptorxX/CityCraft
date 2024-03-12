package xxrexraptorxx.citycraft.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.citycraft.blocks.AsphaltBlock;
import xxrexraptorxx.citycraft.blocks.AsphaltSlabBlock;
import xxrexraptorxx.citycraft.main.References;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, References.MODID);


    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
    }


    //FULL BLOCKS
    public static final RegistryObject<AsphaltBlock> ASPHALT_BLOCK = registerBlock("asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> WHITE_ASPHALT = registerBlock("white_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ORANGE_ASPHALT = registerBlock("orange_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> MAGENTA_ASPHALT = registerBlock("magenta_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> LIGHT_BLUE_ASPHALT = registerBlock("light_blue_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> YELLOW_ASPHALT = registerBlock("yellow_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> LIME_ASPHALT = registerBlock("lime_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> PINK_ASPHALT = registerBlock("pink_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> GRAY_ASPHALT = registerBlock("gray_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> LIGHT_GRAY_ASPHALT = registerBlock("light_gray_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> CYAN_ASPHALT = registerBlock("cyan_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> PURPLE_ASPHALT = registerBlock("purple_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> BLUE_ASPHALT = registerBlock("blue_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> BROWN_ASPHALT = registerBlock("brown_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> GREEN_ASPHALT = registerBlock("green_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> RED_ASPHALT = registerBlock("red_asphalt", AsphaltBlock::new);

    public static final RegistryObject<AsphaltBlock> CRACKED_ASPHALT = registerBlock("cracked_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> POTHOLE_ASPHALT = registerBlock("pothole_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> MOSSY_ASPHALT = registerBlock("mossy_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> DIRTY_ASPHALT = registerBlock("dirty_asphalt", AsphaltBlock::new);

    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_white_broken_middle_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_MIDDLE_LINE = registerBlock("asphalt_with_white_middle_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE = registerBlock("asphalt_with_white_middle_double_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_white_solid_and_broken_middle_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE = registerBlock("asphalt_with_white_broken_side_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_SIDE_LINE = registerBlock("asphalt_with_white_side_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE = registerBlock("asphalt_with_white_broken_diagonal_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_DIAGONAL_LINE = registerBlock("asphalt_with_white_diagonal_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE = registerBlock("asphalt_with_white_diagonal_double_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_HATCHING = registerBlock("asphalt_with_white_hatching", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_SIDE_DOTS = registerBlock("asphalt_with_white_side_dots", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE = registerBlock("asphalt_with_white_thick_broken_side_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_SIDE_LINE = registerBlock("asphalt_with_white_thick_side_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_FRAME = registerBlock("asphalt_with_white_frame", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_EDGE = registerBlock("asphalt_with_white_edge", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_STRAIGHT_ARROW = registerBlock("asphalt_with_white_straight_arrow", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_LEFT_ARROW = registerBlock("asphalt_with_white_left_arrow", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW = registerBlock("asphalt_with_white_straight_and_left_arrow", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_RIGHT_ARROW = registerBlock("asphalt_with_white_right_arrow", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW = registerBlock("asphalt_with_white_straight_and_right_arrow", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW = registerBlock("asphalt_with_white_double_side_arrow", AsphaltBlock::new);

    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_white_thick_broken_middle_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE = registerBlock("asphalt_with_white_thick_middle_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE = registerBlock("asphalt_with_white_thick_middle_double_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_white_thick_solid_and_broken_middle_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE = registerBlock("asphalt_with_white_thick_broken_diagonal_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE = registerBlock("asphalt_with_white_thick_diagonal_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE = registerBlock("asphalt_with_white_thick_diagonal_double_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_FRAME = registerBlock("asphalt_with_white_thick_frame", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_EDGE = registerBlock("asphalt_with_white_thick_edge", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_HATCHING = registerBlock("asphalt_with_white_thick_hatching", AsphaltBlock::new);

    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_yellow_broken_middle_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_MIDDLE_LINE = registerBlock("asphalt_with_yellow_middle_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE = registerBlock("asphalt_with_yellow_middle_double_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_yellow_solid_and_broken_middle_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE = registerBlock("asphalt_with_yellow_broken_side_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_SIDE_LINE = registerBlock("asphalt_with_yellow_side_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE = registerBlock("asphalt_with_yellow_broken_diagonal_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_DIAGONAL_LINE = registerBlock("asphalt_with_yellow_diagonal_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE = registerBlock("asphalt_with_yellow_diagonal_double_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_HATCHING = registerBlock("asphalt_with_yellow_hatching", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_SIDE_DOTS = registerBlock("asphalt_with_yellow_side_dots", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE = registerBlock("asphalt_with_yellow_thick_broken_side_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_SIDE_LINE = registerBlock("asphalt_with_yellow_thick_side_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_FRAME = registerBlock("asphalt_with_yellow_frame", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_EDGE = registerBlock("asphalt_with_yellow_edge", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_STRAIGHT_ARROW = registerBlock("asphalt_with_yellow_straight_arrow", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_LEFT_ARROW = registerBlock("asphalt_with_yellow_left_arrow", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW = registerBlock("asphalt_with_yellow_straight_and_left_arrow", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_RIGHT_ARROW = registerBlock("asphalt_with_yellow_right_arrow", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW = registerBlock("asphalt_with_yellow_straight_and_right_arrow", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW = registerBlock("asphalt_with_yellow_double_side_arrow", AsphaltBlock::new);

    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_yellow_thick_broken_middle_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE = registerBlock("asphalt_with_yellow_thick_middle_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE = registerBlock("asphalt_with_yellow_thick_middle_double_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_yellow_thick_solid_and_broken_middle_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE = registerBlock("asphalt_with_yellow_thick_broken_diagonal_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE = registerBlock("asphalt_with_yellow_thick_diagonal_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE = registerBlock("asphalt_with_yellow_thick_diagonal_double_line", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_FRAME = registerBlock("asphalt_with_yellow_thick_frame", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_EDGE = registerBlock("asphalt_with_yellow_thick_edge", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_HATCHING = registerBlock("asphalt_with_yellow_thick_hatching", AsphaltBlock::new);

    //SLABS
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_SLAB = registerBlock("asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> WHITE_ASPHALT_SLAB = registerBlock("white_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ORANGE_ASPHALT_SLAB = registerBlock("orange_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> MAGENTA_ASPHALT_SLAB = registerBlock("magenta_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> LIGHT_BLUE_ASPHALT_SLAB = registerBlock("light_blue_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> YELLOW_ASPHALT_SLAB = registerBlock("yellow_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> LIME_ASPHALT_SLAB = registerBlock("lime_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> PINK_ASPHALT_SLAB = registerBlock("pink_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> GRAY_ASPHALT_SLAB = registerBlock("gray_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> LIGHT_GRAY_ASPHALT_SLAB = registerBlock("light_gray_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> CYAN_ASPHALT_SLAB = registerBlock("cyan_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> PURPLE_ASPHALT_SLAB = registerBlock("purple_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> BLUE_ASPHALT_SLAB = registerBlock("blue_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> BROWN_ASPHALT_SLAB = registerBlock("brown_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> GREEN_ASPHALT_SLAB = registerBlock("green_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> RED_ASPHALT_SLAB = registerBlock("red_asphalt_slab", AsphaltSlabBlock::new);

    public static final RegistryObject<AsphaltSlabBlock> CRACKED_ASPHALT_SLAB = registerBlock("cracked_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> POTHOLE_ASPHALT_SLAB = registerBlock("pothole_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> MOSSY_ASPHALT_SLAB = registerBlock("mossy_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> DIRTY_ASPHALT_SLAB = registerBlock("dirty_asphalt_slab", AsphaltSlabBlock::new);

    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_white_broken_middle_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_white_middle_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_white_middle_double_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_white_solid_and_broken_middle_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE_SLAB = registerBlock("asphalt_with_white_broken_side_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_SIDE_LINE_SLAB = registerBlock("asphalt_with_white_side_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_white_broken_diagonal_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_white_diagonal_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_white_diagonal_double_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_HATCHING_SLAB = registerBlock("asphalt_with_white_hatching_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_SIDE_DOTS_SLAB = registerBlock("asphalt_with_white_side_dots_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE_SLAB = registerBlock("asphalt_with_white_thick_broken_side_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_SIDE_LINE_SLAB = registerBlock("asphalt_with_white_thick_side_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_FRAME_SLAB = registerBlock("asphalt_with_white_frame_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_EDGE_SLAB = registerBlock("asphalt_with_white_edge_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_STRAIGHT_ARROW_SLAB = registerBlock("asphalt_with_white_straight_arrow_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_LEFT_ARROW_SLAB = registerBlock("asphalt_with_white_left_arrow_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW_SLAB = registerBlock("asphalt_with_white_straight_and_left_arrow_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_RIGHT_ARROW_SLAB = registerBlock("asphalt_with_white_right_arrow_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW_SLAB = registerBlock("asphalt_with_white_straight_and_right_arrow_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW_SLAB = registerBlock("asphalt_with_white_double_side_arrow_slab", AsphaltSlabBlock::new);

    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_white_thick_broken_middle_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_white_thick_middle_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_white_thick_middle_double_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_white_thick_solid_and_broken_middle_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_white_thick_broken_diagonal_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_white_thick_diagonal_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_white_thick_diagonal_double_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_FRAME_SLAB = registerBlock("asphalt_with_white_thick_frame_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_EDGE_SLAB = registerBlock("asphalt_with_white_thick_edge_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_HATCHING_SLAB = registerBlock("asphalt_with_white_thick_hatching_slab", AsphaltSlabBlock::new);

    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_yellow_broken_middle_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_yellow_middle_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_yellow_middle_double_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_yellow_solid_and_broken_middle_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE_SLAB = registerBlock("asphalt_with_yellow_broken_side_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_SIDE_LINE_SLAB = registerBlock("asphalt_with_yellow_side_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_yellow_broken_diagonal_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_yellow_diagonal_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_yellow_diagonal_double_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_HATCHING_SLAB = registerBlock("asphalt_with_yellow_hatching_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_SIDE_DOTS_SLAB = registerBlock("asphalt_with_yellow_side_dots_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_broken_side_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_SIDE_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_side_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_FRAME_SLAB = registerBlock("asphalt_with_yellow_frame_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_EDGE_SLAB = registerBlock("asphalt_with_yellow_edge_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_STRAIGHT_ARROW_SLAB = registerBlock("asphalt_with_yellow_straight_arrow_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_LEFT_ARROW_SLAB = registerBlock("asphalt_with_yellow_left_arrow_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW_SLAB = registerBlock("asphalt_with_yellow_straight_and_left_arrow_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_RIGHT_ARROW_SLAB = registerBlock("asphalt_with_yellow_right_arrow_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW_SLAB = registerBlock("asphalt_with_yellow_straight_and_right_arrow_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW_SLAB = registerBlock("asphalt_with_yellow_double_side_arrow_slab", AsphaltSlabBlock::new);

    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_broken_middle_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_middle_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_middle_double_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_solid_and_broken_middle_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_broken_diagonal_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_diagonal_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_diagonal_double_line_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_FRAME_SLAB = registerBlock("asphalt_with_yellow_thick_frame_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_EDGE_SLAB = registerBlock("asphalt_with_yellow_thick_edge_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_HATCHING_SLAB = registerBlock("asphalt_with_yellow_thick_hatching_slab", AsphaltSlabBlock::new);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}