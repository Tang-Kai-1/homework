package io.codelex.oop.shapesTwoJustBecauseSomebodyMessedUpWithExerciseNine;

public class RectangleNew extends Shape {
    private int width;
    private int height;

    public RectangleNew(int width, int height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (width * 2) + (height * 2);
    }
}
