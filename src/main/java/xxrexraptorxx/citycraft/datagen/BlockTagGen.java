package xxrexraptorxx.citycraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.registry.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class BlockTagGen extends BlockTagsProvider {

    public BlockTagGen(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper helper) {
        super(packOutput, lookupProvider, References.MODID, helper);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
       tag(BlockTags.MINEABLE_WITH_PICKAXE)
               .add(
                       ModBlocks.ASPHALT_BLOCK.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_BROKEN_MIDDLE_LINE.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_LINE.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_MIDDLE_DOUBLE_LINE.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_SOLID_AND_BROKEN_MIDDLE_LINE.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_BROKEN_SIDE_LINE.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_SIDE_LINE.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_BROKEN_DIAGONAL_LINE.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_LINE.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_DIAGONAL_DOUBLE_LINE.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_HATCHING.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_SIDE_DOTS.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_SIDE_LINE.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_THICK_SIDE_LINE.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_FRAME.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_EDGE.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_ARROW.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_SIDE_ARROW.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_STRAIGHT_AND_SIDE_ARROW.get(),
                       ModBlocks.ASPHALT_WITH_WHITE_DOUBLE_SIDE_ARROW.get()
               );
    }
}
