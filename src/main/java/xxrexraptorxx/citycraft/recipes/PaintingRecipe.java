package xxrexraptorxx.citycraft.recipes;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.CommonHooks;
import org.jetbrains.annotations.NotNull;
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


   //Unknown recipe category fix
   @Override
   public boolean isSpecial() {
      return true;
   }


   @Override
   public ItemStack getResultItem(RegistryAccess registryAccess) {
      return this.result;
   }


   @Override
   public boolean isColorIngredient(ItemStack stack) {
      return this.color.test(stack);
   }


   @Override
   public boolean isBaseIngredient(ItemStack stack) {
      return this.base.test(stack);
   }


   public ResourceLocation getId() {
      return this.id;
   }


   @Override
   public RecipeSerializer<?> getSerializer() {
      return ModRecipeSerializers.PAINTING.get();
   }


   @Override
   public RecipeType<?> getType() {
      return ModRecipeTypes.PAINTING.get();
   }


   @Override
   public boolean isIncomplete() {
      return Stream.of(this.color, this.base).anyMatch(CommonHooks::hasNoElements);
   }


   public static class Serializer implements RecipeSerializer<PaintingRecipe> {
      public static final Serializer INSTANCE = new Serializer();

      private static final Codec<PaintingRecipe> CODEC = RecordCodecBuilder.create((builder) -> {
         return builder.group(
                 ResourceLocation.CODEC.fieldOf("type").forGetter((recipe) -> recipe.id),
                 Ingredient.CODEC.fieldOf("base").forGetter((recipe) -> recipe.base),
                 Ingredient.CODEC.fieldOf("color").forGetter((recipe) -> recipe.color),
                 ItemStack.ITEM_WITH_COUNT_CODEC.fieldOf("result").forGetter((recipe) -> recipe.result)
         ).apply(builder, PaintingRecipe::new);
      });


      @Override
      public PaintingRecipe fromNetwork(FriendlyByteBuf buf) {
         ResourceLocation id = buf.readResourceLocation();
         Ingredient base = Ingredient.fromNetwork(buf);
         Ingredient color = Ingredient.fromNetwork(buf);
         ItemStack result = buf.readItem();

         return new PaintingRecipe(id, base, color, result);
      }


      @Override
      public void toNetwork(FriendlyByteBuf buf, PaintingRecipe recipe) {
         buf.writeResourceLocation(recipe.getId());
         recipe.base.toNetwork(buf);
         recipe.color.toNetwork(buf);
         buf.writeItem(recipe.result);
      }


      @Override
      public @NotNull Codec<PaintingRecipe> codec() {
         return CODEC;
      }
   }


}