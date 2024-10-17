package com.revaturejava.inheritance;

// Base class
class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Base method
    void sound() {
        System.out.println("This is an animal sound");
    }

    // Final method (cannot be overridden)
    final void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Derived class (Single-level inheritance)
class Dog extends Animal {

    // Constructor
    public Dog(String name) {
        super(name); // Call the base class constructor
    }

    // Overriding the sound method
    @Override
    void sound() {
        System.out.println(name + " is barking.");
    }
}

// Derived class (Multi-level inheritance)
class Puppy extends Dog {

    // Constructor
    public Puppy(String name) {
        super(name); // Call the Dog class constructor
    }

    // Overriding the sound method for Puppy
    @Override
    void sound() {
        System.out.println(name + " is yipping.");
    }

    // Using super to access parent class method
    void makeParentSound() {
        super.sound(); // Calls Dog's sound() method
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Using the Dog class
        Dog dog = new Dog("Rex");
        dog.sound();  // Rex is barking.
        dog.sleep();  // Rex is sleeping.

        // Using the Puppy class
        Puppy puppy = new Puppy("Buddy");
        puppy.sound(); // Buddy is yipping.
        puppy.makeParentSound(); // Buddy is barking.
        puppy.sleep(); // Buddy is sleeping.

        // Polymorphism: Treat Puppy as an Animal
        Animal animal = new Puppy("Charlie");
        animal.sound(); // Charlie is yipping (run-time polymorphism)
        animal.sleep(); // Charlie is sleeping.
    }
}
