package com.example.inheritance;

public class Employee {
    public int id = 0;
    public String firstName = "John";
    public String lastName = "Wick";
    public int rate = 15;

    public Employee(int id, String firstName, String lastName, int rate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rate = rate;
    }

    public void raiseRate(int percent) {
        if (percent > 0) {
            rate += rate * percent / 100;
        }
    }
}
