package xxrexraptorxx.citycraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.BlockHitResult;
import xxrexraptorxx.citycraft.blocks.container.PainterMenu;
import xxrexraptorxx.citycraft.main.References;

import javax.annotation.Nullable;


public class PainterBlock extends Block {

	private static final Component CONTAINER_TITLE = Component.translatable("block." + References.MODID + ".block_painter");


	public PainterBlock() {
		super(Properties.of()
				.strength(2.5F)
				.sound(SoundType.METAL)
				.mapColor(MapColor.METAL)
				.instrument(NoteBlockInstrument.IRON_XYLOPHONE)
		);
	}


	@Override
	protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
		if (level.isClientSide) {
			return InteractionResult.SUCCESS;

		} else {
			player.openMenu(state.getMenuProvider(level, pos));
			player.awardStat(Stats.ITEM_USED.get(state.getBlock().asItem()));

			return InteractionResult.CONSUME;
		}
	}


	@Override
	@Nullable
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		return new SimpleMenuProvider((id, playerInventory, player) -> new PainterMenu(id, playerInventory, ContainerLevelAccess.create(worldIn, pos)), CONTAINER_TITLE);
	}

}