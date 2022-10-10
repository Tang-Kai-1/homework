package io.codelex.polymorphism.practice.exercise6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnimalsList list = new AnimalsList();
        while (true) {
            Food food = null;
            Animal animal;
            String input = sc.nextLine();
            if (input.equals("End")) {
                break;
            } else {
                String[] inputs = input.split(" ");
                if (inputs.length == 4) {
                    if (inputs[0].equals("Zebra")) {
                        animal = new Zebra(inputs[0], inputs[1], Double.parseDouble(inputs[2]), inputs[3]);
                    } else if (inputs[0].equals("Mouse")) {
                        animal = new Mouse(inputs[0], inputs[1], Double.parseDouble(inputs[2]), inputs[3]);
                    } else if (inputs[0].equals("Tiger")) {
                        animal = new Tiger(inputs[0], inputs[1], Double.parseDouble(inputs[2]), inputs[3]);
                    } else {
                        System.out.println("Bad input");
                        continue;
                    }
                } else if (inputs.length == 5) {
                    animal = new Cat(inputs[0], inputs[1], Double.parseDouble(inputs[2]), inputs[3], inputs[4]);
                } else {
                    System.out.println("Bad input");
                    continue;
                }
                animal.makeSound();
                String inputSecond = sc.nextLine();
                String[] inputFood = inputSecond.split(" ");
                if (inputFood.length == 2) {
                    if (inputFood[0].equals("Vegetable")) {
                        food = new Vegetable(Integer.parseInt(inputFood[1]));
                    } else if (inputFood[0].equals("Meat")) {
                        food = new Meat(Integer.parseInt(inputFood[1]));
                    } else {
                        System.out.println("Bad input");
                    }
                } else {
                    System.out.println("Bad input");
                    continue;
                }
            }
            animal.eat(food);
            list.addAnimal(animal);
            System.out.println(animal.toString());
        }
        list.printAnimals();
    }
}
