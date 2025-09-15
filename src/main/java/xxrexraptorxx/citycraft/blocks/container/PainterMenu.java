package xxrexraptorxx.citycraft.blocks.container;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeInput;
import net.minecraft.world.level.Level;
import xxrexraptorxx.citycraft.recipes.IPaintingRecipe;
import xxrexraptorxx.citycraft.recipes.RecipeInputWrapper;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.registry.ModMenuTypes;
import xxrexraptorxx.citycraft.registry.ModRecipeTypes;

public class PainterMenu extends AbstractContainerMenu {

    public static final int INPUT_SLOT_1 = 0;
    public static final int INPUT_SLOT_2 = 1;
    public static final int RESULT_SLOT = 2;
    private static final int INV_SLOT_START = 3;
    private static final int INV_SLOT_END = 30;
    private static final int USE_ROW_SLOT_START = 30;
    private static final int USE_ROW_SLOT_END = 39;

    private final Level level;
    private List<RecipeHolder<IPaintingRecipe>> recipes = Lists.newArrayList();
    private final List<RecipeHolder<IPaintingRecipe>> allRecipes;
    private ItemStack input1 = ItemStack.EMPTY;
    private ItemStack input2 = ItemStack.EMPTY;
    long lastSoundTime;
    private final ContainerLevelAccess access;
    final Slot inputSlot1;
    final Slot inputSlot2;
    final Slot resultSlot;
    final ResultContainer resultContainer = new ResultContainer();
    Runnable slotUpdateListener = () -> {};
    private final DataSlot selectedRecipeIndex = DataSlot.standalone();
    private final List<Integer> inputSlotIndexes = List.of(0, 1);

    private final Container container = new SimpleContainer(2) {
        @Override
        public void setChanged() {
            super.setChanged();
            PainterMenu.this.slotsChanged(this);
            PainterMenu.this.slotUpdateListener.run();
        }
    };

    public PainterMenu(int containerId, Inventory playerInventory) {
        this(containerId, playerInventory, ContainerLevelAccess.NULL);
    }


    public PainterMenu(int containerId, Inventory playerInventory, final ContainerLevelAccess access) {
        super(ModMenuTypes.PAINTER.get(), containerId);
        this.level = playerInventory.player.level();
        this.access = access;
        this.allRecipes = this.level.getRecipeManager().getAllRecipesFor(ModRecipeTypes.PAINTING.get());

        // Input Slot 1 (left slot)
        this.inputSlot1 = this.addSlot(new Slot(this.container, INPUT_SLOT_1, 20, 20));

        // Input Slot 2 (right slot)
        this.inputSlot2 = this.addSlot(new Slot(this.container, INPUT_SLOT_2, 20, 48));

        // Result Slot
        this.resultSlot = this.addSlot(new Slot(this.resultContainer, RESULT_SLOT, 143, 33) {
            public boolean mayPlace(ItemStack stack) {
                return false; // Prevent result slot from being manually filled
            }


            public void onTake(Player player, ItemStack stack) {
                stack.onCraftedBy(player.level(), player, stack.getCount());
                PainterMenu.this.resultContainer.awardUsedRecipes(player, this.getRelevantItems());
                ItemStack inputStack1 = PainterMenu.this.inputSlot1.remove(1);
                ItemStack inputStack2 = PainterMenu.this.inputSlot2.remove(1);

                if (!inputStack1.isEmpty() || !inputStack2.isEmpty()) {
                    PainterMenu.this.setupResultSlot();
                }

                access.execute((world, pos) -> {
                    long time = world.getGameTime();
                    if (PainterMenu.this.lastSoundTime != time) {
                        world.playSound(null, pos, SoundEvents.BRUSH_GENERIC, SoundSource.BLOCKS, 1.0F, 1.0F);
                        PainterMenu.this.lastSoundTime = time;
                    }
                });
                super.onTake(player, stack);
            }


            private List<ItemStack> getRelevantItems() {
                List<ItemStack> items = Lists.newArrayList();
                items.add(PainterMenu.this.inputSlot1.getItem());
                items.add(PainterMenu.this.inputSlot2.getItem());
                return items;
            }
        });

        // Add player's inventory slots
        int startX = 8;
        int startY = 84;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, startX + j * 18, startY + i * 18));
            }
        }

        // Add player's hotbar slots
        for (int k = 0; k < 9; ++k) {
            this.addSlot(new Slot(playerInventory, k, startX + k * 18, 142));
        }

        this.addDataSlot(this.selectedRecipeIndex);
    }


    @Override
    public boolean stillValid(Player player) {
        return stillValid(this.access, player, ModBlocks.BLOCK_PAINTER.get());
    }


    @Override
    public boolean clickMenuButton(Player player, int id) {
        if (this.isValidRecipeIndex(id)) {
            this.selectedRecipeIndex.set(id);
            this.setupResultSlot();
        }

        return true;
    }


    @Override
    public void slotsChanged(Container inventory) {
        ItemStack stack1 = this.inputSlot1.getItem();
        ItemStack stack2 = this.inputSlot2.getItem();
        if (!stack1.is(this.input1.getItem()) || !stack2.is(this.input2.getItem())) {
            this.input1 = stack1.copy();
            this.input2 = stack2.copy();
            this.setupRecipeList(this.container, stack1, stack2);
        }
    }


    private void setupRecipeList(Container container, ItemStack stack1, ItemStack stack2) {
        this.recipes.clear();
        this.selectedRecipeIndex.set(-1);
        this.resultSlot.set(ItemStack.EMPTY);
        if (!stack1.isEmpty() && !stack2.isEmpty()) {
            this.recipes = this.level.getRecipeManager().getRecipesFor(ModRecipeTypes.PAINTING.get(), getRecipeInput(container), this.level);
        }
    }


    private void setupResultSlot() {
        if (!this.recipes.isEmpty() && this.isValidRecipeIndex(this.selectedRecipeIndex.get())) {
            RecipeHolder<IPaintingRecipe> recipe = this.recipes.get(this.selectedRecipeIndex.get());
            ItemStack resultStack = recipe.value().assemble(getRecipeInput(container), this.level.registryAccess());

            if (resultStack.isItemEnabled(this.level.enabledFeatures())) {
                this.resultContainer.setRecipeUsed(recipe);
                this.resultSlot.set(resultStack);

            } else {
                this.resultSlot.set(ItemStack.EMPTY);
            }
        } else {
            this.resultSlot.set(ItemStack.EMPTY);
        }

        this.broadcastChanges();
    }


    @Override
    public void removed(Player player) {
        super.removed(player);
        this.resultContainer.removeItemNoUpdate(RESULT_SLOT);
        this.access.execute((p_40313_, p_40314_) -> { this.clearContainer(player, this.container); });
    }


    private RecipeInput getRecipeInput(Container inventory) {
        return new RecipeInputWrapper(inventory);
    }

    ///////////////////


    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);

        if (slot != null && slot.hasItem()) {
            ItemStack stack = slot.getItem();
            itemstack = stack.copy();

            // If the clicked slot is the result slot
            if (index == RESULT_SLOT) {
                // Try to move the item to the player's inventory
                if (!this.moveItemStackTo(stack, INV_SLOT_START, USE_ROW_SLOT_END, true)) {
                    return ItemStack.EMPTY;
                }
                slot.onQuickCraft(stack, itemstack);
            }

            // If the clicked slot is in the player's inventory
            else if (index >= INV_SLOT_START && index < USE_ROW_SLOT_END) {

                // Check if the item can be moved into the input slots
                if (!this.canMoveIntoInputSlots(stack)) {
                    return ItemStack.EMPTY;
                }
                // Get the appropriate input slot index for the item
                int slotIndex = this.getSlotToQuickMoveTo(stack);

                // Try to move the item to the input slot
                if (!this.moveItemStackTo(stack, slotIndex, slotIndex + 1, false)) {
                    return ItemStack.EMPTY;
                }
            }

            // If the clicked slot is not the result slot or in the player's inventory
            else {
                // Try to move the item to the player's inventory
                if (!this.moveItemStackTo(stack, INV_SLOT_START, USE_ROW_SLOT_END, false)) {
                    return ItemStack.EMPTY;
                }
            }

            // If the item stack is empty after moving
            if (stack.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }

            // If the item count didn't change, return an empty stack
            if (stack.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }

            // Trigger the slot's onTake method and broadcast changes
            slot.onTake(player, stack);
            this.broadcastChanges();
        }

        return itemstack;
    }


    public int getSlotToQuickMoveTo(ItemStack stack) {
        return allRecipes.stream().map((recipeMap) -> { return findSlotMatchingIngredient(recipeMap.value(), stack); }).filter(Optional::isPresent).findFirst()
                .orElse(Optional.of(1)).get();
    }


    private static Optional<Integer> findSlotMatchingIngredient(IPaintingRecipe recipe, ItemStack stack) {
        if (recipe.isBaseIngredient(stack)) {
            return Optional.of(0);
        } else if (recipe.isColorIngredient(stack)) {
            return Optional.of(1);
        } else {
            return Optional.empty();
        }
    }


    public boolean canMoveIntoInputSlots(ItemStack stack) {
        return this.level.getRecipeManager().getAllRecipesFor(ModRecipeTypes.PAINTING.get()).stream()
                .map((recipeMap) -> { return findSlotMatchingIngredient(recipeMap.value(), stack); }).anyMatch(Optional::isPresent);
    }


    public int getResultSlot() {
        return this.RESULT_SLOT;
    }

    //////////////////


    public void registerUpdateListener(Runnable runnable) {
        this.slotUpdateListener = runnable;
    }


    private boolean isValidRecipeIndex(int id) {
        return id >= 0 && id < this.recipes.size();
    }


    public int getSelectedRecipeIndex() {
        return this.selectedRecipeIndex.get();
    }


    public List<RecipeHolder<IPaintingRecipe>> getRecipes() {
        return this.recipes;
    }


    public int getNumRecipes() {
        return this.recipes.size();
    }


    public boolean hasInputItem() {
        return this.inputSlot1.hasItem() && this.inputSlot2.hasItem() && !this.recipes.isEmpty();
    }
}
