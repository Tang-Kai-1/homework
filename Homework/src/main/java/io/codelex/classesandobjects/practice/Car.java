package io.codelex.classesandobjects.practice;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
        this.endKilometers = startKilometers;
        this.liters = 0;
    }

    public double calculateConsumption() {
        return liters / ((endKilometers - startKilometers) / 100);
    }

    public final boolean gasHog() {

        return calculateConsumption() > 15;
    }

    public final boolean economyCar() {
        return calculateConsumption() < 5;
    }

    public void fillUp(int mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;
    }

}
