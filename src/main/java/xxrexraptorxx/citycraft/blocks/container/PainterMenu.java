package xxrexraptorxx.citycraft.blocks.container;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.apache.commons.compress.utils.Lists;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.registry.ModMenuTypes;
import xxrexraptorxx.citycraft.registry.ModRecipeTypes;
import xxrexraptorxx.citycraft.recipes.IPaintingRecipe;
import xxrexraptorxx.citycraft.recipes.PaintingRecipe;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

public class PainterMenu extends ItemCombinerMenu {

    private final ResultContainer resultContainer = new ResultContainer();
    private final Level level;
    private Runnable slotUpdateListener = () -> {};
    @Nullable
    private PaintingRecipe selectedRecipe;
    private final DataSlot selectedRecipeIndex = DataSlot.standalone();
    private List<IPaintingRecipe> recipes = Lists.newArrayList();
    private List<IPaintingRecipe> allRecipes;
    private ItemStack input = ItemStack.EMPTY;
    private ItemStack color = ItemStack.EMPTY;

    public PainterMenu(int id, Inventory playerInventory) {
        this(id, playerInventory, ContainerLevelAccess.NULL);
    }

    public PainterMenu(int id, Inventory playerInventory, final ContainerLevelAccess access) {
        super(ModMenuTypes.PAINTER, id, playerInventory, access);
        this.level = playerInventory.player.level();
        this.allRecipes = this.level.getRecipeManager().getAllRecipesFor(ModRecipeTypes.PAINTING);
    }


    @Override
    public boolean mayPickup(Player player, boolean hasStack) {
        return this.selectedRecipe != null && this.selectedRecipe.matches(this.inputSlots, this.level);
    }


    @Override
    public void onTake(Player player, ItemStack stack) {
        stack.onCraftedBy(player.level(), player, stack.getCount());
        this.resultSlots.awardUsedRecipes(player, this.getRelevantItems());
        this.shrinkStackInSlot(0);
        this.shrinkStackInSlot(1);
        this.access.execute((p_40263_, p_40264_) -> {
            player.level().playSound(null, player.getOnPos(), SoundEvents.BRUSH_GENERIC, SoundSource.BLOCKS, 1f, 1f);
            p_40263_.levelEvent(1044, p_40264_, 0);
        });
    }


    private List<ItemStack> getRelevantItems() {
        return List.of(this.inputSlots.getItem(0), this.inputSlots.getItem(1));
    }


    @Override
    public ItemCombinerMenuSlotDefinition createInputSlotDefinitions() {
        return ItemCombinerMenuSlotDefinition.create()
                //BASE INGREDIENT SLOT
                .withSlot(0, 20, 20, (ingredient) -> {
                    return this.allRecipes.stream().anyMatch((matchedIngredientRecipes) -> {
                        return matchedIngredientRecipes.isBaseIngredient(ingredient);
                    });
                    //COLOR INGREDIENT SLOT
                }).withSlot(1, 20, 48, (color) -> {
                    return this.allRecipes.stream().anyMatch((matchedColorRecipes) -> {
                        return matchedColorRecipes.isColorIngredient(color);
                    });
                    //RESULT SLOT
                }).withResultSlot(2, 143, 33).build();
    }


    private void shrinkStackInSlot(int index) {
        ItemStack itemstack = this.inputSlots.getItem(index);
        if (!itemstack.isEmpty()) {
            itemstack.shrink(1);
            this.inputSlots.setItem(index, itemstack);
        }
    }


    @Override
    public boolean canTakeItemForPickAll(ItemStack stack, Slot slotIn) {
        return slotIn.container != this.resultContainer && super.canTakeItemForPickAll(stack, slotIn);
    }


    @Override
    public boolean isValidBlock(BlockState state) {
        return state.is(ModBlocks.BLOCK_PAINTER.get());
    }


    @Override
    public boolean canMoveIntoInputSlots(ItemStack stack) {
        return this.allRecipes.stream().map((recipeMap) -> {
            return findSlotMatchingIngredient(recipeMap, stack);
        }).anyMatch(Optional::isPresent);
    }


    private static Optional<Integer> findSlotMatchingIngredient(IPaintingRecipe recipe, ItemStack stack) {
        if (recipe.isColorIngredient(stack)) {
            return Optional.of(1);
        } else {
            return Optional.of(0);
        }
    }


    @Override
    public int getSlotToQuickMoveTo(ItemStack stack) {
        return this.allRecipes.stream().map((recipeMap) -> {
            return findSlotMatchingIngredient(recipeMap, stack);
        }).filter(Optional::isPresent).findFirst().orElse(Optional.of(0)).get();
    }


    public void createResult() {
        List<IPaintingRecipe> list = this.level.getRecipeManager().getRecipesFor(ModRecipeTypes.PAINTING, this.inputSlots, this.level);

        if (list.isEmpty()) {
            this.resultSlots.setItem(0, ItemStack.EMPTY);

        } else {
            IPaintingRecipe recipe = list.get(0);
            ItemStack itemstack = recipe.assemble(this.inputSlots, this.level.registryAccess());

            if (itemstack.isItemEnabled(this.level.enabledFeatures())) {
                this.selectedRecipe = (PaintingRecipe) recipe;
                this.resultSlots.setRecipeUsed(recipe);
                this.resultSlots.setItem(0, itemstack);
            }
        }

    }


    /////STONECUTTER CODE PARTS/////


    public final Container container = new SimpleContainer(2) {
        /**
         * For block entities, ensures the chunk containing the block entity is saved to disk later - the game won't think
         * it hasn't changed and skip it.
         */
        @Override
        public void setChanged() {
            super.setChanged();
            PainterMenu.this.slotsChanged(this);
            PainterMenu.this.slotUpdateListener.run();
        }
    };

    @Override
    public boolean stillValid(Player player) {
        return stillValid(this.access, player, ModBlocks.BLOCK_PAINTER.get());
    }


    @Override
    public boolean clickMenuButton(Player player, int id) {
        if (isValidRecipeIndex(id)) {
            this.selectedRecipeIndex.set(id);
            setupResultSlot();
        }

        return true;
    }


    private boolean isValidRecipeIndex(int id) {
        return id >= 0 && id < this.recipes.size();
    }


    public int getSelectedRecipeIndex() {
        return this.selectedRecipeIndex.get();
    }


    public List<IPaintingRecipe> getRecipes() {
        return this.recipes;
    }


    public int getNumRecipes() {
        return this.recipes.size();
    }


    @Override
    public void slotsChanged(Container inventory) {
        ItemStack input = this.inputSlots.getItem(0);
        ItemStack color = this.inputSlots.getItem(1);

        if (!input.is(this.input.getItem())) {
            this.input = input.copy();
            setupRecipeList(inventory, input, color);
        }
        if (!color.is(this.color.getItem())) {
            this.color = color.copy();
            setupRecipeList(inventory, input, color);
        }
    }


    private void setupRecipeList(Container container, ItemStack input, ItemStack color) {
        this.recipes.clear();
        this.selectedRecipeIndex.set(-1);
        this.resultSlots.setItem(2, ItemStack.EMPTY);

        if (!input.isEmpty() && !color.isEmpty()) {
            this.recipes = this.level.getRecipeManager().getRecipesFor(ModRecipeTypes.PAINTING, container, this.level);
        }

    }


    private void setupResultSlot() {
        if (!this.recipes.isEmpty() && isValidRecipeIndex(this.selectedRecipeIndex.get())) {
            IPaintingRecipe recipeHolder = this.recipes.get(this.selectedRecipeIndex.get());
            ItemStack stack = recipeHolder.assemble(this.inputSlots, this.level.registryAccess());

            if (stack.isItemEnabled(this.level.enabledFeatures())) {
                this.resultContainer.setRecipeUsed(recipeHolder);
                this.resultSlots.setItem(2, stack);

            } else {
                this.resultSlots.setItem(2, ItemStack.EMPTY);
            }

        } else {
            this.resultSlots.setItem(2, ItemStack.EMPTY);
        }

        broadcastChanges();
    }


    @Override
    public MenuType<?> getType() {
        return ModMenuTypes.PAINTER;
    }


    public boolean hasInputItem() {
        return !this.inputSlots.getItem(0).isEmpty() && !this.inputSlots.getItem(1).isEmpty() && !this.recipes.isEmpty();
    }


    public void registerUpdateListener(Runnable runnable) {
        this.slotUpdateListener = runnable;
    }

}