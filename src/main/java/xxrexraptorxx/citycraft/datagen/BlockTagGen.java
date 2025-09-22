package xxrexraptorxx.citycraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import xxrexraptorxx.citycraft.main.CityCraft;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.registry.ModBlockTags;
import xxrexraptorxx.citycraft.registry.ModBlocks;

import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class BlockTagGen extends BlockTagsProvider {

    public BlockTagGen(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper helper) {
        super(packOutput, lookupProvider, References.MODID, helper);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        var lookup = provider.lookupOrThrow(Registries.BLOCK);

        addByPathPredicate(lookup, ModBlockTags.BLANK_ASPHALT, path -> (path.equals("asphalt") || path.endsWith("_asphalt")) && !isSpecialAsphalt(path));
        addByPathPredicate(lookup, ModBlockTags.BLANK_ASPHALT_SLABS, path -> path.endsWith("_asphalt_slab") || (path.contains("_asphalt") && !isSpecialAsphalt(path)));

        addByPathPredicate(lookup, ModBlockTags.WHITE_MARKED_ASPHALT, path -> path.startsWith("asphalt_with_white") && !path.contains("slab"));
        addByPathPredicate(lookup, ModBlockTags.WHITE_MARKED_ASPHALT_SLABS, path -> path.startsWith("asphalt_with_white") && path.endsWith("_slab"));

        addByPathPredicate(lookup, ModBlockTags.YELLOW_MARKED_ASPHALT, path -> path.startsWith("asphalt_with_yellow") && !path.contains("slab"));
        addByPathPredicate(lookup, ModBlockTags.YELLOW_MARKED_ASPHALT_SLABS, path -> path.startsWith("asphalt_with_yellow") && path.endsWith("_slab"));

        tag(ModBlockTags.ASPHALT_WITH_MARKINGS).addTag(ModBlockTags.WHITE_MARKED_ASPHALT).addTag(ModBlockTags.YELLOW_MARKED_ASPHALT);
        tag(ModBlockTags.ASPHALT_SLABS_WITH_MARKINGS).addTag(ModBlockTags.WHITE_MARKED_ASPHALT_SLABS).addTag(ModBlockTags.YELLOW_MARKED_ASPHALT_SLABS);

        tag(ModBlockTags.ASPHALT).addTag(ModBlockTags.BLANK_ASPHALT).addTag(ModBlockTags.ASPHALT_WITH_MARKINGS).add(ModBlocks.CRACKED_ASPHALT.get())
                .add(ModBlocks.CRACKED_ASPHALT_SLAB.get()).add(ModBlocks.POTHOLE_ASPHALT.get()).add(ModBlocks.POTHOLE_ASPHALT_SLAB.get()).add(ModBlocks.DIRTY_ASPHALT.get())
                .add(ModBlocks.DIRTY_ASPHALT_SLAB.get()).add(ModBlocks.BOOST_ASPHALT.get()).add(ModBlocks.BOOST_ASPHALT_SLAB.get()).add(ModBlocks.RED_BUMPER_SLAB.get())
                .add(ModBlocks.YELLOW_BUMPER_SLAB.get());

        addByPathPredicate(lookup, ModBlockTags.TRAFFIC_BARRIERS, path -> path.contains("traffic_barrier"));
        addByPathPredicate(lookup, ModBlockTags.CONCRETES, path -> path.contains("concrete"));
        addByPathPredicate(lookup, ModBlockTags.LEVERS, path -> path.endsWith("lever"));
        addByPathPredicate(lookup, ModBlockTags.POSTS, path -> path.endsWith("_post") && !path.contains("road_edge"));
        addByPathPredicate(lookup, ModBlockTags.POLES, path -> path.endsWith("_pole"));
        addByPathPredicate(lookup, ModBlockTags.LAMPS, path -> path.endsWith("_lamp") || path.endsWith("_light") || path.contains("lantern"));
        addByPathPredicate(lookup, ModBlockTags.SPEED_BOOST_BLOCKS, path -> path.contains("asphalt") && !path.contains("pothole"));

        addByPathModPredicate(lookup, BlockTags.SLABS, path -> path.endsWith("_slab") || path.endsWith("_panel") || path.startsWith("drain_cover"));
        addByPathModPredicate(lookup, BlockTags.STAIRS, path -> path.endsWith("_stairs"));
        addByPathModPredicate(lookup, BlockTags.FENCES, path -> path.endsWith("_fence"));
        addByPathModPredicate(lookup, BlockTags.PRESSURE_PLATES, path -> path.endsWith("_pressure_plate"));
        addByPathModPredicate(lookup, BlockTags.BUTTONS, path -> path.endsWith("_button"));
        addByPathModPredicate(lookup, BlockTags.WALLS, path -> path.endsWith("_wall"));


        tag(ModBlockTags.createBlockTag("c", "asphalt")).addTag(ModBlockTags.ASPHALT);
        tag(ModBlockTags.createBlockTag("c", "traffic_barrier")).addTag(ModBlockTags.TRAFFIC_BARRIERS);
        tag(ModBlockTags.createBlockTag("car", "drivable_blocks")).addTag(ModBlockTags.ASPHALT);

        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.ASPHALT_BLOCK.get(), ModBlocks.CRACKED_ASPHALT.get(), ModBlocks.POTHOLE_ASPHALT.get(), ModBlocks.MOSSY_ASPHALT.get(),
                ModBlocks.DIRTY_ASPHALT.get(), ModBlocks.WHITE_ASPHALT.get(), ModBlocks.ORANGE_ASPHALT.get(), ModBlocks.MAGENTA_ASPHALT.get(), ModBlocks.LIGHT_BLUE_ASPHALT.get(),
                ModBlocks.YELLOW_ASPHALT.get(), ModBlocks.LIME_ASPHALT.get(), ModBlocks.RED_ASPHALT.get(), ModBlocks.PINK_ASPHALT.get(), ModBlocks.GRAY_ASPHALT.get(),
                ModBlocks.LIGHT_GRAY_ASPHALT.get(), ModBlocks.CYAN_ASPHALT.get(), ModBlocks.PURPLE_ASPHALT.get(), ModBlocks.BLUE_ASPHALT.get(), ModBlocks.BROWN_ASPHALT.get(),
                ModBlocks.GREEN_ASPHALT.get(), ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE.get(), ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE.get(),
                ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE.get(), ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE.get(),
                ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE.get(), ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE.get(), ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE.get(),
                ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE.get(), ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE.get(), ModBlocks.ASPHALT_WITH_WHITE_HATCHING.get(),
                ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE.get(),
                ModBlocks.ASPHALT_WITH_WHITE_FRAME.get(), ModBlocks.ASPHALT_WITH_WHITE_EDGE.get(), ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW.get(),
                ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW.get(), ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW.get(), ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW.get(),
                ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW.get(), ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW.get(),
                ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE.get(),
                ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get(),
                ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE.get(),
                ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE.get(),
                ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING.get(), ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE.get(), ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE.get(), ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE.get(), ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE.get(), ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE.get(), ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE.get(), ModBlocks.ASPHALT_WITH_YELLOW_HATCHING.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_FRAME.get(), ModBlocks.ASPHALT_WITH_YELLOW_EDGE.get(), ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW.get(), ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW.get(), ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW.get(), ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING.get(), ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LEFT_EDGE.get(), ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_RIGHT_EDGE.get(),
                ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LEFT_EDGE.get(), ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_RIGHT_EDGE.get(),
                ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LEFT_EDGE.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_RIGHT_EDGE.get(),
                ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LEFT_EDGE.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_RIGHT_EDGE.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LEFT_EDGE.get(), ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_RIGHT_EDGE.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LEFT_EDGE.get(), ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_RIGHT_EDGE.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LEFT_EDGE.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_RIGHT_EDGE.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LEFT_EDGE.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_RIGHT_EDGE.get(), ModBlocks.ASPHALT_SLAB.get(),
                ModBlocks.CRACKED_ASPHALT_SLAB.get(), ModBlocks.POTHOLE_ASPHALT_SLAB.get(), ModBlocks.MOSSY_ASPHALT_SLAB.get(), ModBlocks.DIRTY_ASPHALT_SLAB.get(),
                ModBlocks.WHITE_ASPHALT_SLAB.get(), ModBlocks.ORANGE_ASPHALT_SLAB.get(), ModBlocks.MAGENTA_ASPHALT_SLAB.get(), ModBlocks.LIGHT_BLUE_ASPHALT_SLAB.get(),
                ModBlocks.YELLOW_ASPHALT_SLAB.get(), ModBlocks.LIME_ASPHALT_SLAB.get(), ModBlocks.RED_ASPHALT_SLAB.get(), ModBlocks.PINK_ASPHALT_SLAB.get(),
                ModBlocks.GRAY_ASPHALT_SLAB.get(), ModBlocks.LIGHT_GRAY_ASPHALT_SLAB.get(), ModBlocks.CYAN_ASPHALT_SLAB.get(), ModBlocks.PURPLE_ASPHALT_SLAB.get(),
                ModBlocks.BLUE_ASPHALT_SLAB.get(), ModBlocks.BROWN_ASPHALT_SLAB.get(), ModBlocks.GREEN_ASPHALT_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_HATCHING_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_FRAME_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_HATCHING_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_FRAME_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_EDGE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LEFT_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_RIGHT_EDGE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LEFT_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LEFT_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LEFT_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_RIGHT_EDGE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LEFT_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_RIGHT_EDGE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LEFT_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LEFT_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_RIGHT_EDGE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LEFT_EDGE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_RIGHT_EDGE_SLAB.get(), ModBlocks.BOOST_ASPHALT.get(),
                ModBlocks.BOOST_ASPHALT_SLAB.get(), ModBlocks.RED_BUMPER_SLAB.get(), ModBlocks.YELLOW_BUMPER_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_A.get(),
                ModBlocks.ASPHALT_WITH_WHITE_B.get(), ModBlocks.ASPHALT_WITH_WHITE_C.get(), ModBlocks.ASPHALT_WITH_WHITE_D.get(), ModBlocks.ASPHALT_WITH_WHITE_E.get(),
                ModBlocks.ASPHALT_WITH_WHITE_F.get(), ModBlocks.ASPHALT_WITH_WHITE_G.get(), ModBlocks.ASPHALT_WITH_WHITE_H.get(), ModBlocks.ASPHALT_WITH_WHITE_I.get(),
                ModBlocks.ASPHALT_WITH_WHITE_J.get(), ModBlocks.ASPHALT_WITH_WHITE_K.get(), ModBlocks.ASPHALT_WITH_WHITE_L.get(), ModBlocks.ASPHALT_WITH_WHITE_M.get(),
                ModBlocks.ASPHALT_WITH_WHITE_N.get(), ModBlocks.ASPHALT_WITH_WHITE_O.get(), ModBlocks.ASPHALT_WITH_WHITE_P.get(), ModBlocks.ASPHALT_WITH_WHITE_Q.get(),
                ModBlocks.ASPHALT_WITH_WHITE_R.get(), ModBlocks.ASPHALT_WITH_WHITE_S.get(), ModBlocks.ASPHALT_WITH_WHITE_T.get(), ModBlocks.ASPHALT_WITH_WHITE_U.get(),
                ModBlocks.ASPHALT_WITH_WHITE_V.get(), ModBlocks.ASPHALT_WITH_WHITE_W.get(), ModBlocks.ASPHALT_WITH_WHITE_X.get(), ModBlocks.ASPHALT_WITH_WHITE_Y.get(),
                ModBlocks.ASPHALT_WITH_WHITE_Z.get(), ModBlocks.ASPHALT_WITH_YELLOW_A.get(), ModBlocks.ASPHALT_WITH_YELLOW_B.get(), ModBlocks.ASPHALT_WITH_YELLOW_C.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_D.get(), ModBlocks.ASPHALT_WITH_YELLOW_E.get(), ModBlocks.ASPHALT_WITH_YELLOW_F.get(), ModBlocks.ASPHALT_WITH_YELLOW_G.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_H.get(), ModBlocks.ASPHALT_WITH_YELLOW_I.get(), ModBlocks.ASPHALT_WITH_YELLOW_J.get(), ModBlocks.ASPHALT_WITH_YELLOW_K.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_L.get(), ModBlocks.ASPHALT_WITH_YELLOW_M.get(), ModBlocks.ASPHALT_WITH_YELLOW_N.get(), ModBlocks.ASPHALT_WITH_YELLOW_O.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_P.get(), ModBlocks.ASPHALT_WITH_YELLOW_Q.get(), ModBlocks.ASPHALT_WITH_YELLOW_R.get(), ModBlocks.ASPHALT_WITH_YELLOW_S.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_T.get(), ModBlocks.ASPHALT_WITH_YELLOW_U.get(), ModBlocks.ASPHALT_WITH_YELLOW_V.get(), ModBlocks.ASPHALT_WITH_YELLOW_W.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_X.get(), ModBlocks.ASPHALT_WITH_YELLOW_Y.get(), ModBlocks.ASPHALT_WITH_YELLOW_Z.get(), ModBlocks.ASPHALT_WITH_WHITE_A_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_B_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_C_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_D_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_E_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_F_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_G_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_H_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_I_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_J_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_K_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_L_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_M_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_N_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_O_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_P_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_Q_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_R_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_S_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_T_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_U_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_V_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_W_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_X_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_Y_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_Z_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_A_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_B_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_C_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_D_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_E_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_F_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_G_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_H_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_I_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_J_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_K_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_L_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_M_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_N_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_O_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_P_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_Q_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_R_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_S_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_T_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_U_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_V_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_W_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_X_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_Y_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_Z_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_0.get(), ModBlocks.ASPHALT_WITH_WHITE_1.get(), ModBlocks.ASPHALT_WITH_WHITE_2.get(), ModBlocks.ASPHALT_WITH_WHITE_3.get(),
                ModBlocks.ASPHALT_WITH_WHITE_4.get(), ModBlocks.ASPHALT_WITH_WHITE_5.get(), ModBlocks.ASPHALT_WITH_WHITE_6.get(), ModBlocks.ASPHALT_WITH_WHITE_7.get(),
                ModBlocks.ASPHALT_WITH_WHITE_8.get(), ModBlocks.ASPHALT_WITH_WHITE_9.get(), ModBlocks.ASPHALT_WITH_WHITE_COMMA.get(), ModBlocks.ASPHALT_WITH_WHITE_DASH.get(),
                ModBlocks.ASPHALT_WITH_WHITE_DOT.get(), ModBlocks.ASPHALT_WITH_WHITE_EXCLAMATION.get(), ModBlocks.ASPHALT_WITH_WHITE_QUESTION.get(),
                ModBlocks.ASPHALT_WITH_WHITE_SLASH.get(), ModBlocks.ASPHALT_WITH_YELLOW_0.get(), ModBlocks.ASPHALT_WITH_YELLOW_1.get(), ModBlocks.ASPHALT_WITH_YELLOW_2.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_3.get(), ModBlocks.ASPHALT_WITH_YELLOW_4.get(), ModBlocks.ASPHALT_WITH_YELLOW_5.get(), ModBlocks.ASPHALT_WITH_YELLOW_6.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_7.get(), ModBlocks.ASPHALT_WITH_YELLOW_8.get(), ModBlocks.ASPHALT_WITH_YELLOW_9.get(), ModBlocks.ASPHALT_WITH_YELLOW_COMMA.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_DASH.get(), ModBlocks.ASPHALT_WITH_YELLOW_DOT.get(), ModBlocks.ASPHALT_WITH_YELLOW_EXCLAMATION.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_QUESTION.get(), ModBlocks.ASPHALT_WITH_YELLOW_SLASH.get(), ModBlocks.ASPHALT_WITH_WHITE_0_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_1_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_2_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_3_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_4_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_5_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_6_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_7_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_8_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_9_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_COMMA_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_DASH_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_DOT_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_EXCLAMATION_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_QUESTION_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_SLASH_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_0_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_1_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_2_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_3_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_4_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_5_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_6_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_7_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_8_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_9_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_COMMA_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_DASH_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_DOT_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_EXCLAMATION_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_QUESTION_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_SLASH_SLAB.get(), ModBlocks.IRON_POLE.get(), ModBlocks.REDSTONE_POLE.get(), ModBlocks.RED_POLE.get(), ModBlocks.WHITE_POLE.get(),
                ModBlocks.YELLOW_POLE.get(), ModBlocks.BLACK_POLE.get(), ModBlocks.RED_WHITE_POLE.get(), ModBlocks.YELLOW_BLACK_POLE.get(), ModBlocks.ROAD_EDGE_POST.get(),
                ModBlocks.STONE_POST.get(), ModBlocks.RED_POST.get(), ModBlocks.WHITE_POST.get(), ModBlocks.YELLOW_POST.get(), ModBlocks.BLACK_POST.get(),
                ModBlocks.RED_WHITE_POST.get(), ModBlocks.YELLOW_BLACK_POST.get(), ModBlocks.DRAIN_COVER.get(), ModBlocks.DRAIN_COVER_GRID.get(), ModBlocks.RED_CHAIN.get(),
                ModBlocks.WHITE_CHAIN.get(), ModBlocks.YELLOW_CHAIN.get(), ModBlocks.BLACK_CHAIN.get(), ModBlocks.LEFT_ARROW_EU_SIGN.get(), ModBlocks.CAMPING_EU_SIGN.get(),
                ModBlocks.PR_EU_SIGN.get(), ModBlocks.PRIORITY_ROAD_EU_SIGN.get(), ModBlocks.HIGHWAY_EU_SIGN.get(), ModBlocks.LEFT_NARROWING_EU_SIGN.get(),
                ModBlocks.CHURCH_EU_SIGN.get(), ModBlocks.NO_PARKING_EU_SIGN.get(), ModBlocks.PARKING_EU_SIGN.get(), ModBlocks.NARROWING_EU_SIGN.get(),
                ModBlocks.NO_CARS_EU_SIGN.get(), ModBlocks.NO_TRUCK_PASSING_END_EU_SIGN.get(), ModBlocks.ONGOING_TRAFFIC_EU_SIGN.get(), ModBlocks.DETOUR_RIGHT_EU_SIGN.get(),
                ModBlocks.END_ALL_LIMITS_EU_SIGN.get(), ModBlocks.LEFT_DIRECTION_EU_SIGN.get(), ModBlocks.NO_PASSING_EU_SIGN.get(), ModBlocks.LEFT_CURVE_EU_SIGN.get(),
                ModBlocks.CATTLE_EU_SIGN.get(), ModBlocks.CAFE_EU_SIGN.get(), ModBlocks.NO_VEHICLES_EU_SIGN.get(), ModBlocks.DETOUR_AHEAD_EU_SIGN.get(),
                ModBlocks.NO_TRUCKS_EU_SIGN.get(), ModBlocks.BUS_EU_SIGN.get(), ModBlocks.DANGER_EU_SIGN.get(), ModBlocks.NO_ENTER_EU_SIGN.get(),
                ModBlocks.INTERSECTION_EU_SIGN.get(), ModBlocks.EIGHTY_SPEED_EU_SIGN.get(), ModBlocks.ASCEND_EU_SIGN.get(), ModBlocks.CYCLES_EU_SIGN.get(),
                ModBlocks.EMERGENCY_BAY_EU_SIGN.get(), ModBlocks.NO_PEDESTRIANS_EU_SIGN.get(), ModBlocks.PASS_LEFT_EU_SIGN.get(), ModBlocks.DESCEND_EU_SIGN.get(),
                ModBlocks.FIRST_AID_EU_SIGN.get(), ModBlocks.NO_BICYCLES_EU_SIGN.get(), ModBlocks.PRIORITY_OVER_ONCOMING_TRAFFIC_EU_SIGN.get(),
                ModBlocks.NO_THROUGH_ROAD_EU_SIGN.get(), ModBlocks.CREEPER_EU_SIGN.get(), ModBlocks.PRIORITY_ROAD_END_EU_SIGN.get(), ModBlocks.LEFT_DOUBLE_CURVE_EU_SIGN.get(),
                ModBlocks.BICYCLE_PATH_EU_SIGN.get(), ModBlocks.JAMS_EU_SIGN.get(), ModBlocks.KM_AHEAD_EU_SIGN.get(), ModBlocks.NO_PASSING_END_EU_SIGN.get(),
                ModBlocks.NO_TRUCK_PASSING_EU_SIGN.get(), ModBlocks.END_LINE_EU_SIGN.get(), ModBlocks.PASS_RIGHT_EU_SIGN.get(),
                ModBlocks.NO_PARKING_ALONG_CARRIAGEWAY_EU_SIGN.get(), ModBlocks.SIXTY_SPEED_EU_SIGN.get(), ModBlocks.PEDESTRIANS_EU_SIGN.get(),
                ModBlocks.CALMING_AREA_EU_SIGN.get(), ModBlocks.LEFT_TURN_ARROW_EU_SIGN.get(), ModBlocks.ONCOMING_TRAFFIC_EU_SIGN.get(), ModBlocks.LEFT_HERE_EU_SIGN.get(),
                ModBlocks.PRIORITY_EU_SIGN.get(), ModBlocks.DETOUR_LEFT_EU_SIGN.get(), ModBlocks.ONE_WAY_EU_SIGN.get(), ModBlocks.BUS_STOP_EU_SIGN.get(),
                ModBlocks.HIGHWAY_END_EU_SIGN.get(), ModBlocks.PEDESTRIAN_CROSSING_EU_SIGN.get(), ModBlocks.INFO_EU_SIGN.get(), ModBlocks.DISABLED_EU_SIGN.get(),
                ModBlocks.TEN_SPEED_EU_SIGN.get(), ModBlocks.CROSSBUCK_EU_SIGN.get(), ModBlocks.THIRTY_SPEED_EU_SIGN.get(), ModBlocks.HOTEL_EU_SIGN.get(),
                ModBlocks.GATE_EU_SIGN.get(), ModBlocks.PETROL_STATION_EU_SIGN.get(), ModBlocks.CHILDREN_EU_SIGN.get(), ModBlocks.CROSSWALK_EU_SIGN.get(),
                ModBlocks.END_CALMING_AREA_EU_SIGN.get(), ModBlocks.GUIDE_EU_SIGN.get(), ModBlocks.PARKING_GARAGE_EU_EU_SIGN.get(), ModBlocks.LEFT_RIGHT_EU_SIGN.get(),
                ModBlocks.HUNDRED_SPEED_EU_SIGN.get(), ModBlocks.NO_U_TURN_EU_SIGN.get(), ModBlocks.HUNDRED_TWENTY_SPEED_EU_SIGN.get(), ModBlocks.RAILROAD_EU_SIGN.get(),
                ModBlocks.REPAIR_EU_SIGN.get(), ModBlocks.RESTAURANT_EU_SIGN.get(), ModBlocks.RIGHT_ARROW_EU_SIGN.get(), ModBlocks.RIGHT_CURVE_EU_SIGN.get(),
                ModBlocks.RIGHT_DIRECTION_EU_SIGN.get(), ModBlocks.RIGHT_DOUBLE_CURVE_EU_SIGN.get(), ModBlocks.RIGHT_HERE_EU_SIGN.get(), ModBlocks.RIGHT_NARROWING_EU_SIGN.get(),
                ModBlocks.RIGHT_TURN_ARROW_EU_SIGN.get(), ModBlocks.ROADWORKS_EU_SIGN.get(), ModBlocks.ROCKFALL_EU_SIGN.get(), ModBlocks.ROUNDABOUT_EU_SIGN.get(),
                ModBlocks.SIDEWALK_EU_SIGN.get(), ModBlocks.SIGNAL_EU_SIGN.get(), ModBlocks.SLIPPERINESS_EU_SIGN.get(), ModBlocks.SNOW_EU_SIGN.get(), ModBlocks.STOP_EU_SIGN.get(),
                ModBlocks.STRAIGHT_AHEAD_EU_SIGN.get(), ModBlocks.STRAIGHT_LEFT_EU_SIGN.get(), ModBlocks.STRAIGHT_RIGHT_EU_SIGN.get(), ModBlocks.TAXI_EU_SIGN.get(),
                ModBlocks.TELEPHONE_EU_SIGN.get(), ModBlocks.UNEVEN_EU_SIGN.get(), ModBlocks.WARN_EU_SIGN.get(), ModBlocks.WARNING_BEACON_ALT_EU_SIGN.get(),
                ModBlocks.WARNING_BEACON_RIGHT_EU_SIGN.get(), ModBlocks.WARNING_BEACON_LEFT_EU_SIGN.get(), ModBlocks.WC_EU_SIGN.get(), ModBlocks.WEIGHT_EU_SIGN.get(),
                ModBlocks.WET_EU_SIGN.get(), ModBlocks.YIELD_RIGHT_OF_WAY_EU_SIGN.get(), ModBlocks.NATURE_RESERVE_EU_SIGN.get(), ModBlocks.MOTORWAY_EU_SIGN.get(),
                ModBlocks.MOTORWAY_END_EU_SIGN.get(), ModBlocks.WATER_PROTECTION_AREA_EU_SIGN.get(), ModBlocks.LEFT_AHEAD_EU_SIGN.get(), ModBlocks.RIGHT_AHEAD_EU_SIGN.get(),
                ModBlocks.REPAIR_US_SIGN.get(), ModBlocks.HILL_US_SIGN.get(), ModBlocks.GUIDE_US_SIGN.get(), ModBlocks.LEFT_ADDED_LINE_US_SIGN.get(), ModBlocks.INFO_US_SIGN.get(),
                ModBlocks.LEFT_ENTERING_ROADWAY_MERGE_US_SIGN.get(), ModBlocks.LEFT_ARROW_GREEN_US_SIGN.get(), ModBlocks.DOUBLE_ARROW_ORANGE_US_SIGN.get(),
                ModBlocks.HOTEL_US_SIGN.get(), ModBlocks.PEDESTRIANS_CROSSING_US_SIGN.get(), ModBlocks.RIGHT_ARROW_GREEN_US_SIGN.get(), ModBlocks.NO_BICYCLE_US_SIGN.get(),
                ModBlocks.LEFT_LANE_ENDS_US_SIGN.get(), ModBlocks.RIGHT_DIAGONAL_ARROW_GREEN_US_SIGN.get(), ModBlocks.LEFT_TURN_US_SIGN.get(),
                ModBlocks.HANDICAPPED_ACCESSIBLE_US_SIGN.get(), ModBlocks.RESTAURANT_US_SIGN.get(), ModBlocks.HAIRPIN_CURVE_US_SIGN.get(), ModBlocks.AIRPORT_US_SIGN.get(),
                ModBlocks.LEFT_DIRECTION_US_SIGN.get(), ModBlocks.RAILROAD_CROSSING_US_SIGN.get(), ModBlocks.RIGHT_ENTERING_ROADWAY_MERGE_US_SIGN.get(),
                ModBlocks.DRINKING_WATER_US_SIGN.get(), ModBlocks.CRAFT_CITY_EU_SIGN.get(), ModBlocks.NO_LEFT_TURN_US_SIGN.get(),
                ModBlocks.LEFT_DIAGONAL_ARROW_ORANGE_US_SIGN.get(), ModBlocks.BATHROOMS_US_SIGN.get(), ModBlocks.LITTER_BARREL_US_SIGN.get(), ModBlocks.NO_TRUCKS_US_SIGN.get(),
                ModBlocks.LEFT_TURN_ONLY_US_SIGN.get(), ModBlocks.FORTYFIVE_ADVISORY_SPEED_US_SIGN.get(), ModBlocks.LIGHT_RAIL_TRANSIT_STATION_US_SIGN.get(),
                ModBlocks.CRAFT_CITY_END_EU_SIGN.get(), ModBlocks.HOSPITAL_US_SIGN.get(), ModBlocks.GAS_STATION_US_SIGN.get(), ModBlocks.CATTLE_US_SIGN.get(),
                ModBlocks.HANDICAPED_CROSSING_US_SIGN.get(), ModBlocks.PICNIC_AREA_US_SIGN.get(), ModBlocks.NO_U_TURN_US_SIGN.get(),
                ModBlocks.RIGHT_DIAGONAL_ARROW_ORANGE_US_SIGN.get(), ModBlocks.RIGHT_ADDED_LINE_US_SIGN.get(), ModBlocks.RIGHT_LANE_ENDS_US_SIGN.get(),
                ModBlocks.LEFT_SIDE_ROAD_US_SIGN.get(), ModBlocks.PLAYGROUND_AHEAD_US_SIGN.get(), ModBlocks.DIESEL_STATION_US_SIGN.get(),
                ModBlocks.THIRTYFIVE_ADVISORY_SPEED_US_SIGN.get(), ModBlocks.LEFT_DIAGONAL_ARROW_YELLOW_US_SIGN.get(), ModBlocks.CREEPER_US_SIGN.get(),
                ModBlocks.LEFT_DIAGONAL_ARROW_GREEN_US_SIGN.get(), ModBlocks.LOUNDRY_FACILITY_US_SIGN.get(), ModBlocks.NO_PARKING_US_SIGN.get(),
                ModBlocks.TWENTYFIVE_ADVISORY_SPEED_US_SIGN.get(), ModBlocks.DOUBLE_ARROW_YELLOW_US_SIGN.get(), ModBlocks.CAMPING_US_SIGN.get(),
                ModBlocks.RIGHT_CURVE_US_SIGN.get(), ModBlocks.LEFT_ARROW_YELLOW_US_SIGN.get(), ModBlocks.LEFT_CURVE_US_SIGN.get(), ModBlocks.CIRCULAR_INTERSECTION_US_SIGN.get(),
                ModBlocks.LEFT_MERGING_TRAFFIC_US_SIGN.get(), ModBlocks.DIVIDED_HIGHWAY_US_SIGN.get(), ModBlocks.NO_PEDESTRIANS_US_SIGN.get(), ModBlocks.CROSSBUCK_US_SIGN.get(),
                ModBlocks.RIGHT_ARROW_ORANGE_US_SIGN.get(), ModBlocks.ELECTRIC_STATION_US_SIGN.get(), ModBlocks.BICYCLE_CROSSING_US_SIGN.get(),
                ModBlocks.LEFT_REVERSE_TURN_US_SIGN.get(), ModBlocks.LEFT_ARROW_ORANGE_US_SIGN.get(), ModBlocks.MEDICAL_SERVICE_US_SIGN.get(),
                ModBlocks.RIGHT_ARROW_YELLOW_US_SIGN.get(), ModBlocks.RIGHT_DIRECTION_US_SIGN.get(), ModBlocks.NO_RIGHT_TURN_US_SIGN.get(), ModBlocks.CROSS_ROAD_US_SIGN.get(),
                ModBlocks.DOUBLE_ARROW_GREEN_US_SIGN.get(), ModBlocks.RIGHT_DIAGONAL_ARROW_YELLOW_US_SIGN.get(), ModBlocks.RIGHT_MERGING_TRAFFIC_US_SIGN.get(),
                ModBlocks.RIGHT_REVERSE_TURN_US_SIGN.get(), ModBlocks.RIGHT_SIDE_ROAD_US_SIGN.get(), ModBlocks.RIGHT_TURN_ONLY_US_SIGN.get(), ModBlocks.RIGHT_TURN_US_SIGN.get(),
                ModBlocks.ROAD_NARROWS_US_SIGN.get(), ModBlocks.SIDE_ROAD_AT_ANGLE_LEFT_US_SIGN.get(), ModBlocks.SIDE_ROAD_AT_ANGLE_RIGHT_US_SIGN.get(),
                ModBlocks.SIGNAL_US_SIGN.get(), ModBlocks.SLIPPERY_US_SIGN.get(), ModBlocks.STRAIGHT_AHEAD_ONLY_US_SIGN.get(), ModBlocks.SWIMMING_AREA_US_SIGN.get(),
                ModBlocks.T_INTERSECTION_US_SIGN.get(), ModBlocks.TELEPHONE_US_SIGN.get(), ModBlocks.TRUCK_CROSSING_US_SIGN.get(), ModBlocks.TRUCK_ROLLOVER_WARNING_US_SIGN.get(),
                ModBlocks.TWO_WAY_TRAFFIC_US_SIGN.get(), ModBlocks.VERY_SHARP_CURVE_US_SIGN.get(), ModBlocks.WINTER_RECREATION_AREA_US_SIGN.get(),
                ModBlocks.WINDING_ROAD_US_SIGN.get(), ModBlocks.WORKERS_US_SIGN.get(), ModBlocks.Y_INTERSECTION_US_SIGN.get(), ModBlocks.EXIT_CLOSED_US_SIGN.get(),
                ModBlocks.NO_HAZARDOUS_CARGO_EU_SIGN.get(), ModBlocks.M_AHEAD_EU_SIGN.get(), ModBlocks.AHEAD_YELLOW_US_SIGN.get(), ModBlocks.BICYCLE_PATH_RIGHT_EU_SIGN.get(),
                ModBlocks.BICYCLE_HIGHWAY_END_EU_SIGN.get(), ModBlocks.TEN_MINIMUM_SPEED_SIGN_EU.get(), ModBlocks.HIGHWAY_COUNTDOWN_MARKER_200_EU_SIGN.get(),
                ModBlocks.BICYCLE_PATH_LEFT_EU_SIGN.get(), ModBlocks.BICYCLE_ROUTE_AHEAD_EU_SIGN.get(), ModBlocks.FEDERAL_HIGHWAY_COUNTDOWN_MARKER_100_EU_SIGN.get(),
                ModBlocks.HIGHWAY_COUNTDOWN_MARKER_300_EU_SIGN.get(), ModBlocks.BRIDLE_PATH_EU_SIGN.get(), ModBlocks.DETOUR_END_EU_SIGN.get(), ModBlocks.DETOUR_LEFT_US_SIGN.get(),
                ModBlocks.FEDERAL_HIGHWAY_COUNTDOWN_MARKER_200_EU_SIGN.get(), ModBlocks.DETOUR_RIGHT_US_SIGN.get(), ModBlocks.AHEAD_GREEN_US_SIGN.get(),
                ModBlocks.MOVABLE_BRIDGE_EU_SIGN.get(), ModBlocks.HIGHWAY_COUNTDOWN_MARKER_100_EU_SIGN.get(), ModBlocks.BICYCLE_PATH_US_SIGN.get(),
                ModBlocks.THIRTY_MINIMUM_SPEED_SIGN_EU.get(), ModBlocks.CHARGING_STATION_EU_SIGN.get(), ModBlocks.BICYCLE_ROUTE_LEFT_EU_SIGN.get(),
                ModBlocks.LOOSE_GRAVEL_EU_SIGN.get(), ModBlocks.FEDERAL_HIGHWAY_COUNTDOWN_MARKER_300_EU_SIGN.get(), ModBlocks.BICYCLE_HIGHWAY_EU_SIGN.get(),
                ModBlocks.PARKING_AREA_END_EU_SIGN.get(), ModBlocks.BICYCLE_PATH_AHEAD_EU_SIGN.get(), ModBlocks.NO_MONSTER_EU_SIGN.get(), ModBlocks.AHEAD_ORANGE_US_SIGN.get(),
                ModBlocks.BICYCLE_ROUTE_RIGHT_EU_SIGN.get(), ModBlocks.LEFT_PRIORITY_ROAD_EU_SIGN.get(), ModBlocks.PARKING_AREA_START_EU_SIGN.get(),
                ModBlocks.PRIORITY_ROAD_FROM_LEFT_EU_SIGN.get(), ModBlocks.PRIORITY_ROAD_FROM_RIGHT_EU_SIGN.get(), ModBlocks.RAILWAY_COUNTDOWN_MARKER_80_EU_SIGN.get(),
                ModBlocks.RAILWAY_COUNTDOWN_MARKER_160_EU_SIGN.get(), ModBlocks.RAILWAY_COUNTDOWN_MARKER_240_EU_SIGN.get(), ModBlocks.RIGHT_PRIORITY_ROAD_EU_SIGN.get(),
                ModBlocks.SHORE_EU_SIGN.get(), ModBlocks.TREE_OVERHANG_EU_SIGN.get(), ModBlocks.TRUCK_ROUTE_AHEAD_EU_SIGN.get(), ModBlocks.TRUCK_ROUTE_RIGHT_EU_SIGN.get(),
                ModBlocks.TRUCK_ROUTE_LEFT_EU_SIGN.get(), ModBlocks.WARN_US_SIGN.get(), ModBlocks.WARNING_BEACON_ALT_US_SIGN.get(), ModBlocks.WARNING_BEACON_LEFT_US_SIGN.get(),
                ModBlocks.WARNING_BEACON_RIGHT_US_SIGN.get(), ModBlocks.ONCOMING_TRAFFIC_CN_SIGN.get(), ModBlocks.INTERSECTION_CN_SIGN.get(),
                ModBlocks.DETOUR_LEFT_OR_RIGHT_CN_SIGN.get(), ModBlocks.PEDESTRIAN_CROSSING_CN_SIGN.get(), ModBlocks.EMERGENCY_BAY_CN_SIGN.get(), ModBlocks.CATTLE_CN_SIGN.get(),
                ModBlocks.NARROWING_CN_SIGN.get(), ModBlocks.DESCEND_CN_SIGN.get(), ModBlocks.CHILDREN_CN_SIGN.get(), ModBlocks.FIFTY_ADVISORY_SPEED_CN_SIGN.get(),
                ModBlocks.JAMS_CN_SIGN.get(), ModBlocks.DANGER_CN_SIGN.get(), ModBlocks.RIGHT_DOUBLE_CURVE_CN_SIGN.get(), ModBlocks.RAILROAD_CN_SIGN.get(),
                ModBlocks.DETOUR_LEFT_CN_SIGN.get(), ModBlocks.CREEPER_CN_SIGN.get(), ModBlocks.ASCEND_CN_SIGN.get(), ModBlocks.GAS_STATION_CN_SIGN.get(),
                ModBlocks.PARKING_CN_SIGN.get(), ModBlocks.BUMP_CN_SIGN.get(), ModBlocks.LEFT_DIRECTION_CN_SIGN.get(), ModBlocks.RIGHT_NARROWING_CN_SIGN.get(),
                ModBlocks.INFO_CN_SIGN.get(), ModBlocks.CYCLES_CN_SIGN.get(), ModBlocks.PRIORITY_CN_SIGN.get(), ModBlocks.CAMPING_CN_SIGN.get(), ModBlocks.ROUNDABOUT_CN_SIGN.get(),
                ModBlocks.SHORE_CN_SIGN.get(), ModBlocks.HIGHWAY_CN_SIGN.get(), ModBlocks.RIGHT_CURVE_CN_SIGN.get(), ModBlocks.LEFT_NARROWING_CN_SIGN.get(),
                ModBlocks.NATURE_RESERVE_AREA_CN_SIGN.get(), ModBlocks.LEFT_MERGING_TRAFFIC_CN_SIGN.get(), ModBlocks.HIGHWAY_END_CN_SIGN.get(),
                ModBlocks.LEFT_DOUBLE_CURVE_CN_SIGN.get(), ModBlocks.GATE_CN_SIGN.get(), ModBlocks.ROCKFALL_CN_SIGN.get(), ModBlocks.PARKING_GARAGE_CN_SIGN.get(),
                ModBlocks.DETOUR_RIGHT_CN_SIGN.get(), ModBlocks.THIRTY_ADVISORY_SPEED_CN_SIGN.get(), ModBlocks.RIGHT_DIRECTION_CN_SIGN.get(), ModBlocks.NARROW_BRIDGE_CN_SIGN.get(),
                ModBlocks.FORTY_ADVISORY_SPEED_CN_SIGN.get(), ModBlocks.ONE_WAY_CN_SIGN.get(), ModBlocks.ROADWORKS_CN_SIGN.get(), ModBlocks.RIGHT_MERGING_TRAFFIC_CN_SIGN.get(),
                ModBlocks.LEFT_CURVE_CN_SIGN.get(), ModBlocks.GUIDE_CN_SIGN.get(), ModBlocks.SIDE_ROAD_AT_ANGLE_LEFT_CN_SIGN.get(),
                ModBlocks.SIDE_ROAD_AT_ANGLE_RIGHT_CN_SIGN.get(), ModBlocks.SIDE_ROAD_AT_LEFT_CN_SIGN.get(), ModBlocks.SIDE_ROAD_AT_RIGHT_CN_SIGN.get(),
                ModBlocks.SIGNAL_CN_SIGN.get(), ModBlocks.SLIPPERINESS_CN_SIGN.get(), ModBlocks.SLOW_CN_SIGN.get(), ModBlocks.SNOW_CN_SIGN.get(), ModBlocks.STOP_CN_SIGN.get(),
                ModBlocks.T_INTERSECTION_CN_SIGN.get(), ModBlocks.TELEPHONE_CN_SIGN.get(), ModBlocks.UNEVEN_ROAD_CN_SIGN.get(), ModBlocks.ROUND_SIGN.get(),
                ModBlocks.TRIANGLE_SIGN.get(), ModBlocks.RECTANGLE_SIGN.get(), ModBlocks.SQUARE_SIGN.get(), ModBlocks.CROSS_SIGN.get(), ModBlocks.UPSIDE_DOWN_TRIANGLE_SIGN.get(),
                ModBlocks.RHOMBUS_SIGN.get(), ModBlocks.OCTAGON_SIGN.get(), ModBlocks.BAKE_SIGN.get(), ModBlocks.ENTERING_PROHIBITED_SIGN.get(),
                ModBlocks.HEAVY_LOAD_PROHIBITED_SIGN.get(), ModBlocks.LASER_WARNING_SIGN.get(), ModBlocks.GLOVES_MANDATORY_SIGN.get(), ModBlocks.MANDATORY_SIGN.get(),
                ModBlocks.FIRE_EXTINGUISHER_SIGN.get(), ModBlocks.DRINKING_PROHIBITED_SIGN.get(), ModBlocks.BOOTS_MANDATORY_SIGN.get(), ModBlocks.EMERGENCY_EXIT_LEFT_SIGN.get(),
                ModBlocks.FIRE_TELEPHONE_SIGN.get(), ModBlocks.HELMET_MANDATORY_SIGN.get(), ModBlocks.HOT_WARNING_SIGN.get(), ModBlocks.EXPLOSION_WARNING_SIGN.get(),
                ModBlocks.EMERGENCY_EXIT_SIGN.get(), ModBlocks.EMERGENCY_TELEFONE_SIGN.get(), ModBlocks.EMERGENCY_EXIT_DOWNWARDS_SIGN.get(), ModBlocks.MONSTER_WARNING_SIGN.get(),
                ModBlocks.MAGNETIC_WARNING_SIGN.get(), ModBlocks.FIRE_WARNING_SIGN.get(), ModBlocks.BIOHAZARD_WARNING_SIGN.get(), ModBlocks.ASSEMBLY_POINT_SIGN.get(),
                ModBlocks.EMERGENCY_EXIT_RIGHT_SIGN.get(), ModBlocks.EATING_PROHIBITED_SIGN.get(), ModBlocks.EMERGENCY_EXIT_AHEAD_SIGN.get(), ModBlocks.ARMOR_MANDATORY_SIGN.get(),
                ModBlocks.EXIT_SIGN.get(), ModBlocks.SIGN_0.get(), ModBlocks.SIGN_1.get(), ModBlocks.SIGN_2.get(), ModBlocks.SIGN_3.get(), ModBlocks.SIGN_4.get(),
                ModBlocks.SIGN_5.get(), ModBlocks.SIGN_6.get(), ModBlocks.SIGN_7.get(), ModBlocks.SIGN_8.get(), ModBlocks.SIGN_9.get(), ModBlocks.A_SIGN.get(),
                ModBlocks.B_SIGN.get(), ModBlocks.C_SIGN.get(), ModBlocks.D_SIGN.get(), ModBlocks.E_SIGN.get(), ModBlocks.F_SIGN.get(), ModBlocks.G_SIGN.get(),
                ModBlocks.H_SIGN.get(), ModBlocks.I_SIGN.get(), ModBlocks.J_SIGN.get(), ModBlocks.K_SIGN.get(), ModBlocks.L_SIGN.get(), ModBlocks.M_SIGN.get(),
                ModBlocks.N_SIGN.get(), ModBlocks.O_SIGN.get(), ModBlocks.P_SIGN.get(), ModBlocks.Q_SIGN.get(), ModBlocks.R_SIGN.get(), ModBlocks.S_SIGN.get(),
                ModBlocks.T_SIGN.get(), ModBlocks.U_SIGN.get(), ModBlocks.V_SIGN.get(), ModBlocks.W_SIGN.get(), ModBlocks.X_SIGN.get(), ModBlocks.Y_SIGN.get(),
                ModBlocks.Z_SIGN.get(), ModBlocks.EXCLAMATION_SIGN.get(), ModBlocks.QUESTION_SIGN.get(), ModBlocks.GAS_CYLINDER_WARNING_SIGN.get(), ModBlocks.FIRST_AID_SIGN.get(),
                ModBlocks.FIRE_ALARM_SIGN.get(), ModBlocks.PEDESTRIANS_PROHIBITED_SIGN.get(), ModBlocks.PHONES_PROHIBITED_SIGN.get(), ModBlocks.PROHIBITION_SIGN.get(),
                ModBlocks.RADIATION_WARNING_SIGN.get(), ModBlocks.SMOKING_PROHIBITED_SIGN.get(), ModBlocks.TOXIC_WARNING_SIGN.get(), ModBlocks.UNAUTHORISED_PROHIBITED_SIGN.get(),
                ModBlocks.VOLTAGE_WARNING_SIGN.get(), ModBlocks.WARNING_SIGN.get(), ModBlocks.IRON_FENCE.get(), ModBlocks.TRAFFIC_BARRIER.get(),
                ModBlocks.RED_WHITE_TRAFFIC_BARRIER.get(), ModBlocks.YELLOW_BLACK_TRAFFIC_BARRIER.get(), ModBlocks.DOUBLE_TRAFFIC_BARRIER.get(),
                ModBlocks.DOUBLE_RED_WHITE_TRAFFIC_BARRIER.get(), ModBlocks.DOUBLE_YELLOW_BLACK_TRAFFIC_BARRIER.get(), ModBlocks.BLACK_CONCRETE_WALL.get(),
                ModBlocks.WHITE_CONCRETE_WALL.get(), ModBlocks.ORANGE_CONCRETE_WALL.get(), ModBlocks.MAGENTA_CONCRETE_WALL.get(), ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(),
                ModBlocks.YELLOW_CONCRETE_WALL.get(), ModBlocks.LIME_CONCRETE_WALL.get(), ModBlocks.PINK_CONCRETE_WALL.get(), ModBlocks.GRAY_CONCRETE_WALL.get(),
                ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), ModBlocks.CYAN_CONCRETE_WALL.get(), ModBlocks.PURPLE_CONCRETE_WALL.get(), ModBlocks.BLUE_CONCRETE_WALL.get(),
                ModBlocks.BROWN_CONCRETE_WALL.get(), ModBlocks.GREEN_CONCRETE_WALL.get(), ModBlocks.RED_CONCRETE_WALL.get(), ModBlocks.ASPHALT_WITH_WHITE_BICYCLE.get(),
                ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LEFT_ARROW.get(), ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_RIGHT_ARROW.get(), ModBlocks.ASPHALT_WITH_WHITE_HANDICAPPED.get(),
                ModBlocks.ASPHALT_WITH_WHITE_PEDESTRIAN.get(), ModBlocks.ASPHALT_WITH_WHITE_TRIANGLE.get(), ModBlocks.ASPHALT_WITH_YELLOW_BICYCLE.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LEFT_ARROW.get(), ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_RIGHT_ARROW.get(), ModBlocks.ASPHALT_WITH_YELLOW_HANDICAPPED.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_PEDESTRIAN.get(), ModBlocks.ASPHALT_WITH_YELLOW_TRIANGLE.get(), ModBlocks.ASPHALT_WITH_WHITE_BICYCLE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LEFT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_RIGHT_ARROW_SLAB.get(),
                ModBlocks.ASPHALT_WITH_WHITE_HANDICAPPED_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_PEDESTRIAN_SLAB.get(), ModBlocks.ASPHALT_WITH_WHITE_TRIANGLE_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_BICYCLE_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LEFT_ARROW_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_RIGHT_ARROW_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_HANDICAPPED_SLAB.get(),
                ModBlocks.ASPHALT_WITH_YELLOW_PEDESTRIAN_SLAB.get(), ModBlocks.ASPHALT_WITH_YELLOW_TRIANGLE_SLAB.get(), ModBlocks.VARIABLE_TRAFFIC_SIGN.get(),
                ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_OPEN.get(), ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_CLOSED.get(), ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_CHANGE_LEFT.get(),
                ModBlocks.VARIABLE_TRAFFIC_SIGN_LANE_CHANGE_RIGHT.get(), ModBlocks.VARIABLE_TRAFFIC_SIGN_SIXTY_SPEED_LIMIT.get(),
                ModBlocks.VARIABLE_TRAFFIC_SIGN_EIGHTY_SPEED_LIMIT.get(), ModBlocks.VARIABLE_TRAFFIC_SIGN_HUNDRED_SPEED_LIMIT.get(),
                ModBlocks.VARIABLE_TRAFFIC_SIGN_HUNDRED_TWENTY_SPEED_LIMIT.get(), ModBlocks.VARIABLE_TRAFFIC_SIGN_CREEPER.get(), ModBlocks.VARIABLE_TRAFFIC_SIGN_DANGER.get(),
                ModBlocks.VARIABLE_TRAFFIC_SIGN_END_ALL_LIMITS.get(), ModBlocks.VARIABLE_TRAFFIC_SIGN_JAMS.get(), ModBlocks.VARIABLE_TRAFFIC_SIGN_NO_PASSING.get(),
                ModBlocks.VARIABLE_TRAFFIC_SIGN_NO_TRUCK_PASSING.get(), ModBlocks.VARIABLE_TRAFFIC_SIGN_ROADWORKS.get(), ModBlocks.VARIABLE_TRAFFIC_SIGN_SLIPPERINESS.get(),
                ModBlocks.BICYCLE_DOUBLE_TRAFFIC_LIGHT.get(), ModBlocks.BICYCLE_TRIPLE_TRAFFIC_LIGHT.get(), ModBlocks.DANGER_SIGNAL_LIGHT.get(),
                ModBlocks.DOUBLE_TRAFFIC_LIGHT.get(), ModBlocks.LEFT_TURN_DOUBLE_TRAFFIC_LIGHT.get(), ModBlocks.LEFT_TURN_TRIPLE_TRAFFIC_LIGHT.get(),
                ModBlocks.PEDESTRIAN_DOUBLE_TRAFFIC_LIGHT.get(), ModBlocks.PEDESTRIAN_SIGNAL_LIGHT.get(), ModBlocks.PEDESTRIAN_TRIPLE_TRAFFIC_LIGHT.get(),
                ModBlocks.RIGHT_TURN_DOUBLE_TRAFFIC_LIGHT.get(), ModBlocks.RIGHT_TURN_TRIPLE_TRAFFIC_LIGHT.get(), ModBlocks.SIGNAL_LIGHT.get(),
                ModBlocks.STRAIGHT_DOUBLE_TRAFFIC_LIGHT.get(), ModBlocks.STRAIGHT_TRIPLE_TRAFFIC_LIGHT.get(), ModBlocks.TRAIN_SIGNAL_LIGHT.get(),
                ModBlocks.TRIPLE_TRAFFIC_LIGHT.get(), ModBlocks.BLACK_LAMP.get(), ModBlocks.WHITE_LAMP.get(), ModBlocks.ORANGE_LAMP.get(), ModBlocks.MAGENTA_LAMP.get(),
                ModBlocks.LIGHT_BLUE_LAMP.get(), ModBlocks.YELLOW_LAMP.get(), ModBlocks.LIME_LAMP.get(), ModBlocks.PINK_LAMP.get(), ModBlocks.GRAY_LAMP.get(),
                ModBlocks.LIGHT_GRAY_LAMP.get(), ModBlocks.CYAN_LAMP.get(), ModBlocks.PURPLE_LAMP.get(), ModBlocks.BLUE_LAMP.get(), ModBlocks.BROWN_LAMP.get(),
                ModBlocks.GREEN_LAMP.get(), ModBlocks.RED_LAMP.get(), ModBlocks.STREET_LANTERN.get(), ModBlocks.MODERN_STREET_LANTERN.get(), ModBlocks.STREET_LANTERN_PANEL.get(),
                ModBlocks.BLACK_NEON_LIGHT.get(), ModBlocks.WHITE_NEON_LIGHT.get(), ModBlocks.ORANGE_NEON_LIGHT.get(), ModBlocks.MAGENTA_NEON_LIGHT.get(),
                ModBlocks.LIGHT_BLUE_NEON_LIGHT.get(), ModBlocks.YELLOW_NEON_LIGHT.get(), ModBlocks.LIME_NEON_LIGHT.get(), ModBlocks.PINK_NEON_LIGHT.get(),
                ModBlocks.GRAY_NEON_LIGHT.get(), ModBlocks.LIGHT_GRAY_NEON_LIGHT.get(), ModBlocks.CYAN_NEON_LIGHT.get(), ModBlocks.PURPLE_NEON_LIGHT.get(),
                ModBlocks.BLUE_NEON_LIGHT.get(), ModBlocks.BROWN_NEON_LIGHT.get(), ModBlocks.GREEN_NEON_LIGHT.get(), ModBlocks.RED_NEON_LIGHT.get(),
                ModBlocks.CRACKED_WHITE_CONCRETE.get(), ModBlocks.CRACKED_LIGHT_GRAY_CONCRETE.get(), ModBlocks.CRACKED_GRAY_CONCRETE.get(), ModBlocks.CRACKED_BLACK_CONCRETE.get(),
                ModBlocks.CRACKED_BROWN_CONCRETE.get(), ModBlocks.CRACKED_RED_CONCRETE.get(), ModBlocks.CRACKED_ORANGE_CONCRETE.get(), ModBlocks.CRACKED_YELLOW_CONCRETE.get(),
                ModBlocks.CRACKED_LIME_CONCRETE.get(), ModBlocks.CRACKED_GREEN_CONCRETE.get(), ModBlocks.CRACKED_CYAN_CONCRETE.get(), ModBlocks.CRACKED_LIGHT_BLUE_CONCRETE.get(),
                ModBlocks.CRACKED_BLUE_CONCRETE.get(), ModBlocks.CRACKED_PURPLE_CONCRETE.get(), ModBlocks.CRACKED_MAGENTA_CONCRETE.get(), ModBlocks.CRACKED_PINK_CONCRETE.get(),
                ModBlocks.MOSSY_GRAY_CONCRETE.get(), ModBlocks.MOSSY_BLACK_CONCRETE.get(), ModBlocks.MOSSY_BROWN_CONCRETE.get(), ModBlocks.MOSSY_RED_CONCRETE.get(),
                ModBlocks.MOSSY_ORANGE_CONCRETE.get(), ModBlocks.MOSSY_YELLOW_CONCRETE.get(), ModBlocks.MOSSY_LIME_CONCRETE.get(), ModBlocks.MOSSY_GREEN_CONCRETE.get(),
                ModBlocks.MOSSY_CYAN_CONCRETE.get(), ModBlocks.MOSSY_LIGHT_BLUE_CONCRETE.get(), ModBlocks.MOSSY_BLUE_CONCRETE.get(), ModBlocks.MOSSY_PURPLE_CONCRETE.get(),
                ModBlocks.MOSSY_MAGENTA_CONCRETE.get(), ModBlocks.MOSSY_PINK_CONCRETE.get(), ModBlocks.INFESTED_BLACK_CONCRETE.get(), ModBlocks.INFESTED_WHITE_CONCRETE.get(),
                ModBlocks.INFESTED_GRAY_CONCRETE.get(), ModBlocks.INFESTED_LIGHT_GRAY_CONCRETE.get(), ModBlocks.CHISELED_WHITE_CONCRETE.get(),
                ModBlocks.CHISELED_LIGHT_GRAY_CONCRETE.get(), ModBlocks.CHISELED_GRAY_CONCRETE.get(), ModBlocks.CHISELED_BLACK_CONCRETE.get(),
                ModBlocks.CHISELED_BROWN_CONCRETE.get(), ModBlocks.CHISELED_RED_CONCRETE.get(), ModBlocks.CHISELED_ORANGE_CONCRETE.get(), ModBlocks.CHISELED_YELLOW_CONCRETE.get(),
                ModBlocks.CHISELED_LIME_CONCRETE.get(), ModBlocks.CHISELED_GREEN_CONCRETE.get(), ModBlocks.CHISELED_CYAN_CONCRETE.get(),
                ModBlocks.CHISELED_LIGHT_BLUE_CONCRETE.get(), ModBlocks.CHISELED_BLUE_CONCRETE.get(), ModBlocks.CHISELED_PURPLE_CONCRETE.get(),
                ModBlocks.CHISELED_MAGENTA_CONCRETE.get(), ModBlocks.CHISELED_PINK_CONCRETE.get(), ModBlocks.CHISELED_WHITE_CONCRETE.get(),
                ModBlocks.POLISHED_LIGHT_GRAY_CONCRETE.get(), ModBlocks.POLISHED_GRAY_CONCRETE.get(), ModBlocks.POLISHED_BLACK_CONCRETE.get(),
                ModBlocks.POLISHED_BROWN_CONCRETE.get(), ModBlocks.POLISHED_RED_CONCRETE.get(), ModBlocks.POLISHED_ORANGE_CONCRETE.get(), ModBlocks.POLISHED_YELLOW_CONCRETE.get(),
                ModBlocks.POLISHED_LIME_CONCRETE.get(), ModBlocks.POLISHED_GREEN_CONCRETE.get(), ModBlocks.POLISHED_CYAN_CONCRETE.get(),
                ModBlocks.POLISHED_LIGHT_BLUE_CONCRETE.get(), ModBlocks.POLISHED_BLUE_CONCRETE.get(), ModBlocks.POLISHED_PURPLE_CONCRETE.get(),
                ModBlocks.POLISHED_MAGENTA_CONCRETE.get(), ModBlocks.POLISHED_PINK_CONCRETE.get(), ModBlocks.WHITE_CONCRETE_PILLAR.get(),
                ModBlocks.LIGHT_GRAY_CONCRETE_PILLAR.get(), ModBlocks.GRAY_CONCRETE_PILLAR.get(), ModBlocks.BLACK_CONCRETE_PILLAR.get(), ModBlocks.BROWN_CONCRETE_PILLAR.get(),
                ModBlocks.RED_CONCRETE_PILLAR.get(), ModBlocks.ORANGE_CONCRETE_PILLAR.get(), ModBlocks.YELLOW_CONCRETE_PILLAR.get(), ModBlocks.LIME_CONCRETE_PILLAR.get(),
                ModBlocks.GREEN_CONCRETE_PILLAR.get(), ModBlocks.CYAN_CONCRETE_PILLAR.get(), ModBlocks.LIGHT_BLUE_CONCRETE_PILLAR.get(), ModBlocks.BLUE_CONCRETE_PILLAR.get(),
                ModBlocks.PURPLE_CONCRETE_PILLAR.get(), ModBlocks.MAGENTA_CONCRETE_PILLAR.get(), ModBlocks.PINK_CONCRETE_PILLAR.get(), ModBlocks.WHITE_CONCRETE_STAIRS.get(),
                ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), ModBlocks.GRAY_CONCRETE_STAIRS.get(), ModBlocks.BLACK_CONCRETE_STAIRS.get(), ModBlocks.BROWN_CONCRETE_STAIRS.get(),
                ModBlocks.RED_CONCRETE_STAIRS.get(), ModBlocks.ORANGE_CONCRETE_STAIRS.get(), ModBlocks.YELLOW_CONCRETE_STAIRS.get(), ModBlocks.LIME_CONCRETE_STAIRS.get(),
                ModBlocks.GREEN_CONCRETE_STAIRS.get(), ModBlocks.CYAN_CONCRETE_STAIRS.get(), ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), ModBlocks.BLUE_CONCRETE_STAIRS.get(),
                ModBlocks.PURPLE_CONCRETE_STAIRS.get(), ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), ModBlocks.PINK_CONCRETE_STAIRS.get(), ModBlocks.WHITE_CONCRETE_SLAB.get(),
                ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), ModBlocks.GRAY_CONCRETE_SLAB.get(), ModBlocks.BLACK_CONCRETE_SLAB.get(), ModBlocks.BROWN_CONCRETE_SLAB.get(),
                ModBlocks.RED_CONCRETE_SLAB.get(), ModBlocks.ORANGE_CONCRETE_SLAB.get(), ModBlocks.YELLOW_CONCRETE_SLAB.get(), ModBlocks.LIME_CONCRETE_SLAB.get(),
                ModBlocks.GREEN_CONCRETE_SLAB.get(), ModBlocks.CYAN_CONCRETE_SLAB.get(), ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), ModBlocks.BLUE_CONCRETE_SLAB.get(),
                ModBlocks.PURPLE_CONCRETE_SLAB.get(), ModBlocks.MAGENTA_CONCRETE_SLAB.get(), ModBlocks.PINK_CONCRETE_SLAB.get(), ModBlocks.WHITE_CONCRETE_BUTTON.get(),
                ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get(), ModBlocks.GRAY_CONCRETE_BUTTON.get(), ModBlocks.BLACK_CONCRETE_BUTTON.get(), ModBlocks.BROWN_CONCRETE_BUTTON.get(),
                ModBlocks.RED_CONCRETE_BUTTON.get(), ModBlocks.ORANGE_CONCRETE_BUTTON.get(), ModBlocks.YELLOW_CONCRETE_BUTTON.get(), ModBlocks.LIME_CONCRETE_BUTTON.get(),
                ModBlocks.GREEN_CONCRETE_BUTTON.get(), ModBlocks.CYAN_CONCRETE_BUTTON.get(), ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get(), ModBlocks.BLUE_CONCRETE_BUTTON.get(),
                ModBlocks.PURPLE_CONCRETE_BUTTON.get(), ModBlocks.MAGENTA_CONCRETE_BUTTON.get(), ModBlocks.PINK_CONCRETE_BUTTON.get(),
                ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get(), ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get(), ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get(),
                ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get(), ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get(), ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get(),
                ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get(), ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get(), ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get(),
                ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get(), ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get(), ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get(),
                ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get(), ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get(), ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get(),
                ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get(), ModBlocks.WHITE_CONCRETE_LEVER.get(), ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.get(), ModBlocks.GRAY_CONCRETE_LEVER.get(),
                ModBlocks.BLACK_CONCRETE_LEVER.get(), ModBlocks.BROWN_CONCRETE_LEVER.get(), ModBlocks.RED_CONCRETE_LEVER.get(), ModBlocks.ORANGE_CONCRETE_LEVER.get(),
                ModBlocks.YELLOW_CONCRETE_LEVER.get(), ModBlocks.LIME_CONCRETE_LEVER.get(), ModBlocks.GREEN_CONCRETE_LEVER.get(), ModBlocks.CYAN_CONCRETE_LEVER.get(),
                ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.get(), ModBlocks.BLUE_CONCRETE_LEVER.get(), ModBlocks.PURPLE_CONCRETE_LEVER.get(), ModBlocks.MAGENTA_CONCRETE_LEVER.get(),
                ModBlocks.PINK_CONCRETE_LEVER.get(), ModBlocks.WHITE_CONCRETE_BRICKS.get(), ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS.get(), ModBlocks.GRAY_CONCRETE_BRICKS.get(),
                ModBlocks.BLACK_CONCRETE_BRICKS.get(), ModBlocks.BROWN_CONCRETE_BRICKS.get(), ModBlocks.RED_CONCRETE_BRICKS.get(), ModBlocks.ORANGE_CONCRETE_BRICKS.get(),
                ModBlocks.YELLOW_CONCRETE_BRICKS.get(), ModBlocks.LIME_CONCRETE_BRICKS.get(), ModBlocks.GREEN_CONCRETE_BRICKS.get(), ModBlocks.CYAN_CONCRETE_BRICKS.get(),
                ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS.get(), ModBlocks.BLUE_CONCRETE_BRICKS.get(), ModBlocks.PURPLE_CONCRETE_BRICKS.get(), ModBlocks.MAGENTA_CONCRETE_BRICKS.get(),
                ModBlocks.PINK_CONCRETE_BRICKS.get(), ModBlocks.WHITE_CONCRETE_CRACKED_BRICKS.get(), ModBlocks.LIGHT_GRAY_CONCRETE_CRACKED_BRICKS.get(),
                ModBlocks.GRAY_CONCRETE_CRACKED_BRICKS.get(), ModBlocks.BLACK_CONCRETE_CRACKED_BRICKS.get(), ModBlocks.BROWN_CONCRETE_CRACKED_BRICKS.get(),
                ModBlocks.RED_CONCRETE_CRACKED_BRICKS.get(), ModBlocks.ORANGE_CONCRETE_CRACKED_BRICKS.get(), ModBlocks.YELLOW_CONCRETE_CRACKED_BRICKS.get(),
                ModBlocks.LIME_CONCRETE_CRACKED_BRICKS.get(), ModBlocks.GREEN_CONCRETE_CRACKED_BRICKS.get(), ModBlocks.CYAN_CONCRETE_CRACKED_BRICKS.get(),
                ModBlocks.LIGHT_BLUE_CONCRETE_CRACKED_BRICKS.get(), ModBlocks.BLUE_CONCRETE_CRACKED_BRICKS.get(), ModBlocks.PURPLE_CONCRETE_CRACKED_BRICKS.get(),
                ModBlocks.MAGENTA_CONCRETE_CRACKED_BRICKS.get(), ModBlocks.PINK_CONCRETE_CRACKED_BRICKS.get(), ModBlocks.REINFORCED_BLACK_CONCRETE.get(),
                ModBlocks.REINFORCED_WHITE_CONCRETE.get(), ModBlocks.REINFORCED_ORANGE_CONCRETE.get(), ModBlocks.REINFORCED_MAGENTA_CONCRETE.get(),
                ModBlocks.REINFORCED_LIGHT_BLUE_CONCRETE.get(), ModBlocks.REINFORCED_YELLOW_CONCRETE.get(), ModBlocks.REINFORCED_LIME_CONCRETE.get(),
                ModBlocks.REINFORCED_PINK_CONCRETE.get(), ModBlocks.REINFORCED_GRAY_CONCRETE.get(), ModBlocks.REINFORCED_LIGHT_GRAY_CONCRETE.get(),
                ModBlocks.REINFORCED_CYAN_CONCRETE.get(), ModBlocks.REINFORCED_PURPLE_CONCRETE.get(), ModBlocks.REINFORCED_BLUE_CONCRETE.get(),
                ModBlocks.REINFORCED_BROWN_CONCRETE.get(), ModBlocks.REINFORCED_GREEN_CONCRETE.get(), ModBlocks.REINFORCED_RED_CONCRETE.get());
    }


    private void addByPathPredicate(HolderLookup.RegistryLookup<Block> blockLookup, TagKey<Block> tag, Predicate<String> pathPredicate) {
        var appender = tag(tag);

        blockLookup.listElementIds().forEach(id -> {
            String ns = id.location().getNamespace();
            if (!References.MODID.equals(ns) && !"minecraft".equals(ns)) return;

            String path = id.location().getPath().toLowerCase(Locale.ROOT);

            try {
                if (pathPredicate.test(path)) {
                    ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, id.location());

                    CityCraft.LOGGER.info("Generate block tag with " + path);
                    appender.add(key);
                }
            } catch (Exception ignored) {
            }
        });

        appender.replace(false);
    }


    private void addByPathModPredicate(HolderLookup.RegistryLookup<Block> blockLookup, TagKey<Block> tag, Predicate<String> pathPredicate) {
        var appender = tag(tag);

        blockLookup.listElementIds().forEach(id -> {
            String ns = id.location().getNamespace();
            if (!References.MODID.equals(ns)) return;

            String path = id.location().getPath().toLowerCase(Locale.ROOT);

            try {
                if (pathPredicate.test(path)) {
                    ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, id.location());
                    CityCraft.LOGGER.info("Generate block tag with " + path);

                    appender.add(key);
                }
            } catch (Exception ignored) {
            }
        });

        appender.replace(false);
    }


    public static boolean isSpecialAsphalt(String path) {
        return path.contains("pothole") || path.contains("mossy") || path.contains("dirty") || path.contains("boost") || path.contains("cracked") || path.contains("asphalt_with");
    }

}
