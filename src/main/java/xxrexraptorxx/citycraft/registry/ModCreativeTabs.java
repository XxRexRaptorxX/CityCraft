package xxrexraptorxx.citycraft.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import xxrexraptorxx.citycraft.main.References;

public class ModCreativeTabs {

    public static final CreativeModeTab MAIN_TAB = new CreativeModeTab(References.MODID + ".main_tab")  {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.YELLOW_BLACK_POST.get());
        }

    };


    public static final CreativeModeTab SIGNS_TAB = new CreativeModeTab(References.MODID + ".signs_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CREEPER_EU_SIGN.get());
        }
    };


    public static final CreativeModeTab ROADS_TAB = new CreativeModeTab(References.MODID + ".roads_tab") {
        @Override
        public ItemStack makeIcon() {
                return new ItemStack(ModBlocks.ASPHALT_WITH_WHITE_THICK_BROKEN_MIDDLE_LINE.get());
        }

    };

}
