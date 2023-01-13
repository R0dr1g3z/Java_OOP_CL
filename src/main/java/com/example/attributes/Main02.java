package com.example.attributes;

public class Main02 {
    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        System.out.println(testAttribute.publicAttribute = "Testing");
        System.out.println(testAttribute.protectedAttribute = "Protected");
    }
}
