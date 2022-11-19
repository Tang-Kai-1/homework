package io.codelex.oop.shapesTwoJustBecauseSomebodyMessedUpWithExerciseNine;

public class TriangleNew extends Shape {
    private int width;
    private int height;

    public TriangleNew(int width, int height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (width * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        double widthHalf = width / 2;
        double side = Math.sqrt(Math.pow(widthHalf, 2) + Math.pow(height, 2));
        return (side * 2) + width;
    }

}
