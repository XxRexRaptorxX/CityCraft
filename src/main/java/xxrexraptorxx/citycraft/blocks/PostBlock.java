package xxrexraptorxx.citycraft.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;


public class PostBlock extends FenceBlock implements SimpleWaterloggedBlock {

	public PostBlock() {
		super(Properties.of()
				.strength(5.0F, 6.0F)
				.sound(SoundType.METAL)
				.mapColor(DyeColor.WHITE)
				.instrument(NoteBlockInstrument.IRON_XYLOPHONE)
		);

	}


	@Override
	public boolean connectsTo(BlockState state, boolean isSideSolid, Direction direction) {
		return false;
	}
}