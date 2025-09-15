package xxrexraptorxx.citycraft.blocks;

import com.mojang.serialization.MapCodec;
import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.utils.Config;

public class AsphaltBlock extends HorizontalDirectionalBlock {

    public static final MapCodec<AsphaltBlock> CODEC = simpleCodec(AsphaltBlock::new);

    public AsphaltBlock(Properties properties) {
        super(properties);
    }


    public AsphaltBlock() {
        super(Properties.of().requiresCorrectToolForDrops().strength(1.6F).sound(SoundType.STONE).mapColor(DyeColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM));
    }


    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (level.isClientSide || entity == null) return;

        boolean isBoostAsphalt = this == ModBlocks.BOOST_ASPHALT.get();
        boolean isRegularAsphalt = !isBoostAsphalt && Config.ENABLE_ASPHALT_SPEED_EFFECT.get();

        if (isRegularAsphalt || isBoostAsphalt) {
            int duration = isBoostAsphalt ? 30 : 10;
            int amplifier = isBoostAsphalt ? Config.BOOST_SPEED_EFFECT_AMPLIFIER.get() : Config.SPEED_EFFECT_AMPLIFIER.get();

            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, duration, amplifier, false, false, true));
            }
        }
    }


    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
        if (Config.ENABLE_TOOLTIPS.get()) {
            if (this == ModBlocks.BOOST_ASPHALT.get()) {
                list.add(Component.translatable("message." + References.MODID + ".boost_speed_tooltip").withStyle(ChatFormatting.GRAY));

            } else if (Config.ENABLE_ASPHALT_SPEED_EFFECT.get() && this != ModBlocks.POTHOLE_ASPHALT.get()) {
                list.add(Component.translatable("message." + References.MODID + ".speed_tooltip").withStyle(ChatFormatting.GRAY));
            }
        }
    }


    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }


    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }


    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }
}
