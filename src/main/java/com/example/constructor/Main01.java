package com.example.constructor;

import com.example.inheritance.AdvancedCalculator;

public class Main01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(2, 4);
        calculator.subtract(10, 2);
        calculator.multiply(2, 5);
        calculator.divide(10, 2);
        calculator.divide(10, 0);
        calculator.printOperations();
        calculator.clearOperations();
        calculator.add(5, 5);
        calculator.printOperations();
        
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.pow(4, 2);
        advancedCalculator.printOperations();
    }
}
