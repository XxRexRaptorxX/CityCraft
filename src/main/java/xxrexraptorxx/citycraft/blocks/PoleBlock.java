package xxrexraptorxx.citycraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;


public class PoleBlock extends RodBlock implements SimpleWaterloggedBlock {

	public PoleBlock() {
		super(Properties.of()
				.strength(5.0F, 6.0F)
				.sound(SoundType.METAL)
				.mapColor(MapColor.METAL)
				.instrument(NoteBlockInstrument.IRON_XYLOPHONE)
				.requiresCorrectToolForDrops()
		);

	}


	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		Direction direction = context.getClickedFace();
		BlockState blockstate = context.getLevel().getBlockState(context.getClickedPos().relative(direction.getOpposite()));
		return blockstate.is(this) && blockstate.getValue(FACING) == direction ? this.defaultBlockState().setValue(FACING, direction.getOpposite()) : this.defaultBlockState().setValue(FACING, direction);
	}


	@Override
	public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}


	@Override
	public void onProjectileHit(Level level, BlockState state, BlockHitResult hit, Projectile projectile) {
		if (level.isThundering() && projectile instanceof ThrownTrident && ((ThrownTrident) projectile).isChanneling()) {
			BlockPos blockpos = hit.getBlockPos();

			if (level.canSeeSky(blockpos)) {
				LightningBolt lightningbolt = EntityType.LIGHTNING_BOLT.create(level);

				if (lightningbolt != null) {
					lightningbolt.moveTo(Vec3.atBottomCenterOf(blockpos.above()));
					Entity entity = projectile.getOwner();
					lightningbolt.setCause(entity instanceof ServerPlayer ? (ServerPlayer) entity : null);
					level.addFreshEntity(lightningbolt);
				}

				level.playSound((Player) null, blockpos, SoundEvents.TRIDENT_THUNDER, SoundSource.WEATHER, 5.0F, 1.0F);
			}
		}
	}

}