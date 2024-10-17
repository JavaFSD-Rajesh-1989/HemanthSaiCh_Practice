package com.revaturejava.classes_objects;

// Dog class with attributes and methods
class Dog {
    // Instance variables
    private String name;
    private int age;

    // Constructor to initialize the Dog object
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to make the dog bark
    public void bark() {
        System.out.println(name + " is barking!");
    }

    // Overloaded method to change the dog's name
    public void setName(String newName) {
        this.name = newName;
        System.out.println("Dog's name changed to: " + this.name);
    }

    // Method to get the dog's details
    public void displayInfo() {
        System.out.println("Dog's Name: " + name + ", Age: " + age);
    }

    // Static method to compare two dogs
    public static void compareDogs(Dog dog1, Dog dog2) {
        if (dog1.age > dog2.age) {
            System.out.println(dog1.name + " is older than " + dog2.name);
        } else if (dog1.age < dog2.age) {
            System.out.println(dog2.name + " is older than " + dog1.name);
        } else {
            System.out.println(dog1.name + " and " + dog2.name + " are of the same age.");
        }
    }
}

// Main class to demonstrate the Dog class
public class ClassesObjectsExample {
    public static void main(String[] args) {
        // Creating Dog objects
        Dog dog1 = new Dog("Rex", 3);
        Dog dog2 = new Dog("Buddy", 5);

        // Calling methods on the Dog objects
        dog1.bark(); // Dog barks
        dog2.bark(); // Dog barks

        // Displaying info of the dogs
        dog1.displayInfo();
        dog2.displayInfo();

        // Changing the name of dog1 and displaying the info again
        dog1.setName("Max");
        dog1.displayInfo();

        // Comparing the ages of the two dogs
        Dog.compareDogs(dog1, dog2);
    }
}
