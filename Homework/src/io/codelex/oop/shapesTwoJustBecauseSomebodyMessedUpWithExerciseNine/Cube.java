package io.codelex.oop.shapesTwoJustBecauseSomebodyMessedUpWithExerciseNine;

public class Cube extends ShapeThreeDee {

    private int sideLength;

    public Cube(int sideLength) {
        super(8);
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    @Override
    public double calculatePerimeter() {
        return this.getNumSides() * sideLength;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }
}
