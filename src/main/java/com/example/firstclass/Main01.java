package com.example.firstclass;

public class Main01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        if (cat.equals(dog)) {
            System.out.println("To samo");
        }
        System.out.println("To nie to samo");
    }
}
