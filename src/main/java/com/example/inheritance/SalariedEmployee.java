package com.example.inheritance;

public class SalariedEmployee extends Employee {
    public SalariedEmployee(int id, String firstName, String lastName, int rate) {
        super(id, firstName, lastName, rate);
    }
    public int calculatePayment(){
        final int workDays = 190;
        return workDays * rate;
    }
}
