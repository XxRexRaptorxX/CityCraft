package xxrexraptorxx.citycraft.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RodBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class PoleBlock extends RodBlock implements SimpleWaterloggedBlock {

    public static final MapCodec<PoleBlock> CODEC = simpleCodec(PoleBlock::new);

    public PoleBlock(Properties properties) {
        super(properties);
    }

    public PoleBlock() {
        super(Properties.of()
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .mapColor(MapColor.METAL)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops());
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction direction = context.getClickedFace();
        BlockState blockstate =
                context.getLevel().getBlockState(context.getClickedPos().relative(direction.getOpposite()));
        return blockstate.is(this) && blockstate.getValue(FACING) == direction
                ? this.defaultBlockState().setValue(FACING, direction.getOpposite())
                : this.defaultBlockState().setValue(FACING, direction);
    }

    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    // @Override			TODO!
    // public void onProjectileHit(Level level, BlockState state, BlockHitResult hit, Projectile projectile) {
    //	if (level.isThundering() && projectile instanceof ThrownTrident && ((ThrownTrident) projectile).isChanneling()) {
    //		BlockPos blockpos = hit.getBlockPos();
    //
    //		if (level.canSeeSky(blockpos)) {
    //			LightningBolt lightningbolt = EntityType.LIGHTNING_BOLT.create(level);
    //
    //			if (lightningbolt != null) {
    //				lightningbolt.moveTo(Vec3.atBottomCenterOf(blockpos.above()));
    //				Entity entity = projectile.getOwner();
    //				lightningbolt.setCause(entity instanceof ServerPlayer ? (ServerPlayer) entity : null);
    //				level.addFreshEntity(lightningbolt);
    //			}
    //
    //			level.playSound((Player) null, blockpos, SoundEvents.TRIDENT_THUNDER.value(), SoundSource.WEATHER, 5.0F, 1.0F);
    //		}
    //	}
    // }

    @Override
    protected MapCodec<? extends RodBlock> codec() {
        return CODEC;
    }
}
