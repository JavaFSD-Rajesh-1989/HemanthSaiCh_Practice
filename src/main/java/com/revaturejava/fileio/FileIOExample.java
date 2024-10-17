package com.revaturejava.fileio;

import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        // 1. Writing to a text file
        writeToFile("example.txt", "Hello, File IO!");

        // 2. Reading from a text file
        readFromFile("example.txt");

        // 3. File existence and other file operations
        fileOperations("example.txt");

        // 4. Writing and reading binary data
        String binaryFileName = "example.bin";
        writeBinaryFile(binaryFileName);
        readBinaryFile(binaryFileName);
    }

    // Method for writing text to a file
    public static void writeToFile(String fileName, String content) {
        File file = new File(fileName);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
            System.out.println("Text file written successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }

    // Method for reading text from a file
    public static void readFromFile(String fileName) {
        File file = new File(fileName);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("\nReading file: " + fileName);
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    // Method for performing basic file operations
    public static void fileOperations(String fileName) {
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("\nFile " + fileName + " exists.");
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is it a directory? " + file.isDirectory());
            System.out.println("Is it a file? " + file.isFile());
            System.out.println("File size: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }

    // Method for writing binary data to a file
    public static void writeBinaryFile(String fileName) {
        File file = new File(fileName);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(new byte[] { 1, 2, 3, 4, 5 }); // Writing some binary data
            System.out.println("\nBinary file written successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing binary data: " + e.getMessage());
        }
    }

    // Method for reading binary data from a file
    public static void readBinaryFile(String fileName) {
        File file = new File(fileName);
        try (FileInputStream fis = new FileInputStream(file)) {
            System.out.println("\nReading binary file: " + fileName);
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print(byteData + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading binary data: " + e.getMessage());
        }
    }
}
