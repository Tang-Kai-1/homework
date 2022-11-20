package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {
    protected String livingRegion;

    public Mammal(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        return animalType + "[" + animalName + ", " + animalWeight + ", " + livingRegion + ", " + foodEaten + "]";
    }
}
