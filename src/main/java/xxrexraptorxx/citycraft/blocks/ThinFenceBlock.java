package xxrexraptorxx.citycraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.Vec3;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.utils.Config;

public class ThinFenceBlock extends IronBarsBlock {

    public ThinFenceBlock(Properties properties) {
        super(properties.requiresCorrectToolForDrops().strength(5.0F, 10.0F).sound(SoundType.METAL).mapColor(MapColor.METAL).instrument(NoteBlockInstrument.PLING).noOcclusion());
    }


    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (state.getBlock() == ModBlocks.BARBED_WIRE_FENCE.get()) {
            entity.makeStuckInBlock(state, new Vec3(0.25D, (double) 0.05F, 0.25D));

            if (!level.isClientSide) {
                if (Config.BARBED_WIRE_DESTROY_ITEMS.get()) {
                    entity.hurt(level.damageSources().generic(), (float) Config.BARBED_WIRE_FENCE_DAMAGE.get());

                } else {
                    if (entity instanceof LivingEntity) {
                        entity.hurt(level.damageSources().generic(), (float) Config.BARBED_WIRE_FENCE_DAMAGE.get());
                    }
                }
            }
        }
    }

}
