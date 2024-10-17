package com.revaturejava.variables;

public class VariableExample {
    
    // Instance variable
    private String instanceVar = "I am an instance variable";

    // Static variable
    private static int staticVar = 20;

    public static void main(String[] args) {
        // Local variable
        int localVar = 10;
        final int CONSTANT_VAR = 100; // Constant variable

        System.out.println("Local Variable: " + localVar);
        System.out.println("Constant Variable: " + CONSTANT_VAR);

        // Create an instance of the class to access instance variable
        VariableExample example = new VariableExample();
        System.out.println("Instance Variable: " + example.instanceVar);
        
        // Access static variable
        System.out.println("Static Variable: " + staticVar);
        
        // Demonstrating Variable Naming Conventions
        int numberOfStudents = 30; // Camel case
        int NUMBERS_COUNT = 100;    // Uppercase for constants
        
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Numbers Count: " + NUMBERS_COUNT);
        
        // Data Types and Default Values
        // Here are examples of different data types
        int intValue = 5;               // Integer
        double doubleValue = 5.99;      // Double
        char charValue = 'A';           // Character
        boolean booleanValue = true;    // Boolean
        
        // Printing default values
        System.out.println("Default values:");
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);
        
        // Wrapper Classes Example
        Integer wrappedInt = Integer.valueOf(intValue);
        System.out.println("Wrapped Integer: " + wrappedInt);
        
        // Autoboxing and Unboxing
        Integer autoboxedInt = intValue;  // Autoboxing
        int unboxedInt = autoboxedInt;    // Unboxing
        System.out.println("Autoboxed Integer: " + autoboxedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
    }
}
