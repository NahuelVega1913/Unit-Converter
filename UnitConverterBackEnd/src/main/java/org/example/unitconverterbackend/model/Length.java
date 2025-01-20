package org.example.unitconverterbackend.model;

public enum Length {
    METER("Meter", 1.0),
    KILOMETER("Kilometer", 1000.0),
    CENTIMETER("Centimeter", 0.01),
    MILLIMETER("Millimeter", 0.001),
    MILE("Mile", 1609.34),
    YARD("Yard", 0.9144),
    FOOT("Foot", 0.3048),
    INCH("Inch", 0.0254);

    private final String name;
    private final double value;

    Length(String name, double value) {
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
