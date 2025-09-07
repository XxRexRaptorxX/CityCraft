package xxrexraptorxx.citycraft.datagen;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

public class ModLootTableProvider {

    public static LootTableProvider create(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        return new LootTableProvider(
                output,
                Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(BlockLootTables::new, LootContextParamSets.BLOCK)),
                lookupProvider);
    }
}
