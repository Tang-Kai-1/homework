package io.codelex.classesandobjects.practice;

public class TestThree {
    public static void main(String[] args) {
        FuelGauge fuel1 = new FuelGauge(35);
        Odometer odometer = new Odometer(500000);
        System.out.println("Fuel: " + fuel1.getFuelAmount() + "; odometer reading: " + odometer.getMilage());
        while (fuel1.getFuelAmount() != 0) {
            odometer.incrementMilage();
            if (odometer.getDistanceDriven() % 10 == 0) {
                fuel1.decrementFuel();
            }
        }
        System.out.println("Fuel: " + fuel1.getFuelAmount() + "; odometer reading: " + odometer.getMilage());
        for (int i = 0; i < 10; i++) {
            fuel1.incrementFuel();
        }
        System.out.println("Fuel: " + fuel1.getFuelAmount() + "; odometer reading: " + odometer.getMilage());
    }
}
