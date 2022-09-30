package io.codelex.oop.shapes;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 8);
        Rectangle rectangle = new Rectangle(8, 6);
        System.out.println("Triangle sides:");
        System.out.println(triangle.getNumSides());
        System.out.println("Triangle area:");
        System.out.println(triangle.getArea());
        System.out.println("Triangle perimeter:");
        System.out.println(triangle.getPerimeter());
        System.out.println("Rectangle sides:");
        System.out.println(rectangle.getNumSides());
        System.out.println("Rectangle area:");
        System.out.println(rectangle.getArea());
        System.out.println("Rectangle perimeter:");
        System.out.println(rectangle.getPerimeter());
    }
}
