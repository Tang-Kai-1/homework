package io.codelex.oop.shapesTwoJustBecauseSomebodyMessedUpWithExerciseNine;

public class Cone extends ShapeThreeDee {
    private int radius;
    private int height;
    private int sideLength;

    public Cone(int sideLength, int radius, int height) {
        super('1');
        this.sideLength = sideLength;
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        //πr(r + √(r2 + h2))
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateVolume() {
        return (1 / 3) * Math.PI * Math.pow(radius, 2) * height;
    }
}
