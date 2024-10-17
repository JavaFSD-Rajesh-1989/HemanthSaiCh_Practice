package com.revaturejava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // Sample list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Filter even numbers and find their sum
        int evenSum = numbers.stream()
                .filter(n -> n % 2 == 0) // Filters even numbers
                .mapToInt(n -> n)        // Converts the stream to IntStream
                .sum();                  // Sum of all even numbers
        System.out.println("Sum of even numbers: " + evenSum);
        
        // Map and collect squared values
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n) // Squares each number
                .collect(Collectors.toList()); // Collects results in a list
        System.out.println("Squared numbers: " + squaredNumbers);
        
        // Find the maximum number
        numbers.stream()
                .max(Integer::compareTo)
                .ifPresent(max -> System.out.println("Max number: " + max));
        
        // Reduce: find the product of all numbers
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product of all numbers: " + product);
        
        // Count the odd numbers
        long oddCount = numbers.stream()
                .filter(n -> n % 2 != 0)
                .count();
        System.out.println("Count of odd numbers: " + oddCount);
        
        // Create a list of strings
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape");

        // Filter and sort strings in natural order
        List<String> filteredWords = words.stream()
                .filter(word -> word.startsWith("a"))
                .sorted() // Sorts the words alphabetically
                .collect(Collectors.toList());
        System.out.println("Filtered and sorted words: " + filteredWords);
    }
}
