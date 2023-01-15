package com.example.inheritance;

public class Main03 {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Jackie", "Rolly", 20);
        employee.raiseRate(10);
        System.out.println(employee.rate);

        HourlyEmployee hourlyEmployee = new HourlyEmployee(1, "Nasty", "Tiny", 15);
        System.out.println(hourlyEmployee.calculatePayment(10));

        SalariedEmployee salariedEmployee = new SalariedEmployee(1, "Harry", "Kisty", 12);
        System.out.println(salariedEmployee.calculatePayment());
    }
}
