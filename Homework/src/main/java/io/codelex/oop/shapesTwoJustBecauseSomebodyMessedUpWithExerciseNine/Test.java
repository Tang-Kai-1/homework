package io.codelex.oop.shapesTwoJustBecauseSomebodyMessedUpWithExerciseNine;

public class Test {
    public static void main(String[] args) {
        TriangleNew triangleNew = new TriangleNew(4, 8);
        RectangleNew rectangleNew = new RectangleNew(8, 6);
        Hexagon hexagon = new Hexagon(4);
        Cube cube = new Cube(8);
        Cone cone = new Cone(8, 5, 9);
        System.out.println("Triangle sides:");
        System.out.println(triangleNew.getNumSides());
        System.out.println("Triangle area:");
        System.out.println(triangleNew.calculateArea());
        System.out.println("Triangle perimeter:");
        System.out.println(triangleNew.calculatePerimeter());
        System.out.println("Rectangle sides:");
        System.out.println(rectangleNew.getNumSides());
        System.out.println("Rectangle area:");
        System.out.println(rectangleNew.calculateArea());
        System.out.println("Rectangle perimeter:");
        System.out.println(rectangleNew.calculatePerimeter());
        System.out.println("Hexagon area:");
        System.out.println(hexagon.calculateArea());
        System.out.println("Hexagon perimeter:");
        System.out.println(hexagon.calculatePerimeter());
        System.out.println("Cube area:");
        System.out.println(cube.calculateArea());
        System.out.println("Cube perimeter:");
        System.out.println(cube.calculatePerimeter());
        System.out.println("Cube volume:");
        System.out.println(cube.calculatePerimeter());
        System.out.println("Cone area:");
        System.out.println(cone.calculateArea());
        System.out.println("Cone perimeter:");
        System.out.println(cone.calculatePerimeter());
        System.out.println("Cone volume:");
        System.out.println(cone.calculatePerimeter());
    }
}
