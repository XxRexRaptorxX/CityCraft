package xxrexraptorxx.citycraft.recipes;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeInput;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import xxrexraptorxx.citycraft.main.CityCraft;
import xxrexraptorxx.citycraft.registry.ModRecipeSerializers;
import xxrexraptorxx.citycraft.registry.ModRecipeTypes;

import java.util.stream.Stream;

public class PaintingRecipe implements IPaintingRecipe {

    private final ResourceLocation id;
    final Ingredient base;
    final Ingredient color;
    final ItemStack result;

    public PaintingRecipe(
            ResourceLocation id, Ingredient baseIngredient, Ingredient colorIngredient, ItemStack result) {
        this.id = id;
        this.base = baseIngredient;
        this.color = colorIngredient;
        this.result = result;
    }

    @Override
    public boolean matches(RecipeInput input, Level level) {
        return this.base.test(input.getItem(0)) && this.color.test(input.getItem(1));
    }

    @Override
    public ItemStack assemble(RecipeInput input, HolderLookup.Provider provider) {
        return this.result.copy();
    }

    @Override
    public Ingredient getIngredients(Integer slotId) {
        switch (slotId) {
            case 0:
                return this.base;
            case 1:
                return this.color;

            default:
                CityCraft.LOGGER.error("Invalid Ingredient slot id: " + id);
        }
        return null;
    }

    // Unknown recipe category fix
    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider provider) {
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
        return Stream.of(this.color, this.base).anyMatch(Ingredient::hasNoItems);
    }

    public static class Serializer implements RecipeSerializer<PaintingRecipe> {
        public static final Serializer INSTANCE = new Serializer();

        private static final MapCodec<PaintingRecipe> CODEC = RecordCodecBuilder.mapCodec((builder) -> {
            return builder.group(
                            ResourceLocation.CODEC.fieldOf("type").forGetter((recipe) -> recipe.id),
                            Ingredient.CODEC.fieldOf("base").forGetter((recipe) -> recipe.base),
                            Ingredient.CODEC.fieldOf("color").forGetter((recipe) -> recipe.color),
                            ItemStack.OPTIONAL_CODEC.fieldOf("result").forGetter((recipe) -> recipe.result))
                    .apply(builder, PaintingRecipe::new);
        });

        private static PaintingRecipe read(RegistryFriendlyByteBuf buf) {
            ResourceLocation id = buf.readResourceLocation();
            Ingredient base = Ingredient.CONTENTS_STREAM_CODEC.decode(buf);
            Ingredient color = Ingredient.CONTENTS_STREAM_CODEC.decode(buf);
            ItemStack result = ItemStack.OPTIONAL_STREAM_CODEC.decode(buf);

            return new PaintingRecipe(id, base, color, result);
        }

        private static void write(RegistryFriendlyByteBuf buf, PaintingRecipe recipe) {
            buf.writeResourceLocation(recipe.getId());
            Ingredient.CONTENTS_STREAM_CODEC.encode(buf, recipe.base);
            Ingredient.CONTENTS_STREAM_CODEC.encode(buf, recipe.color);
            ItemStack.OPTIONAL_STREAM_CODEC.encode(buf, recipe.result);
        }

        private final StreamCodec<RegistryFriendlyByteBuf, PaintingRecipe> STREAM_CODEC =
                StreamCodec.of(Serializer::write, Serializer::read);

        @Override
        public MapCodec<PaintingRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, PaintingRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}
