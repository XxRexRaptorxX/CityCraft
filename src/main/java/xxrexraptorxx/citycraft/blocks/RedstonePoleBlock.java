package xxrexraptorxx.citycraft.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.utils.Config;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RedstonePoleBlock extends Block implements SimpleWaterloggedBlock {

    public static final MapCodec<RedstonePoleBlock> CODEC = simpleCodec(RedstonePoleBlock::new);
    public static final EnumProperty<Axis> AXIS = EnumProperty.create("axis", Axis.class);
    public static final IntegerProperty POWER = BlockStateProperties.POWER;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

    private static final VoxelShape SHAPE_Y = Block.box(6, 0, 6, 10, 16, 10);
    private static final VoxelShape SHAPE_Z = Block.box(6, 6, 0, 10, 10, 16);
    private static final VoxelShape SHAPE_X = Block.box(0, 6, 6, 16, 10, 10);

    public enum Axis implements StringRepresentable {
        X("x"),
        Y("y"),
        Z("z");

        private final String name;

        Axis(String name) {
            this.name = name;
        }


        @Override
        public String getSerializedName() {
            return this.name;
        }


        public Direction[] getDirections() {
            return switch (this) {
                case X -> new Direction[]{Direction.EAST, Direction.WEST};
                case Y -> new Direction[]{Direction.UP, Direction.DOWN};
                case Z -> new Direction[]{Direction.NORTH, Direction.SOUTH};
            };
        }


        public static Axis fromDirection(Direction direction) {
            return switch (direction) {
                case UP, DOWN -> Y;
                case NORTH, SOUTH -> Z;
                case EAST, WEST -> X;
            };
        }
    }

    public RedstonePoleBlock(Properties properties) {
        super(properties);
    }


    public RedstonePoleBlock() {
        super(Properties.of().strength(5.0F, 6.0F).sound(SoundType.METAL).mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops());
        this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Axis.Y).setValue(POWER, 0).setValue(POWERED, false));
    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(AXIS)) {
            case X -> SHAPE_X;
            case Y -> SHAPE_Y;
            case Z -> SHAPE_Z;
        };
    }


    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction direction = context.getClickedFace();
        return this.defaultBlockState().setValue(AXIS, Axis.fromDirection(direction));
    }


    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AXIS, POWER, POWERED);
    }


    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block neighborBlock, BlockPos neighborPos, boolean movedByPiston) {
        if (!level.isClientSide) {
            level.scheduleTick(pos, this, 1);
        }
    }


    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        if (!level.isClientSide && !oldState.is(this)) {
            level.scheduleTick(pos, this, 1);
        }
    }


    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean movedByPiston) {
        if (!state.is(newState.getBlock()) && !level.isClientSide) {
            updateConnectedPoles(level, pos, new HashSet<>(), true);
        }
        super.onRemove(state, level, pos, newState, movedByPiston);
    }


    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        updatePowerState(level, pos, state);
    }


    private void updatePowerState(Level level, BlockPos pos, BlockState state) {
        int maxInputPower = getMaxInputPower(level, pos, state);
        int currentPower = state.getValue(POWER);
        boolean currentPowered = state.getValue(POWERED);

        boolean shouldBePowered = maxInputPower > 0;
        int newPower = shouldBePowered ? Math.max(0, maxInputPower - 1) : 0;

        if (currentPower != newPower || currentPowered != shouldBePowered) {
            BlockState newState = state.setValue(POWER, newPower).setValue(POWERED, shouldBePowered);
            level.setBlock(pos, newState, Block.UPDATE_ALL);

            for (Direction direction : Direction.values()) {
                BlockPos neighborPos = pos.relative(direction);
                level.updateNeighborsAt(neighborPos, this);
            }
        }
    }


    private int getMaxInputPower(Level level, BlockPos pos, BlockState state) {
        Axis axis = state.getValue(AXIS);
        int maxPower = 0;

        for (Direction direction : Direction.values()) {
            BlockPos neighborPos = pos.relative(direction);
            int power = getNeighborPower(level, neighborPos, direction.getOpposite(), axis);
            maxPower = Math.max(maxPower, power);
        }

        return maxPower;
    }


    private int getNeighborPower(Level level, BlockPos pos, Direction fromDirection, Axis sourceAxis) {
        BlockState neighborState = level.getBlockState(pos);

        if (neighborState.getBlock() instanceof RedstonePoleBlock) {
            Axis neighborAxis = neighborState.getValue(AXIS);

            if (neighborAxis == sourceAxis && neighborState.getValue(POWERED)) {
                return neighborState.getValue(POWER);
            }
            return 0;
        }

        int directSignal = level.getDirectSignal(pos, fromDirection);
        int indirectSignal = level.getSignal(pos, fromDirection);
        return Math.max(directSignal, indirectSignal);
    }


    private void updateConnectedPoles(Level level, BlockPos startPos, Set<BlockPos> visited, boolean isRemoving) {
        if (visited.contains(startPos)) return;
        visited.add(startPos);

        for (Direction direction : Direction.values()) {
            BlockPos neighborPos = startPos.relative(direction);

            if (!visited.contains(neighborPos)) {
                BlockState neighborState = level.getBlockState(neighborPos);

                if (neighborState.getBlock() instanceof RedstonePoleBlock) {
                    level.scheduleTick(neighborPos, neighborState.getBlock(), 1);
                    updateConnectedPoles(level, neighborPos, visited, isRemoving);
                } else {
                    level.updateNeighborsAt(neighborPos, this);
                }
            }
        }
    }


    @Override
    public int getDirectSignal(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return getSignal(state, level, pos, direction);
    }


    @Override
    public int getSignal(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        if (!state.getValue(POWERED)) return 0;

        Axis axis = state.getValue(AXIS);
        int power = state.getValue(POWER);

        Axis requestAxis = Axis.fromDirection(direction);

        if (requestAxis == axis) {
            return power;
        }

        return Math.max(0, power - 1);
    }


    @Override
    public boolean isSignalSource(BlockState state) {
        return state.getValue(POWERED);
    }


    @Override
    protected boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }


    @Override
    protected int getAnalogOutputSignal(BlockState state, Level level, BlockPos pos) {
        return state.getValue(POWER);
    }


    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return switch (rotation) {
            case CLOCKWISE_90, COUNTERCLOCKWISE_90 -> switch (state.getValue(AXIS)) {
                case X -> state.setValue(AXIS, Axis.Z);
                case Z -> state.setValue(AXIS, Axis.X);
                default -> state;
            };
            default -> state;
        };
    }


    @Override
    public boolean canConnectRedstone(BlockState state, BlockGetter level, BlockPos pos, @Nullable Direction direction) {
        return direction != null;
    }


    @Override
    protected MapCodec<? extends Block> codec() {
        return CODEC;
    }


    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
        if (Config.ENABLE_TOOLTIPS.get()) {
            list.add(Component.translatable("message." + References.MODID + ".redstone_info").withStyle(ChatFormatting.GRAY));
        }
    }
}
