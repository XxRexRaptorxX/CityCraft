package xxrexraptorxx.citycraft.blocks;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.registry.ModBlockTags;
import xxrexraptorxx.citycraft.utils.Config;

import java.util.List;


public class ChimneyBlock extends RotatedPillarBlock {

    public ChimneyBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }


    public static void makeParticles(Level level, BlockPos pos, int density, boolean spawnExtraSmoke) {
        RandomSource randomsource = level.getRandom();

        SimpleParticleType simpleparticletype = density > 3 ? ParticleTypes.CAMPFIRE_SIGNAL_SMOKE : ParticleTypes.CAMPFIRE_COSY_SMOKE;

        level.addAlwaysVisibleParticle(simpleparticletype, true,
                (double) pos.getX() + (double) 0.5F + randomsource.nextDouble() / (double) 3.0F * (double) (randomsource.nextBoolean() ? 1 : -1),
                (double) pos.getY() + 1 + randomsource.nextDouble() + randomsource.nextDouble(),
                (double) pos.getZ() + (double) 0.5F + randomsource.nextDouble() / (double) 3.0F * (double) (randomsource.nextBoolean() ? 1 : -1), (double) 0.0F,
                0.07 + (double) density / 100, (double) 0.0F);

        if (spawnExtraSmoke) {
            level.addParticle(ParticleTypes.SMOKE, (double) pos.getX() + (double) 0.5F + randomsource.nextDouble() / (double) 4.0F * (double) (randomsource.nextBoolean() ? 1 : -1),
                    (double) pos.getY() + 1, (double) pos.getZ() + (double) 0.5F + randomsource.nextDouble() / (double) 4.0F * (double) (randomsource.nextBoolean() ? 1 : -1),
                    (double) 0.0F, 0.005, (double) 0.0F);
        }
    }


    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (!level.getBlockState(pos.above()).isSolid() && state.getValue(RotatedPillarBlock.AXIS).equals(Direction.Axis.Y) && random.nextInt(3) == 0) {
            int density = getSmokeIntensity(level, pos);

            for (int i = 0; i < random.nextInt(1) + 2; ++i) {
                makeParticles(level, pos, density, true);
            }
            for (int x = 0; x < density; ++x) {
                makeParticles(level, pos, density, true);
            }
        }
    }


    public static int getSmokeIntensity(Level level, BlockPos pos) {
        int maxDepth = 10;
        int count = 0;

        for (int i = 1; i <= maxDepth; i++) {
            BlockPos posBelow = pos.below(i);
            BlockState state = level.getBlockState(posBelow);

            if (level.getBlockState(posBelow).is(ModBlockTags.CHIMNEYS_BOOSTER)) {
                count = count + 3;
            }
            if (state.getBlock() instanceof ChimneyBlock || state.getBlock() instanceof FlueBlock) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }


    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
        if (Config.ENABLE_TOOLTIPS.get()) {
            list.add(Component.translatable("message." + References.MODID + ".chimney_info").withStyle(ChatFormatting.GRAY));
        }
    }


}
