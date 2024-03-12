package xxrexraptorxx.citycraft.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
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


        this.dropSelf(ModBlocks.ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.CRACKED_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.POTHOLE_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.MOSSY_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.DIRTY_ASPHALT_SLAB.get());

        this.dropSelf(ModBlocks.WHITE_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.ORANGE_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.MAGENTA_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.YELLOW_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.LIME_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.RED_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.PINK_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.GRAY_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.CYAN_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.PURPLE_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.BLUE_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.BROWN_ASPHALT_SLAB.get());
        this.dropSelf(ModBlocks.GREEN_ASPHALT_SLAB.get());

        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_HATCHING_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_FRAME_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_EDGE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_LEFT_ARROW_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_LEFT_ARROW_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_RIGHT_ARROW_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_RIGHT_ARROW_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_MIDDLE_DOUBLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_DIAGONAL_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_FRAME_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_EDGE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_WHITE_THICK_HATCHING_SLAB.get());

        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_MIDDLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_MIDDLE_DOUBLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_SIDE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_BROKEN_DIAGONAL_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_DIAGONAL_DOUBLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_HATCHING_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_SIDE_DOTS_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_SIDE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SIDE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_FRAME_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_EDGE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_ARROW_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_LEFT_ARROW_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_LEFT_ARROW_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_RIGHT_ARROW_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_STRAIGHT_AND_RIGHT_ARROW_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_DOUBLE_SIDE_ARROW_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_MIDDLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_MIDDLE_DOUBLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_SOLID_AND_BROKEN_MIDDLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_BROKEN_DIAGONAL_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_DIAGONAL_DOUBLE_LINE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_FRAME_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_EDGE_SLAB.get());
        this.dropSelf(ModBlocks.ASPHALT_WITH_YELLOW_THICK_HATCHING_SLAB.get());
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
