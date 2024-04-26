package xxrexraptorxx.citycraft.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.recipes.IPaintingRecipe;
import xxrexraptorxx.citycraft.recipes.PaintingRecipe;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.registry.ModRecipeTypes;

public class PainterJEICategory implements IRecipeCategory<IPaintingRecipe> {

    public static final ResourceLocation UID = new ResourceLocation(ModRecipeTypes.PAINTING_RECIPE_TYPE);
    public static final ResourceLocation BACKGROUND = new ResourceLocation(References.MODID,"textures/gui/container/painter_jei.png");
    public static final RecipeType<IPaintingRecipe> TYPE = new RecipeType<>(UID, PaintingRecipe.class);
    private final IDrawable background;
    private final IDrawable icon;


    public PainterJEICategory(IGuiHelper helper) {
        background = helper.createDrawable(BACKGROUND, 0, 0, 81, 46);
        icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.BLOCK_PAINTER.get()));
    }


    @Override
    public RecipeType<IPaintingRecipe> getRecipeType() {
        return TYPE;
    }


    @Override
    public Component getTitle() {
        return Component.translatable("gui." + References.MODID + ".painting");
    }


    @Override
    public IDrawable getBackground() {
        return background;
    }


    @Override
    public IDrawable getIcon() {
        return icon;
    }


    @Override
    public void setRecipe(IRecipeLayoutBuilder iRecipeLayoutBuilder, IPaintingRecipe recipe, IFocusGroup iFocusGroup) {
        iRecipeLayoutBuilder.addSlot(RecipeIngredientRole.INPUT, 1, 1).addIngredients(recipe.getIngredients(0));
        iRecipeLayoutBuilder.addSlot(RecipeIngredientRole.INPUT, 1, 29).addIngredients(recipe.getIngredients(1));

        iRecipeLayoutBuilder.addSlot(RecipeIngredientRole.OUTPUT, 61, 15).addItemStack(recipe.getResultItem(Minecraft.getInstance().level.registryAccess()));
    }


}