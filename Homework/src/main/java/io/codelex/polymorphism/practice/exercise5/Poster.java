package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private double length;
    private double height;
    private int numberOfCopies;
    private int costPerCopy;

    public Poster(int fee, double length, double height, int numberOfCopies, int costPerCopy) {
        super(fee);
        this.length = length;
        this.height = height;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    public int cost() {
        return fee + numberOfCopies * costPerCopy;
    }

    public String toString() {
        return super.toString() + " Poster: Height=" + height + " Length=" + length + " Number of copies=" + numberOfCopies + " Cost per copy=" + costPerCopy;
    }
}
