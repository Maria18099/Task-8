package org.example;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        printShapeName(circle);

        Shape triangle = new Triangle();
        printShapeName(triangle);

        Shape elipse = new Elipse();
        printShapeName(elipse);

        Shape rectangle = new Rectangle();
        printShapeName(rectangle);

        Shape quad = new Quad();
        printShapeName(quad);
    }
    public static void printShapeName(Shape shape) {
        System.out.println("Shape name: " + shape.getName());
    }
}