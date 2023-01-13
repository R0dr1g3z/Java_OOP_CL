package com.example.methods;

public class Main01 {
    public static void main(String[] args) {
        Person person = new Person();
        Car car = new Car();
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getFullName());
        System.out.println(person.increaseAge(person.getAge()));
        System.out.println(car.toString());
    }
}
