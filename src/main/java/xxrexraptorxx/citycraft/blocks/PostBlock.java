package xxrexraptorxx.citycraft.blocks;

import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;


public class PostBlock extends WallBlock implements SimpleWaterloggedBlock {

	public PostBlock() {
		super(Properties.of(Material.STONE)
				.strength(1.5F, 6.0F)
				.sound(SoundType.STONE)
				.color(MaterialColor.STONE)
				.requiresCorrectToolForDrops()
		);

	}


	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
		return this.defaultBlockState().setValue(UP, true).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
	}

}