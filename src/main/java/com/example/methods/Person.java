package com.example.methods;

public class Person {
    private String name = "Katie";
    private String surname = "Stone";
    private int age = 19;
    private String gender = "F";

    public int increaseAge(int age){
        return age + 1;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getFullName() {
        return name + " " + surname;
    }
}
