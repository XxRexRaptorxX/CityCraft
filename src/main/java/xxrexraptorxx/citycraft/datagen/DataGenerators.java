package xxrexraptorxx.citycraft.datagen;

//import net.minecraft.data.DataGenerator;
//import net.minecraftforge.common.data.ExistingFileHelper;
//import net.minecraftforge.data.event.GatherDataEvent;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//import xxrexraptorxx.citycraft.main.References;
//
//@Mod.EventBusSubscriber(modid = References.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
//public class DataGenerators {
//
//    @SubscribeEvent
//    public static void gatherData(GatherDataEvent event) {
//        DataGenerator generator = event.getGenerator();
//        ExistingFileHelper helper = event.getExistingFileHelper();
//
//        generator.addProvider(event.includeClient(), new ItemModelGen(generator, helper));
//        generator.addProvider(event.includeClient(), new BlockStateGen(generator, helper));
//
//        generator.addProvider(event.includeServer(), new BlockTagGen(generator, lookupProvider, helper));
//        generator.addProvider(event.includeServer(), ModLootTableProvider.create(generator));
//        generator.addProvider(event.includeServer(), new ModRecipeProvider(generator));
//    }
//}