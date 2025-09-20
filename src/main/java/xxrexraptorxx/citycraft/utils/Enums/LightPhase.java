package xxrexraptorxx.citycraft.utils.Enums;

import net.minecraft.util.StringRepresentable;

public enum LightPhase implements StringRepresentable {
    RED("red"),
    RED_YELLOW("red_yellow"),
    GREEN("green"),
    YELLOW("yellow");

    private final String name;

    LightPhase(String name) {
        this.name = name;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}