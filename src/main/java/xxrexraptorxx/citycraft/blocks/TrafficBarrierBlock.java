package xxrexraptorxx.citycraft.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import xxrexraptorxx.citycraft.registry.ModTags;


public class TrafficBarrierBlock extends FenceBlock implements SimpleWaterloggedBlock {

	public TrafficBarrierBlock() {
		super(Properties.of(Material.METAL)
				.strength(5.0F, 6.5F)
				.sound(SoundType.METAL)
				.color(MaterialColor.METAL)
				.requiresCorrectToolForDrops()
		);

	}


	@Override
	public boolean connectsTo(BlockState state, boolean isSideSolid, Direction direction) {
		boolean flag = this.isSameFence(state);
		return !isExceptionForConnection(state) && isSideSolid || flag;
	}


	private boolean isSameFence(BlockState state) {
		return state.is(ModTags.TRAFFIC_BARRIERS_TAG);
	}


}