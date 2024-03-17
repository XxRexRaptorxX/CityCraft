package xxrexraptorxx.citycraft.blocks;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;


public class PostBlock extends FenceBlock implements SimpleWaterloggedBlock {

	public PostBlock() {
		super(Properties.of()
				.requiresCorrectToolForDrops()
				.strength(1.6F)
				.sound(SoundType.STONE)
				.mapColor(DyeColor.BLACK)
				.instrument(NoteBlockInstrument.BASEDRUM)
		);
	}


}