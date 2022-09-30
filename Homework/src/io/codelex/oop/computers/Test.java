package io.codelex.oop.computers;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("Ryzen something", "16GB", "RTX3090", "blank", "first");
        Computer computer2 = new Computer("Ryzen something", "16GB", "RTX3090", "blank", "first");
        Laptop laptop = new Laptop("Intel something", "8GB", "some laptop graphics card", "Intel", "unspecified", "yes");
        Laptop laptop2 = new Laptop("Intel something", "8GB", "some laptop graphics card", "Intel", "unspecified", "yes");
        Laptop laptop3 = new Laptop("Intel something", "16GB", "some laptop graphics card", "Intel", "gaem", "yes");
        System.out.println(computer.equals(computer2));
        System.out.println(laptop.equals(laptop2));
        System.out.println(laptop.equals(laptop3));
        System.out.println(computer.toString());
        System.out.println(laptop.toString());
        computer.setCompany("Generic company");
        System.out.println(computer.toString());
    }
}
