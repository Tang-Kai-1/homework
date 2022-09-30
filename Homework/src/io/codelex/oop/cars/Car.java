package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

public class Car {
    private String name;
    private String model;
    private double price;
    private int yearOfManufacture;
    private ArrayList<Manufacturer> manufacturers;
    private Engine engineType;

    public enum Engine {
        V12,
        V8,
        V6,
        S6,
        S4,
        S3
    }

    public Car(String name, String model, double price, int yearOfManufacture, ArrayList<Manufacturer> manufacturers, Engine engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public ArrayList<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public Engine getEngineType() {
        return engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && yearOfManufacture == car.yearOfManufacture && name.equals(car.name) && model.equals(car.model) && manufacturers.equals(car.manufacturers) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturers, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", manufacturers=" + manufacturers.stream().map(man->man.getName()).collect(Collectors.toList()) +
                ", engineType=" + engineType +
                '}';
    }

    public static Comparator<Car> carCompareAgeAscending = new Comparator<Car>() {
        public int compare(Car carOne, Car carTwo) {
            int carOneAge = carOne.getYearOfManufacture();
            int carTwoAge = carTwo.getYearOfManufacture();
            return carOneAge - carTwoAge;
        }
    };

    public static Comparator<Car> carCompareAgeDescending = new Comparator<Car>() {
        public int compare(Car carOne, Car carTwo) {
            int carOneAge = carOne.getYearOfManufacture();
            int carTwoAge = carTwo.getYearOfManufacture();
            return carTwoAge - carOneAge;
        }
    };
}
