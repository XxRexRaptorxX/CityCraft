package xxrexraptorxx.citycraft.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.BaseTorchBlock;

public class LightingRod extends BaseTorchBlock {

    public static final MapCodec<LightingRod> CODEC = simpleCodec(LightingRod::new);


    public LightingRod(Properties properties) {
        super(properties);
    }


    @Override
    protected MapCodec<? extends BaseTorchBlock> codec() {
        return CODEC;
    }

}
