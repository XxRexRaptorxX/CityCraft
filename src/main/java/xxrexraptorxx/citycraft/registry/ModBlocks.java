package xxrexraptorxx.citycraft.registry;

import java.util.function.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.citycraft.blocks.*;
import xxrexraptorxx.citycraft.blocks.LanternBlock;
import xxrexraptorxx.citycraft.blocks.WallSignBlock;
import xxrexraptorxx.citycraft.main.References;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(References.MODID);

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
    }

    // FULL BLOCKS
    public static final DeferredBlock<AsphaltBlock> ASPHALT_BLOCK = registerBlock("asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> WHITE_ASPHALT = registerBlock("white_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ORANGE_ASPHALT = registerBlock("orange_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> MAGENTA_ASPHALT = registerBlock("magenta_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> LIGHT_BLUE_ASPHALT = registerBlock("light_blue_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> YELLOW_ASPHALT = registerBlock("yellow_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> LIME_ASPHALT = registerBlock("lime_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> PINK_ASPHALT = registerBlock("pink_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> GRAY_ASPHALT = registerBlock("gray_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> LIGHT_GRAY_ASPHALT = registerBlock("light_gray_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> CYAN_ASPHALT = registerBlock("cyan_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> PURPLE_ASPHALT = registerBlock("purple_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> BLUE_ASPHALT = registerBlock("blue_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> BROWN_ASPHALT = registerBlock("brown_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> GREEN_ASPHALT = registerBlock("green_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> RED_ASPHALT = registerBlock("red_asphalt", AsphaltBlock::new);

    public static final DeferredBlock<AsphaltBlock> CRACKED_ASPHALT = registerBlock("cracked_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> POTHOLE_ASPHALT = registerBlock("pothole_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> MOSSY_ASPHALT = registerBlock("mossy_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> DIRTY_ASPHALT = registerBlock("dirty_asphalt", AsphaltBlock::new);

    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_white_broken_middle_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_MIDDLE_LINE = registerBlock("asphalt_with_white_middle_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE = registerBlock("asphalt_with_white_middle_double_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_white_solid_and_broken_middle_line",
            AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE = registerBlock("asphalt_with_white_broken_side_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_SIDE_LINE = registerBlock("asphalt_with_white_side_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_MIDDLE_LEFT_EDGE = registerBlock("asphalt_with_white_middle_left_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_MIDDLE_RIGHT_EDGE = registerBlock("asphalt_with_white_middle_right_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LEFT_EDGE = registerBlock("asphalt_with_white_middle_double_left_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_RIGHT_EDGE = registerBlock("asphalt_with_white_middle_double_right_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE = registerBlock("asphalt_with_white_broken_diagonal_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_DIAGONAL_LINE = registerBlock("asphalt_with_white_diagonal_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE = registerBlock("asphalt_with_white_diagonal_double_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_HATCHING = registerBlock("asphalt_with_white_hatching", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_SIDE_DOTS = registerBlock("asphalt_with_white_side_dots", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE = registerBlock("asphalt_with_white_thick_broken_side_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_SIDE_LINE = registerBlock("asphalt_with_white_thick_side_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_FRAME = registerBlock("asphalt_with_white_frame", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_EDGE = registerBlock("asphalt_with_white_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_STRAIGHT_ARROW = registerBlock("asphalt_with_white_straight_arrow", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_LEFT_ARROW = registerBlock("asphalt_with_white_left_arrow", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW = registerBlock("asphalt_with_white_straight_and_left_arrow", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_RIGHT_ARROW = registerBlock("asphalt_with_white_right_arrow", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW = registerBlock("asphalt_with_white_straight_and_right_arrow", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW = registerBlock("asphalt_with_white_double_side_arrow", AsphaltBlock::new);

    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_white_thick_broken_middle_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE = registerBlock("asphalt_with_white_thick_middle_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE = registerBlock("asphalt_with_white_thick_middle_double_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_white_thick_solid_and_broken_middle_line",
            AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE = registerBlock("asphalt_with_white_thick_broken_diagonal_line",
            AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LEFT_EDGE = registerBlock("asphalt_with_white_thick_middle_double_left_edge",
            AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_RIGHT_EDGE = registerBlock("asphalt_with_white_thick_middle_double_right_edge",
            AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_LEFT_EDGE = registerBlock("asphalt_with_white_thick_middle_left_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_RIGHT_EDGE = registerBlock("asphalt_with_white_thick_middle_right_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE = registerBlock("asphalt_with_white_thick_diagonal_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE = registerBlock("asphalt_with_white_thick_diagonal_double_line",
            AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_FRAME = registerBlock("asphalt_with_white_thick_frame", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_EDGE = registerBlock("asphalt_with_white_thick_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_THICK_HATCHING = registerBlock("asphalt_with_white_thick_hatching", AsphaltBlock::new);

    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_yellow_broken_middle_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_MIDDLE_LINE = registerBlock("asphalt_with_yellow_middle_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE = registerBlock("asphalt_with_yellow_middle_double_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_yellow_solid_and_broken_middle_line",
            AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE = registerBlock("asphalt_with_yellow_broken_side_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_SIDE_LINE = registerBlock("asphalt_with_yellow_side_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE = registerBlock("asphalt_with_yellow_broken_diagonal_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_MIDDLE_LEFT_EDGE = registerBlock("asphalt_with_yellow_middle_left_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_MIDDLE_RIGHT_EDGE = registerBlock("asphalt_with_yellow_middle_right_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LEFT_EDGE = registerBlock("asphalt_with_yellow_middle_double_left_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_RIGHT_EDGE = registerBlock("asphalt_with_yellow_middle_double_right_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_DIAGONAL_LINE = registerBlock("asphalt_with_yellow_diagonal_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE = registerBlock("asphalt_with_yellow_diagonal_double_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_HATCHING = registerBlock("asphalt_with_yellow_hatching", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_SIDE_DOTS = registerBlock("asphalt_with_yellow_side_dots", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE = registerBlock("asphalt_with_yellow_thick_broken_side_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_SIDE_LINE = registerBlock("asphalt_with_yellow_thick_side_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_FRAME = registerBlock("asphalt_with_yellow_frame", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_EDGE = registerBlock("asphalt_with_yellow_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_STRAIGHT_ARROW = registerBlock("asphalt_with_yellow_straight_arrow", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_LEFT_ARROW = registerBlock("asphalt_with_yellow_left_arrow", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW = registerBlock("asphalt_with_yellow_straight_and_left_arrow", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_RIGHT_ARROW = registerBlock("asphalt_with_yellow_right_arrow", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW = registerBlock("asphalt_with_yellow_straight_and_right_arrow", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW = registerBlock("asphalt_with_yellow_double_side_arrow", AsphaltBlock::new);

    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_yellow_thick_broken_middle_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE = registerBlock("asphalt_with_yellow_thick_middle_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE = registerBlock("asphalt_with_yellow_thick_middle_double_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE = registerBlock("asphalt_with_yellow_thick_solid_and_broken_middle_line",
            AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE = registerBlock("asphalt_with_yellow_thick_broken_diagonal_line",
            AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LEFT_EDGE = registerBlock("asphalt_with_yellow_thick_middle_double_left_edge",
            AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_RIGHT_EDGE = registerBlock("asphalt_with_yellow_thick_middle_double_right_edge",
            AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_LEFT_EDGE = registerBlock("asphalt_with_yellow_thick_middle_left_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_RIGHT_EDGE = registerBlock("asphalt_with_yellow_thick_middle_right_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE = registerBlock("asphalt_with_yellow_thick_diagonal_line", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE = registerBlock("asphalt_with_yellow_thick_diagonal_double_line",
            AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_FRAME = registerBlock("asphalt_with_yellow_thick_frame", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_EDGE = registerBlock("asphalt_with_yellow_thick_edge", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_THICK_HATCHING = registerBlock("asphalt_with_yellow_thick_hatching", AsphaltBlock::new);

    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_A = registerBlock("asphalt_with_white_a", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_B = registerBlock("asphalt_with_white_b", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_C = registerBlock("asphalt_with_white_c", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_D = registerBlock("asphalt_with_white_d", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_E = registerBlock("asphalt_with_white_e_", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_F = registerBlock("asphalt_with_white_f", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_G = registerBlock("asphalt_with_white_g", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_H = registerBlock("asphalt_with_white_h", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_I = registerBlock("asphalt_with_white_i", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_J = registerBlock("asphalt_with_white_j", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_K = registerBlock("asphalt_with_white_k", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_L = registerBlock("asphalt_with_white_l", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_M = registerBlock("asphalt_with_white_m", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_N = registerBlock("asphalt_with_white_n", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_O = registerBlock("asphalt_with_white_o", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_P = registerBlock("asphalt_with_white_p", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_Q = registerBlock("asphalt_with_white_q", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_R = registerBlock("asphalt_with_white_r", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_S = registerBlock("asphalt_with_white_s", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_T = registerBlock("asphalt_with_white_t", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_U = registerBlock("asphalt_with_white_u", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_V = registerBlock("asphalt_with_white_v", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_W = registerBlock("asphalt_with_white_w", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_X = registerBlock("asphalt_with_white_x", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_Y = registerBlock("asphalt_with_white_y", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_Z = registerBlock("asphalt_with_white_z", AsphaltBlock::new);

    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_A = registerBlock("asphalt_with_yellow_a", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_B = registerBlock("asphalt_with_yellow_b", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_C = registerBlock("asphalt_with_yellow_c", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_D = registerBlock("asphalt_with_yellow_d", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_E = registerBlock("asphalt_with_yellow_e_", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_F = registerBlock("asphalt_with_yellow_f", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_G = registerBlock("asphalt_with_yellow_g", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_H = registerBlock("asphalt_with_yellow_h", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_I = registerBlock("asphalt_with_yellow_i", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_J = registerBlock("asphalt_with_yellow_j", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_K = registerBlock("asphalt_with_yellow_k", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_L = registerBlock("asphalt_with_yellow_l", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_M = registerBlock("asphalt_with_yellow_m", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_N = registerBlock("asphalt_with_yellow_n", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_O = registerBlock("asphalt_with_yellow_o", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_P = registerBlock("asphalt_with_yellow_p", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_Q = registerBlock("asphalt_with_yellow_q", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_R = registerBlock("asphalt_with_yellow_r", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_S = registerBlock("asphalt_with_yellow_s", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_T = registerBlock("asphalt_with_yellow_t", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_U = registerBlock("asphalt_with_yellow_u", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_V = registerBlock("asphalt_with_yellow_v", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_W = registerBlock("asphalt_with_yellow_w", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_X = registerBlock("asphalt_with_yellow_x", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_Y = registerBlock("asphalt_with_yellow_y", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_Z = registerBlock("asphalt_with_yellow_z", AsphaltBlock::new);

    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_0 = registerBlock("asphalt_with_white_0", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_1 = registerBlock("asphalt_with_white_1", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_2 = registerBlock("asphalt_with_white_2", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_3 = registerBlock("asphalt_with_white_3", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_4 = registerBlock("asphalt_with_white_4", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_5 = registerBlock("asphalt_with_white_5", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_6 = registerBlock("asphalt_with_white_6", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_7 = registerBlock("asphalt_with_white_7", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_8 = registerBlock("asphalt_with_white_8", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_9 = registerBlock("asphalt_with_white_9", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_COMMA = registerBlock("asphalt_with_white_comma", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_DASH = registerBlock("asphalt_with_white_dash", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_DOT = registerBlock("asphalt_with_white_dot", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_EXCLAMATION = registerBlock("asphalt_with_white_exclamation", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_QUESTION = registerBlock("asphalt_with_white_question", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_SLASH = registerBlock("asphalt_with_white_slash", AsphaltBlock::new);

    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_0 = registerBlock("asphalt_with_yellow_0", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_1 = registerBlock("asphalt_with_yellow_1", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_2 = registerBlock("asphalt_with_yellow_2", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_3 = registerBlock("asphalt_with_yellow_3", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_4 = registerBlock("asphalt_with_yellow_4", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_5 = registerBlock("asphalt_with_yellow_5", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_6 = registerBlock("asphalt_with_yellow_6", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_7 = registerBlock("asphalt_with_yellow_7", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_8 = registerBlock("asphalt_with_yellow_8", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_9 = registerBlock("asphalt_with_yellow_9", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_COMMA = registerBlock("asphalt_with_yellow_comma", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_DASH = registerBlock("asphalt_with_yellow_dash", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_DOT = registerBlock("asphalt_with_yellow_dot", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_EXCLAMATION = registerBlock("asphalt_with_yellow_exclamation", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_QUESTION = registerBlock("asphalt_with_yellow_question", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_SLASH = registerBlock("asphalt_with_yellow_slash", AsphaltBlock::new);

    // SLABS
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_SLAB = registerBlock("asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> WHITE_ASPHALT_SLAB = registerBlock("white_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ORANGE_ASPHALT_SLAB = registerBlock("orange_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> MAGENTA_ASPHALT_SLAB = registerBlock("magenta_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> LIGHT_BLUE_ASPHALT_SLAB = registerBlock("light_blue_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> YELLOW_ASPHALT_SLAB = registerBlock("yellow_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> LIME_ASPHALT_SLAB = registerBlock("lime_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> PINK_ASPHALT_SLAB = registerBlock("pink_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> GRAY_ASPHALT_SLAB = registerBlock("gray_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> LIGHT_GRAY_ASPHALT_SLAB = registerBlock("light_gray_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> CYAN_ASPHALT_SLAB = registerBlock("cyan_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> PURPLE_ASPHALT_SLAB = registerBlock("purple_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> BLUE_ASPHALT_SLAB = registerBlock("blue_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> BROWN_ASPHALT_SLAB = registerBlock("brown_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> GREEN_ASPHALT_SLAB = registerBlock("green_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> RED_ASPHALT_SLAB = registerBlock("red_asphalt_slab", AsphaltSlabBlock::new);

    public static final DeferredBlock<AsphaltSlabBlock> CRACKED_ASPHALT_SLAB = registerBlock("cracked_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> POTHOLE_ASPHALT_SLAB = registerBlock("pothole_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> MOSSY_ASPHALT_SLAB = registerBlock("mossy_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> DIRTY_ASPHALT_SLAB = registerBlock("dirty_asphalt_slab", AsphaltSlabBlock::new);

    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_white_broken_middle_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_white_middle_line_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_white_middle_double_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_white_solid_and_broken_middle_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE_SLAB = registerBlock("asphalt_with_white_broken_side_line_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_SIDE_LINE_SLAB = registerBlock("asphalt_with_white_side_line_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_white_broken_diagonal_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LEFT_EDGE_SLAB = registerBlock("asphalt_with_white_middle_double_left_edge_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB = registerBlock("asphalt_with_white_middle_double_right_edge_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_MIDDLE_LEFT_EDGE_SLAB = registerBlock("asphalt_with_white_middle_left_edge_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_MIDDLE_RIGHT_EDGE_SLAB = registerBlock("asphalt_with_white_middle_right_edge_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_white_diagonal_line_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_white_diagonal_double_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_HATCHING_SLAB = registerBlock("asphalt_with_white_hatching_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_SIDE_DOTS_SLAB = registerBlock("asphalt_with_white_side_dots_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE_SLAB = registerBlock("asphalt_with_white_thick_broken_side_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_SIDE_LINE_SLAB = registerBlock("asphalt_with_white_thick_side_line_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_FRAME_SLAB = registerBlock("asphalt_with_white_frame_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_EDGE_SLAB = registerBlock("asphalt_with_white_edge_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_STRAIGHT_ARROW_SLAB = registerBlock("asphalt_with_white_straight_arrow_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_LEFT_ARROW_SLAB = registerBlock("asphalt_with_white_left_arrow_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW_SLAB = registerBlock("asphalt_with_white_straight_and_left_arrow_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_RIGHT_ARROW_SLAB = registerBlock("asphalt_with_white_right_arrow_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW_SLAB = registerBlock("asphalt_with_white_straight_and_right_arrow_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW_SLAB = registerBlock("asphalt_with_white_double_side_arrow_slab",
            AsphaltSlabBlock::new);

    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_white_thick_broken_middle_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_white_thick_middle_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_white_thick_middle_double_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB = registerBlock(
            "asphalt_with_white_thick_solid_and_broken_middle_line_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_white_thick_broken_diagonal_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LEFT_EDGE_SLAB = registerBlock(
            "asphalt_with_white_thick_middle_double_left_edge_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB = registerBlock(
            "asphalt_with_white_thick_middle_double_right_edge_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_LEFT_EDGE_SLAB = registerBlock("asphalt_with_white_thick_middle_left_edge_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_MIDDLE_RIGHT_EDGE_SLAB = registerBlock("asphalt_with_white_thick_middle_right_edge_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_white_thick_diagonal_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_white_thick_diagonal_double_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_FRAME_SLAB = registerBlock("asphalt_with_white_thick_frame_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_EDGE_SLAB = registerBlock("asphalt_with_white_thick_edge_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_THICK_HATCHING_SLAB = registerBlock("asphalt_with_white_thick_hatching_slab", AsphaltSlabBlock::new);

    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_yellow_broken_middle_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_yellow_middle_line_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_yellow_middle_double_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB = registerBlock(
            "asphalt_with_yellow_solid_and_broken_middle_line_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE_SLAB = registerBlock("asphalt_with_yellow_broken_side_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_SIDE_LINE_SLAB = registerBlock("asphalt_with_yellow_side_line_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_yellow_broken_diagonal_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LEFT_EDGE_SLAB = registerBlock("asphalt_with_yellow_middle_double_left_edge_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB = registerBlock("asphalt_with_yellow_middle_double_right_edge_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_MIDDLE_LEFT_EDGE_SLAB = registerBlock("asphalt_with_yellow_middle_left_edge_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_MIDDLE_RIGHT_EDGE_SLAB = registerBlock("asphalt_with_yellow_middle_right_edge_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_yellow_diagonal_line_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_yellow_diagonal_double_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_HATCHING_SLAB = registerBlock("asphalt_with_yellow_hatching_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_SIDE_DOTS_SLAB = registerBlock("asphalt_with_yellow_side_dots_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_broken_side_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_SIDE_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_side_line_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_FRAME_SLAB = registerBlock("asphalt_with_yellow_frame_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_EDGE_SLAB = registerBlock("asphalt_with_yellow_edge_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_STRAIGHT_ARROW_SLAB = registerBlock("asphalt_with_yellow_straight_arrow_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_LEFT_ARROW_SLAB = registerBlock("asphalt_with_yellow_left_arrow_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW_SLAB = registerBlock("asphalt_with_yellow_straight_and_left_arrow_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_RIGHT_ARROW_SLAB = registerBlock("asphalt_with_yellow_right_arrow_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW_SLAB = registerBlock("asphalt_with_yellow_straight_and_right_arrow_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW_SLAB = registerBlock("asphalt_with_yellow_double_side_arrow_slab",
            AsphaltSlabBlock::new);

    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_broken_middle_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_middle_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_middle_double_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB = registerBlock(
            "asphalt_with_yellow_thick_solid_and_broken_middle_line_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_broken_diagonal_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LEFT_EDGE_SLAB = registerBlock(
            "asphalt_with_yellow_thick_middle_double_left_edge_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB = registerBlock(
            "asphalt_with_yellow_thick_middle_double_right_edge_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_LEFT_EDGE_SLAB = registerBlock("asphalt_with_yellow_thick_middle_left_edge_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_MIDDLE_RIGHT_EDGE_SLAB = registerBlock("asphalt_with_yellow_thick_middle_right_edge_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_diagonal_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE_SLAB = registerBlock("asphalt_with_yellow_thick_diagonal_double_line_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_FRAME_SLAB = registerBlock("asphalt_with_yellow_thick_frame_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_EDGE_SLAB = registerBlock("asphalt_with_yellow_thick_edge_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_THICK_HATCHING_SLAB = registerBlock("asphalt_with_yellow_thick_hatching_slab", AsphaltSlabBlock::new);

    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_A_SLAB = registerBlock("asphalt_with_white_a_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_B_SLAB = registerBlock("asphalt_with_white_b_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_C_SLAB = registerBlock("asphalt_with_white_c_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_D_SLAB = registerBlock("asphalt_with_white_d_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_E_SLAB = registerBlock("asphalt_with_white_e__slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_F_SLAB = registerBlock("asphalt_with_white_f_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_G_SLAB = registerBlock("asphalt_with_white_g_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_H_SLAB = registerBlock("asphalt_with_white_h_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_I_SLAB = registerBlock("asphalt_with_white_i_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_J_SLAB = registerBlock("asphalt_with_white_j_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_K_SLAB = registerBlock("asphalt_with_white_k_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_L_SLAB = registerBlock("asphalt_with_white_l_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_M_SLAB = registerBlock("asphalt_with_white_m_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_N_SLAB = registerBlock("asphalt_with_white_n_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_O_SLAB = registerBlock("asphalt_with_white_o_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_P_SLAB = registerBlock("asphalt_with_white_p_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_Q_SLAB = registerBlock("asphalt_with_white_q_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_R_SLAB = registerBlock("asphalt_with_white_r_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_S_SLAB = registerBlock("asphalt_with_white_s_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_T_SLAB = registerBlock("asphalt_with_white_t_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_U_SLAB = registerBlock("asphalt_with_white_u_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_V_SLAB = registerBlock("asphalt_with_white_v_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_W_SLAB = registerBlock("asphalt_with_white_w_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_X_SLAB = registerBlock("asphalt_with_white_x_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_Y_SLAB = registerBlock("asphalt_with_white_y_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_Z_SLAB = registerBlock("asphalt_with_white_z_slab", AsphaltSlabBlock::new);

    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_A_SLAB = registerBlock("asphalt_with_yellow_a_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_B_SLAB = registerBlock("asphalt_with_yellow_b_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_C_SLAB = registerBlock("asphalt_with_yellow_c_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_D_SLAB = registerBlock("asphalt_with_yellow_d_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_E_SLAB = registerBlock("asphalt_with_yellow_e__slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_F_SLAB = registerBlock("asphalt_with_yellow_f_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_G_SLAB = registerBlock("asphalt_with_yellow_g_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_H_SLAB = registerBlock("asphalt_with_yellow_h_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_I_SLAB = registerBlock("asphalt_with_yellow_i_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_J_SLAB = registerBlock("asphalt_with_yellow_j_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_K_SLAB = registerBlock("asphalt_with_yellow_k_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_L_SLAB = registerBlock("asphalt_with_yellow_l_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_M_SLAB = registerBlock("asphalt_with_yellow_m_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_N_SLAB = registerBlock("asphalt_with_yellow_n_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_O_SLAB = registerBlock("asphalt_with_yellow_o_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_P_SLAB = registerBlock("asphalt_with_yellow_p_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_Q_SLAB = registerBlock("asphalt_with_yellow_q_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_R_SLAB = registerBlock("asphalt_with_yellow_r_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_S_SLAB = registerBlock("asphalt_with_yellow_s_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_T_SLAB = registerBlock("asphalt_with_yellow_t_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_U_SLAB = registerBlock("asphalt_with_yellow_u_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_V_SLAB = registerBlock("asphalt_with_yellow_v_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_W_SLAB = registerBlock("asphalt_with_yellow_w_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_X_SLAB = registerBlock("asphalt_with_yellow_x_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_Y_SLAB = registerBlock("asphalt_with_yellow_y_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_Z_SLAB = registerBlock("asphalt_with_yellow_z_slab", AsphaltSlabBlock::new);

    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_0_SLAB = registerBlock("asphalt_with_white_0_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_1_SLAB = registerBlock("asphalt_with_white_1_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_2_SLAB = registerBlock("asphalt_with_white_2_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_3_SLAB = registerBlock("asphalt_with_white_3_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_4_SLAB = registerBlock("asphalt_with_white_4_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_5_SLAB = registerBlock("asphalt_with_white_5_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_6_SLAB = registerBlock("asphalt_with_white_6_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_7_SLAB = registerBlock("asphalt_with_white_7_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_8_SLAB = registerBlock("asphalt_with_white_8_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_9_SLAB = registerBlock("asphalt_with_white_9_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_COMMA_SLAB = registerBlock("asphalt_with_white_comma_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_DASH_SLAB = registerBlock("asphalt_with_white_dash_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_DOT_SLAB = registerBlock("asphalt_with_white_dot_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_EXCLAMATION_SLAB = registerBlock("asphalt_with_white_exclamation_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_QUESTION_SLAB = registerBlock("asphalt_with_white_question_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_SLASH_SLAB = registerBlock("asphalt_with_white_slash_slab", AsphaltSlabBlock::new);

    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_0_SLAB = registerBlock("asphalt_with_yellow_0_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_1_SLAB = registerBlock("asphalt_with_yellow_1_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_2_SLAB = registerBlock("asphalt_with_yellow_2_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_3_SLAB = registerBlock("asphalt_with_yellow_3_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_4_SLAB = registerBlock("asphalt_with_yellow_4_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_5_SLAB = registerBlock("asphalt_with_yellow_5_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_6_SLAB = registerBlock("asphalt_with_yellow_6_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_7_SLAB = registerBlock("asphalt_with_yellow_7_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_8_SLAB = registerBlock("asphalt_with_yellow_8_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_9_SLAB = registerBlock("asphalt_with_yellow_9_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_COMMA_SLAB = registerBlock("asphalt_with_yellow_comma_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_DASH_SLAB = registerBlock("asphalt_with_yellow_dash_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_DOT_SLAB = registerBlock("asphalt_with_yellow_dot_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_EXCLAMATION_SLAB = registerBlock("asphalt_with_yellow_exclamation_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_QUESTION_SLAB = registerBlock("asphalt_with_yellow_question_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_SLASH_SLAB = registerBlock("asphalt_with_yellow_slash_slab", AsphaltSlabBlock::new);

    public static final DeferredBlock<AsphaltBlock> BOOST_ASPHALT = registerBlock("boost_asphalt", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> BOOST_ASPHALT_SLAB = registerBlock("boost_asphalt_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<BumperSlab> YELLOW_BUMPER_SLAB = registerBlock("yellow_bumper_slab", BumperSlab::new);
    public static final DeferredBlock<BumperSlab> RED_BUMPER_SLAB = registerBlock("red_bumper_slab", BumperSlab::new);

    public static final DeferredBlock<PoleBlock> IRON_POLE = registerBlock("iron_pole", PoleBlock::new);
    public static final DeferredBlock<RedstonePoleBlock> REDSTONE_POLE = registerBlock("redstone_pole", RedstonePoleBlock::new);
    public static final DeferredBlock<PoleBlock> RED_POLE = registerBlock("red_pole", PoleBlock::new);
    public static final DeferredBlock<PoleBlock> WHITE_POLE = registerBlock("white_pole", PoleBlock::new);
    public static final DeferredBlock<PoleBlock> YELLOW_POLE = registerBlock("yellow_pole", PoleBlock::new);
    public static final DeferredBlock<PoleBlock> BLACK_POLE = registerBlock("black_pole", PoleBlock::new);
    public static final DeferredBlock<PoleBlock> RED_WHITE_POLE = registerBlock("red_white_pole", PoleBlock::new);
    public static final DeferredBlock<PoleBlock> YELLOW_BLACK_POLE = registerBlock("yellow_black_pole", PoleBlock::new);
    public static final DeferredBlock<DirectionalPoleBlock> ROAD_EDGE_POST = registerBlock("road_edge_post", DirectionalPoleBlock::new);
    public static final DeferredBlock<DirectionalPoleBlock> ORANGE_ROAD_EDGE_POST = registerBlock("orange_road_edge_post", DirectionalPoleBlock::new);

    public static final DeferredBlock<PostBlock> STONE_POST = registerBlock("stone_post", PostBlock::new);
    public static final DeferredBlock<PostBlock> RED_POST = registerBlock("red_post", PostBlock::new);
    public static final DeferredBlock<PostBlock> WHITE_POST = registerBlock("white_post", PostBlock::new);
    public static final DeferredBlock<PostBlock> YELLOW_POST = registerBlock("yellow_post", PostBlock::new);
    public static final DeferredBlock<PostBlock> BLACK_POST = registerBlock("black_post", PostBlock::new);
    public static final DeferredBlock<PostBlock> RED_WHITE_POST = registerBlock("red_white_post", PostBlock::new);
    public static final DeferredBlock<PostBlock> YELLOW_BLACK_POST = registerBlock("yellow_black_post", PostBlock::new);

    public static final DeferredBlock<ChainBlock> RED_CHAIN = registerBlock("red_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)));
    public static final DeferredBlock<ChainBlock> WHITE_CHAIN = registerBlock("white_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)));
    public static final DeferredBlock<ChainBlock> YELLOW_CHAIN = registerBlock("yellow_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)));
    public static final DeferredBlock<ChainBlock> BLACK_CHAIN = registerBlock("black_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)));

    public static final DeferredBlock<TrafficSignBlock> LEFT_ARROW_EU_SIGN = registerBlock("left_arrow_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CAMPING_EU_SIGN = registerBlock("camping_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PR_EU_SIGN = registerBlock("pr_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PRIORITY_ROAD_EU_SIGN = registerBlock("priority_road_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HIGHWAY_EU_SIGN = registerBlock("highway_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_NARROWING_EU_SIGN = registerBlock("left_narrowing_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CHURCH_EU_SIGN = registerBlock("church_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_PARKING_EU_SIGN = registerBlock("no_parking_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PARKING_EU_SIGN = registerBlock("parking_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NARROWING_EU_SIGN = registerBlock("narrowing_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_CARS_EU_SIGN = registerBlock("no_cars_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_TRUCK_PASSING_END_EU_SIGN = registerBlock("no_truck_passing_end_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> ONGOING_TRAFFIC_EU_SIGN = registerBlock("ongoing_traffic_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DETOUR_RIGHT_EU_SIGN = registerBlock("detour_right_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> END_ALL_LIMITS_EU_SIGN = registerBlock("end_all_limits_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_DIRECTION_EU_SIGN = registerBlock("left_direction_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_PASSING_EU_SIGN = registerBlock("no_passing_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_CURVE_EU_SIGN = registerBlock("left_curve_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CATTLE_EU_SIGN = registerBlock("cattle_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CAFE_EU_SIGN = registerBlock("cafe_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_VEHICLES_EU_SIGN = registerBlock("no_vehicles_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DETOUR_AHEAD_EU_SIGN = registerBlock("detour_ahead_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_TRUCKS_EU_SIGN = registerBlock("no_trucks_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BUS_EU_SIGN = registerBlock("bus_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DANGER_EU_SIGN = registerBlock("danger_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_ENTER_EU_SIGN = registerBlock("no_enter_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> INTERSECTION_EU_SIGN = registerBlock("intersection_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> EIGHTY_SPEED_EU_SIGN = registerBlock("80_speed_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> ASCEND_EU_SIGN = registerBlock("ascend_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CYCLES_EU_SIGN = registerBlock("cycles_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> EMERGENCY_BAY_EU_SIGN = registerBlock("emergency_bay_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_PEDESTRIANS_EU_SIGN = registerBlock("no_pedestrians_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PASS_LEFT_EU_SIGN = registerBlock("pass_left_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DESCEND_EU_SIGN = registerBlock("descend_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> FIRST_AID_EU_SIGN = registerBlock("first_aid_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_BICYCLES_EU_SIGN = registerBlock("no_bicycles_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PRIORITY_OVER_ONCOMING_TRAFFIC_EU_SIGN = registerBlock("priority_over_oncoming_traffic_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_THROUGH_ROAD_EU_SIGN = registerBlock("no_through_road_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CREEPER_EU_SIGN = registerBlock("creeper_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PRIORITY_ROAD_END_EU_SIGN = registerBlock("priority_road_end_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_DOUBLE_CURVE_EU_SIGN = registerBlock("left_double_curve_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BICYCLE_PATH_EU_SIGN = registerBlock("bicycle_path_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> JAMS_EU_SIGN = registerBlock("jams_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> KM_AHEAD_EU_SIGN = registerBlock("km_ahead_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_PASSING_END_EU_SIGN = registerBlock("no_passing_end_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_TRUCK_PASSING_EU_SIGN = registerBlock("no_truck_passing_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> END_LINE_EU_SIGN = registerBlock("end_line_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PASS_RIGHT_EU_SIGN = registerBlock("pass_right_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_PARKING_ALONG_CARRIAGEWAY_EU_SIGN = registerBlock("no_parking_along_carriageway_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SIXTY_SPEED_EU_SIGN = registerBlock("60_speed_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PEDESTRIANS_EU_SIGN = registerBlock("pedestrians_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CALMING_AREA_EU_SIGN = registerBlock("calming_area_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_TURN_ARROW_EU_SIGN = registerBlock("left_turn_arrow_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> ONCOMING_TRAFFIC_EU_SIGN = registerBlock("oncoming_traffic_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_HERE_EU_SIGN = registerBlock("left_here_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PRIORITY_EU_SIGN = registerBlock("priority_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DETOUR_LEFT_EU_SIGN = registerBlock("detour_left_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> ONE_WAY_EU_SIGN = registerBlock("one_way_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BUS_STOP_EU_SIGN = registerBlock("bus_stop_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HIGHWAY_END_EU_SIGN = registerBlock("highway_end_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PEDESTRIAN_CROSSING_EU_SIGN = registerBlock("pedestrian_crossing_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> INFO_EU_SIGN = registerBlock("info_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DISABLED_EU_SIGN = registerBlock("disabled_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> TEN_SPEED_EU_SIGN = registerBlock("10_speed_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CROSSBUCK_EU_SIGN = registerBlock("crossbuck_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> THIRTY_SPEED_EU_SIGN = registerBlock("30_speed_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HOTEL_EU_SIGN = registerBlock("hotel_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> GATE_EU_SIGN = registerBlock("gate_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PETROL_STATION_EU_SIGN = registerBlock("petrol_station_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CHILDREN_EU_SIGN = registerBlock("children_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CROSSWALK_EU_SIGN = registerBlock("crosswalk_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> END_CALMING_AREA_EU_SIGN = registerBlock("end_calming_area_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> GUIDE_EU_SIGN = registerBlock("guide_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PARKING_GARAGE_EU_EU_SIGN = registerBlock("parking_garage_eu_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_RIGHT_EU_SIGN = registerBlock("left_right_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HUNDRED_SPEED_EU_SIGN = registerBlock("100_speed_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_U_TURN_EU_SIGN = registerBlock("no_u_turn_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HUNDRED_TWENTY_SPEED_EU_SIGN = registerBlock("120_speed_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RAILROAD_EU_SIGN = registerBlock("railroad_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> REPAIR_EU_SIGN = registerBlock("repair_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RESTAURANT_EU_SIGN = registerBlock("restaurant_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_ARROW_EU_SIGN = registerBlock("right_arrow_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_CURVE_EU_SIGN = registerBlock("right_curve_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_DIRECTION_EU_SIGN = registerBlock("right_direction_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_DOUBLE_CURVE_EU_SIGN = registerBlock("right_double_curve_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_HERE_EU_SIGN = registerBlock("right_here_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_NARROWING_EU_SIGN = registerBlock("right_narrowing_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_TURN_ARROW_EU_SIGN = registerBlock("right_turn_arrow_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> ROADWORKS_EU_SIGN = registerBlock("roadworks_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> ROCKFALL_EU_SIGN = registerBlock("rockfall_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> ROUNDABOUT_EU_SIGN = registerBlock("roundabout_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SIDEWALK_EU_SIGN = registerBlock("sidewalk_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SIGNAL_EU_SIGN = registerBlock("signal_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SLIPPERINESS_EU_SIGN = registerBlock("slipperiness_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SNOW_EU_SIGN = registerBlock("snow_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> STOP_EU_SIGN = registerBlock("stop_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> STRAIGHT_AHEAD_EU_SIGN = registerBlock("straight_ahead_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> STRAIGHT_LEFT_EU_SIGN = registerBlock("straight_left_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> STRAIGHT_RIGHT_EU_SIGN = registerBlock("straight_right_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> TAXI_EU_SIGN = registerBlock("taxi_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> TELEPHONE_EU_SIGN = registerBlock("telephone_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> UNEVEN_EU_SIGN = registerBlock("uneven_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> WARN_EU_SIGN = registerBlock("warn_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> WARNING_BEACON_ALT_EU_SIGN = registerBlock("warning_beacon_alt_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> WARNING_BEACON_RIGHT_EU_SIGN = registerBlock("warning_beacon_right_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> WARNING_BEACON_LEFT_EU_SIGN = registerBlock("warning_beacon_left_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> WC_EU_SIGN = registerBlock("wc_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> WEIGHT_EU_SIGN = registerBlock("weight_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> WET_EU_SIGN = registerBlock("wet_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> YIELD_RIGHT_OF_WAY_EU_SIGN = registerBlock("yield_right_of_way_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NATURE_RESERVE_EU_SIGN = registerBlock("nature_reserve_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> MOTORWAY_EU_SIGN = registerBlock("motorway_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> MOTORWAY_END_EU_SIGN = registerBlock("motorway_end_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> WATER_PROTECTION_AREA_EU_SIGN = registerBlock("water_protection_area_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_AHEAD_EU_SIGN = registerBlock("left_ahead_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_AHEAD_EU_SIGN = registerBlock("right_ahead_eu_sign", TrafficSignBlock::new);

    public static final DeferredBlock<TrafficSignBlock> REPAIR_US_SIGN = registerBlock("repair_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HILL_US_SIGN = registerBlock("hill_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> GUIDE_US_SIGN = registerBlock("guide_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_ADDED_LINE_US_SIGN = registerBlock("left_added_line_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> INFO_US_SIGN = registerBlock("info_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_ENTERING_ROADWAY_MERGE_US_SIGN = registerBlock("left_entering_roadway_merge_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_ARROW_GREEN_US_SIGN = registerBlock("left_arrow_green_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DOUBLE_ARROW_ORANGE_US_SIGN = registerBlock("double_arrow_orange_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HOTEL_US_SIGN = registerBlock("hotel_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PEDESTRIANS_CROSSING_US_SIGN = registerBlock("pedestrians_crossing_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_ARROW_GREEN_US_SIGN = registerBlock("right_arrow_green_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_BICYCLE_US_SIGN = registerBlock("no_bicycle_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_LANE_ENDS_US_SIGN = registerBlock("left_lane_ends_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_DIAGONAL_ARROW_GREEN_US_SIGN = registerBlock("right_diagonal_arrow_green_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_TURN_US_SIGN = registerBlock("left_turn_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HANDICAPPED_ACCESSIBLE_US_SIGN = registerBlock("handicapped_accessible_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RESTAURANT_US_SIGN = registerBlock("restaurant_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HAIRPIN_CURVE_US_SIGN = registerBlock("hairpin_curve_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> AIRPORT_US_SIGN = registerBlock("airport_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_DIRECTION_US_SIGN = registerBlock("left_direction_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RAILROAD_CROSSING_US_SIGN = registerBlock("railroad_crossing_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_ENTERING_ROADWAY_MERGE_US_SIGN = registerBlock("right_entering_roadway_merge_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DRINKING_WATER_US_SIGN = registerBlock("drinking_water_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CRAFT_CITY_EU_SIGN = registerBlock("craft_city_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_LEFT_TURN_US_SIGN = registerBlock("no_left_turn_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_DIAGONAL_ARROW_ORANGE_US_SIGN = registerBlock("left_diagonal_arrow_orange_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BATHROOMS_US_SIGN = registerBlock("bathrooms_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LITTER_BARREL_US_SIGN = registerBlock("litter_barrel_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_TRUCKS_US_SIGN = registerBlock("no_trucks_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_TURN_ONLY_US_SIGN = registerBlock("left_turn_only_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> FORTYFIVE_ADVISORY_SPEED_US_SIGN = registerBlock("45_advisory_speed_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LIGHT_RAIL_TRANSIT_STATION_US_SIGN = registerBlock("light_rail_transit_station_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CRAFT_CITY_END_EU_SIGN = registerBlock("craft_city_end_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HOSPITAL_US_SIGN = registerBlock("hospital_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> GAS_STATION_US_SIGN = registerBlock("gas_station_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CATTLE_US_SIGN = registerBlock("cattle_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HANDICAPED_CROSSING_US_SIGN = registerBlock("handicaped_crossing_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PICNIC_AREA_US_SIGN = registerBlock("picnic_area_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_U_TURN_US_SIGN = registerBlock("no_u_turn_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_DIAGONAL_ARROW_ORANGE_US_SIGN = registerBlock("right_diagonal_arrow_orange_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_ADDED_LINE_US_SIGN = registerBlock("right_added_line_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_LANE_ENDS_US_SIGN = registerBlock("right_lane_ends_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_SIDE_ROAD_US_SIGN = registerBlock("left_side_road_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PLAYGROUND_AHEAD_US_SIGN = registerBlock("playground_ahead_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DIESEL_STATION_US_SIGN = registerBlock("diesel_station_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> THIRTYFIVE_ADVISORY_SPEED_US_SIGN = registerBlock("35_advisory_speed_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_DIAGONAL_ARROW_YELLOW_US_SIGN = registerBlock("left_diagonal_arrow_yellow_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CREEPER_US_SIGN = registerBlock("creeper_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_DIAGONAL_ARROW_GREEN_US_SIGN = registerBlock("left_diagonal_arrow_green_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LOUNDRY_FACILITY_US_SIGN = registerBlock("loundry_facility_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_PARKING_US_SIGN = registerBlock("no_parking_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> TWENTYFIVE_ADVISORY_SPEED_US_SIGN = registerBlock("25_advisory_speed_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DOUBLE_ARROW_YELLOW_US_SIGN = registerBlock("double_arrow_yellow_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CAMPING_US_SIGN = registerBlock("camping_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_CURVE_US_SIGN = registerBlock("right_curve_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_ARROW_YELLOW_US_SIGN = registerBlock("left_arrow_yellow_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_CURVE_US_SIGN = registerBlock("left_curve_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CIRCULAR_INTERSECTION_US_SIGN = registerBlock("circular_intersection_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_MERGING_TRAFFIC_US_SIGN = registerBlock("left_merging_traffic_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DIVIDED_HIGHWAY_US_SIGN = registerBlock("divided_highway_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_PEDESTRIANS_US_SIGN = registerBlock("no_pedestrians_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CROSSBUCK_US_SIGN = registerBlock("crossbuck_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_ARROW_ORANGE_US_SIGN = registerBlock("right_arrow_orange_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> ELECTRIC_STATION_US_SIGN = registerBlock("electric_station_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BICYCLE_CROSSING_US_SIGN = registerBlock("bicycle_crossing_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_REVERSE_TURN_US_SIGN = registerBlock("left_reverse_turn_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_ARROW_ORANGE_US_SIGN = registerBlock("left_arrow_orange_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> MEDICAL_SERVICE_US_SIGN = registerBlock("medical_service_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_ARROW_YELLOW_US_SIGN = registerBlock("right_arrow_yellow_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_DIRECTION_US_SIGN = registerBlock("right_direction_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_RIGHT_TURN_US_SIGN = registerBlock("no_right_turn_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CROSS_ROAD_US_SIGN = registerBlock("cross_road_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DOUBLE_ARROW_GREEN_US_SIGN = registerBlock("double_arrow_green_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_DIAGONAL_ARROW_YELLOW_US_SIGN = registerBlock("right_diagonal_arrow_yellow_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_MERGING_TRAFFIC_US_SIGN = registerBlock("right_merging_traffic_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_REVERSE_TURN_US_SIGN = registerBlock("right_reverse_turn_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_SIDE_ROAD_US_SIGN = registerBlock("right_side_road_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_TURN_ONLY_US_SIGN = registerBlock("right_turn_only_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_TURN_US_SIGN = registerBlock("right_turn_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> ROAD_NARROWS_US_SIGN = registerBlock("road_narrows_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SIDE_ROAD_AT_ANGLE_LEFT_US_SIGN = registerBlock("side_road_at_angle_left_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SIDE_ROAD_AT_ANGLE_RIGHT_US_SIGN = registerBlock("side_road_at_angle_right_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SIGNAL_US_SIGN = registerBlock("signal_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SLIPPERY_US_SIGN = registerBlock("slippery_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> STRAIGHT_AHEAD_ONLY_US_SIGN = registerBlock("straight_ahead_only_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SWIMMING_AREA_US_SIGN = registerBlock("swimming_area_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> T_INTERSECTION_US_SIGN = registerBlock("t_intersection_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> TELEPHONE_US_SIGN = registerBlock("telephone_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> TRUCK_CROSSING_US_SIGN = registerBlock("truck_crossing_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> TRUCK_ROLLOVER_WARNING_US_SIGN = registerBlock("truck_rollover_warning_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> TWO_WAY_TRAFFIC_US_SIGN = registerBlock("two_way_traffic_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> VERY_SHARP_CURVE_US_SIGN = registerBlock("very_sharp_curve_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> WINTER_RECREATION_AREA_US_SIGN = registerBlock("winter_recreation_area_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> WINDING_ROAD_US_SIGN = registerBlock("winding_road_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> WORKERS_US_SIGN = registerBlock("workers_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> Y_INTERSECTION_US_SIGN = registerBlock("y_intersection_us_sign", TrafficSignBlock::new);

    public static final DeferredBlock<TrafficSignBlock> ROUND_SIGN = registerBlock("round_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> TRIANGLE_SIGN = registerBlock("triangle_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RECTANGLE_SIGN = registerBlock("rectangle_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SQUARE_SIGN = registerBlock("square_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CROSS_SIGN = registerBlock("cross_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> UPSIDE_DOWN_TRIANGLE_SIGN = registerBlock("upside_down_triangle_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RHOMBUS_SIGN = registerBlock("rhombus_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> OCTAGON_SIGN = registerBlock("octagon_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BAKE_SIGN = registerBlock("bake_sign", TrafficSignBlock::new);

    public static final DeferredBlock<TrafficSignBlock> EXIT_CLOSED_US_SIGN = registerBlock("exit_closed_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_HAZARDOUS_CARGO_EU_SIGN = registerBlock("no_hazardous_cargo_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> M_AHEAD_EU_SIGN = registerBlock("m_ahead_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> AHEAD_YELLOW_US_SIGN = registerBlock("ahead_yellow_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BICYCLE_PATH_RIGHT_EU_SIGN = registerBlock("bicycle_path_right_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BICYCLE_HIGHWAY_END_EU_SIGN = registerBlock("bicycle_highway_end_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> TEN_MINIMUM_SPEED_SIGN_EU = registerBlock("10_minimum_speed_sign_eu", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HIGHWAY_COUNTDOWN_MARKER_200_EU_SIGN = registerBlock("highway_countdown_marker_200_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BICYCLE_PATH_LEFT_EU_SIGN = registerBlock("bicycle_path_left_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BICYCLE_ROUTE_AHEAD_EU_SIGN = registerBlock("bicycle_route_ahead_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> FEDERAL_HIGHWAY_COUNTDOWN_MARKER_100_EU_SIGN = registerBlock("federal_highway_countdown_marker_100_eu_sign",
            TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HIGHWAY_COUNTDOWN_MARKER_300_EU_SIGN = registerBlock("highway_countdown_marker_300_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BRIDLE_PATH_EU_SIGN = registerBlock("bridle_path_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DETOUR_END_EU_SIGN = registerBlock("detour_end_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DETOUR_LEFT_US_SIGN = registerBlock("detour_left_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> FEDERAL_HIGHWAY_COUNTDOWN_MARKER_200_EU_SIGN = registerBlock("federal_highway_countdown_marker_200_eu_sign",
            TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DETOUR_RIGHT_US_SIGN = registerBlock("detour_right_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> AHEAD_GREEN_US_SIGN = registerBlock("ahead_green_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> MOVABLE_BRIDGE_EU_SIGN = registerBlock("movable_bridge_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HIGHWAY_COUNTDOWN_MARKER_100_EU_SIGN = registerBlock("highway_countdown_marker_100_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BICYCLE_PATH_US_SIGN = registerBlock("bicycle_path_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> THIRTY_MINIMUM_SPEED_SIGN_EU = registerBlock("30_minimum_speed_sign_eu", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CHARGING_STATION_EU_SIGN = registerBlock("charging_station_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BICYCLE_ROUTE_LEFT_EU_SIGN = registerBlock("bicycle_route_left_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LOOSE_GRAVEL_EU_SIGN = registerBlock("loose_gravel_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> FEDERAL_HIGHWAY_COUNTDOWN_MARKER_300_EU_SIGN = registerBlock("federal_highway_countdown_marker_300_eu_sign",
            TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BICYCLE_HIGHWAY_EU_SIGN = registerBlock("bicycle_highway_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PARKING_AREA_END_EU_SIGN = registerBlock("parking_area_end_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BICYCLE_PATH_AHEAD_EU_SIGN = registerBlock("bicycle_path_ahead_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NO_MONSTER_EU_SIGN = registerBlock("no_monster_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> AHEAD_ORANGE_US_SIGN = registerBlock("ahead_orange_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BICYCLE_ROUTE_RIGHT_EU_SIGN = registerBlock("bicycle_route_right_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_PRIORITY_ROAD_EU_SIGN = registerBlock("left_priority_road_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PARKING_AREA_START_EU_SIGN = registerBlock("parking_area_start_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PRIORITY_ROAD_FROM_LEFT_EU_SIGN = registerBlock("priority_road_from_left_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PRIORITY_ROAD_FROM_RIGHT_EU_SIGN = registerBlock("priority_road_from_right_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RAILWAY_COUNTDOWN_MARKER_80_EU_SIGN = registerBlock("railway_countdown_marker_80_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RAILWAY_COUNTDOWN_MARKER_160_EU_SIGN = registerBlock("railway_countdown_marker_160_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RAILWAY_COUNTDOWN_MARKER_240_EU_SIGN = registerBlock("railway_countdown_marker_240_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_PRIORITY_ROAD_EU_SIGN = registerBlock("right_priority_road_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SHORE_EU_SIGN = registerBlock("shore_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> TREE_OVERHANG_EU_SIGN = registerBlock("tree_overhang_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> TRUCK_ROUTE_AHEAD_EU_SIGN = registerBlock("truck_route_ahead_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> TRUCK_ROUTE_RIGHT_EU_SIGN = registerBlock("truck_route_right_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> TRUCK_ROUTE_LEFT_EU_SIGN = registerBlock("truck_route_left_eu_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> WARN_US_SIGN = registerBlock("warn_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> WARNING_BEACON_ALT_US_SIGN = registerBlock("warning_beacon_alt_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> WARNING_BEACON_LEFT_US_SIGN = registerBlock("warning_beacon_left_us_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> WARNING_BEACON_RIGHT_US_SIGN = registerBlock("warning_beacon_right_us_sign", TrafficSignBlock::new);

    public static final DeferredBlock<TrafficSignBlock> ONCOMING_TRAFFIC_CN_SIGN = registerBlock("oncoming_traffic_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> INTERSECTION_CN_SIGN = registerBlock("intersection_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DETOUR_LEFT_OR_RIGHT_CN_SIGN = registerBlock("detour_left_or_right_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PEDESTRIAN_CROSSING_CN_SIGN = registerBlock("pedestrian_crossing_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> EMERGENCY_BAY_CN_SIGN = registerBlock("emergency_bay_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CATTLE_CN_SIGN = registerBlock("cattle_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NARROWING_CN_SIGN = registerBlock("narrowing_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DESCEND_CN_SIGN = registerBlock("descend_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CHILDREN_CN_SIGN = registerBlock("children_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> FIFTY_ADVISORY_SPEED_CN_SIGN = registerBlock("50_advisory_speed_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> JAMS_CN_SIGN = registerBlock("jams_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DANGER_CN_SIGN = registerBlock("danger_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_DOUBLE_CURVE_CN_SIGN = registerBlock("right_double_curve_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RAILROAD_CN_SIGN = registerBlock("railroad_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DETOUR_LEFT_CN_SIGN = registerBlock("detour_left_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CREEPER_CN_SIGN = registerBlock("creeper_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> ASCEND_CN_SIGN = registerBlock("ascend_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> GAS_STATION_CN_SIGN = registerBlock("gas_station_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PARKING_CN_SIGN = registerBlock("parking_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> BUMP_CN_SIGN = registerBlock("bump_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_DIRECTION_CN_SIGN = registerBlock("left_direction_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_NARROWING_CN_SIGN = registerBlock("right_narrowing_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> INFO_CN_SIGN = registerBlock("info_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CYCLES_CN_SIGN = registerBlock("cycles_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PRIORITY_CN_SIGN = registerBlock("priority_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> CAMPING_CN_SIGN = registerBlock("camping_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> ROUNDABOUT_CN_SIGN = registerBlock("roundabout_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SHORE_CN_SIGN = registerBlock("shore_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HIGHWAY_CN_SIGN = registerBlock("highway_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_CURVE_CN_SIGN = registerBlock("right_curve_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_NARROWING_CN_SIGN = registerBlock("left_narrowing_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NATURE_RESERVE_AREA_CN_SIGN = registerBlock("nature_reserve_area_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_MERGING_TRAFFIC_CN_SIGN = registerBlock("left_merging_traffic_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> HIGHWAY_END_CN_SIGN = registerBlock("highway_end_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_DOUBLE_CURVE_CN_SIGN = registerBlock("left_double_curve_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> GATE_CN_SIGN = registerBlock("gate_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> ROCKFALL_CN_SIGN = registerBlock("rockfall_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> PARKING_GARAGE_CN_SIGN = registerBlock("parking_garage_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> DETOUR_RIGHT_CN_SIGN = registerBlock("detour_right_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> THIRTY_ADVISORY_SPEED_CN_SIGN = registerBlock("30_advisory_speed_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_DIRECTION_CN_SIGN = registerBlock("right_direction_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> NARROW_BRIDGE_CN_SIGN = registerBlock("narrow_bridge_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> FORTY_ADVISORY_SPEED_CN_SIGN = registerBlock("40_advisory_speed_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> ONE_WAY_CN_SIGN = registerBlock("one_way_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> ROADWORKS_CN_SIGN = registerBlock("roadworks_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> RIGHT_MERGING_TRAFFIC_CN_SIGN = registerBlock("right_merging_traffic_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> LEFT_CURVE_CN_SIGN = registerBlock("left_curve_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> GUIDE_CN_SIGN = registerBlock("guide_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SIDE_ROAD_AT_ANGLE_LEFT_CN_SIGN = registerBlock("side_road_at_angle_left_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SIDE_ROAD_AT_ANGLE_RIGHT_CN_SIGN = registerBlock("side_road_at_angle_right_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SIDE_ROAD_AT_LEFT_CN_SIGN = registerBlock("side_road_at_left_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SIDE_ROAD_AT_RIGHT_CN_SIGN = registerBlock("side_road_at_right_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SIGNAL_CN_SIGN = registerBlock("signal_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SLIPPERINESS_CN_SIGN = registerBlock("slipperiness_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SLOW_CN_SIGN = registerBlock("slow_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> SNOW_CN_SIGN = registerBlock("snow_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> STOP_CN_SIGN = registerBlock("stop_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> T_INTERSECTION_CN_SIGN = registerBlock("t_intersection_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> TELEPHONE_CN_SIGN = registerBlock("telephone_cn_sign", TrafficSignBlock::new);
    public static final DeferredBlock<TrafficSignBlock> UNEVEN_ROAD_CN_SIGN = registerBlock("uneven_road_cn_sign", TrafficSignBlock::new);

    public static final DeferredBlock<WallSignBlock> ENTERING_PROHIBITED_SIGN = registerBlock("entering_prohibited_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> HEAVY_LOAD_PROHIBITED_SIGN = registerBlock("heavy_load_prohibited_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> LASER_WARNING_SIGN = registerBlock("laser_warning_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> GLOVES_MANDATORY_SIGN = registerBlock("gloves_mandatory_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> MANDATORY_SIGN = registerBlock("mandatory_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> FIRE_EXTINGUISHER_SIGN = registerBlock("fire_extinguisher_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> DRINKING_PROHIBITED_SIGN = registerBlock("drinking_prohibited_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> BOOTS_MANDATORY_SIGN = registerBlock("boots_mandatory_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> EMERGENCY_EXIT_LEFT_SIGN = registerBlock("emergency_exit_left_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> FIRE_TELEPHONE_SIGN = registerBlock("fire_telephone_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> HELMET_MANDATORY_SIGN = registerBlock("helmet_mandatory_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> HOT_WARNING_SIGN = registerBlock("hot_warning_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> EXPLOSION_WARNING_SIGN = registerBlock("explosion_warning_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> EMERGENCY_EXIT_SIGN = registerBlock("emergency_exit_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> EMERGENCY_TELEFONE_SIGN = registerBlock("emergency_telefone_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> EMERGENCY_EXIT_DOWNWARDS_SIGN = registerBlock("emergency_exit_downwards_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> MONSTER_WARNING_SIGN = registerBlock("monster_warning_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> MAGNETIC_WARNING_SIGN = registerBlock("magnetic_warning_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> FIRE_WARNING_SIGN = registerBlock("fire_warning_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> BIOHAZARD_WARNING_SIGN = registerBlock("biohazard_warning_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> ASSEMBLY_POINT_SIGN = registerBlock("assembly_point_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> EMERGENCY_EXIT_RIGHT_SIGN = registerBlock("emergency_exit_right_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> EATING_PROHIBITED_SIGN = registerBlock("eating_prohibited_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> EMERGENCY_EXIT_AHEAD_SIGN = registerBlock("emergency_exit_ahead_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> ARMOR_MANDATORY_SIGN = registerBlock("armor_mandatory_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> EXIT_SIGN = registerBlock("exit_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> GAS_CYLINDER_WARNING_SIGN = registerBlock("gas_cylinder_warning_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> FIRST_AID_SIGN = registerBlock("first_aid_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> FIRE_ALARM_SIGN = registerBlock("fire_alarm_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> PEDESTRIANS_PROHIBITED_SIGN = registerBlock("pedestrians_prohibited_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> PHONES_PROHIBITED_SIGN = registerBlock("phones_prohibited_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> PROHIBITION_SIGN = registerBlock("prohibition_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> RADIATION_WARNING_SIGN = registerBlock("radiation_warning_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> SMOKING_PROHIBITED_SIGN = registerBlock("smoking_prohibited_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> TOXIC_WARNING_SIGN = registerBlock("toxic_warning_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> UNAUTHORISED_PROHIBITED_SIGN = registerBlock("unauthorised_prohibited_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> VOLTAGE_WARNING_SIGN = registerBlock("voltage_warning_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> WARNING_SIGN = registerBlock("warning_sign", WallSignBlock::new);

    public static final DeferredBlock<WallSignBlock> SIGN_0 = registerBlock("0_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> SIGN_1 = registerBlock("1_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> SIGN_2 = registerBlock("2_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> SIGN_3 = registerBlock("3_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> SIGN_4 = registerBlock("4_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> SIGN_5 = registerBlock("5_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> SIGN_6 = registerBlock("6_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> SIGN_7 = registerBlock("7_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> SIGN_8 = registerBlock("8_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> SIGN_9 = registerBlock("9_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> A_SIGN = registerBlock("a_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> B_SIGN = registerBlock("b_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> C_SIGN = registerBlock("c_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> D_SIGN = registerBlock("d_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> E_SIGN = registerBlock("e_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> F_SIGN = registerBlock("f_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> G_SIGN = registerBlock("g_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> H_SIGN = registerBlock("h_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> I_SIGN = registerBlock("i_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> J_SIGN = registerBlock("j_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> K_SIGN = registerBlock("k_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> L_SIGN = registerBlock("l_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> M_SIGN = registerBlock("m_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> N_SIGN = registerBlock("n_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> O_SIGN = registerBlock("o_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> P_SIGN = registerBlock("p_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> Q_SIGN = registerBlock("q_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> R_SIGN = registerBlock("r_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> S_SIGN = registerBlock("s_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> T_SIGN = registerBlock("t_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> U_SIGN = registerBlock("u_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> V_SIGN = registerBlock("v_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> W_SIGN = registerBlock("w_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> X_SIGN = registerBlock("x_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> Y_SIGN = registerBlock("y_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> Z_SIGN = registerBlock("z_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> EXCLAMATION_SIGN = registerBlock("exclamation_sign", WallSignBlock::new);
    public static final DeferredBlock<WallSignBlock> QUESTION_SIGN = registerBlock("question_sign", WallSignBlock::new);

    public static final DeferredBlock<DrainCoverBlock> DRAIN_COVER = registerBlock("drain_cover", DrainCoverBlock::new);
    public static final DeferredBlock<DrainCoverBlock> DRAIN_COVER_GRID = registerBlock("drain_cover_grid", DrainCoverBlock::new);

    public static final DeferredBlock<FenceBlock> IRON_FENCE = registerBlock("iron_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.IRON_POLE.get())));
    public static final DeferredBlock<TrafficBarrierBlock> TRAFFIC_BARRIER = registerBlock("traffic_barrier", TrafficBarrierBlock::new);
    public static final DeferredBlock<TrafficBarrierBlock> RED_WHITE_TRAFFIC_BARRIER = registerBlock("red_white_traffic_barrier", TrafficBarrierBlock::new);
    public static final DeferredBlock<TrafficBarrierBlock> YELLOW_BLACK_TRAFFIC_BARRIER = registerBlock("yellow_black_traffic_barrier", TrafficBarrierBlock::new);
    public static final DeferredBlock<DoubleTrafficBarrierBlock> DOUBLE_TRAFFIC_BARRIER = registerBlock("double_traffic_barrier", DoubleTrafficBarrierBlock::new);
    public static final DeferredBlock<DoubleTrafficBarrierBlock> DOUBLE_RED_WHITE_TRAFFIC_BARRIER = registerBlock("double_red_white_traffic_barrier",
            DoubleTrafficBarrierBlock::new);
    public static final DeferredBlock<DoubleTrafficBarrierBlock> DOUBLE_YELLOW_BLACK_TRAFFIC_BARRIER = registerBlock("double_yellow_black_traffic_barrier",
            DoubleTrafficBarrierBlock::new);

    public static final DeferredBlock<WallBlock> BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)));
    public static final DeferredBlock<WallBlock> WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));
    public static final DeferredBlock<WallBlock> ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)));
    public static final DeferredBlock<WallBlock> MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final DeferredBlock<WallBlock> YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)));
    public static final DeferredBlock<WallBlock> LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)));
    public static final DeferredBlock<WallBlock> PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)));
    public static final DeferredBlock<WallBlock> GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final DeferredBlock<WallBlock> CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)));
    public static final DeferredBlock<WallBlock> PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)));
    public static final DeferredBlock<WallBlock> BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)));
    public static final DeferredBlock<WallBlock> BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)));
    public static final DeferredBlock<WallBlock> GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)));
    public static final DeferredBlock<WallBlock> RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)));

    public static final DeferredBlock<PainterBlock> BLOCK_PAINTER = registerBlock("block_painter", PainterBlock::new);

    public static final DeferredBlock<TapeBlock> RED_WHITE_BARRIER_TAPE = registerBlock("red_white_barrier_tape",
            () -> new TapeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(0.1F).sound(SoundType.AZALEA_LEAVES).noOcclusion()));
    public static final DeferredBlock<TapeBlock> YELLOW_BLACK_BARRIER_TAPE = registerBlock("yellow_black_barrier_tape",
            () -> new TapeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(0.1F).sound(SoundType.AZALEA_LEAVES).noOcclusion()));

    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_BICYCLE = registerBlock("asphalt_with_white_bicycle", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_DIAGONAL_LEFT_ARROW = registerBlock("asphalt_with_white_diagonal_left_arrow", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_DIAGONAL_RIGHT_ARROW = registerBlock("asphalt_with_white_diagonal_right_arrow", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_HANDICAPPED = registerBlock("asphalt_with_white_handicapped", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_PEDESTRIAN = registerBlock("asphalt_with_white_pedestrian", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_WHITE_TRIANGLE = registerBlock("asphalt_with_white_triangle", AsphaltBlock::new);

    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_BICYCLE_SLAB = registerBlock("asphalt_with_white_bicycle_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_DIAGONAL_LEFT_ARROW_SLAB = registerBlock("asphalt_with_white_diagonal_left_arrow_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_DIAGONAL_RIGHT_ARROW_SLAB = registerBlock("asphalt_with_white_diagonal_right_arrow_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_HANDICAPPED_SLAB = registerBlock("asphalt_with_white_handicapped_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_PEDESTRIAN_SLAB = registerBlock("asphalt_with_white_pedestrian_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_WHITE_TRIANGLE_SLAB = registerBlock("asphalt_with_white_triangle_slab", AsphaltSlabBlock::new);

    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_BICYCLE = registerBlock("asphalt_with_yellow_bicycle", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_DIAGONAL_LEFT_ARROW = registerBlock("asphalt_with_yellow_diagonal_left_arrow", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_DIAGONAL_RIGHT_ARROW = registerBlock("asphalt_with_yellow_diagonal_right_arrow", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_HANDICAPPED = registerBlock("asphalt_with_yellow_handicapped", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_PEDESTRIAN = registerBlock("asphalt_with_yellow_pedestrian", AsphaltBlock::new);
    public static final DeferredBlock<AsphaltBlock> ASPHALT_WITH_YELLOW_TRIANGLE = registerBlock("asphalt_with_yellow_triangle", AsphaltBlock::new);

    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_BICYCLE_SLAB = registerBlock("asphalt_with_yellow_bicycle_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_DIAGONAL_LEFT_ARROW_SLAB = registerBlock("asphalt_with_yellow_diagonal_left_arrow_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_DIAGONAL_RIGHT_ARROW_SLAB = registerBlock("asphalt_with_yellow_diagonal_right_arrow_slab",
            AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_HANDICAPPED_SLAB = registerBlock("asphalt_with_yellow_handicapped_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_PEDESTRIAN_SLAB = registerBlock("asphalt_with_yellow_pedestrian_slab", AsphaltSlabBlock::new);
    public static final DeferredBlock<AsphaltSlabBlock> ASPHALT_WITH_YELLOW_TRIANGLE_SLAB = registerBlock("asphalt_with_yellow_triangle_slab", AsphaltSlabBlock::new);

    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN = registerBlock("variable_traffic_sign", VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_LANE_OPEN = registerBlock("variable_traffic_sign_lane_open", VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_LANE_CLOSED = registerBlock("variable_traffic_sign_lane_closed",
            VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_LANE_CHANGE_LEFT = registerBlock("variable_traffic_sign_lane_change_left",
            VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_LANE_CHANGE_RIGHT = registerBlock("variable_traffic_sign_lane_change_right",
            VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_SIXTY_SPEED_LIMIT = registerBlock("variable_traffic_sign_sixty_speed_limit",
            VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_EIGHTY_SPEED_LIMIT = registerBlock("variable_traffic_sign_eighty_speed_limit",
            VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_HUNDRED_SPEED_LIMIT = registerBlock("variable_traffic_sign_hundred_speed_limit",
            VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_HUNDRED_TWENTY_SPEED_LIMIT = registerBlock("variable_traffic_sign_hundred_twenty_speed_limit",
            VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_CREEPER = registerBlock("variable_traffic_sign_creeper", VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_DANGER = registerBlock("variable_traffic_sign_danger", VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_END_ALL_LIMITS = registerBlock("variable_traffic_sign_end_all_limits",
            VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_JAMS = registerBlock("variable_traffic_sign_jams", VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_NO_PASSING = registerBlock("variable_traffic_sign_no_passing", VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_NO_TRUCK_PASSING = registerBlock("variable_traffic_sign_no_truck_passing",
            VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_ROADWORKS = registerBlock("variable_traffic_sign_roadworks", VariableTrafficSignBlock::new);
    public static final DeferredBlock<VariableTrafficSignBlock> VARIABLE_TRAFFIC_SIGN_SLIPPERINESS = registerBlock("variable_traffic_sign_slipperiness",
            VariableTrafficSignBlock::new);

    public static final DeferredBlock<TrafficLightBlock> BICYCLE_DOUBLE_TRAFFIC_LIGHT = registerBlock("bicycle_double_traffic_light",
            () -> new TrafficLightBlock(BlockBehaviour.Properties.of(), true));
    public static final DeferredBlock<TrafficLightBlock> BICYCLE_TRIPLE_TRAFFIC_LIGHT = registerBlock("bicycle_triple_traffic_light",
            () -> new TrafficLightBlock(BlockBehaviour.Properties.of(), false));
    public static final DeferredBlock<SignalLightBlock> DANGER_SIGNAL_LIGHT = registerBlock("danger_signal_light", () -> new SignalLightBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<TrafficLightBlock> DOUBLE_TRAFFIC_LIGHT = registerBlock("double_traffic_light",
            () -> new TrafficLightBlock(BlockBehaviour.Properties.of(), true));
    public static final DeferredBlock<TrafficLightBlock> LEFT_TURN_DOUBLE_TRAFFIC_LIGHT = registerBlock("left_turn_double_traffic_light",
            () -> new TrafficLightBlock(BlockBehaviour.Properties.of(), false));
    public static final DeferredBlock<TrafficLightBlock> LEFT_TURN_TRIPLE_TRAFFIC_LIGHT = registerBlock("left_turn_triple_traffic_light",
            () -> new TrafficLightBlock(BlockBehaviour.Properties.of(), true));
    public static final DeferredBlock<TrafficLightBlock> PEDESTRIAN_DOUBLE_TRAFFIC_LIGHT = registerBlock("pedestrian_double_traffic_light",
            () -> new TrafficLightBlock(BlockBehaviour.Properties.of(), true));
    public static final DeferredBlock<SignalLightBlock> PEDESTRIAN_SIGNAL_LIGHT = registerBlock("pedestrian_signal_light",
            () -> new SignalLightBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<TrafficLightBlock> PEDESTRIAN_TRIPLE_TRAFFIC_LIGHT = registerBlock("pedestrian_triple_traffic_light",
            () -> new TrafficLightBlock(BlockBehaviour.Properties.of(), false));
    public static final DeferredBlock<TrafficLightBlock> RIGHT_TURN_DOUBLE_TRAFFIC_LIGHT = registerBlock("right_turn_double_traffic_light",
            () -> new TrafficLightBlock(BlockBehaviour.Properties.of(), false));
    public static final DeferredBlock<TrafficLightBlock> RIGHT_TURN_TRIPLE_TRAFFIC_LIGHT = registerBlock("right_turn_triple_traffic_light",
            () -> new TrafficLightBlock(BlockBehaviour.Properties.of(), true));
    public static final DeferredBlock<SignalLightBlock> SIGNAL_LIGHT = registerBlock("signal_light", () -> new SignalLightBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<TrafficLightBlock> STRAIGHT_DOUBLE_TRAFFIC_LIGHT = registerBlock("straight_double_traffic_light",
            () -> new TrafficLightBlock(BlockBehaviour.Properties.of(), true));
    public static final DeferredBlock<TrafficLightBlock> STRAIGHT_TRIPLE_TRAFFIC_LIGHT = registerBlock("straight_triple_traffic_light",
            () -> new TrafficLightBlock(BlockBehaviour.Properties.of(), false));
    public static final DeferredBlock<SignalLightBlock> TRAIN_SIGNAL_LIGHT = registerBlock("train_signal_light", () -> new SignalLightBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<TrafficLightBlock> TRIPLE_TRAFFIC_LIGHT = registerBlock("triple_traffic_light",
            () -> new TrafficLightBlock(BlockBehaviour.Properties.of(), false));

    public static final DeferredBlock<RedstoneLampBlock> BLACK_LAMP = registerBlock("black_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.BLACK)));
    public static final DeferredBlock<RedstoneLampBlock> WHITE_LAMP = registerBlock("white_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.WHITE)));
    public static final DeferredBlock<RedstoneLampBlock> ORANGE_LAMP = registerBlock("orange_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.ORANGE)));
    public static final DeferredBlock<RedstoneLampBlock> MAGENTA_LAMP = registerBlock("magenta_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.MAGENTA)));
    public static final DeferredBlock<RedstoneLampBlock> LIGHT_BLUE_LAMP = registerBlock("light_blue_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.LIGHT_BLUE)));
    public static final DeferredBlock<RedstoneLampBlock> YELLOW_LAMP = registerBlock("yellow_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.YELLOW)));
    public static final DeferredBlock<RedstoneLampBlock> LIME_LAMP = registerBlock("lime_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.LIME)));
    public static final DeferredBlock<RedstoneLampBlock> PINK_LAMP = registerBlock("pink_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.PINK)));
    public static final DeferredBlock<RedstoneLampBlock> GRAY_LAMP = registerBlock("gray_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.GRAY)));
    public static final DeferredBlock<RedstoneLampBlock> LIGHT_GRAY_LAMP = registerBlock("light_gray_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.LIGHT_GRAY)));
    public static final DeferredBlock<RedstoneLampBlock> CYAN_LAMP = registerBlock("cyan_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.CYAN)));
    public static final DeferredBlock<RedstoneLampBlock> PURPLE_LAMP = registerBlock("purple_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.PURPLE)));
    public static final DeferredBlock<RedstoneLampBlock> BLUE_LAMP = registerBlock("blue_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.BLUE)));
    public static final DeferredBlock<RedstoneLampBlock> BROWN_LAMP = registerBlock("brown_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.BROWN)));
    public static final DeferredBlock<RedstoneLampBlock> GREEN_LAMP = registerBlock("green_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.GREEN)));
    public static final DeferredBlock<RedstoneLampBlock> RED_LAMP = registerBlock("red_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.RED)));

    public static final DeferredBlock<NeonBlock> BLACK_NEON_LIGHT = registerBlock("black_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.BLACK)));
    public static final DeferredBlock<NeonBlock> BLUE_NEON_LIGHT = registerBlock("blue_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.BLUE)));
    public static final DeferredBlock<NeonBlock> BROWN_NEON_LIGHT = registerBlock("brown_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.BROWN)));
    public static final DeferredBlock<NeonBlock> CYAN_NEON_LIGHT = registerBlock("cyan_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.CYAN)));
    public static final DeferredBlock<NeonBlock> GRAY_NEON_LIGHT = registerBlock("gray_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.GRAY)));
    public static final DeferredBlock<NeonBlock> GREEN_NEON_LIGHT = registerBlock("green_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.GREEN)));
    public static final DeferredBlock<NeonBlock> LIGHT_BLUE_NEON_LIGHT = registerBlock("light_blue_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.LIGHT_BLUE)));
    public static final DeferredBlock<NeonBlock> LIGHT_GRAY_NEON_LIGHT = registerBlock("light_gray_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.LIGHT_GRAY)));
    public static final DeferredBlock<NeonBlock> LIME_NEON_LIGHT = registerBlock("lime_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.LIME)));
    public static final DeferredBlock<NeonBlock> MAGENTA_NEON_LIGHT = registerBlock("magenta_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.MAGENTA)));
    public static final DeferredBlock<NeonBlock> ORANGE_NEON_LIGHT = registerBlock("orange_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.ORANGE)));
    public static final DeferredBlock<NeonBlock> PINK_NEON_LIGHT = registerBlock("pink_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.PINK)));
    public static final DeferredBlock<NeonBlock> PURPLE_NEON_LIGHT = registerBlock("purple_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.PURPLE)));
    public static final DeferredBlock<NeonBlock> RED_NEON_LIGHT = registerBlock("red_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.RED)));
    public static final DeferredBlock<NeonBlock> WHITE_NEON_LIGHT = registerBlock("white_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.WHITE)));
    public static final DeferredBlock<NeonBlock> YELLOW_NEON_LIGHT = registerBlock("yellow_neon_light",
            () -> new NeonBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP).mapColor(DyeColor.YELLOW)));

    public static final DeferredBlock<LanternBlockSlab> STREET_LANTERN_PANEL = registerBlock("street_lantern_panel", LanternBlockSlab::new);
    public static final DeferredBlock<LanternBlock> STREET_LANTERN = registerBlock("street_lantern", LanternBlock::new);
    public static final DeferredBlock<LanternBlock> MODERN_STREET_LANTERN = registerBlock("modern_street_lantern", LanternBlock::new);

    public static final DeferredBlock<Block> CRACKED_BLACK_CONCRETE = registerBlock("cracked_black_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> CRACKED_WHITE_CONCRETE = registerBlock("cracked_white_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> CRACKED_ORANGE_CONCRETE = registerBlock("cracked_orange_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> CRACKED_MAGENTA_CONCRETE = registerBlock("cracked_magenta_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> CRACKED_LIGHT_BLUE_CONCRETE = registerBlock("cracked_light_blue_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> CRACKED_YELLOW_CONCRETE = registerBlock("cracked_yellow_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> CRACKED_LIME_CONCRETE = registerBlock("cracked_lime_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> CRACKED_PINK_CONCRETE = registerBlock("cracked_pink_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> CRACKED_GRAY_CONCRETE = registerBlock("cracked_gray_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> CRACKED_LIGHT_GRAY_CONCRETE = registerBlock("cracked_light_gray_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> CRACKED_CYAN_CONCRETE = registerBlock("cracked_cyan_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> CRACKED_PURPLE_CONCRETE = registerBlock("cracked_purple_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> CRACKED_BLUE_CONCRETE = registerBlock("cracked_blue_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> CRACKED_BROWN_CONCRETE = registerBlock("cracked_brown_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> CRACKED_GREEN_CONCRETE = registerBlock("cracked_green_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> CRACKED_RED_CONCRETE = registerBlock("cracked_red_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE).strength(1.5F)));

    public static final DeferredBlock<Block> MOSSY_BLACK_CONCRETE = registerBlock("mossy_black_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> MOSSY_WHITE_CONCRETE = registerBlock("mossy_white_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> MOSSY_ORANGE_CONCRETE = registerBlock("mossy_orange_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> MOSSY_MAGENTA_CONCRETE = registerBlock("mossy_magenta_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> MOSSY_LIGHT_BLUE_CONCRETE = registerBlock("mossy_light_blue_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> MOSSY_YELLOW_CONCRETE = registerBlock("mossy_yellow_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> MOSSY_LIME_CONCRETE = registerBlock("mossy_lime_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> MOSSY_PINK_CONCRETE = registerBlock("mossy_pink_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> MOSSY_GRAY_CONCRETE = registerBlock("mossy_gray_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> MOSSY_LIGHT_GRAY_CONCRETE = registerBlock("mossy_light_gray_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> MOSSY_CYAN_CONCRETE = registerBlock("mossy_cyan_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> MOSSY_PURPLE_CONCRETE = registerBlock("mossy_purple_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> MOSSY_BLUE_CONCRETE = registerBlock("mossy_blue_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> MOSSY_BROWN_CONCRETE = registerBlock("mossy_brown_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> MOSSY_GREEN_CONCRETE = registerBlock("mossy_green_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE).strength(1.5F)));
    public static final DeferredBlock<Block> MOSSY_RED_CONCRETE = registerBlock("mossy_red_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE).strength(1.5F)));

    public static final DeferredBlock<InfestedBlock> INFESTED_BLACK_CONCRETE = registerBlock("infested_black_concrete",
            () -> new InfestedBlock(Blocks.BLACK_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)));
    public static final DeferredBlock<InfestedBlock> INFESTED_WHITE_CONCRETE = registerBlock("infested_white_concrete",
            () -> new InfestedBlock(Blocks.WHITE_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));
    public static final DeferredBlock<InfestedBlock> INFESTED_GRAY_CONCRETE = registerBlock("infested_gray_concrete",
            () -> new InfestedBlock(Blocks.GRAY_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)));
    public static final DeferredBlock<InfestedBlock> INFESTED_LIGHT_GRAY_CONCRETE = registerBlock("infested_light_gray_concrete",
            () -> new InfestedBlock(Blocks.LIGHT_GRAY_CONCRETE, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final DeferredBlock<Block> CHISELED_BLACK_CONCRETE = registerBlock("chiseled_black_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)));
    public static final DeferredBlock<Block> CHISELED_WHITE_CONCRETE = registerBlock("chiseled_white_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));
    public static final DeferredBlock<Block> CHISELED_ORANGE_CONCRETE = registerBlock("chiseled_orange_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)));
    public static final DeferredBlock<Block> CHISELED_MAGENTA_CONCRETE = registerBlock("chiseled_magenta_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)));
    public static final DeferredBlock<Block> CHISELED_LIGHT_BLUE_CONCRETE = registerBlock("chiseled_light_blue_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final DeferredBlock<Block> CHISELED_YELLOW_CONCRETE = registerBlock("chiseled_yellow_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)));
    public static final DeferredBlock<Block> CHISELED_LIME_CONCRETE = registerBlock("chiseled_lime_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)));
    public static final DeferredBlock<Block> CHISELED_PINK_CONCRETE = registerBlock("chiseled_pink_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)));
    public static final DeferredBlock<Block> CHISELED_GRAY_CONCRETE = registerBlock("chiseled_gray_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)));
    public static final DeferredBlock<Block> CHISELED_LIGHT_GRAY_CONCRETE = registerBlock("chiseled_light_gray_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final DeferredBlock<Block> CHISELED_CYAN_CONCRETE = registerBlock("chiseled_cyan_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)));
    public static final DeferredBlock<Block> CHISELED_PURPLE_CONCRETE = registerBlock("chiseled_purple_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)));
    public static final DeferredBlock<Block> CHISELED_BLUE_CONCRETE = registerBlock("chiseled_blue_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)));
    public static final DeferredBlock<Block> CHISELED_BROWN_CONCRETE = registerBlock("chiseled_brown_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)));
    public static final DeferredBlock<Block> CHISELED_GREEN_CONCRETE = registerBlock("chiseled_green_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)));
    public static final DeferredBlock<Block> CHISELED_RED_CONCRETE = registerBlock("chiseled_red_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)));

    public static final DeferredBlock<Block> POLISHED_BLACK_CONCRETE = registerBlock("polished_black_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)));
    public static final DeferredBlock<Block> POLISHED_WHITE_CONCRETE = registerBlock("polished_white_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));
    public static final DeferredBlock<Block> POLISHED_ORANGE_CONCRETE = registerBlock("polished_orange_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)));
    public static final DeferredBlock<Block> POLISHED_MAGENTA_CONCRETE = registerBlock("polished_magenta_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)));
    public static final DeferredBlock<Block> POLISHED_LIGHT_BLUE_CONCRETE = registerBlock("polished_light_blue_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final DeferredBlock<Block> POLISHED_YELLOW_CONCRETE = registerBlock("polished_yellow_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)));
    public static final DeferredBlock<Block> POLISHED_LIME_CONCRETE = registerBlock("polished_lime_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)));
    public static final DeferredBlock<Block> POLISHED_PINK_CONCRETE = registerBlock("polished_pink_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)));
    public static final DeferredBlock<Block> POLISHED_GRAY_CONCRETE = registerBlock("polished_gray_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)));
    public static final DeferredBlock<Block> POLISHED_LIGHT_GRAY_CONCRETE = registerBlock("polished_light_gray_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final DeferredBlock<Block> POLISHED_CYAN_CONCRETE = registerBlock("polished_cyan_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)));
    public static final DeferredBlock<Block> POLISHED_PURPLE_CONCRETE = registerBlock("polished_purple_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)));
    public static final DeferredBlock<Block> POLISHED_BLUE_CONCRETE = registerBlock("polished_blue_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)));
    public static final DeferredBlock<Block> POLISHED_BROWN_CONCRETE = registerBlock("polished_brown_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)));
    public static final DeferredBlock<Block> POLISHED_GREEN_CONCRETE = registerBlock("polished_green_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)));
    public static final DeferredBlock<Block> POLISHED_RED_CONCRETE = registerBlock("polished_red_concrete",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)));

    public static final DeferredBlock<RotatedPillarBlock> BLACK_CONCRETE_PILLAR = registerBlock("black_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)));
    public static final DeferredBlock<RotatedPillarBlock> WHITE_CONCRETE_PILLAR = registerBlock("white_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));
    public static final DeferredBlock<RotatedPillarBlock> ORANGE_CONCRETE_PILLAR = registerBlock("orange_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)));
    public static final DeferredBlock<RotatedPillarBlock> MAGENTA_CONCRETE_PILLAR = registerBlock("magenta_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)));
    public static final DeferredBlock<RotatedPillarBlock> LIGHT_BLUE_CONCRETE_PILLAR = registerBlock("light_blue_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final DeferredBlock<RotatedPillarBlock> YELLOW_CONCRETE_PILLAR = registerBlock("yellow_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)));
    public static final DeferredBlock<RotatedPillarBlock> LIME_CONCRETE_PILLAR = registerBlock("lime_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)));
    public static final DeferredBlock<RotatedPillarBlock> PINK_CONCRETE_PILLAR = registerBlock("pink_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)));
    public static final DeferredBlock<RotatedPillarBlock> GRAY_CONCRETE_PILLAR = registerBlock("gray_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)));
    public static final DeferredBlock<RotatedPillarBlock> LIGHT_GRAY_CONCRETE_PILLAR = registerBlock("light_gray_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final DeferredBlock<RotatedPillarBlock> CYAN_CONCRETE_PILLAR = registerBlock("cyan_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)));
    public static final DeferredBlock<RotatedPillarBlock> PURPLE_CONCRETE_PILLAR = registerBlock("purple_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)));
    public static final DeferredBlock<RotatedPillarBlock> BLUE_CONCRETE_PILLAR = registerBlock("blue_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)));
    public static final DeferredBlock<RotatedPillarBlock> BROWN_CONCRETE_PILLAR = registerBlock("brown_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)));
    public static final DeferredBlock<RotatedPillarBlock> GREEN_CONCRETE_PILLAR = registerBlock("green_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)));
    public static final DeferredBlock<RotatedPillarBlock> RED_CONCRETE_PILLAR = registerBlock("red_concrete_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)));

    public static final DeferredBlock<StairBlock> BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            () -> new StairBlock(Blocks.BLACK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)));
    public static final DeferredBlock<StairBlock> WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            () -> new StairBlock(Blocks.WHITE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));
    public static final DeferredBlock<StairBlock> ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            () -> new StairBlock(Blocks.ORANGE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)));
    public static final DeferredBlock<StairBlock> MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            () -> new StairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final DeferredBlock<StairBlock> YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            () -> new StairBlock(Blocks.YELLOW_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)));
    public static final DeferredBlock<StairBlock> LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            () -> new StairBlock(Blocks.LIME_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)));
    public static final DeferredBlock<StairBlock> PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            () -> new StairBlock(Blocks.PINK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)));
    public static final DeferredBlock<StairBlock> GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            () -> new StairBlock(Blocks.GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final DeferredBlock<StairBlock> CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            () -> new StairBlock(Blocks.CYAN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)));
    public static final DeferredBlock<StairBlock> PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            () -> new StairBlock(Blocks.PURPLE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)));
    public static final DeferredBlock<StairBlock> BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            () -> new StairBlock(Blocks.BLUE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)));
    public static final DeferredBlock<StairBlock> BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            () -> new StairBlock(Blocks.BROWN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)));
    public static final DeferredBlock<StairBlock> GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            () -> new StairBlock(Blocks.GREEN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)));
    public static final DeferredBlock<StairBlock> RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            () -> new StairBlock(Blocks.RED_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)));

    public static final DeferredBlock<SlabBlock> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)));
    public static final DeferredBlock<SlabBlock> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));
    public static final DeferredBlock<SlabBlock> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)));
    public static final DeferredBlock<SlabBlock> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final DeferredBlock<SlabBlock> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)));
    public static final DeferredBlock<SlabBlock> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)));
    public static final DeferredBlock<SlabBlock> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)));
    public static final DeferredBlock<SlabBlock> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final DeferredBlock<SlabBlock> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)));
    public static final DeferredBlock<SlabBlock> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)));
    public static final DeferredBlock<SlabBlock> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)));
    public static final DeferredBlock<SlabBlock> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)));
    public static final DeferredBlock<SlabBlock> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)));
    public static final DeferredBlock<SlabBlock> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)));

    public static final DeferredBlock<ButtonBlock> BLACK_CONCRETE_BUTTON = registerBlock("black_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<ButtonBlock> WHITE_CONCRETE_BUTTON = registerBlock("white_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<ButtonBlock> ORANGE_CONCRETE_BUTTON = registerBlock("orange_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<ButtonBlock> MAGENTA_CONCRETE_BUTTON = registerBlock("magenta_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<ButtonBlock> LIGHT_BLUE_CONCRETE_BUTTON = registerBlock("light_blue_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<ButtonBlock> YELLOW_CONCRETE_BUTTON = registerBlock("yellow_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<ButtonBlock> LIME_CONCRETE_BUTTON = registerBlock("lime_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<ButtonBlock> PINK_CONCRETE_BUTTON = registerBlock("pink_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<ButtonBlock> GRAY_CONCRETE_BUTTON = registerBlock("gray_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<ButtonBlock> LIGHT_GRAY_CONCRETE_BUTTON = registerBlock("light_gray_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<ButtonBlock> CYAN_CONCRETE_BUTTON = registerBlock("cyan_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<ButtonBlock> PURPLE_CONCRETE_BUTTON = registerBlock("purple_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<ButtonBlock> BLUE_CONCRETE_BUTTON = registerBlock("blue_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<ButtonBlock> BROWN_CONCRETE_BUTTON = registerBlock("brown_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<ButtonBlock> GREEN_CONCRETE_BUTTON = registerBlock("green_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<ButtonBlock> RED_CONCRETE_BUTTON = registerBlock("red_concrete_button", () -> new ButtonBlock(BlockSetType.STONE, 25,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<PressurePlateBlock> BLACK_CONCRETE_PRESSURE_PLATE = registerBlock("black_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<PressurePlateBlock> WHITE_CONCRETE_PRESSURE_PLATE = registerBlock("white_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<PressurePlateBlock> ORANGE_CONCRETE_PRESSURE_PLATE = registerBlock("orange_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<PressurePlateBlock> MAGENTA_CONCRETE_PRESSURE_PLATE = registerBlock("magenta_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<PressurePlateBlock> LIGHT_BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("light_blue_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<PressurePlateBlock> YELLOW_CONCRETE_PRESSURE_PLATE = registerBlock("yellow_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<PressurePlateBlock> LIME_CONCRETE_PRESSURE_PLATE = registerBlock("lime_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<PressurePlateBlock> PINK_CONCRETE_PRESSURE_PLATE = registerBlock("pink_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<PressurePlateBlock> GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("gray_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<PressurePlateBlock> LIGHT_GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("light_gray_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<PressurePlateBlock> CYAN_CONCRETE_PRESSURE_PLATE = registerBlock("cyan_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<PressurePlateBlock> PURPLE_CONCRETE_PRESSURE_PLATE = registerBlock("purple_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<PressurePlateBlock> BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("blue_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<PressurePlateBlock> BROWN_CONCRETE_PRESSURE_PLATE = registerBlock("brown_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<PressurePlateBlock> GREEN_CONCRETE_PRESSURE_PLATE = registerBlock("green_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<PressurePlateBlock> RED_CONCRETE_PRESSURE_PLATE = registerBlock("red_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE).forceSolidOn().requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> DeferredItem registerBlockItem(String name, DeferredBlock<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
