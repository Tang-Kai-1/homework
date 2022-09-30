package io.codelex.oop.imperialToMetric;

public enum ConversionType {
    METERS_TO_YARDS(1.09361),
    YARDS_TO_METERS(0.9144),
    CENTIMETERS_TO_ICHES(0.393701),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.621371),
    MILES_TO_KILOMETERS(1.60934);

    private final double lengthConversionRate;

    ConversionType(double lengthConversionRate) {
        this.lengthConversionRate = lengthConversionRate;
    }

    public double getConversion() {
        return this.lengthConversionRate;
    }
}
