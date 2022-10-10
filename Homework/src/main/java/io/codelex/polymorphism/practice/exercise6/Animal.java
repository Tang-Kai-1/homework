package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    protected String animalType;
    protected String animalName;
    protected Double animalWeight;
    protected Integer foodEaten = 0;

    public Animal(String animalType, String animalName, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    public abstract void eat(Food food);

    public abstract void makeSound();
}
