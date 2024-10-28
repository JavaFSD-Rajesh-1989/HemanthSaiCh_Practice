package Pointers;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Primitive type demonstration
        int num1 = 11;
        int num2 = num1;

        // Changing value of num1 doesn't affect num2
        num1 = 22;

        System.out.println("Primitive Values:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println();

        // HashMap demonstration
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();

        // Adding an initial value to map1
        map1.put("value", 10);
        System.out.println("Initial map1: " + map1);

        // map2 now references the same HashMap as map1
        map2 = map1;
        
        // Modifying map1 affects map2 since they reference the same object
        map1.put("value", 11);
        System.out.println("After updating map1:");
        System.out.println("map1: " + map1);
        System.out.println("map2: " + map2);
        System.out.println();

        // Updating map3 and changing map2 to reference map3
        map3.put("value", 22);
        map2 = map3; // Now map2 points to map3

        // Changing map1 again
        map1.put("anotherValue", 30);

        System.out.println("After updating map1 and changing map2 to map3:");
        System.out.println("map1: " + map1);
        System.out.println("map2: " + map2);
        System.out.println("map3: " + map3);
        
        // Demonstrating removal of a value from map1
        map1.remove("value");
        System.out.println("After removing 'value' from map1:");
        System.out.println("map1: " + map1);
        System.out.println("map2: " + map2);
        System.out.println("map3: " + map3);
    }
}
