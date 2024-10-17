package com.revaturejava.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionExample {
    public static void main(String[] args) {
        // 1. Handling ArithmeticException
        System.out.println("=== Handling ArithmeticException ===");
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("This block is always executed.");
        }

        // 2. Handling Multiple Exceptions
        System.out.println("\n=== Handling Multiple Exceptions ===");
        try {
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer encountered.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Multiple exceptions handled.");
        }

        // 3. Throwing Custom Exceptions
        System.out.println("\n=== Throwing Custom Exceptions ===");
        try {
            validateAge(15); // This will throw CustomException
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 4. Try-with-Resources for Resource Management
        System.out.println("\n=== Try-with-Resources ===");
        try (BufferedReader reader = new BufferedReader(new FileReader("non_existent_file.txt"))) {
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error: File not found or unable to read file.");
        } finally {
            System.out.println("Try-with-resources completed.");
        }
    }

    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}
