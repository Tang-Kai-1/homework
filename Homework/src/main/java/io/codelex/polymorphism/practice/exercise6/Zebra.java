package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {
    public Zebra(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            foodEaten += food.quantity;
        } else {
            System.out.println(this.getClass().getSimpleName() + " will not eat this type of food");
        }
    }

    @Override
    public void makeSound() {
        System.out.println("*Zebra sound*");
    }
}
