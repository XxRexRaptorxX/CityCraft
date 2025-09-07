package xxrexraptorxx.citycraft.utils;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_ROADS = "roads";
    public static final String CATEGORY_SIGNS = "signs";

    public static ModConfigSpec SERVER_CONFIG;
    public static ModConfigSpec CLIENT_CONFIG;

    public static ModConfigSpec.BooleanValue UPDATE_CHECKER;
    public static ModConfigSpec.BooleanValue PATREON_REWARDS;

    public static ModConfigSpec.BooleanValue ENABLE_TOOLTIPS;
    public static ModConfigSpec.BooleanValue ENABLE_ASPHALT_SPEED_EFFECT;
    public static ModConfigSpec.BooleanValue SPLIT_TRAFFIC_SIGN_TAB;
    public static ModConfigSpec.IntValue SPEED_EFFECT_AMPLIFIER;
    public static ModConfigSpec.IntValue BOOST_SPEED_EFFECT_AMPLIFIER;

    public static void init(ModContainer container) {
        initServer();
        initClient();

        container.registerConfig(ModConfig.Type.SERVER, SERVER_CONFIG);
        container.registerConfig(ModConfig.Type.CLIENT, CLIENT_CONFIG);
    }

    public static void initClient() {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        builder.comment("General").push(CATEGORY_GENERAL);
        UPDATE_CHECKER = builder.comment("Activate the Update-Checker").define("update-checker", true);
        ENABLE_TOOLTIPS = builder.comment("Enables tooltips for some blocks/items in your inventory")
                .define("enable_tooltips", true);
        builder.pop();

        // builder.comment("Signs").push(CATEGORY_SIGNS);
        // SPLIT_TRAFFIC_SIGN_TAB = builder.comment("Activate this if you want to split the signs tab in the creative
        // inventory into different categories").define("split_traffic_sign_tab", false);
        // builder.pop();

        CLIENT_CONFIG = builder.build();
    }

    public static void initServer() {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        builder.comment("General").push(CATEGORY_GENERAL);
        PATREON_REWARDS = builder.comment("Enables ingame rewards on first spawn for Patreons")
                .define("patreon_rewards", true);
        builder.pop();

        builder.comment("Roads").push(CATEGORY_ROADS);
        ENABLE_ASPHALT_SPEED_EFFECT = builder.comment(
                        "Enables the speed effect you get when you run on asphalt. [not boost blocks]")
                .define("enable_asphalt_speed_effect", true);
        SPEED_EFFECT_AMPLIFIER = builder.comment("How strong the speed effect should be.")
                .defineInRange("speed_effect_amplifier", 1, 0, 5);
        BOOST_SPEED_EFFECT_AMPLIFIER = builder.comment("How strong the speed effect of Boost blocks should be.")
                .defineInRange("boost_speed_effect_amplifier", 3, 0, 5);
        builder.pop();

        SERVER_CONFIG = builder.build();
    }
}
