package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class CarService {
    private ArrayList<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public ArrayList returnCarList() {
        return carList;
    }

    public ArrayList returnCarsWithV12() {
        ArrayList<Car> carsWithV12 = new ArrayList<>();
        for (Car car : carList) {
            if (car.getEngineType().equals(Car.Engine.valueOf("V12"))) {
                carsWithV12.add(car);
            }
        }
        return carsWithV12;
    }

    public ArrayList returnCarsBefore99() {
        ArrayList<Car> carsBefore99 = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYearOfManufacture() < 1999) {
                carsBefore99.add(car);
            }
        }
        return carsBefore99;
    }

    public Car returnCheapest() {
        Car cheapest = carList.get(0);
        for (Car car : carList) {
            if (car.getPrice() < cheapest.getPrice()) {
                cheapest = car;
            }
        }
        return cheapest;
    }

    public Car returnExpensive() {
        Car expensive = carList.get(0);
        for (Car car : carList) {
            if (car.getPrice() > expensive.getPrice()) {
                expensive = car;
            }
        }
        return expensive;
    }

    public Car returnThreeManufacturers() {
        for (Car car : carList) {
            if (car.getManufacturers().size() >= 3) {
                return car;
            }
        }
        return null;
    }

    public ArrayList sortCars(String order) {
        ArrayList<Car> sorted = new ArrayList<>(carList);
        if (order.toLowerCase().equals("ascending")) {
            Collections.sort(sorted, Car.carCompareAgeAscending);
        } else {
            Collections.sort(sorted, Car.carCompareAgeDescending);
        }
        return sorted;
    }

    public boolean checkIfInList(Car car) {
        for (Car car1 : carList) {
            if (car1.equals(car)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList returnCarsManufacturedBy(Manufacturer manufacturer) {
        ArrayList<Car> carsByManufacturer = new ArrayList<>();
        for (Car car : carList) {
            if (car.getManufacturers().contains(manufacturer)) {
                carsByManufacturer.add(car);
            }
        }
        return carsByManufacturer;
    }

    public ArrayList returnCarsManufacturedByYear(int year, String comparitor) {
        ArrayList<Car> cars = new ArrayList<>();
        for (Car car : carList) {
            boolean checkIfTrue = false;
            for (Manufacturer manufacturer : car.getManufacturers()) {
                if (comparitor.equals("<")) {
                    if (manufacturer.getYearOfEstablishment() < year) {
                        checkIfTrue = true;
                    }
                } else if (comparitor.equals(">")) {
                    if (manufacturer.getYearOfEstablishment() > year) {
                        checkIfTrue = true;
                    }
                } else if (comparitor.equals("<=")) {
                    if (manufacturer.getYearOfEstablishment() <= year) {
                        checkIfTrue = true;
                    }
                } else if (comparitor.equals(">=")) {
                    if (manufacturer.getYearOfEstablishment() >= year) {
                        checkIfTrue = true;
                    }
                } else if (comparitor.equals("==")) {
                    if (manufacturer.getYearOfEstablishment() == year) {
                        checkIfTrue = true;
                    }
                } else {
                    if (manufacturer.getYearOfEstablishment() != year) {
                        checkIfTrue = true;
                    }
                }
            }
            if (checkIfTrue) {
                cars.add(car);
            }
        }
        return cars;
    }
}
