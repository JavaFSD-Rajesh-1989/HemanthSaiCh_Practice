package com.revaturejava.basics;

import java.util.Scanner;

public class BasicsExample {

    // Command line inputs, Scanner, and System.console for user input
    public static void main(String[] args) {
        // Command Line Inputs: Printing all inputs passed from the command line
        if (args.length > 0) {
            System.out.println("Command Line Inputs:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command line inputs provided.");
        }

        // Using Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Using System.console() for password input (console-only, may not work in IDEs)
        if (System.console() != null) {
            char[] password = System.console().readPassword("Enter your password: ");
            System.out.println("Password length: " + password.length);
        } else {
            System.out.println("System.console() is not supported in this environment.");
        }

        // Demonstrate path and classpath
        displayPaths();
    }

    // Method to display the current classpath and file path
    private static void displayPaths() {
        // Show current file path
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Current working directory: " + currentDirectory);

        // Show current classpath
        String classpath = System.getProperty("java.class.path");
        System.out.println("Classpath: " + classpath);
    }
}
