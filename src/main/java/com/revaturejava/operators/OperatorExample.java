package com.revaturejava.operators;

public class OperatorExample {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 5;
        int b = 10;
        System.out.println("Sum: " + (a + b)); // Addition
        System.out.println("Difference: " + (b - a)); // Subtraction
        System.out.println("Product: " + (a * b)); // Multiplication
        System.out.println("Quotient: " + (b / a)); // Division
        System.out.println("Modulus: " + (b % a)); // Modulus

        // Increment and Decrement Operators
        System.out.println("Postfix Increment a: " + (a++)); // a = 5, then increment to 6
        System.out.println("Current value of a: " + a); // a = 6
        System.out.println("Prefix Increment b: " + (++b)); // Increment to b = 11, then print
        System.out.println("Postfix Decrement b: " + (b--)); // b = 11, then decrement to 10
        System.out.println("Current value of b: " + b); // b = 10

        // Comparison Operators
        System.out.println("Is a equal to b? " + (a == b)); // false
        System.out.println("Is a not equal to b? " + (a != b)); // true
        System.out.println("Is a greater than b? " + (a > b)); // false
        System.out.println("Is a less than or equal to b? " + (a <= b)); // true

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND (x && y): " + (x && y)); // false
        System.out.println("Logical OR (x || y): " + (x || y)); // true
        System.out.println("Logical NOT (!x): " + (!x)); // false

        // Bitwise Operators
        int c = 3; // Binary: 0011
        int d = 5; // Binary: 0101
        System.out.println("Bitwise AND (c & d): " + (c & d)); // 0011 & 0101 = 0001 (1)
        System.out.println("Bitwise OR (c | d): " + (c | d)); // 0011 | 0101 = 0111 (7)
        System.out.println("Bitwise XOR (c ^ d): " + (c ^ d)); // 0011 ^ 0101 = 0110 (6)
        System.out.println("Bitwise NOT (~c): " + (~c)); // NOT 0011 = 1100 (bitwise negation)
        
        // Shift Operators
        System.out.println("Left Shift (c << 1): " + (c << 1)); // Shift left (0011 << 1) = 0110 (6)
        System.out.println("Right Shift (d >> 1): " + (d >> 1)); // Shift right (0101 >> 1) = 0010 (2)

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max); // Ternary operator returns b = 10
    }
}
