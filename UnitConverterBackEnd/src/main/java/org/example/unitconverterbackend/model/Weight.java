package org.example.unitconverterbackend.model;

public enum Weight {
    GRAM("Gram", 1.0),
    KILOGRAM("Kilogram", 1000.0),
    MILLIGRAM("Milligram", 0.001),
    TONNE("Tonne", 1000000.0),
    POUND("Pound", 453.592),
    OUNCE("Ounce", 28.3495);

    private final String name;
    private final double value;

    Weight(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
