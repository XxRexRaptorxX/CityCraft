package xxrexraptorxx.citycraft.main;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.citycraft.blocks.container.PainterScreen;
import xxrexraptorxx.citycraft.registry.*;
import xxrexraptorxx.citycraft.utils.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage <a href="https://www.curseforge.com/minecraft/mc-mods/city-craft">...</a>
 **/
@Mod(References.MODID)
public class CityCraft {

    public static final Logger LOGGER = LogManager.getLogger();

    public CityCraft(IEventBus bus, ModContainer container) {

        ModBlocks.init(bus);
        ModItems.init(bus);
        Config.init(container);
        CreativeTabs.init(bus);
        ModRecipeSerializers.init(bus);
        ModRecipeTypes.init(bus);
        ModMenuTypes.init(bus);
        bus.addListener(this::registerScreens);
        bus.addListener(this::addCreative);
    }


    private void registerScreens(RegisterMenuScreensEvent event) {
        event.register(ModMenuTypes.PAINTER.get(), PainterScreen::new);
    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> key = event.getTabKey();

        if (key == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.accept(ModBlocks.REDSTONE_POLE);

            event.accept(ModBlocks.DOUBLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.TRIPLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.STRAIGHT_DOUBLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.STRAIGHT_TRIPLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.LEFT_TURN_DOUBLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.LEFT_TURN_TRIPLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.RIGHT_TURN_DOUBLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.RIGHT_TURN_TRIPLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.BICYCLE_DOUBLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.BICYCLE_TRIPLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.PEDESTRIAN_DOUBLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.PEDESTRIAN_TRIPLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.PEDESTRIAN_SIGNAL_LIGHT.get());
            event.accept(ModBlocks.SIGNAL_LIGHT.get());
            event.accept(ModBlocks.DANGER_SIGNAL_LIGHT.get());
            event.accept(ModBlocks.TRAIN_SIGNAL_LIGHT.get());

            event.accept(ModBlocks.MODERN_STREET_LANTERN.get());
            event.accept(ModBlocks.STREET_LANTERN.get());
            event.accept(ModBlocks.STREET_LANTERN_PANEL.get());

            event.accept(ModBlocks.WHITE_LAMP.get());
            event.accept(ModBlocks.LIGHT_GRAY_LAMP.get());
            event.accept(ModBlocks.GRAY_LAMP.get());
            event.accept(ModBlocks.BLACK_LAMP.get());
            event.accept(ModBlocks.BROWN_LAMP.get());
            event.accept(ModBlocks.RED_LAMP.get());
            event.accept(ModBlocks.ORANGE_LAMP.get());
            event.accept(ModBlocks.YELLOW_LAMP.get());
            event.accept(ModBlocks.LIME_LAMP.get());
            event.accept(ModBlocks.GREEN_LAMP.get());
            event.accept(ModBlocks.CYAN_LAMP.get());
            event.accept(ModBlocks.LIGHT_BLUE_LAMP.get());
            event.accept(ModBlocks.BLUE_LAMP.get());
            event.accept(ModBlocks.PURPLE_LAMP.get());
            event.accept(ModBlocks.MAGENTA_LAMP.get());
            event.accept(ModBlocks.PINK_LAMP.get());

            event.accept(ModBlocks.WHITE_NEON_LIGHT.get());
            event.accept(ModBlocks.LIGHT_GRAY_NEON_LIGHT.get());
            event.accept(ModBlocks.GRAY_NEON_LIGHT.get());
            event.accept(ModBlocks.BLACK_NEON_LIGHT.get());
            event.accept(ModBlocks.BROWN_NEON_LIGHT.get());
            event.accept(ModBlocks.RED_NEON_LIGHT.get());
            event.accept(ModBlocks.ORANGE_NEON_LIGHT.get());
            event.accept(ModBlocks.YELLOW_NEON_LIGHT.get());
            event.accept(ModBlocks.LIME_NEON_LIGHT.get());
            event.accept(ModBlocks.GREEN_NEON_LIGHT.get());
            event.accept(ModBlocks.CYAN_NEON_LIGHT.get());
            event.accept(ModBlocks.LIGHT_BLUE_NEON_LIGHT.get());
            event.accept(ModBlocks.BLUE_NEON_LIGHT.get());
            event.accept(ModBlocks.PURPLE_NEON_LIGHT.get());
            event.accept(ModBlocks.MAGENTA_NEON_LIGHT.get());
            event.accept(ModBlocks.PINK_NEON_LIGHT.get());

        } else if (key == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(ModBlocks.INFESTED_BLACK_CONCRETE.get());
            event.accept(ModBlocks.INFESTED_WHITE_CONCRETE.get());
            event.accept(ModBlocks.INFESTED_GRAY_CONCRETE.get());
            event.accept(ModBlocks.INFESTED_LIGHT_GRAY_CONCRETE.get());

            event.accept(ModBlocks.BLOCK_PAINTER.get());
            event.accept(ModBlocks.ASPHALT_BLOCK);
            event.accept(ModBlocks.BOOST_ASPHALT);

            event.accept(ModItems.LIGHTING_ROD_BLOCK_ITEM);

            event.accept(ModBlocks.DOUBLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.TRIPLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.STRAIGHT_DOUBLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.STRAIGHT_TRIPLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.LEFT_TURN_DOUBLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.LEFT_TURN_TRIPLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.RIGHT_TURN_DOUBLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.RIGHT_TURN_TRIPLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.BICYCLE_DOUBLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.BICYCLE_TRIPLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.PEDESTRIAN_DOUBLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.PEDESTRIAN_TRIPLE_TRAFFIC_LIGHT.get());
            event.accept(ModBlocks.PEDESTRIAN_SIGNAL_LIGHT.get());
            event.accept(ModBlocks.SIGNAL_LIGHT.get());
            event.accept(ModBlocks.DANGER_SIGNAL_LIGHT.get());
            event.accept(ModBlocks.TRAIN_SIGNAL_LIGHT.get());

            event.accept(ModBlocks.MODERN_STREET_LANTERN.get());
            event.accept(ModBlocks.STREET_LANTERN.get());
            event.accept(ModBlocks.STREET_LANTERN_PANEL.get());

            event.accept(ModBlocks.WHITE_LAMP.get());
            event.accept(ModBlocks.LIGHT_GRAY_LAMP.get());
            event.accept(ModBlocks.GRAY_LAMP.get());
            event.accept(ModBlocks.BLACK_LAMP.get());
            event.accept(ModBlocks.BROWN_LAMP.get());
            event.accept(ModBlocks.RED_LAMP.get());
            event.accept(ModBlocks.ORANGE_LAMP.get());
            event.accept(ModBlocks.YELLOW_LAMP.get());
            event.accept(ModBlocks.LIME_LAMP.get());
            event.accept(ModBlocks.GREEN_LAMP.get());
            event.accept(ModBlocks.CYAN_LAMP.get());
            event.accept(ModBlocks.LIGHT_BLUE_LAMP.get());
            event.accept(ModBlocks.BLUE_LAMP.get());
            event.accept(ModBlocks.PURPLE_LAMP.get());
            event.accept(ModBlocks.MAGENTA_LAMP.get());
            event.accept(ModBlocks.PINK_LAMP.get());

            event.accept(ModBlocks.WHITE_NEON_LIGHT.get());
            event.accept(ModBlocks.LIGHT_GRAY_NEON_LIGHT.get());
            event.accept(ModBlocks.GRAY_NEON_LIGHT.get());
            event.accept(ModBlocks.BLACK_NEON_LIGHT.get());
            event.accept(ModBlocks.BROWN_NEON_LIGHT.get());
            event.accept(ModBlocks.RED_NEON_LIGHT.get());
            event.accept(ModBlocks.ORANGE_NEON_LIGHT.get());
            event.accept(ModBlocks.YELLOW_NEON_LIGHT.get());
            event.accept(ModBlocks.LIME_NEON_LIGHT.get());
            event.accept(ModBlocks.GREEN_NEON_LIGHT.get());
            event.accept(ModBlocks.CYAN_NEON_LIGHT.get());
            event.accept(ModBlocks.LIGHT_BLUE_NEON_LIGHT.get());
            event.accept(ModBlocks.BLUE_NEON_LIGHT.get());
            event.accept(ModBlocks.PURPLE_NEON_LIGHT.get());
            event.accept(ModBlocks.MAGENTA_NEON_LIGHT.get());
            event.accept(ModBlocks.PINK_NEON_LIGHT.get());

            event.accept(ModBlocks.WHITE_CHAIN.get());
            event.accept(ModBlocks.RED_CHAIN.get());
            event.accept(ModBlocks.YELLOW_CHAIN.get());
            event.accept(ModBlocks.BLACK_CHAIN.get());

            event.accept(ModBlocks.IRON_LADDER.get());

            event.accept(ModBlocks.DRAIN_COVER.get());
            event.accept(ModBlocks.DRAIN_COVER_GRID.get());

            event.accept(ModBlocks.IRON_FLUE);
            event.accept(ModBlocks.COPPER_FLUE);
            event.accept(ModBlocks.STONE_CHIMNEY.get());
            event.accept(ModBlocks.MOSSY_STONE_CHIMNEY.get());
            event.accept(ModBlocks.CRACKED_STONE_CHIMNEY.get());
            event.accept(ModBlocks.DEEPSLATE_CHIMNEY.get());
            event.accept(ModBlocks.CRACKED_DEEPSLATE_CHIMNEY.get());
            event.accept(ModBlocks.BLACKSTONE_CHIMNEY.get());
            event.accept(ModBlocks.CRACKED_BLACKSTONE_CHIMNEY.get());
            event.accept(ModBlocks.BRICKS_CHIMNEY.get());
            event.accept(ModBlocks.MUD_CHIMNEY.get());
            event.accept(ModBlocks.WHITE_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.GRAY_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.BLACK_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.BROWN_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.RED_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.LIME_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.GREEN_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.CYAN_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.BLUE_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.PINK_CONCRETE_CHIMNEY.get());

            event.accept(ModBlocks.NETHER_FLOWER_BOX.get());
            event.accept(ModBlocks.BLACKSTONE_FLOWER_BOX.get());
            event.accept(ModBlocks.DEEPSLATE_FLOWER_BOX.get());
            event.accept(ModBlocks.TUFF_FLOWER_BOX.get());
            event.accept(ModBlocks.STONE_FLOWER_BOX.get());
            event.accept(ModBlocks.RED_SANDSTONE_FLOWER_BOX.get());
            event.accept(ModBlocks.SANDSTONE_FLOWER_BOX.get());
            event.accept(ModBlocks.QUARTZ_FLOWER_BOX.get());
            event.accept(ModBlocks.WHITE_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.GRAY_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.BLACK_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.BROWN_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.RED_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.LIME_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.GREEN_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.CYAN_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.BLUE_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.PINK_CONCRETE_FLOWER_BOX.get());

        } else if (key == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.COAL_COKE.get());
            event.accept(ModItems.ASPHALT_MIXTURE.get());
            event.accept(ModItems.DYE_MIX.get());
            event.accept(ModItems.IRON_ROD.get());

        } else if (key == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.COAL_TAR.get());

        } else if (key == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.IRON_GRATE.get());
            event.accept(ModBlocks.IRON_FENCE.get());
            event.accept(ModBlocks.IRON_POLE.get());
            event.accept(ModBlocks.STONE_POST.get());
            event.accept(ModBlocks.WIRE_FENCE.get());
            event.accept(ModBlocks.CHAIN_LINK_FENCE.get());
            event.accept(ModBlocks.MESH_FENCE.get());
            event.accept(ModBlocks.BARBED_WIRE_FENCE.get());

        } else if (key == CreativeModeTabs.COLORED_BLOCKS) {
            event.accept(ModBlocks.POLISHED_WHITE_CONCRETE.get());
            event.accept(ModBlocks.POLISHED_LIGHT_GRAY_CONCRETE.get());
            event.accept(ModBlocks.POLISHED_GRAY_CONCRETE.get());
            event.accept(ModBlocks.POLISHED_BLACK_CONCRETE.get());
            event.accept(ModBlocks.POLISHED_BROWN_CONCRETE.get());
            event.accept(ModBlocks.POLISHED_RED_CONCRETE.get());
            event.accept(ModBlocks.POLISHED_ORANGE_CONCRETE.get());
            event.accept(ModBlocks.POLISHED_YELLOW_CONCRETE.get());
            event.accept(ModBlocks.POLISHED_LIME_CONCRETE.get());
            event.accept(ModBlocks.POLISHED_GREEN_CONCRETE.get());
            event.accept(ModBlocks.POLISHED_CYAN_CONCRETE.get());
            event.accept(ModBlocks.POLISHED_LIGHT_BLUE_CONCRETE.get());
            event.accept(ModBlocks.POLISHED_BLUE_CONCRETE.get());
            event.accept(ModBlocks.POLISHED_PURPLE_CONCRETE.get());
            event.accept(ModBlocks.POLISHED_MAGENTA_CONCRETE.get());
            event.accept(ModBlocks.POLISHED_PINK_CONCRETE.get());

            event.accept(ModBlocks.CHISELED_WHITE_CONCRETE.get());
            event.accept(ModBlocks.CHISELED_LIGHT_GRAY_CONCRETE.get());
            event.accept(ModBlocks.CHISELED_GRAY_CONCRETE.get());
            event.accept(ModBlocks.CHISELED_BLACK_CONCRETE.get());
            event.accept(ModBlocks.CHISELED_BROWN_CONCRETE.get());
            event.accept(ModBlocks.CHISELED_RED_CONCRETE.get());
            event.accept(ModBlocks.CHISELED_ORANGE_CONCRETE.get());
            event.accept(ModBlocks.CHISELED_YELLOW_CONCRETE.get());
            event.accept(ModBlocks.CHISELED_LIME_CONCRETE.get());
            event.accept(ModBlocks.CHISELED_GREEN_CONCRETE.get());
            event.accept(ModBlocks.CHISELED_CYAN_CONCRETE.get());
            event.accept(ModBlocks.CHISELED_LIGHT_BLUE_CONCRETE.get());
            event.accept(ModBlocks.CHISELED_BLUE_CONCRETE.get());
            event.accept(ModBlocks.CHISELED_PURPLE_CONCRETE.get());
            event.accept(ModBlocks.CHISELED_MAGENTA_CONCRETE.get());
            event.accept(ModBlocks.CHISELED_PINK_CONCRETE.get());

            event.accept(ModBlocks.WHITE_CONCRETE_BRICKS.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS.get());
            event.accept(ModBlocks.GRAY_CONCRETE_BRICKS.get());
            event.accept(ModBlocks.BLACK_CONCRETE_BRICKS.get());
            event.accept(ModBlocks.BROWN_CONCRETE_BRICKS.get());
            event.accept(ModBlocks.RED_CONCRETE_BRICKS.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_BRICKS.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_BRICKS.get());
            event.accept(ModBlocks.LIME_CONCRETE_BRICKS.get());
            event.accept(ModBlocks.GREEN_CONCRETE_BRICKS.get());
            event.accept(ModBlocks.CYAN_CONCRETE_BRICKS.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS.get());
            event.accept(ModBlocks.BLUE_CONCRETE_BRICKS.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_BRICKS.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_BRICKS.get());
            event.accept(ModBlocks.PINK_CONCRETE_BRICKS.get());

            event.accept(ModBlocks.WHITE_CONCRETE_CRACKED_BRICKS.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_CRACKED_BRICKS.get());
            event.accept(ModBlocks.GRAY_CONCRETE_CRACKED_BRICKS.get());
            event.accept(ModBlocks.BLACK_CONCRETE_CRACKED_BRICKS.get());
            event.accept(ModBlocks.BROWN_CONCRETE_CRACKED_BRICKS.get());
            event.accept(ModBlocks.RED_CONCRETE_CRACKED_BRICKS.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_CRACKED_BRICKS.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_CRACKED_BRICKS.get());
            event.accept(ModBlocks.LIME_CONCRETE_CRACKED_BRICKS.get());
            event.accept(ModBlocks.GREEN_CONCRETE_CRACKED_BRICKS.get());
            event.accept(ModBlocks.CYAN_CONCRETE_CRACKED_BRICKS.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_CRACKED_BRICKS.get());
            event.accept(ModBlocks.BLUE_CONCRETE_CRACKED_BRICKS.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_CRACKED_BRICKS.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_CRACKED_BRICKS.get());
            event.accept(ModBlocks.PINK_CONCRETE_CRACKED_BRICKS.get());

            event.accept(ModBlocks.WHITE_CONCRETE_PILLAR.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_PILLAR.get());
            event.accept(ModBlocks.GRAY_CONCRETE_PILLAR.get());
            event.accept(ModBlocks.BLACK_CONCRETE_PILLAR.get());
            event.accept(ModBlocks.BROWN_CONCRETE_PILLAR.get());
            event.accept(ModBlocks.RED_CONCRETE_PILLAR.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_PILLAR.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_PILLAR.get());
            event.accept(ModBlocks.LIME_CONCRETE_PILLAR.get());
            event.accept(ModBlocks.GREEN_CONCRETE_PILLAR.get());
            event.accept(ModBlocks.CYAN_CONCRETE_PILLAR.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_PILLAR.get());
            event.accept(ModBlocks.BLUE_CONCRETE_PILLAR.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_PILLAR.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_PILLAR.get());
            event.accept(ModBlocks.PINK_CONCRETE_PILLAR.get());

            event.accept(ModBlocks.WHITE_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.GRAY_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.BLACK_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.BROWN_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.RED_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.LIME_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.GREEN_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.CYAN_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.BLUE_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.PINK_CONCRETE_STAIRS.get());

            event.accept(ModBlocks.WHITE_CONCRETE_SLAB.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get());
            event.accept(ModBlocks.GRAY_CONCRETE_SLAB.get());
            event.accept(ModBlocks.BLACK_CONCRETE_SLAB.get());
            event.accept(ModBlocks.BROWN_CONCRETE_SLAB.get());
            event.accept(ModBlocks.RED_CONCRETE_SLAB.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_SLAB.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_SLAB.get());
            event.accept(ModBlocks.LIME_CONCRETE_SLAB.get());
            event.accept(ModBlocks.GREEN_CONCRETE_SLAB.get());
            event.accept(ModBlocks.CYAN_CONCRETE_SLAB.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get());
            event.accept(ModBlocks.BLUE_CONCRETE_SLAB.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_SLAB.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_SLAB.get());
            event.accept(ModBlocks.PINK_CONCRETE_SLAB.get());

            event.accept(ModBlocks.WHITE_CONCRETE_WALL.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get());
            event.accept(ModBlocks.GRAY_CONCRETE_WALL.get());
            event.accept(ModBlocks.BLACK_CONCRETE_WALL.get());
            event.accept(ModBlocks.BROWN_CONCRETE_WALL.get());
            event.accept(ModBlocks.RED_CONCRETE_WALL.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_WALL.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_WALL.get());
            event.accept(ModBlocks.LIME_CONCRETE_WALL.get());
            event.accept(ModBlocks.GREEN_CONCRETE_WALL.get());
            event.accept(ModBlocks.CYAN_CONCRETE_WALL.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get());
            event.accept(ModBlocks.BLUE_CONCRETE_WALL.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_WALL.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_WALL.get());
            event.accept(ModBlocks.PINK_CONCRETE_WALL.get());

            event.accept(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get());

            event.accept(ModBlocks.WHITE_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.GRAY_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.BLACK_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.BROWN_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.RED_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.LIME_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.GREEN_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.CYAN_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.BLUE_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.PINK_CONCRETE_BUTTON.get());

            event.accept(ModBlocks.WHITE_CONCRETE_LEVER.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.get());
            event.accept(ModBlocks.GRAY_CONCRETE_LEVER.get());
            event.accept(ModBlocks.BLACK_CONCRETE_LEVER.get());
            event.accept(ModBlocks.BROWN_CONCRETE_LEVER.get());
            event.accept(ModBlocks.RED_CONCRETE_LEVER.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_LEVER.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_LEVER.get());
            event.accept(ModBlocks.LIME_CONCRETE_LEVER.get());
            event.accept(ModBlocks.GREEN_CONCRETE_LEVER.get());
            event.accept(ModBlocks.CYAN_CONCRETE_LEVER.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.get());
            event.accept(ModBlocks.BLUE_CONCRETE_LEVER.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_LEVER.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_LEVER.get());
            event.accept(ModBlocks.PINK_CONCRETE_LEVER.get());

            event.accept(ModBlocks.CRACKED_WHITE_CONCRETE.get());
            event.accept(ModBlocks.CRACKED_LIGHT_GRAY_CONCRETE.get());
            event.accept(ModBlocks.CRACKED_GRAY_CONCRETE.get());
            event.accept(ModBlocks.CRACKED_BLACK_CONCRETE.get());
            event.accept(ModBlocks.CRACKED_BROWN_CONCRETE.get());
            event.accept(ModBlocks.CRACKED_RED_CONCRETE.get());
            event.accept(ModBlocks.CRACKED_ORANGE_CONCRETE.get());
            event.accept(ModBlocks.CRACKED_YELLOW_CONCRETE.get());
            event.accept(ModBlocks.CRACKED_LIME_CONCRETE.get());
            event.accept(ModBlocks.CRACKED_GREEN_CONCRETE.get());
            event.accept(ModBlocks.CRACKED_CYAN_CONCRETE.get());
            event.accept(ModBlocks.CRACKED_LIGHT_BLUE_CONCRETE.get());
            event.accept(ModBlocks.CRACKED_BLUE_CONCRETE.get());
            event.accept(ModBlocks.CRACKED_PURPLE_CONCRETE.get());
            event.accept(ModBlocks.CRACKED_MAGENTA_CONCRETE.get());
            event.accept(ModBlocks.CRACKED_PINK_CONCRETE.get());

            event.accept(ModBlocks.MOSSY_WHITE_CONCRETE.get());
            event.accept(ModBlocks.MOSSY_LIGHT_GRAY_CONCRETE.get());
            event.accept(ModBlocks.MOSSY_GRAY_CONCRETE.get());
            event.accept(ModBlocks.MOSSY_BLACK_CONCRETE.get());
            event.accept(ModBlocks.MOSSY_BROWN_CONCRETE.get());
            event.accept(ModBlocks.MOSSY_RED_CONCRETE.get());
            event.accept(ModBlocks.MOSSY_ORANGE_CONCRETE.get());
            event.accept(ModBlocks.MOSSY_YELLOW_CONCRETE.get());
            event.accept(ModBlocks.MOSSY_LIME_CONCRETE.get());
            event.accept(ModBlocks.MOSSY_GREEN_CONCRETE.get());
            event.accept(ModBlocks.MOSSY_CYAN_CONCRETE.get());
            event.accept(ModBlocks.MOSSY_LIGHT_BLUE_CONCRETE.get());
            event.accept(ModBlocks.MOSSY_BLUE_CONCRETE.get());
            event.accept(ModBlocks.MOSSY_PURPLE_CONCRETE.get());
            event.accept(ModBlocks.MOSSY_MAGENTA_CONCRETE.get());
            event.accept(ModBlocks.MOSSY_PINK_CONCRETE.get());

            event.accept(ModBlocks.WHITE_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.GRAY_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.BLACK_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.BROWN_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.RED_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.LIME_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.GREEN_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.CYAN_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.BLUE_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_CHIMNEY.get());
            event.accept(ModBlocks.PINK_CONCRETE_CHIMNEY.get());

            event.accept(ModBlocks.WHITE_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.GRAY_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.BLACK_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.BROWN_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.RED_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.LIME_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.GREEN_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.CYAN_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.BLUE_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_FLOWER_BOX.get());
            event.accept(ModBlocks.PINK_CONCRETE_FLOWER_BOX.get());

            event.accept(ModBlocks.REINFORCED_WHITE_CONCRETE.get());
            event.accept(ModBlocks.REINFORCED_LIGHT_GRAY_CONCRETE.get());
            event.accept(ModBlocks.REINFORCED_GRAY_CONCRETE.get());
            event.accept(ModBlocks.REINFORCED_BLACK_CONCRETE.get());
            event.accept(ModBlocks.REINFORCED_BROWN_CONCRETE.get());
            event.accept(ModBlocks.REINFORCED_RED_CONCRETE.get());
            event.accept(ModBlocks.REINFORCED_ORANGE_CONCRETE.get());
            event.accept(ModBlocks.REINFORCED_YELLOW_CONCRETE.get());
            event.accept(ModBlocks.REINFORCED_LIME_CONCRETE.get());
            event.accept(ModBlocks.REINFORCED_GREEN_CONCRETE.get());
            event.accept(ModBlocks.REINFORCED_CYAN_CONCRETE.get());
            event.accept(ModBlocks.REINFORCED_LIGHT_BLUE_CONCRETE.get());
            event.accept(ModBlocks.REINFORCED_BLUE_CONCRETE.get());
            event.accept(ModBlocks.REINFORCED_PURPLE_CONCRETE.get());
            event.accept(ModBlocks.REINFORCED_MAGENTA_CONCRETE.get());
            event.accept(ModBlocks.REINFORCED_PINK_CONCRETE.get());

            event.accept(ModBlocks.WHITE_ASPHALT.get());
            event.accept(ModBlocks.LIGHT_GRAY_ASPHALT.get());
            event.accept(ModBlocks.GRAY_ASPHALT.get());
            event.accept(ModBlocks.ASPHALT_BLOCK.get());
            event.accept(ModBlocks.BROWN_ASPHALT.get());
            event.accept(ModBlocks.RED_ASPHALT.get());
            event.accept(ModBlocks.ORANGE_ASPHALT.get());
            event.accept(ModBlocks.YELLOW_ASPHALT.get());
            event.accept(ModBlocks.LIME_ASPHALT.get());
            event.accept(ModBlocks.GREEN_ASPHALT.get());
            event.accept(ModBlocks.CYAN_ASPHALT.get());
            event.accept(ModBlocks.LIGHT_BLUE_ASPHALT.get());
            event.accept(ModBlocks.BLUE_ASPHALT.get());
            event.accept(ModBlocks.PURPLE_ASPHALT.get());
            event.accept(ModBlocks.MAGENTA_ASPHALT.get());
            event.accept(ModBlocks.PINK_ASPHALT.get());

            event.accept(ModBlocks.WHITE_ASPHALT_SLAB.get());
            event.accept(ModBlocks.LIGHT_GRAY_ASPHALT_SLAB.get());
            event.accept(ModBlocks.GRAY_ASPHALT_SLAB.get());
            event.accept(ModBlocks.ASPHALT_SLAB);
            event.accept(ModBlocks.BROWN_ASPHALT_SLAB.get());
            event.accept(ModBlocks.RED_ASPHALT_SLAB.get());
            event.accept(ModBlocks.ORANGE_ASPHALT_SLAB.get());
            event.accept(ModBlocks.YELLOW_ASPHALT_SLAB.get());
            event.accept(ModBlocks.LIME_ASPHALT_SLAB.get());
            event.accept(ModBlocks.GREEN_ASPHALT_SLAB.get());
            event.accept(ModBlocks.CYAN_ASPHALT_SLAB.get());
            event.accept(ModBlocks.LIGHT_BLUE_ASPHALT_SLAB.get());
            event.accept(ModBlocks.BLUE_ASPHALT_SLAB.get());
            event.accept(ModBlocks.PURPLE_ASPHALT_SLAB.get());
            event.accept(ModBlocks.MAGENTA_ASPHALT_SLAB.get());
            event.accept(ModBlocks.PINK_ASPHALT_SLAB.get());

            event.accept(ModBlocks.WHITE_LAMP.get());
            event.accept(ModBlocks.LIGHT_GRAY_LAMP.get());
            event.accept(ModBlocks.GRAY_LAMP.get());
            event.accept(ModBlocks.BLACK_LAMP.get());
            event.accept(ModBlocks.BROWN_LAMP.get());
            event.accept(ModBlocks.RED_LAMP.get());
            event.accept(ModBlocks.ORANGE_LAMP.get());
            event.accept(ModBlocks.YELLOW_LAMP.get());
            event.accept(ModBlocks.LIME_LAMP.get());
            event.accept(ModBlocks.GREEN_LAMP.get());
            event.accept(ModBlocks.CYAN_LAMP.get());
            event.accept(ModBlocks.LIGHT_BLUE_LAMP.get());
            event.accept(ModBlocks.BLUE_LAMP.get());
            event.accept(ModBlocks.PURPLE_LAMP.get());
            event.accept(ModBlocks.MAGENTA_LAMP.get());
            event.accept(ModBlocks.PINK_LAMP.get());

            event.accept(ModBlocks.WHITE_NEON_LIGHT.get());
            event.accept(ModBlocks.LIGHT_GRAY_NEON_LIGHT.get());
            event.accept(ModBlocks.GRAY_NEON_LIGHT.get());
            event.accept(ModBlocks.BLACK_NEON_LIGHT.get());
            event.accept(ModBlocks.BROWN_NEON_LIGHT.get());
            event.accept(ModBlocks.RED_NEON_LIGHT.get());
            event.accept(ModBlocks.ORANGE_NEON_LIGHT.get());
            event.accept(ModBlocks.YELLOW_NEON_LIGHT.get());
            event.accept(ModBlocks.LIME_NEON_LIGHT.get());
            event.accept(ModBlocks.GREEN_NEON_LIGHT.get());
            event.accept(ModBlocks.CYAN_NEON_LIGHT.get());
            event.accept(ModBlocks.LIGHT_BLUE_NEON_LIGHT.get());
            event.accept(ModBlocks.BLUE_NEON_LIGHT.get());
            event.accept(ModBlocks.PURPLE_NEON_LIGHT.get());
            event.accept(ModBlocks.MAGENTA_NEON_LIGHT.get());
            event.accept(ModBlocks.PINK_NEON_LIGHT.get());

            event.accept(ModBlocks.WHITE_BRICKS.get());
            event.accept(ModBlocks.LIGHT_GRAY_BRICKS.get());
            event.accept(ModBlocks.GRAY_BRICKS.get());
            event.accept(ModBlocks.BLACK_BRICKS.get());
            event.accept(ModBlocks.BROWN_BRICKS.get());
            event.accept(ModBlocks.RED_BRICKS.get());
            event.accept(ModBlocks.ORANGE_BRICKS.get());
            event.accept(ModBlocks.YELLOW_BRICKS.get());
            event.accept(ModBlocks.LIME_BRICKS.get());
            event.accept(ModBlocks.GREEN_BRICKS.get());
            event.accept(ModBlocks.CYAN_BRICKS.get());
            event.accept(ModBlocks.LIGHT_BLUE_BRICKS.get());
            event.accept(ModBlocks.BLUE_BRICKS.get());
            event.accept(ModBlocks.PURPLE_BRICKS.get());
            event.accept(ModBlocks.MAGENTA_BRICKS.get());
            event.accept(ModBlocks.PINK_BRICKS.get());

            event.accept(ModBlocks.WHITE_BRICK_SLAB.get());
            event.accept(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get());
            event.accept(ModBlocks.GRAY_BRICK_SLAB.get());
            event.accept(ModBlocks.BLACK_BRICK_SLAB.get());
            event.accept(ModBlocks.BROWN_BRICK_SLAB.get());
            event.accept(ModBlocks.RED_BRICK_SLAB.get());
            event.accept(ModBlocks.ORANGE_BRICK_SLAB.get());
            event.accept(ModBlocks.YELLOW_BRICK_SLAB.get());
            event.accept(ModBlocks.LIME_BRICK_SLAB.get());
            event.accept(ModBlocks.GREEN_BRICK_SLAB.get());
            event.accept(ModBlocks.CYAN_BRICK_SLAB.get());
            event.accept(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get());
            event.accept(ModBlocks.BLUE_BRICK_SLAB.get());
            event.accept(ModBlocks.PURPLE_BRICK_SLAB.get());
            event.accept(ModBlocks.MAGENTA_BRICK_SLAB.get());
            event.accept(ModBlocks.PINK_BRICK_SLAB.get());

            event.accept(ModBlocks.WHITE_BRICK_STAIRS.get());
            event.accept(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get());
            event.accept(ModBlocks.GRAY_BRICK_STAIRS.get());
            event.accept(ModBlocks.BLACK_BRICK_STAIRS.get());
            event.accept(ModBlocks.BROWN_BRICK_STAIRS.get());
            event.accept(ModBlocks.RED_BRICK_STAIRS.get());
            event.accept(ModBlocks.ORANGE_BRICK_STAIRS.get());
            event.accept(ModBlocks.YELLOW_BRICK_STAIRS.get());
            event.accept(ModBlocks.LIME_BRICK_STAIRS.get());
            event.accept(ModBlocks.GREEN_BRICK_STAIRS.get());
            event.accept(ModBlocks.CYAN_BRICK_STAIRS.get());
            event.accept(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get());
            event.accept(ModBlocks.BLUE_BRICK_STAIRS.get());
            event.accept(ModBlocks.PURPLE_BRICK_STAIRS.get());
            event.accept(ModBlocks.MAGENTA_BRICK_STAIRS.get());
            event.accept(ModBlocks.PINK_BRICK_STAIRS.get());

            event.accept(ModBlocks.WHITE_BRICK_WALL.get());
            event.accept(ModBlocks.LIGHT_GRAY_BRICK_WALL.get());
            event.accept(ModBlocks.GRAY_BRICK_WALL.get());
            event.accept(ModBlocks.BLACK_BRICK_WALL.get());
            event.accept(ModBlocks.BROWN_BRICK_WALL.get());
            event.accept(ModBlocks.RED_BRICK_WALL.get());
            event.accept(ModBlocks.ORANGE_BRICK_WALL.get());
            event.accept(ModBlocks.YELLOW_BRICK_WALL.get());
            event.accept(ModBlocks.LIME_BRICK_WALL.get());
            event.accept(ModBlocks.GREEN_BRICK_WALL.get());
            event.accept(ModBlocks.CYAN_BRICK_WALL.get());
            event.accept(ModBlocks.LIGHT_BLUE_BRICK_WALL.get());
            event.accept(ModBlocks.BLUE_BRICK_WALL.get());
            event.accept(ModBlocks.PURPLE_BRICK_WALL.get());
            event.accept(ModBlocks.MAGENTA_BRICK_WALL.get());
            event.accept(ModBlocks.PINK_BRICK_WALL.get());

            event.accept(ModBlocks.WHITE_POST.get());
            event.accept(ModBlocks.RED_POST.get());
            event.accept(ModBlocks.RED_WHITE_POST.get());
            event.accept(ModBlocks.YELLOW_POST.get());
            event.accept(ModBlocks.BLACK_POST.get());
            event.accept(ModBlocks.YELLOW_BLACK_POST.get());

            event.accept(ModBlocks.RED_POLE.get());
            event.accept(ModBlocks.RED_WHITE_POLE.get());
            event.accept(ModBlocks.YELLOW_POLE.get());
            event.accept(ModBlocks.BLACK_POLE.get());
            event.accept(ModBlocks.YELLOW_BLACK_POLE.get());

            event.accept(ModBlocks.WHITE_CHAIN.get());
            event.accept(ModBlocks.RED_CHAIN.get());
            event.accept(ModBlocks.YELLOW_CHAIN.get());
            event.accept(ModBlocks.BLACK_CHAIN.get());
        }
    }
}
