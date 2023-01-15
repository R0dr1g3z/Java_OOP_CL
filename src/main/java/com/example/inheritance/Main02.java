package com.example.inheritance;

public class Main02 {
    public static void main(String[] args) {
        Shape shape = new Shape(20, 10, "Blue");
        System.out.println(shape.getDescription());
        Circle circle = new Circle(25, 11, "Green", 10);
        System.out.println(circle.getDescription());
        System.out.println(circle.getArea());
        System.out.println(circle.getCircuit());
    }
}
