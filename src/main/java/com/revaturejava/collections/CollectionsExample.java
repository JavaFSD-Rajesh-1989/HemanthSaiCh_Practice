package com.revaturejava.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class CollectionsExample {
    public static void main(String[] args) {
        // 1. Using List (ArrayList)
        System.out.println("List Example (ArrayList):");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Initial Fruits List: " + fruits);
        fruits.add("Grapes");
        System.out.println("After adding Grapes: " + fruits);
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println("Fruits Size: " + fruits.size());
        System.out.println("Sorted Fruits List:");
        fruits.sort(null);  // Sort in natural order
        System.out.println(fruits);

        // 2. Using Set (HashSet)
        System.out.println("\nSet Example (HashSet):");
        HashSet<String> uniqueFruits = new HashSet<>(fruits);
        uniqueFruits.add("Apple"); // Duplicate, will not be added
        uniqueFruits.add("Pineapple");
        System.out.println("Unique Fruits Set: " + uniqueFruits);
        System.out.println("Set Size: " + uniqueFruits.size());

        // 3. Using Map (HashMap)
        System.out.println("\nMap Example (HashMap):");
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 60);
        fruitPrices.put("Banana", 30);
        fruitPrices.put("Orange", 50);
        fruitPrices.put("Mango", 100);

        System.out.println("Fruit Prices Map: " + fruitPrices);
        System.out.println("Price of Banana: " + fruitPrices.get("Banana"));
        fruitPrices.put("Banana", 35); // Update price
        System.out.println("Updated Fruit Prices Map: " + fruitPrices);
        System.out.println("All Fruit Prices:");
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 4. Using Queue (LinkedList)
        System.out.println("\nQueue Example (LinkedList):");
        Queue<String> fruitQueue = new LinkedList<>();
        fruitQueue.add("Apple");
        fruitQueue.add("Banana");
        fruitQueue.add("Orange");

        System.out.println("Initial Fruit Queue: " + fruitQueue);
        System.out.println("Head of Queue: " + fruitQueue.peek());
        System.out.println("Removing from Queue: " + fruitQueue.poll());
        System.out.println("Queue after removing head: " + fruitQueue);
        System.out.println("Queue Size: " + fruitQueue.size());

        // Iterating through collections
        System.out.println("\nIterating through the List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating through the Set:");
        for (String fruit : uniqueFruits) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating through the Map:");
        for (String key : fruitPrices.keySet()) {
            System.out.println(key + ": " + fruitPrices.get(key));
        }

        System.out.println("\nIterating through the Queue:");
        Iterator<String> iterator = fruitQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
