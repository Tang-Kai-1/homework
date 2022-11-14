package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {

    public static double convert(double value, ConversionType conversionType) {
        return value * conversionType.getConversion();
    }
}
