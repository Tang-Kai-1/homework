package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Feline {
    protected String breed;

    public Cat(String animalType, String animalName, double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void eat(Food food) {
        foodEaten += food.quantity;
    }

    @Override
    public void makeSound() {
        System.out.println("*Cat sound*");
    }

    @Override
    public String toString() {//{AnimalType} [{AnimalName}, {CatBreed}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]
        return animalType + "[" + animalName + ", " + breed + ", " + animalWeight + ", " + livingRegion + ", " + foodEaten + "]";
    }
}
