package io.codelex.polymorphism.practice.exercise1;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        Audi car1 = new Audi();
        Bmw car2 = new Bmw();
        Lexus car3 = new Lexus();
        Subaru car4 = new Subaru();
        Tesla car5 = new Tesla();
        Peugeot car6 = new Peugeot();
        ArrayList<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        list.add(car6);
        for (int i = 0; i < 10; i++) {
            for (Object car : list) {
                if (i == 2) {
                    if (car instanceof CarWithBoost) {
                        ((CarWithBoost) car).useNitrousOxideEngine();
                    }
                }
                ((Car) car).speedUp();
            }
        }
        int fastestIndex = 0;
        int fastestSpeed = Integer.parseInt(list.get(0).showCurrentSpeed());
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i).getClass() + ": " + list.get(i).showCurrentSpeed());
            int speedX = Integer.parseInt(list.get(i).showCurrentSpeed());
            if (speedX > fastestSpeed) {
                fastestIndex = i;
                fastestSpeed = speedX;
            }
        }
        System.out.println(list.get(fastestIndex).toString());
    }
}
