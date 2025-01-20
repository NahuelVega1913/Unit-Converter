package org.example.unitconverterbackend.model;

public enum Temperature {
    CELSIUS("Celsius", 1.0),
    FAHRENHEIT("Fahrenheit", 33.8),
    KELVIN("Kelvin", 274.15);

    private final String name;
    private final double value;

    Temperature(String name, double value) {
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
