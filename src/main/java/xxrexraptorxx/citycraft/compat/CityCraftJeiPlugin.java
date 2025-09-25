package xxrexraptorxx.citycraft.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeManager;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.registry.ModRecipeTypes;
import xxrexraptorxx.citycraft.utils.Config;
import xxrexraptorxx.citycraft.utils.Helper;

@JeiPlugin
public class CityCraftJeiPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(References.MODID, "jei_plugin");
    }


    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new PainterJEICategory(registration.getJeiHelpers().getGuiHelper()));
    }


    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        if (Config.ENABLE_JEI_DESCRIPTIONS.get()) {
            registration.addIngredientInfo(Helper.getAllLampBlocks(), VanillaTypes.ITEM_STACK, Component.translatable("message." + References.MODID + ".flicker_info"));
            registration.addIngredientInfo(Helper.getAllLanternBlocks(), VanillaTypes.ITEM_STACK, Component.translatable("message." + References.MODID + ".solar_info")
                    .append("\n\n").append(Component.translatable("message." + References.MODID + ".flicker_info")));
            registration.addIngredientInfo(Helper.getAllChimneyBlocks(), VanillaTypes.ITEM_STACK, Component.translatable("message." + References.MODID + ".chimney_info"));
            registration.addIngredientInfo(Helper.getAllAsphaltSpeedBlocks(), VanillaTypes.ITEM_STACK, Component.translatable("message." + References.MODID + ".speed_info"));
            registration.addIngredientInfo(Helper.getAllNeonBlocks(), VanillaTypes.ITEM_STACK, Component.translatable("message." + References.MODID + ".neon_info"));
            registration.addIngredientInfo(Helper.getAllBoostBlocks(), VanillaTypes.ITEM_STACK, Component.translatable("message." + References.MODID + ".boost_info"));
            registration.addIngredientInfo(new ItemStack(ModBlocks.REDSTONE_POLE), VanillaTypes.ITEM_STACK, Component.translatable("message." + References.MODID + ".redstone_info"));
        }

        registration.addRecipes(PainterJEICategory.TYPE, recipeManager.getAllRecipesFor(ModRecipeTypes.PAINTING.get()));
    }


    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.BLOCK_PAINTER.get()), PainterJEICategory.TYPE);
    }
}
