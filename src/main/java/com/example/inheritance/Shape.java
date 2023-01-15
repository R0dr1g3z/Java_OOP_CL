package com.example.inheritance;

public class Shape {
    private int x = 0;
    private int y = 0;
    private String color = "white";

    public Shape(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public String getDescription(){
        return "X: " + x + "\nY: " + y + "\nColor: " + color;
    }
    public double getDistance(Shape shape){
        return 0;
    }
}
