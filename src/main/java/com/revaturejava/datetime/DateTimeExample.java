package com.revaturejava.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DateTimeExample {
    public static void main(String[] args) {
        // 1. Get Current Date and Time
        System.out.println("=== Current Date and Time ===");
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current DateTime: " + currentDateTime);

        // 2. Date and Time Manipulation
        System.out.println("\n=== Date and Time Manipulation ===");
        LocalDate tomorrow = currentDate.plusDays(1);
        LocalTime addHours = currentTime.plusHours(3);
        System.out.println("Tomorrow's Date: " + tomorrow);
        System.out.println("Time after 3 hours: " + addHours);

        // 3. Formatting Date and Time
        System.out.println("\n=== Formatting Date and Time ===");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("Formatted Date: " + currentDate.format(dateFormatter));
        System.out.println("Formatted Time: " + currentTime.format(timeFormatter));

        // 4. Working with ZonedDateTime
        System.out.println("\n=== ZonedDateTime ===");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current Date and Time in New York: " + zonedDateTime);

        // 5. User Input for Date and Time
        System.out.println("\n=== User Input for Date and Time ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String userInputDate = scanner.nextLine();
        LocalDate userDate = LocalDate.parse(userInputDate);
        System.out.println("You entered: " + userDate);

        // Calculate days until entered date
        long daysUntil = java.time.temporal.ChronoUnit.DAYS.between(currentDate, userDate);
        System.out.println("Days until entered date: " + daysUntil);

        // Close the scanner
        scanner.close();
    }
}
