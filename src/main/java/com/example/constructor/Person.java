package com.example.constructor;

public class Person {
    private String name = "John";
    private String surname = "Potato";
    private int age = 25;
    private String gender = "M";
    
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name, String surname, int age, String gender){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
}
