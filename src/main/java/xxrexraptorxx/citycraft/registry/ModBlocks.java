package xxrexraptorxx.citycraft.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.citycraft.blocks.AsphaltBlock;
import xxrexraptorxx.citycraft.main.References;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, References.MODID);


    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
    }


    //BLOCKS
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
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_SIDE_ARROW = registerBlock("asphalt_with_white_side_arrow", AsphaltBlock::new);
    public static final RegistryObject<AsphaltBlock> ASPHALT_WITH_WHITE_STRAIGHT_AND_SIDE_ARROW = registerBlock("asphalt_with_white_straight_and_side_arrow", AsphaltBlock::new);
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


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}