package com.example.inheritance;

import com.example.constructor.Calculator;

public class AdvancedCalculator extends Calculator {
    public double pow(double a, double b) {
        double result = Math.pow(a, b);
        addToHistory(a, b, result, "pow");
        return result;
    }
    public double root(double a, double b){
        double result = Math.pow(a, 1/b);
        addToHistory(a, b, result, "root");
        return result;
    }
}
