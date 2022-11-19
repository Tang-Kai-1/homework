package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer manufacturer2 = new Manufacturer("Mercedes-Benz", 1926, "Germany");
        Manufacturer manufacturer3 = new Manufacturer("Volkswagen", 1937, "Germany");
        Manufacturer manufacturer4 = new Manufacturer("Peugeot", 1810, "France");
        Manufacturer manufacturer5 = new Manufacturer("Renault", 1899, "France");
        Manufacturer manufacturer6 = new Manufacturer("Citroën", 1919, "France");
        Manufacturer manufacturer7 = new Manufacturer("Dacia", 1966, "Romania");
        Manufacturer manufacturer8 = new Manufacturer("Škoda", 1859, "Czech Republic");
        Manufacturer manufacturer9 = new Manufacturer("Volvo", 1927, "Sweden");
        Manufacturer manufacturer10 = new Manufacturer("Fiat", 1899, "Italy");
        Manufacturer manufacturer11 = new Manufacturer("Ford", 1903, "USA");
        Manufacturer manufacturer12 = new Manufacturer("Toyota", 1937, "Japan");
        Car car1 = new Car("Abomination",
                "AlphaAndOmega",
                9999999,
                2011,
                new ArrayList<Manufacturer>(Arrays.asList(manufacturer1, manufacturer2,
                        manufacturer3, manufacturer4, manufacturer5,
                        manufacturer6, manufacturer7, manufacturer8,
                        manufacturer9, manufacturer10)),
                Car.Engine.V12);
        Car car2 = new Car("Not so bad",
                "first",
                25000,
                2017,
                new ArrayList<Manufacturer>(Arrays.asList(manufacturer1, manufacturer2,
                        manufacturer3, manufacturer4)),
                Car.Engine.V8);
        Car car3 = new Car("McShitbox",
                "unspecified",
                500,
                1995,
                new ArrayList<Manufacturer>(Arrays.asList(manufacturer3)),
                Car.Engine.S3);
        System.out.println(car1.equals(car2));

        System.out.println(car1.toString());

        CarService carService = new CarService();
        carService.addCar(car1);
        carService.addCar(car2);
        System.out.println("Full car list:");
        System.out.println(carService.returnCarList());
        System.out.println("Check if list contains:");
        System.out.println(carService.checkIfInList(car3));
        System.out.println(carService.checkIfInList(car2));
        System.out.println("Return cars produced before 1999:");
        System.out.println(carService.returnCarsBefore99());
        System.out.println("Return cars with V12 engine:");
        System.out.println(carService.returnCarsWithV12());
        System.out.println("Return first car in list with at least 3 manufacturers:");
        System.out.println(carService.returnThreeManufacturers());
        carService.addCar(car3);
        System.out.println("Return cheapest and most expensive:");
        System.out.println(carService.returnCheapest());
        System.out.println(carService.returnExpensive());
        System.out.println("Sorted and unsorted list:");
        System.out.println(carService.sortCars("ascending"));
        System.out.println(carService.returnCarList());

        carService.addCar(new Car("Model",
                "T",
                100000,
                1921,
                new ArrayList<Manufacturer>(Arrays.asList(manufacturer11)),
                Car.Engine.S3));
        carService.addCar(new Car("",
                "focus",
                3000,
                2004,
                new ArrayList<Manufacturer>(Arrays.asList(manufacturer11)),
                Car.Engine.V6));
        carService.addCar(new Car("some toyota",
                "big",
                5000,
                2008,
                new ArrayList<Manufacturer>(Arrays.asList(manufacturer12)),
                Car.Engine.V8));
        carService.addCar(new Car("other toyota",
                "small",
                8500,
                2009,
                new ArrayList<Manufacturer>(Arrays.asList(manufacturer12)),
                Car.Engine.V6));

        System.out.println("Get cars produced by Ford:");
        System.out.println(carService.returnCarsManufacturedBy(manufacturer11));
        System.out.println("Get cars produced by manufacturers founded before 1925:");
        System.out.println(carService.returnCarsManufacturedByYear(1925, "<"));
        System.out.println("Get cars produced by manufacturers founded before 1925:");
        System.out.println(carService.returnCarsManufacturedByYear(1925, "<"));
        System.out.println("Get cars produced by manufacturers founded in 1937:");
        System.out.println(carService.returnCarsManufacturedByYear(1937, "=="));
    }
}
