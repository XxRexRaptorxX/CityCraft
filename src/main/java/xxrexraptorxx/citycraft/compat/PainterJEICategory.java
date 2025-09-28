package xxrexraptorxx.citycraft.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.recipes.IPaintingRecipe;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.registry.ModRecipeTypes;

public class PainterJEICategory implements IRecipeCategory<RecipeHolder<IPaintingRecipe>> {

    public static final ResourceLocation UID = ModRecipeTypes.PAINTING.getId();
    public static final ResourceLocation BACKGROUND = ResourceLocation.fromNamespaceAndPath(References.MODID, "textures/gui/container/painter_jei.png");
    public static final RecipeType<RecipeHolder<IPaintingRecipe>> TYPE = new RecipeType<>(UID, RecipeType.createFromVanilla(ModRecipeTypes.PAINTING.get()).getRecipeClass());
    // public static final RecipeType<RecipeHolder<IPaintingRecipe>> TYPE =
    // RecipeType.createFromVanilla(ModRecipeTypes.PAINTING);
    private final IDrawable background;
    private final IDrawable icon;
    private final int width;
    private final int height;

    public PainterJEICategory(IGuiHelper helper) {
        this.background = helper.createDrawable(BACKGROUND, 0, 0, 81, 46);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.BLOCK_PAINTER.get()));
        this.width = background.getWidth();
        this.height = background.getHeight();
    }


    @Override
    public RecipeType<RecipeHolder<IPaintingRecipe>> getRecipeType() {
        return TYPE;
    }


    @Override
    public int getHeight() {
        return height;
    }


    @Override
    public int getWidth() {
        return width;
    }


    @Override
    public void draw(RecipeHolder<IPaintingRecipe> recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
        if (background != null) {
            background.draw(guiGraphics, 0, 0);
        }

        IRecipeCategory.super.draw(recipe, recipeSlotsView, guiGraphics, mouseX, mouseY);
    }


    @Override
    public Component getTitle() {
        return Component.translatable("gui." + References.MODID + ".painting");
    }


    @Override
    public IDrawable getIcon() {
        return icon;
    }


    @Override
    public void setRecipe(IRecipeLayoutBuilder iRecipeLayoutBuilder, RecipeHolder<IPaintingRecipe> recipe, IFocusGroup iFocusGroup) {
        iRecipeLayoutBuilder.addSlot(RecipeIngredientRole.INPUT, 1, 1).addIngredients(recipe.value().getIngredients(0));
        iRecipeLayoutBuilder.addSlot(RecipeIngredientRole.INPUT, 1, 29).addIngredients(recipe.value().getIngredients(1));

        iRecipeLayoutBuilder.addSlot(RecipeIngredientRole.OUTPUT, 61, 15).addItemStack(recipe.value().getResultItem(Minecraft.getInstance().level.registryAccess()));
    }
}
