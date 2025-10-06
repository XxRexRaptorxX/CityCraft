package xxrexraptorxx.citycraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.CrossCollisionBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import xxrexraptorxx.citycraft.registry.ModBlockTags;

public class StepBarrierBlock extends FenceBlock implements SimpleWaterloggedBlock {

    private static final VoxelShape BASE = box(0, 0, 0, 16, 8, 16);
    private static final VoxelShape POST = box(5, 8, 5, 11, 16, 11);
    private static final VoxelShape SIDE_N = box(5, 8, 0, 11, 16, 5);
    private static final VoxelShape[] SHAPES = new VoxelShape[16];


    public StepBarrierBlock(Properties properties) {
        super(properties);
    }


    @Override
    public boolean connectsTo(BlockState state, boolean isSideSolid, Direction direction) {
        boolean flag = this.isSameFence(state);
        return !isExceptionForConnection(state) && isSideSolid || flag;
    }


    private boolean isSameFence(BlockState state) {
        return state.is(ModBlockTags.CONCRETE_BARRIERS);
    }


    private static VoxelShape rotateY(VoxelShape shape, int times) {
        int t = (times % 4 + 4) % 4;
        if (t == 0) return shape;
        java.util.List<net.minecraft.world.phys.AABB> aabbs = shape.toAabbs();
        VoxelShape out = Shapes.empty();
        for (AABB a : aabbs) {
            double minX = a.minX * 16.0, minZ = a.minZ * 16.0, maxX = a.maxX * 16.0, maxZ = a.maxZ * 16.0;
            double nx1 = minX, nz1 = minZ, nx2 = maxX, nz2 = maxZ;
            for (int r = 0; r < t; r++) {
                double rminX = 8.0 + (nz1 - 8.0);
                double rmaxX = 8.0 + (nz2 - 8.0);
                double rminZ = 8.0 - (nx2 - 8.0);
                double rmaxZ = 8.0 - (nx1 - 8.0);
                nx1 = Math.min(rminX, rmaxX);
                nx2 = Math.max(rminX, rmaxX);
                nz1 = Math.min(rminZ, rmaxZ);
                nz2 = Math.max(rminZ, rmaxZ);
            }
            out = Shapes.or(out, box(nx1, a.minY * 16.0, nz1, nx2, a.maxY * 16.0, nz2));
        }
        return out;
    }


    private static int shapeIndex(BlockState state) {
        int i = 0;
        if (state.getValue(CrossCollisionBlock.NORTH)) i |= 1;
        if (state.getValue(CrossCollisionBlock.EAST)) i |= 2;
        if (state.getValue(CrossCollisionBlock.SOUTH)) i |= 4;
        if (state.getValue(CrossCollisionBlock.WEST)) i |= 8;
        return i;
    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext ctx) {
        return SHAPES[shapeIndex(state)];
    }


    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext ctx) {
        return SHAPES[shapeIndex(state)];
    }


    @Override
    public VoxelShape getOcclusionShape(BlockState state, BlockGetter world, BlockPos pos) {
        return SHAPES[shapeIndex(state)];
    }


    static {
        for (int i = 0; i < 16; i++) {
            VoxelShape s = Shapes.or(BASE, POST);
            if ((i & 1) != 0) s = Shapes.or(s, SIDE_N);
            if ((i & 2) != 0) s = Shapes.or(s, rotateY(SIDE_N, 1)); // East
            if ((i & 4) != 0) s = Shapes.or(s, rotateY(SIDE_N, 2)); // South
            if ((i & 8) != 0) s = Shapes.or(s, rotateY(SIDE_N, 3)); // West
            SHAPES[i] = s;
        }
    }
}
