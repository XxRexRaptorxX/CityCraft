package xxrexraptorxx.citycraft.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.citycraft.blocks.*;
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

    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_A = registerBlock("asphalt_with_white_a", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_B = registerBlock("asphalt_with_white_b", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_C = registerBlock("asphalt_with_white_c", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_D = registerBlock("asphalt_with_white_d", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_E = registerBlock("asphalt_with_white_e_", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_F = registerBlock("asphalt_with_white_f", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_G = registerBlock("asphalt_with_white_g", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_H = registerBlock("asphalt_with_white_h", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_I = registerBlock("asphalt_with_white_i", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_J = registerBlock("asphalt_with_white_j", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_K = registerBlock("asphalt_with_white_k", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_L = registerBlock("asphalt_with_white_l", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_M = registerBlock("asphalt_with_white_m", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_N = registerBlock("asphalt_with_white_n", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_O = registerBlock("asphalt_with_white_o", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_P = registerBlock("asphalt_with_white_p", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_Q = registerBlock("asphalt_with_white_q", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_R = registerBlock("asphalt_with_white_r", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_S = registerBlock("asphalt_with_white_s", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_T = registerBlock("asphalt_with_white_t", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_U = registerBlock("asphalt_with_white_u", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_V = registerBlock("asphalt_with_white_v", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_W = registerBlock("asphalt_with_white_w", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_X = registerBlock("asphalt_with_white_x", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_Y = registerBlock("asphalt_with_white_y", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_Z = registerBlock("asphalt_with_white_z", AsphaltBlock::new);

    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_A = registerBlock("asphalt_with_yellow_a", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_B = registerBlock("asphalt_with_yellow_b", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_C = registerBlock("asphalt_with_yellow_c", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_D = registerBlock("asphalt_with_yellow_d", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_E = registerBlock("asphalt_with_yellow_e_", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_F = registerBlock("asphalt_with_yellow_f", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_G = registerBlock("asphalt_with_yellow_g", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_H = registerBlock("asphalt_with_yellow_h", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_I = registerBlock("asphalt_with_yellow_i", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_J = registerBlock("asphalt_with_yellow_j", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_K = registerBlock("asphalt_with_yellow_k", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_L = registerBlock("asphalt_with_yellow_l", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_M = registerBlock("asphalt_with_yellow_m", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_N = registerBlock("asphalt_with_yellow_n", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_O = registerBlock("asphalt_with_yellow_o", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_P = registerBlock("asphalt_with_yellow_p", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_Q = registerBlock("asphalt_with_yellow_q", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_R = registerBlock("asphalt_with_yellow_r", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_S = registerBlock("asphalt_with_yellow_s", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_T = registerBlock("asphalt_with_yellow_t", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_U = registerBlock("asphalt_with_yellow_u", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_V = registerBlock("asphalt_with_yellow_v", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_W = registerBlock("asphalt_with_yellow_w", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_X = registerBlock("asphalt_with_yellow_x", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_Y = registerBlock("asphalt_with_yellow_y", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_YELLOW_Z = registerBlock("asphalt_with_yellow_z", AsphaltBlock::new);


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


    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_A_SLAB = registerBlock("asphalt_with_white_a_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_B_SLAB = registerBlock("asphalt_with_white_b_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_C_SLAB = registerBlock("asphalt_with_white_c_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_D_SLAB = registerBlock("asphalt_with_white_d_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_E_SLAB = registerBlock("asphalt_with_white_e__slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_F_SLAB = registerBlock("asphalt_with_white_f_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_G_SLAB = registerBlock("asphalt_with_white_g_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_H_SLAB = registerBlock("asphalt_with_white_h_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_I_SLAB = registerBlock("asphalt_with_white_i_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_J_SLAB = registerBlock("asphalt_with_white_j_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_K_SLAB = registerBlock("asphalt_with_white_k_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_L_SLAB = registerBlock("asphalt_with_white_l_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_M_SLAB = registerBlock("asphalt_with_white_m_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_N_SLAB = registerBlock("asphalt_with_white_n_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_O_SLAB = registerBlock("asphalt_with_white_o_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_P_SLAB = registerBlock("asphalt_with_white_p_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_Q_SLAB = registerBlock("asphalt_with_white_q_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_R_SLAB = registerBlock("asphalt_with_white_r_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_S_SLAB = registerBlock("asphalt_with_white_s_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_T_SLAB = registerBlock("asphalt_with_white_t_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_U_SLAB = registerBlock("asphalt_with_white_u_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_V_SLAB = registerBlock("asphalt_with_white_v_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_W_SLAB = registerBlock("asphalt_with_white_w_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_X_SLAB = registerBlock("asphalt_with_white_x_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_Y_SLAB = registerBlock("asphalt_with_white_y_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_WHITE_Z_SLAB = registerBlock("asphalt_with_white_z_slab", AsphaltSlabBlock::new);

    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_A_SLAB = registerBlock("asphalt_with_yellow_a_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_B_SLAB = registerBlock("asphalt_with_yellow_b_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_C_SLAB = registerBlock("asphalt_with_yellow_c_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_D_SLAB = registerBlock("asphalt_with_yellow_d_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_E_SLAB = registerBlock("asphalt_with_yellow_e__slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_F_SLAB = registerBlock("asphalt_with_yellow_f_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_G_SLAB = registerBlock("asphalt_with_yellow_g_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_H_SLAB = registerBlock("asphalt_with_yellow_h_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_I_SLAB = registerBlock("asphalt_with_yellow_i_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_J_SLAB = registerBlock("asphalt_with_yellow_j_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_K_SLAB = registerBlock("asphalt_with_yellow_k_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_L_SLAB = registerBlock("asphalt_with_yellow_l_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_M_SLAB = registerBlock("asphalt_with_yellow_m_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_N_SLAB = registerBlock("asphalt_with_yellow_n_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_O_SLAB = registerBlock("asphalt_with_yellow_o_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_P_SLAB = registerBlock("asphalt_with_yellow_p_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_Q_SLAB = registerBlock("asphalt_with_yellow_q_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_R_SLAB = registerBlock("asphalt_with_yellow_r_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_S_SLAB = registerBlock("asphalt_with_yellow_s_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_T_SLAB = registerBlock("asphalt_with_yellow_t_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_U_SLAB = registerBlock("asphalt_with_yellow_u_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_V_SLAB = registerBlock("asphalt_with_yellow_v_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_W_SLAB = registerBlock("asphalt_with_yellow_w_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_X_SLAB = registerBlock("asphalt_with_yellow_x_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_Y_SLAB = registerBlock("asphalt_with_yellow_y_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_Z_SLAB = registerBlock("asphalt_with_yellow_z_slab", AsphaltSlabBlock::new);

    public static final RegistryObject<AsphaltBlock> BOOST_ASPHALT = registerBlock("boost_asphalt", AsphaltBlock::new);
    public static final RegistryObject<AsphaltSlabBlock> BOOST_ASPHALT_SLAB = registerBlock("boost_asphalt_slab", AsphaltSlabBlock::new);
    public static final RegistryObject<BumperSlab> YELLOW_BUMPER_SLAB = registerBlock("yellow_bumper_slab", BumperSlab::new);
    public static final RegistryObject<BumperSlab> RED_BUMPER_SLAB = registerBlock("red_bumper_slab", BumperSlab::new);

    public static final RegistryObject<PoleBlock> IRON_POLE = registerBlock("iron_pole", PoleBlock::new);
    public static final RegistryObject<PoleBlock> RED_POLE = registerBlock("red_pole", PoleBlock::new);
    public static final RegistryObject<PoleBlock> WHITE_POLE = registerBlock("white_pole", PoleBlock::new);
    public static final RegistryObject<PoleBlock> YELLOW_POLE = registerBlock("yellow_pole", PoleBlock::new);
    public static final RegistryObject<PoleBlock> BLACK_POLE = registerBlock("black_pole", PoleBlock::new);
    public static final RegistryObject<PoleBlock> RED_WHITE_POLE = registerBlock("red_white_pole", PoleBlock::new);
    public static final RegistryObject<PoleBlock> YELLOW_BLACK_POLE = registerBlock("yellow_black_pole", PoleBlock::new);
    public static final RegistryObject<DirectionalPoleBlock> ROAD_EDGE_POST = registerBlock("road_edge_post", DirectionalPoleBlock::new);

    public static final RegistryObject<PostBlock> STONE_POST = registerBlock("stone_post", PostBlock::new);
    public static final RegistryObject<PostBlock> RED_POST = registerBlock("red_post", PostBlock::new);
    public static final RegistryObject<PostBlock> WHITE_POST = registerBlock("white_post", PostBlock::new);
    public static final RegistryObject<PostBlock> YELLOW_POST = registerBlock("yellow_post", PostBlock::new);
    public static final RegistryObject<PostBlock> BLACK_POST = registerBlock("black_post", PostBlock::new);
    public static final RegistryObject<PostBlock> RED_WHITE_POST = registerBlock("red_white_post", PostBlock::new);
    public static final RegistryObject<PostBlock> YELLOW_BLACK_POST = registerBlock("yellow_black_post", PostBlock::new);

    public static final RegistryObject<ChainBlock> RED_CHAIN = registerBlock("red_chain", () -> new ChainBlock(BlockBehaviour.Properties.copy(Blocks.CHAIN)));
    public static final RegistryObject<ChainBlock> WHITE_CHAIN = registerBlock("white_chain", () -> new ChainBlock(BlockBehaviour.Properties.copy(Blocks.CHAIN)));
    public static final RegistryObject<ChainBlock> YELLOW_CHAIN = registerBlock("yellow_chain", () -> new ChainBlock(BlockBehaviour.Properties.copy(Blocks.CHAIN)));
    public static final RegistryObject<ChainBlock> BLACK_CHAIN = registerBlock("black_chain", () -> new ChainBlock(BlockBehaviour.Properties.copy(Blocks.CHAIN)));

    public static final RegistryObject<TrafficSignBlock> DANGER_SIGN = registerBlock("danger_sign", TrafficSignBlock::new);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}