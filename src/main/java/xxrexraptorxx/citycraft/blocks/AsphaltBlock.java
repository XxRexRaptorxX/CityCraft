package xxrexraptorxx.citycraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import xxrexraptorxx.citycraft.utils.Config;


public class AsphaltBlock extends Block {

	public AsphaltBlock() {
		super(Properties.of()
				.requiresCorrectToolForDrops()
				.strength(1.6F)
				.sound(SoundType.STONE)
				.mapColor(DyeColor.BLACK)
				.instrument(NoteBlockInstrument.BASEDRUM)
		);
	}


	@Override
	public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
		if(!level.isClientSide && Config.ENABLE_ASPHALT_SPEED_EFFECT.get()) {
			if(entity instanceof Player) {
				Player player = (Player) entity;
				player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, Config.SPEED_EFFECT_AMPLIFIER.get(), false, false, true));
			}

			if(entity instanceof LivingEntity) {
				LivingEntity livingentity = (LivingEntity) entity;
				livingentity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, Config.SPEED_EFFECT_AMPLIFIER.get(), false, false, true));
			}
		}
	}

}