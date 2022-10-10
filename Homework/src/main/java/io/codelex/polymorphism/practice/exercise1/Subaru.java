package io.codelex.polymorphism.practice.exercise1;

public class Subaru implements CarWithBoost {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 13;
    }

    public void slowDown() {
        currentSpeed -= 13;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 40;
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
}
