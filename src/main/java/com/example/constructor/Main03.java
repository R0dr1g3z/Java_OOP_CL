package com.example.constructor;

public class Main03 {
    public static void main(String[] args) {
        BankAccount bankAccount  = new BankAccount(2352);
        bankAccount.depositCash(5000);
        bankAccount.depositCash(-500);
        bankAccount.printInfo();
        bankAccount.withdrawCash(500);
        bankAccount.withdrawCash(-200);
        bankAccount.withdrawCash(6000);
        bankAccount.printInfo();
    }
}
