package io.codelex.classesandobjects.practice;

public class FuelGauge {
    private int fuelAmount;

    public FuelGauge(int fuelAmount) {
        this.fuelAmount = Math.min(fuelAmount, 70);
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void incrementFuel() {
        if (fuelAmount + 1 <= 70) {
            fuelAmount++;
        } else {
            System.out.println("Tank full.");
        }
    }

    public void decrementFuel() {
        if (fuelAmount - 1 >= 0) {
            fuelAmount--;
        } else {
            System.out.println("Empty full.");
        }
    }
}
