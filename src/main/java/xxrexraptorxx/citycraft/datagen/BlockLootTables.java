package xxrexraptorxx.citycraft.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.citycraft.registry.ModBlocks;

import java.util.Set;

public class BlockLootTables extends BlockLootSubProvider {

    public BlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.ASPHALT_BLOCK.get());
        this.dropSelf(ModBlocks.CRACKED_ASPHALT.get());
        this.dropSelf(ModBlocks.POTHOLE_ASPHALT.get());
        this.dropSelf(ModBlocks.MOSSY_ASPHALT.get());
        this.dropSelf(ModBlocks.DIRTY_ASPHALT.get());

        this.dropSelf(ModBlocks.WHITE_ASPHALT.get());
        this.dropSelf(ModBlocks.ORANGE_ASPHALT.get());
        this.dropSelf(ModBlocks.MAGENTA_ASPHALT.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_ASPHALT.get());
        this.dropSelf(ModBlocks.YELLOW_ASPHALT.get());
        this.dropSelf(ModBlocks.LIME_ASPHALT.get());
        this.dropSelf(ModBlocks.RED_ASPHALT.get());
        this.dropSelf(ModBlocks.PINK_ASPHALT.get());
        this.dropSelf(ModBlocks.GRAY_ASPHALT.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_ASPHALT.get());
        this.dropSelf(ModBlocks.CYAN_ASPHALT.get());
        this.dropSelf(ModBlocks.PURPLE_ASPHALT.get());
        this.dropSelf(ModBlocks.BLUE_ASPHALT.get());
        this.dropSelf(ModBlocks.BROWN_ASPHALT.get());
        this.dropSelf(ModBlocks.GREEN_ASPHALT.get());

        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_HATCHING.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_FRAME.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_EDGE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING.get());

        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_FRAME.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_EDGE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING.get());

        this.add(ModBlocks.ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_SLAB.get()));
        this.add(ModBlocks.CRACKED_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.CRACKED_ASPHALT_SLAB.get()));
        this.add(ModBlocks.POTHOLE_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.POTHOLE_ASPHALT_SLAB.get()));
        this.add(ModBlocks.MOSSY_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.MOSSY_ASPHALT_SLAB.get()));
        this.add(ModBlocks.DIRTY_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.DIRTY_ASPHALT_SLAB.get()));

        this.add(ModBlocks.WHITE_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.WHITE_ASPHALT_SLAB.get()));
        this.add(ModBlocks.ORANGE_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.ORANGE_ASPHALT_SLAB.get()));
        this.add(ModBlocks.MAGENTA_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.MAGENTA_ASPHALT_SLAB.get()));
        this.add(ModBlocks.LIGHT_BLUE_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.LIGHT_BLUE_ASPHALT_SLAB.get()));
        this.add(ModBlocks.YELLOW_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.YELLOW_ASPHALT_SLAB.get()));
        this.add(ModBlocks.LIME_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.LIME_ASPHALT_SLAB.get()));
        this.add(ModBlocks.RED_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.RED_ASPHALT_SLAB.get()));
        this.add(ModBlocks.PINK_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.PINK_ASPHALT_SLAB.get()));
        this.add(ModBlocks.GRAY_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.GRAY_ASPHALT_SLAB.get()));
        this.add(ModBlocks.LIGHT_GRAY_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.LIGHT_GRAY_ASPHALT_SLAB.get()));
        this.add(ModBlocks.CYAN_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.CYAN_ASPHALT_SLAB.get()));
        this.add(ModBlocks.PURPLE_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.PURPLE_ASPHALT_SLAB.get()));
        this.add(ModBlocks.BLUE_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.BLUE_ASPHALT_SLAB.get()));
        this.add(ModBlocks.BROWN_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.BROWN_ASPHALT_SLAB.get()));
        this.add(ModBlocks.GREEN_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.GREEN_ASPHALT_SLAB.get()));

        this.add(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_HATCHING_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_HATCHING_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_FRAME_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_FRAME_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_EDGE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_EDGE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING_SLAB.get()));

        this.add(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_FRAME_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_FRAME_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_EDGE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_EDGE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING_SLAB.get()));

        this.dropSelf(ModBlocks.BOOST_ASPHALT.get());
        this.add(ModBlocks.BOOST_ASPHALT_SLAB.get(), block -> createSlabItemTable(ModBlocks.BOOST_ASPHALT_SLAB.get()));
        this.add(ModBlocks.YELLOW_BUMPER_SLAB.get(), block -> createSlabItemTable(ModBlocks.YELLOW_BUMPER_SLAB.get()));
        this.add(ModBlocks.RED_BUMPER_SLAB.get(), block -> createSlabItemTable(ModBlocks.RED_BUMPER_SLAB.get()));

        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_A.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_B.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_C.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_D.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_E.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_F.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_G.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_H.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_I.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_J.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_K.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_L.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_M.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_N.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_O.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_P.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_Q.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_R.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_S.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_T.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_U.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_V.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_W.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_X.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_Y.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_Z.get());

        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_A.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_B.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_C.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_D.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_E.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_F.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_G.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_H.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_I.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_J.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_K.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_L.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_M.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_N.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_O.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_P.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_Q.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_R.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_S.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_T.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_U.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_V.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_W.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_X.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_Y.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_Z.get());

        this.add(ModBlocks.ASPHALT_WITH_WHITE_A_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_A_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_B_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_B_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_C_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_C_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_D_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_D_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_E_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_E_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_F_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_F_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_G_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_G_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_H_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_H_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_I_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_I_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_J_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_J_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_K_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_K_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_L_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_L_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_M_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_M_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_N_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_N_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_O_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_O_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_P_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_P_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_Q_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_Q_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_R_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_R_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_S_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_S_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_T_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_T_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_U_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_U_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_V_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_V_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_W_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_W_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_X_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_X_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_Y_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_Y_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_WHITE_Z_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_WHITE_Z_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_A_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_A_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_B_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_B_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_C_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_C_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_D_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_D_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_E_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_E_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_F_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_F_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_G_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_G_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_H_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_H_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_I_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_I_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_J_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_J_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_K_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_K_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_L_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_L_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_M_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_M_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_N_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_N_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_O_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_O_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_P_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_P_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_Q_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_Q_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_R_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_R_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_S_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_S_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_T_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_T_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_U_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_U_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_V_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_V_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_W_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_W_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_X_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_X_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_Y_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_Y_SLAB.get()));
        this.add(ModBlocks.ASPHALT_WITH_YELLOW_Z_SLAB.get(), block -> createSlabItemTable(ModBlocks.ASPHALT_WITH_YELLOW_Z_SLAB.get()));

        this.dropSelf(ModBlocks.IRON_POLE.get());
        this.dropSelf(ModBlocks.YELLOW_POLE.get());
        this.dropSelf(ModBlocks.BLACK_POLE.get());
        this.dropSelf(ModBlocks.WHITE_POLE.get());
        this.dropSelf(ModBlocks.RED_WHITE_POLE.get());
        this.dropSelf(ModBlocks.YELLOW_BLACK_POLE.get());
        this.dropSelf(ModBlocks.RED_POLE.get());

        this.dropSelf(ModBlocks.STONE_POST.get());
        this.dropSelf(ModBlocks.YELLOW_POST.get());
        this.dropSelf(ModBlocks.BLACK_POST.get());
        this.dropSelf(ModBlocks.WHITE_POST.get());
        this.dropSelf(ModBlocks.RED_WHITE_POST.get());
        this.dropSelf(ModBlocks.YELLOW_BLACK_POST.get());
        this.dropSelf(ModBlocks.RED_POST.get());
        this.dropSelf(ModBlocks.ROAD_EDGE_POST.get());

        this.dropSelf(ModBlocks.YELLOW_CHAIN.get());
        this.dropSelf(ModBlocks.BLACK_CHAIN.get());
        this.dropSelf(ModBlocks.WHITE_CHAIN.get());
        this.dropSelf(ModBlocks.RED_CHAIN.get());
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
