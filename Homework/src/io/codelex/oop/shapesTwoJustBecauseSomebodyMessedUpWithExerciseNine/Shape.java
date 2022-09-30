package io.codelex.oop.shapesTwoJustBecauseSomebodyMessedUpWithExerciseNine;

public abstract class Shape {
    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
