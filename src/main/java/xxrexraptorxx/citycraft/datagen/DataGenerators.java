package xxrexraptorxx.citycraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import xxrexraptorxx.citycraft.main.References;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = References.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new ItemModelGen(packOutput, helper));
        generator.addProvider(event.includeClient(), new BlockStateGen(packOutput, helper));

        generator.addProvider(event.includeServer(), new BlockTagGen(packOutput, lookupProvider, helper));
        generator.addProvider(event.includeServer(), ModLootTableProvider.create(packOutput));
        //generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput)); TODO!
    }
}