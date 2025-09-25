package xxrexraptorxx.citycraft.blocks;

import java.util.function.ToIntFunction;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.phys.BlockHitResult;

public class LanternBlock extends Block {

    public static final BooleanProperty LIT;
    public static final BooleanProperty FORCED_ON;
    public static final BooleanProperty FLICKERING;

    public LanternBlock() {
        super(Properties.of().strength(5.0F, 6.0F).sound(SoundType.GLASS).mapColor(MapColor.METAL).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops()
                .lightLevel(litBlockEmission(15)).noOcclusion());
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, false).setValue(FORCED_ON, false).setValue(FLICKERING, false));
    }


    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource source) {
        boolean powered = level.hasNeighborSignal(pos);
        boolean forced = state.getValue(FORCED_ON);
        boolean flick = state.getValue(FLICKERING);

        boolean shouldBeOn = powered || (level.getSkyDarken() >= 6) || forced;

        // If not flickering, behave like a normal lantern that turns on/off on schedule
        if (!flick) {
            level.setBlock(pos, state.setValue(LIT, shouldBeOn), 2);
            // schedule next periodic check
            level.scheduleTick(pos, this, 100);
            return;
        }

        // Flickering logic: only active when flickering is enabled AND the lamp
        // would otherwise be ON (powered, dark sky, or forced)
        if (!shouldBeOn) {
            // ensure it's off when nothing drives it
            if (state.getValue(LIT)) {
                level.setBlock(pos, state.setValue(LIT, false), 2);
            }
            return;
        }

        boolean currentlyLit = state.getValue(LIT);

        if (currentlyLit) {
            // While lit: often start a short burst (quick off -> back on -> maybe off again),
            // but sometimes remain steadily lit.
            double startBurstChance = 0.65; // 65% chance to initiate a short flicker burst
            if (source.nextDouble() < startBurstChance) {
                // Switch off briefly to start the blink sequence.
                level.setBlock(pos, state.setValue(LIT, false), 2);
                // Schedule next tick soon for the off-phase decision (quick flicker or long outage)
                int delay = 1 + source.nextInt(3); // 1-3 ticks
                level.scheduleTick(pos, this, delay);
            } else {
                // Remain lit; schedule a later random check so flickers aren't too regular.
                int delay = 10 + source.nextInt(20); // check again after 10-30 ticks
                level.scheduleTick(pos, this, delay);
            }
        } else {
            // Currently off (we're in a flicker). Decide if this is a short blink or a longer outage.
            double shortBlinkChance = 0.78; // ~78% of off-phases are short blinks (quick return)
            if (source.nextDouble() < shortBlinkChance) {
                // Short blink: turn back on quickly and schedule another quick chance to flick again
                level.setBlock(pos, state.setValue(LIT, true), 2);
                // After a short on period, there's a decent chance to immediately flick off again
                int delay = 1 + source.nextInt(4); // 1-4 ticks
                level.scheduleTick(pos, this, delay);
            } else {
                // Longer outage: stay off for a noticeably longer randomized duration
                level.setBlock(pos, state.setValue(LIT, false), 2);
                int delay = 18 + source.nextInt(26); // stay off for 18-43 ticks (~0.9s - 2.15s at 20 tps)
                level.scheduleTick(pos, this, delay);
            }
        }
    }


    /**
     * Called when placed: schedule initial tick so the lantern starts updating.
     */
    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, level, pos, oldState, isMoving);

        if (!level.isClientSide()) {
            level.scheduleTick(pos, this, 20);
        }
    }


    /**
     * Add LIT, FORCED_ON and FLICKERING properties to the blockstate definition.
     */
    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT, FORCED_ON, FLICKERING);
    }


    /**
     * Neighbor updates: update lit state and ensure flicker scheduling starts when forced_on is applied or when flickering is enabled and the lantern should be on.
     */
    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean isMoving) {
        if (!level.isClientSide()) {
            boolean powered = level.hasNeighborSignal(pos);
            boolean forced = state.getValue(FORCED_ON);
            boolean flick = state.getValue(FLICKERING);

            boolean shouldBeLit = powered || (level.getSkyDarken() >= 6) || forced;

            // If forced_on is set, ensure the block becomes lit immediately. If flickering is
            // enabled, schedule an immediate flicker tick so the effect starts right away.
            if (forced && !state.getValue(LIT)) {
                level.setBlock(pos, state.setValue(LIT, true), 2);
                if (flick) {
                    level.scheduleTick(pos, this, 1 + level.getRandom().nextInt(4));
                }
                // don't return here; continue to ensure we also handle other transitions below
            }

            // If flickering is enabled and the lantern should be on, schedule flicker ticks.
            if (flick) {
                if (shouldBeLit) {
                    level.scheduleTick(pos, this, 1 + level.getRandom().nextInt(4));
                } else if (!shouldBeLit && state.getValue(LIT)) {
                    // No driver -> ensure off
                    level.setBlock(pos, state.setValue(LIT, false), 2);
                }
                // we intentionally don't return: we've handled scheduling and possible state sync
                // above; other parts of code may still run.
            } else {
                // Default behavior when not flickering: toggle LIT to match shouldBeLit
                if (state.getValue(LIT) != shouldBeLit) {
                    level.setBlock(pos, state.setValue(LIT, shouldBeLit), 2);
                }
            }
        }
        super.neighborChanged(state, level, pos, neighborBlock, fromPos, isMoving);
    }


    /**
     * Right-click with an axe toggles FLICKERING. When enabling, schedule a tick immediately if the lantern would be ON so the neon-effect starts without extra stimulus.
     */
    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack held = player.getItemInHand(hand);

        if (held.getItem() instanceof TieredItem) {
            if (!level.isClientSide()) {

                boolean currently = state.getValue(FLICKERING);
                BlockState newState = state.setValue(FLICKERING, !currently);

                // If we just enabled flickering and the lantern would be ON, schedule the first tick.
                boolean powered = level.hasNeighborSignal(pos);
                boolean forced = newState.getValue(FORCED_ON);
                boolean shouldBeOn = powered || (level.getSkyDarken() >= 6) || forced;

                if (!currently && shouldBeOn) {
                    level.scheduleTick(pos, this, 1);
                }

                // If we disabled flickering, set LIT back to stable value immediately
                if (currently) {
                    newState = newState.setValue(LIT, shouldBeOn);
                }

                level.setBlock(pos, newState, 2);
                level.playSound(null, pos, currently ? SoundEvents.ANVIL_LAND : SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 0.9F, 1.0F);
            }

            return ItemInteractionResult.SUCCESS;
        }

        return super.useItemOn(stack, state, level, pos, player, hand, hit);
    }


    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        boolean powered = context.getLevel().hasNeighborSignal(context.getClickedPos());
        return this.defaultBlockState().setValue(LIT, powered);
    }


    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return (block) -> (block.getValue(LIT) || block.getValue(FORCED_ON)) ? lightValue : 0;
    }

    static {
        LIT = BlockStateProperties.LIT;
        FORCED_ON = BooleanProperty.create("forced_on");
        FLICKERING = BooleanProperty.create("flickering");
    }
}
