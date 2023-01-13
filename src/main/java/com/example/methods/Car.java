package com.example.methods;

public class Car {
    private String brand = "Audi";
    private String model = "RS8";
    private int price = 500000;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
    public String toString(){
        return brand + " " + model + " " + price;
    }
}
