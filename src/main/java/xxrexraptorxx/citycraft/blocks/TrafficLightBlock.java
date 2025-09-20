package xxrexraptorxx.citycraft.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import xxrexraptorxx.citycraft.registry.ModBlocks;
import xxrexraptorxx.citycraft.utils.Enums.LightPhase;

public class TrafficLightBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {

    public static final MapCodec<TrafficLightBlock> CODEC = MapCodec.unit(() -> new TrafficLightBlock(BlockBehaviour.Properties.of(), false));

    public static final EnumProperty<LightPhase> PHASE = EnumProperty.create("phase", LightPhase.class);
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    private static final int RED_DURATION = 1000;
    private static final int GREEN_DURATION = 1000;
    private static final int RED_YELLOW_DURATION = 60;
    private static final int YELLOW_DURATION = 60;
    private static final int TOTAL_CYCLE_DURATION = RED_DURATION + RED_YELLOW_DURATION + GREEN_DURATION + YELLOW_DURATION;

    private static final VoxelShape TRIPLE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);
    private static final VoxelShape DOUBLE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 12.0D, 12.0D);
    private static final VoxelShape SINGLE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D);
    private static final VoxelShape SIDE_EAST_WEST = Block.box(4.0D, 0.0D, 0.0D, 12.0D, 8.0D, 16.0D);
    private static final VoxelShape SIDE_NORTH_SOUTH = Block.box(0.0D, 0.0D, 4.0D, 16.0D, 8.0D, 12.0D);

    private final boolean constructorInverted;

    public TrafficLightBlock(BlockBehaviour.Properties properties, boolean inverted) {
        super(properties);
        this.constructorInverted = inverted;

        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(PHASE, calculatePhaseFromWorldTime(0, Direction.NORTH, inverted))
                .setValue(POWERED, false)
                .setValue(WATERLOGGED, false));
    }

    @Override
    protected MapCodec<? extends TrafficLightBlock> codec() {
        return CODEC;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, PHASE, POWERED, WATERLOGGED);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction facing = context.getHorizontalDirection();
        boolean powered = context.getLevel().hasNeighborSignal(context.getClickedPos());
        FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
        boolean waterlogged = fluidState.getType() == Fluids.WATER;

        LightPhase initialPhase = calculatePhaseFromWorldTime(context.getLevel().getGameTime(), facing, constructorInverted);

        return this.defaultBlockState()
                .setValue(FACING, facing)
                .setValue(PHASE, powered ? LightPhase.RED : initialPhase)
                .setValue(POWERED, powered)
                .setValue(WATERLOGGED, waterlogged);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        String blockName = BuiltInRegistries.BLOCK.getKey(this).getPath();

        if (blockName.contains("triple")) {
            return TRIPLE;
        } else if (blockName.contains("double")) {
            return DOUBLE;
        } else if (this == ModBlocks.SIGNAL_LIGHT.get() || this == ModBlocks.PEDESTRIAN_SIGNAL_LIGHT.get()) {
            return SINGLE;
        } else {
            // SIDE
            if (state.getValue(FACING) == Direction.NORTH || state.getValue(FACING) == Direction.SOUTH) {
                return SIDE_NORTH_SOUTH;
            } else {
                return SIDE_EAST_WEST;
            }
        }
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos currentPos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return super.updateShape(state, direction, neighborState, level, currentPos, neighborPos);
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (!level.isClientSide && !state.getValue(POWERED)) {
            // Synchronisiere mit der Weltzeit
            long worldTime = level.getGameTime();
            Direction facing = state.getValue(FACING);
            LightPhase currentPhase = calculatePhaseFromWorldTime(worldTime, facing, constructorInverted);

            if (currentPhase != state.getValue(PHASE)) {
                BlockState newState = state.setValue(PHASE, currentPhase);
                level.setBlock(pos, newState, Block.UPDATE_ALL);
            }

            // Plane nächsten Tick basierend auf verbleibendem Zeit in aktueller Phase
            int ticksUntilNextPhase = calculateTicksUntilNextPhase(worldTime, facing, constructorInverted);
            level.scheduleTick(pos, this, ticksUntilNextPhase);
        }
        super.onPlace(state, level, pos, oldState, isMoving);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        // Redstone-Check
        boolean powered = level.hasNeighborSignal(pos);
        boolean wasPowered = state.getValue(POWERED);

        if (powered != wasPowered) {
            BlockState newState = state.setValue(POWERED, powered);
            if (powered) {
                newState = newState.setValue(PHASE, LightPhase.RED);
            }
            level.setBlock(pos, newState, Block.UPDATE_ALL);

            if (!powered) {
                // Synchronisiere wieder mit Weltzeit
                long worldTime = level.getGameTime();
                Direction facing = state.getValue(FACING);
                LightPhase correctPhase = calculatePhaseFromWorldTime(worldTime, facing, constructorInverted);
                newState = newState.setValue(PHASE, correctPhase);
                level.setBlock(pos, newState, Block.UPDATE_ALL);

                int ticksUntilNextPhase = calculateTicksUntilNextPhase(worldTime, facing, constructorInverted);
                level.scheduleTick(pos, this, ticksUntilNextPhase);
            }
            return;
        }

        // Normale Phasenschaltung nur wenn nicht powered
        if (!powered) {
            long worldTime = level.getGameTime();
            Direction facing = state.getValue(FACING);
            LightPhase correctPhase = calculatePhaseFromWorldTime(worldTime, facing, constructorInverted);

            BlockState newState = state.setValue(PHASE, correctPhase);
            level.setBlock(pos, newState, Block.UPDATE_ALL);

            // Nächsten Tick planen - immer zum nächsten Phasenwechsel
            int ticksUntilNextPhase = calculateTicksUntilNextPhase(worldTime, facing, constructorInverted);
            level.scheduleTick(pos, this, ticksUntilNextPhase);
        }
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (!level.isClientSide) {
            boolean powered = level.hasNeighborSignal(pos);
            boolean wasPowered = state.getValue(POWERED);

            if (powered != wasPowered) {
                BlockState newState = state.setValue(POWERED, powered);
                if (powered) {
                    newState = newState.setValue(PHASE, LightPhase.RED);
                }
                level.setBlock(pos, newState, Block.UPDATE_ALL);

                if (powered) {
                    // Stoppe alle geplanten Ticks
                    level.getBlockTicks().willTickThisTick(pos, this);
                } else {
                    // Synchronisiere wieder mit Weltzeit
                    long worldTime = level.getGameTime();
                    Direction facing = state.getValue(FACING);
                    LightPhase correctPhase = calculatePhaseFromWorldTime(worldTime, facing, constructorInverted);
                    newState = newState.setValue(PHASE, correctPhase);
                    level.setBlock(pos, newState, Block.UPDATE_ALL);

                    int ticksUntilNextPhase = calculateTicksUntilNextPhase(worldTime, facing, constructorInverted);
                    level.scheduleTick(pos, this, ticksUntilNextPhase);
                }
            }
        }
    }

    @Override
    public boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    @Override
    public int getAnalogOutputSignal(BlockState state, Level level, BlockPos pos) {
        if (state.getValue(POWERED)) {
            return 15;
        }

        LightPhase phase = state.getValue(PHASE);
        return switch (phase) {
            case RED -> 3;
            case RED_YELLOW -> 6;
            case YELLOW -> 9;
            case GREEN -> 12;
        };
    }

    /**
     * Berechnet die aktuelle Phase basierend auf der Weltzeit
     * @param worldTime Aktuelle Weltzeit
     * @param facing Richtung des Blocks
     * @param constructorInverted Zusätzliche Invertierung aus dem Konstruktor
     * @return Die berechnete Phase
     */
    private LightPhase calculatePhaseFromWorldTime(long worldTime, Direction facing, boolean constructorInverted) {
        // Basis-Phasenberechnung ohne Invertierung
        long cycleTime = worldTime % TOTAL_CYCLE_DURATION;

        LightPhase basePhase;
        if (cycleTime < RED_DURATION) {
            basePhase = LightPhase.RED;
        } else if (cycleTime < RED_DURATION + RED_YELLOW_DURATION) {
            basePhase = LightPhase.RED_YELLOW;
        } else if (cycleTime < RED_DURATION + RED_YELLOW_DURATION + GREEN_DURATION) {
            basePhase = LightPhase.GREEN;
        } else {
            basePhase = LightPhase.YELLOW;
        }

        // Anwenden der Rotations-basierten Invertierung
        boolean rotationInverted = isOppositeDirection(facing);
        if (rotationInverted) {
            basePhase = invertPhase(basePhase);
        }

        // Anwenden der Konstruktor-basierten Invertierung
        if (constructorInverted) {
            basePhase = invertPhase(basePhase);
        }

        return basePhase;
    }

    /**
     * Berechnet wie viele Ticks bis zur nächsten Phase vergehen
     */
    private int calculateTicksUntilNextPhase(long worldTime, Direction facing, boolean constructorInverted) {
        long cycleTime = worldTime % TOTAL_CYCLE_DURATION;

        int ticksInCurrentPhase;
        if (cycleTime < RED_DURATION) {
            ticksInCurrentPhase = RED_DURATION - (int) cycleTime;
        } else if (cycleTime < RED_DURATION + RED_YELLOW_DURATION) {
            ticksInCurrentPhase = RED_YELLOW_DURATION - (int) (cycleTime - RED_DURATION);
        } else if (cycleTime < RED_DURATION + RED_YELLOW_DURATION + GREEN_DURATION) {
            ticksInCurrentPhase = GREEN_DURATION - (int) (cycleTime - RED_DURATION - RED_YELLOW_DURATION);
        } else {
            ticksInCurrentPhase = YELLOW_DURATION - (int) (cycleTime - RED_DURATION - RED_YELLOW_DURATION - GREEN_DURATION);
        }

        return Math.max(1, ticksInCurrentPhase);
    }

    private LightPhase invertPhase(LightPhase phase) {
        return switch (phase) {
            case RED -> LightPhase.GREEN;
            case RED_YELLOW -> LightPhase.YELLOW;
            case GREEN -> LightPhase.RED;
            case YELLOW -> LightPhase.RED_YELLOW;
        };
    }

    /**
     * Prüft ob die Richtung eine "gegenüberliegende" Richtung ist
     * NORTH/SOUTH sind ein Paar, EAST/WEST sind ein Paar
     * SOUTH und WEST werden als "gegenüberliegend" betrachtet
     */
    private boolean isOppositeDirection(Direction facing) {
        return facing == Direction.SOUTH || facing == Direction.WEST;
    }

    @Override
    public boolean canConnectRedstone(BlockState state, BlockGetter level, BlockPos pos, @Nullable Direction direction) {
        return true;
    }
}