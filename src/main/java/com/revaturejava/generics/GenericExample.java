package com.revaturejava.generics;

// A generic Box class that can store an item of any type
class Box<T> {
    private T item;

    // Set item
    public void setItem(T item) {
        this.item = item;
    }

    // Get item
    public T getItem() {
        return item;
    }
    
    // Generic method to display the type of item
    public <U> void displayItemType(U item) {
        System.out.println("The type of the item is: " + item.getClass().getName());
    }
}

// Another generic class with two parameters
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" + "key=" + key + ", value=" + value + '}';
    }
}

public class GenericExample {
    public static void main(String[] args) {
        // Example with Integer type
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(10);
        System.out.println("Integer Box Item: " + integerBox.getItem());
        integerBox.displayItemType(integerBox.getItem());

        // Example with String type
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics");
        System.out.println("String Box Item: " + stringBox.getItem());
        stringBox.displayItemType(stringBox.getItem());

        // Example of a generic class with two parameters
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        System.out.println("Pair: " + pair);

        // Type safety: Uncommenting below will cause compile-time error
        // integerBox.setItem("String instead of Integer");
    }
}
