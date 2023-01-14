package com.example.constructor;

public class BankAccount {
    private int number;
    private double cash = 0;

    public BankAccount(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }

    public void depositCash(double amount) {
        if (amount > 0) {
            this.cash += amount;
        }
    }

    public double withdrawCash(double amount) {
        if (amount > 0 && this.cash - amount > 0) {
            this.cash -= amount;
            return amount;
        }
        return amount;
    }

    public void printInfo() {
        System.out.println("Number konta: " + this.number);
        System.out.println("Stan konta: " + this.cash);
    }
}
