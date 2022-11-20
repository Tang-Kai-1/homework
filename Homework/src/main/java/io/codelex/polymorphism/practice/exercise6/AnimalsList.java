package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;

public class AnimalsList {
    private ArrayList<Animal> list;

    public AnimalsList() {
        list = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        list.add(animal);
    }

    public void printAnimals() {
        String result = "";
        for (Animal animal : list) {
            if (!result.equals("")) {
                result += ", ";
            }
            result += animal.toString();
        }
        System.out.println(result);
    }
}
