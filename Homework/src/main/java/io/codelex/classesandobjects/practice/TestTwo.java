package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Car car = newCar();
        if (car.gasHog()) {
            System.out.println("This car is a gas hog.");
        } else if (car.economyCar()) {
            System.out.println("The car has good fuel economy.");
        }
        double liters;
        int milage;
        System.out.print("Enter odemeter reading: ");
        milage = sc.nextInt();
        System.out.print("Enter liters: ");
        liters = sc.nextDouble();
        car.fillUp(milage, liters);
        System.out.println("Kilometers per liter are " + car.calculateConsumption());
    }

    public static Car newCar() {
        Scanner scan = new Scanner(System.in);

        double odometer;
        System.out.print("Enter odemeter reading: ");
        odometer = scan.nextDouble();
        return new Car(odometer);
    }
}
