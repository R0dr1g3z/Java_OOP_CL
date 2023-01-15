package com.example.inheritance;

public class HourlyEmployee extends Employee {
    public HourlyEmployee(int id, String firstName, String lastName, int rate){
        super(id, firstName, lastName, rate);
    }
    public  int calculatePayment(int hours){
        return rate * hours;
    }
}
