package io.codelex.polymorphism.practice.exercise1;

public class Peugeot implements Car {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 11;
    }

    public void slowDown() {
        currentSpeed -= 11;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
}
