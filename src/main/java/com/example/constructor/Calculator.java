package com.example.constructor;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> history = new ArrayList<>();

    public double add(double a, double b) {
        double result = a + b;
        addToHistory(a, b, result, "add");
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        addToHistory(a, b, result, "multiply");
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        addToHistory(a, b, result, "subtract");
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            addToHistory(a, b, b, "divide_0");
            return 0;
        }
        double result = a / b;
        addToHistory(a, b, result, "divide");
        return result;
    }

    private void addToHistory(double a, double b, double c, String switcher) {
        String txt = "";
        switch (switcher) {
            case "add":
                txt = String.format("Added %s + %s = %.2f", a, b, c);
                break;

            case "multiply":
                txt = String.format("Multiplied %s * %s = %.2f", a, b, c);
                break;

            case "subtract":
                txt = String.format("Subtracted %s - %s = %.2f", a, b, c);
                break;

            case "divide":
                txt = String.format("Divided %s / %s = %.2f", a, b, c);
                break;

            case "divide_0":
                txt = String.format("Cannot divide by 0");
                break;
        }
        this.history.add(txt);
    }

    public void printOperations() {
        for (String s : history) {
            System.out.println(s);
        }
    }

    public void clearOperations() {
        this.history.clear();
    }
}
