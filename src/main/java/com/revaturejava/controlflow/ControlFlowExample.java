package com.revaturejava.controlflow;

import java.util.Scanner;

public class ControlFlowExample {
    public static void main(String[] args) {
        // 1. If-Else Statements
        System.out.println("=== If-Else Statements ===");
        int num = 10;

        if (num > 5) {
            System.out.println("Number is greater than 5");
        } else if (num == 5) {
            System.out.println("Number is equal to 5");
        } else {
            System.out.println("Number is less than 5");
        }

        // 2. Switch Statement
        System.out.println("\n=== Switch Statement ===");
        String day = "Wednesday";

        switch (day) {
            case "Monday":
                System.out.println("It's Monday!");
                break; // Exit the switch after executing this case
            case "Tuesday":
                System.out.println("It's Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday!");
                break;
            case "Thursday":
                System.out.println("It's Thursday!");
                break;
            case "Friday":
                System.out.println("It's Friday!");
                break;
            case "Saturday":
            case "Sunday": // Both Saturday and Sunday will execute this case
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Not a valid day!"); // If none of the cases match
                break;
        }

        // 3. For Loop
        System.out.println("\n=== For Loop ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop iteration: " + i);
        }

        // 4. While Loop
        System.out.println("\n=== While Loop ===");
        int count = 0;
        while (count < 3) {
            System.out.println("While loop iteration: " + count);
            count++; // Increment the counter
        }

        // 5. Do-While Loop
        System.out.println("\n=== Do-While Loop ===");
        int j = 0;
        do {
            System.out.println("Do-While loop iteration: " + j);
            j++; // Increment the counter
        } while (j < 3); // Check the condition after the first iteration

        // 6. Break and Continue
        System.out.println("\n=== Break and Continue ===");
        for (int k = 0; k < 5; k++) {
            if (k == 2) {
                System.out.println("Continuing to next iteration at k = " + k);
                continue; // Skip the rest of the loop when k is 2
            }
            if (k == 4) {
                System.out.println("Breaking the loop at k = " + k);
                break; // Exit the loop when k is 4
            }
            System.out.println("Loop iteration: " + k);
        }

        // 7. Using Scanner for User Input
        System.out.println("\n=== User Input Example ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNum = scanner.nextInt();

        // Check if the user number is even or odd
        if (userNum % 2 == 0) {
            System.out.println(userNum + " is even.");
        } else {
            System.out.println(userNum + " is odd.");
        }

        // Close the scanner
        scanner.close();
    }
}
