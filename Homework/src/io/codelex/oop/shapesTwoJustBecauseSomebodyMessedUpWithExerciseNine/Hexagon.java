package io.codelex.oop.shapesTwoJustBecauseSomebodyMessedUpWithExerciseNine;

public class Hexagon extends Shape {
    private int side;

    public Hexagon(int side) {
        super(6);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return ((3 * Math.sqrt(3)) * Math.pow(side, 2)) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return side * 6;
    }

}
