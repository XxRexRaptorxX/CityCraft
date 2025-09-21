package xxrexraptorxx.citycraft.compat;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;
import snownee.jade.api.*;
import snownee.jade.api.config.IPluginConfig;
import xxrexraptorxx.citycraft.blocks.SignalLightBlock;
import xxrexraptorxx.citycraft.blocks.TrafficLightBlock;
import xxrexraptorxx.citycraft.main.References;
import xxrexraptorxx.citycraft.utils.Enums.LightPhase;

@WailaPlugin
public class CityCraftWailaPlugin implements IWailaPlugin {

    @Override
    public void registerClient(IWailaClientRegistration registration) {
        registration.registerBlockComponent(TrafficLightProvider.INSTANCE, TrafficLightBlock.class);
        registration.registerBlockComponent(SimpleTrafficLightProvider.INSTANCE, SignalLightBlock.class);
    }

    public enum TrafficLightProvider implements IBlockComponentProvider {
        INSTANCE;

        @Override
        public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config) {
            BlockState state = accessor.getBlockState();

            if (!(state.getBlock() instanceof TrafficLightBlock)) {
                return;
            }

            // Current Phase
            LightPhase phase = state.getValue(TrafficLightBlock.PHASE);
            Component phaseText = switch (phase) {
                case RED -> Component.translatable("jade.citycraft.phase.red").withStyle(ChatFormatting.RED);
                case RED_YELLOW -> Component.translatable("jade.citycraft.phase.red_yellow").withStyle(ChatFormatting.GOLD);
                case GREEN -> Component.translatable("jade.citycraft.phase.green").withStyle(ChatFormatting.GREEN);
                case YELLOW -> Component.translatable("jade.citycraft.phase.yellow").withStyle(ChatFormatting.YELLOW);
            };

            tooltip.add(Component.translatable("jade.citycraft.phase").append(": ").append(phaseText));

            // Redstone State
            boolean powered = state.getValue(TrafficLightBlock.POWERED);
            Component powerStatus = !powered
                    ? Component.translatable("tooltip.jade.state_on").withStyle(ChatFormatting.GREEN)
                    : Component.translatable("tooltip.jade.state_off").withStyle(ChatFormatting.RED);

            tooltip.add(Component.translatable("jade.citycraft.state").append(": ").append(powerStatus));
        }


        @Override
        public ResourceLocation getUid() {
            return ResourceLocation.fromNamespaceAndPath(References.MODID, "traffic_light_info");
        }
    }

    public enum SimpleTrafficLightProvider implements IBlockComponentProvider {
        INSTANCE;

        @Override
        public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config) {
            BlockState state = accessor.getBlockState();

            if (!(state.getBlock() instanceof SignalLightBlock)) {
                return;
            }

            boolean lit = state.getValue(SignalLightBlock.LIT);
            Component lightStatus = lit
                    ? Component.translatable("tooltip.jade.state_on").withStyle(ChatFormatting.GREEN)
                    : Component.translatable("tooltip.jade.state_off").withStyle(ChatFormatting.RED);

            tooltip.add(Component.translatable("jade.citycraft.state").append(": ").append(lightStatus));
        }


        @Override
        public ResourceLocation getUid() {
            return ResourceLocation.fromNamespaceAndPath(References.MODID, "signal_light_info");
        }
    }
}
