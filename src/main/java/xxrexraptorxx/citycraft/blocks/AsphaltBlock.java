package xxrexraptorxx.citycraft.blocks;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import org.jetbrains.annotations.Nullable;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.utils.Config;

import java.util.List;


public class AsphaltBlock extends HorizontalDirectionalBlock {

	public AsphaltBlock() {
		super(Properties.of(Material.STONE)
				.requiresCorrectToolForDrops()
				.strength(1.6F)
				.sound(SoundType.STONE)
				.color(MaterialColor.COLOR_BLACK)
		);
	}


	@Override
	public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
		if (level.isClientSide || entity == null)
			return;

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
	public void appendHoverText(ItemStack stack, @Nullable BlockGetter level, List<Component> list, TooltipFlag flag) {
		if (Config.ENABLE_TOOLTIPS.get()) {
			if (this == ModBlocks.BOOST_ASPHALT.get()) {
				list.add(Component.translatable("message.citycraft.boost_speed_tooltip").withStyle(ChatFormatting.GRAY));

			} else if (Config.ENABLE_ASPHALT_SPEED_EFFECT.get() && this != ModBlocks.POTHOLE_ASPHALT.get()) {
				list.add(Component.translatable("message.citycraft.speed_tooltip").withStyle(ChatFormatting.GRAY));
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

}