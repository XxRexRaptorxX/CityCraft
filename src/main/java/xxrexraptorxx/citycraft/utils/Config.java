package xxrexraptorxx.citycraft.utils;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod.EventBusSubscriber
public class Config {

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_ROADS = "roads";
    public static final String CATEGORY_SIGNS = "signs";

    public static ForgeConfigSpec SERVER_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;

    public static ForgeConfigSpec.BooleanValue UPDATE_CHECKER;
    public static ForgeConfigSpec.BooleanValue PATREON_REWARDS;

    public static ForgeConfigSpec.BooleanValue ENABLE_ASPHALT_SPEED_EFFECT;
    public static ForgeConfigSpec.BooleanValue SPLIT_TRAFFIC_SIGN_TAB;
    public static ForgeConfigSpec.IntValue SPEED_EFFECT_AMPLIFIER;
    public static ForgeConfigSpec.IntValue BOOST_SPEED_EFFECT_AMPLIFIER;

    public static void init() {
        initServer();
        initClient();

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, SERVER_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CLIENT_CONFIG);
    }


    public static void initClient() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("General").push(CATEGORY_GENERAL);
        UPDATE_CHECKER = builder.comment("Activate the Update-Checker").define("update-checker", true);
        builder.pop();

        //builder.comment("Signs").push(CATEGORY_SIGNS);
        //SPLIT_TRAFFIC_SIGN_TAB = builder.comment("Activate this if you want to split the signs tab in the creative inventory into different categories").define("split_traffic_sign_tab", false);
        //builder.pop();

        CLIENT_CONFIG = builder.build();
    }


    public static void initServer() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("General").push(CATEGORY_GENERAL);
        PATREON_REWARDS = builder.comment("Enables ingame rewards on first spawn for Patreons").define("patreon_rewards", true);
        builder.pop();

        builder.comment("Roads").push(CATEGORY_ROADS);
        ENABLE_ASPHALT_SPEED_EFFECT = builder.comment("Enables the speed effect you get when you run on asphalt. [not boost blocks]").define("enable_asphalt_speed_effect", true);
        SPEED_EFFECT_AMPLIFIER = builder.comment("How strong the speed effect should be.").defineInRange("speed_effect_amplifier", 1, 0, 5);
        BOOST_SPEED_EFFECT_AMPLIFIER = builder.comment("How strong the speed effect of Boost blocks should be.").defineInRange("boost_speed_effect_amplifier", 3, 0, 5);
        builder.pop();

        SERVER_CONFIG = builder.build();
    }

}