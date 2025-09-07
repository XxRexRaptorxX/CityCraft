package xxrexraptorxx.citycraft.utils;

public enum SignShape {
    ROUND("round"),
    TRIANGLE("triangle"),
    UPSIDE_DOWN_TRIANGLE("upside_down_triangle"),
    SQUARE("square"),
    RHOMBUS("rhombus"),
    OCTAGON("octagon"),
    CROSS("cross"),
    RECTANGLE("rectangle"),
    BAKE("bake");

    private final String name;

    SignShape(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
