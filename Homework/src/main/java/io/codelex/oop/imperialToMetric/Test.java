package io.codelex.oop.imperialToMetric;

public class Test {
    public static void main(String[] args) {

        System.out.println(MeasurementConverter.convert(10, ConversionType.METERS_TO_YARDS));
        System.out.println(MeasurementConverter.convert(10, ConversionType.CENTIMETERS_TO_ICHES));
        System.out.println(MeasurementConverter.convert(10, ConversionType.KILOMETERS_TO_MILES));
        System.out.println(MeasurementConverter.convert(10, ConversionType.YARDS_TO_METERS));
    }
}
