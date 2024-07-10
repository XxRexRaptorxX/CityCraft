package xxrexraptorxx.citycraft.recipes;

import com.google.gson.JsonObject;
import net.minecraft.core.RegistryAccess;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeHooks;
import xxrexraptorxx.citycraft.main.CityCraft;
import xxrexraptorxx.citycraft.registry.ModRecipeSerializers;
import xxrexraptorxx.citycraft.registry.ModRecipeTypes;

import java.util.stream.Stream;

public class PaintingRecipe implements IPaintingRecipe {

   private final ResourceLocation id;
   final Ingredient base;
   final Ingredient color;
   final ItemStack result;


   public PaintingRecipe(ResourceLocation id, Ingredient baseIngredient, Ingredient colorIngredient, ItemStack result) {
      this.id = id;
      this.base = baseIngredient;
      this.color = colorIngredient;
      this.result = result;
   }


   /**
    * Used to check if a recipe matches current crafting inventory
    */
   @Override
   public boolean matches(Container container, Level level) {
      return this.base.test(container.getItem(0)) && this.color.test(container.getItem(1));
   }


   @Override
   public ItemStack assemble(Container container, RegistryAccess registryAccess) {
      ItemStack itemstack = this.result.copy();
      CompoundTag compoundtag = container.getItem(0).getTag();
      if (compoundtag != null) {
         itemstack.setTag(compoundtag.copy());
      }

      return itemstack;
   }


   @Override
   public Ingredient getIngredients(Integer slotId) {
      switch (slotId) {
         case 0: return this.base;
         case 1: return this.color;

         default:
            CityCraft.LOGGER.error("Invalid Ingredient slot id: " + id);
      }
      return null;
   }


   @Override
   public ItemStack getResultItem(RegistryAccess registryAccess) {
      return this.result;
   }


   @Override
   public boolean isColorIngredient(ItemStack pStack) {
      return this.color.test(pStack);
   }


   @Override
   public boolean isBaseIngredient(ItemStack pStack) {
      return this.base.test(pStack);
   }


   @Override
   public ResourceLocation getId() {
      return this.id;
   }


   @Override
   public RecipeSerializer<?> getSerializer() {
      return ModRecipeSerializers.PAINTING.get();
   }


   @Override
   public RecipeType<?> getType() {
      return ModRecipeTypes.PAINTING;
   }


   @Override
   public boolean isIncomplete() {
      return Stream.of(this.color, this.base).anyMatch(ForgeHooks::hasNoElements);
   }


   @Override
   public boolean isSpecial() {
      return true;
   }


   public static class Serializer implements RecipeSerializer<PaintingRecipe> {
      public static final Serializer INSTANCE = new Serializer();
      public static final ResourceLocation ID = new ResourceLocation(ModRecipeTypes.PAINTING_RECIPE_TYPE);

      public PaintingRecipe fromJson(ResourceLocation loc, JsonObject json) {
         Ingredient ingredient = Ingredient.fromJson(GsonHelper.getAsJsonObject(json, "base"));
         Ingredient color = Ingredient.fromJson(GsonHelper.getAsJsonObject(json, "color"));
         ItemStack result = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "result"));

         return new PaintingRecipe(loc, ingredient, color, result);
      }

      public PaintingRecipe fromNetwork(ResourceLocation loc, FriendlyByteBuf buf) {
         Ingredient ingredient = Ingredient.fromNetwork(buf);
         Ingredient ingredient1 = Ingredient.fromNetwork(buf);
         ItemStack itemstack = buf.readItem();

         return new PaintingRecipe(loc, ingredient, ingredient1, itemstack);
      }


      public void toNetwork(FriendlyByteBuf buf, PaintingRecipe recipe) {
         recipe.base.toNetwork(buf);
         recipe.color.toNetwork(buf);
         buf.writeItem(recipe.result);
      }
   }
}