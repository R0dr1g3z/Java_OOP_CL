package com.example.inheritance;

public class Circle extends Shape {
    private int radius = 0;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public String getDescription() {
        return super.getDescription() + "\nRadius: " + radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircuit() {
        return 2 * Math.PI * radius;
    }
}