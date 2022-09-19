package io.codelex.classesandobjects.practice;

public class Odometer {
    private int milage;
    private int kmDriven = 0;

    public Odometer(int milage) {
        this.milage = milage;
    }

    public int getMilage() {
        return milage;
    }

    public int getDistanceDriven() {
        return kmDriven;
    }

    public void incrementMilage() {
        if (milage + 1 <= 999999) {
            milage++;
        } else {
            milage = 0;
        }
        kmDriven++;
    }
}
