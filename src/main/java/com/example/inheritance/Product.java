package com.example.inheritance;

public class Product {
    private int id;
    private String name;
    private double price;
    private static int nextId = 0;

    public Product(String name, double price) {
        this.id = nextId++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }
}
