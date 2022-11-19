package io.codelex.classesandobjects.practice;

public class Product {
    private String name;
    private double priceAtStart;

    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    public void setAmountAtStart(int amountAtStart) {
        this.amountAtStart = amountAtStart;
    }

    private int amountAtStart;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.println(name + ", " + priceAtStart + " EUR, " + amountAtStart + " units.");
    }

    public static void main(String[] args) {
        Product p1 = new Product("first", 200.00, 1);
        Product p2 = new Product("sossig", 2.39, 9800);
        Product p3 = new Product("A shrubbery", 20000.00, 2);
        p1.printProduct();
        p2.printProduct();
        p3.printProduct();
        p1.setAmountAtStart(4);
        p1.printProduct();
    }
}
