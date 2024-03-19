package xxrexraptorxx.citycraft.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;


public class PoleBlock extends FenceBlock implements SimpleWaterloggedBlock {

	public PoleBlock() {
		super(Properties.of()
				.strength(4.0F, 6.0F)
				.sound(SoundType.METAL)
				.mapColor(MapColor.METAL)
				.instrument(NoteBlockInstrument.IRON_XYLOPHONE)
				.requiresCorrectToolForDrops()
		);

	}


	@Override
	public boolean connectsTo(BlockState state, boolean isSideSolid, Direction direction) {
		return false;
	}
}