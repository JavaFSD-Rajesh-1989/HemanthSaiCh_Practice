package com.revaturejava.polymorphism;

// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    
    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

// Derived class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Upcasting: Animal reference to a Dog object
        Animal myDog = new Dog(); // Polymorphism
        myDog.sound(); // Dog's sound() method is called
        
        // Upcasting: Animal reference to a Cat object
        Animal myCat = new Cat();
        myCat.sound(); // Cat's sound() method is called
        
        // Demonstrating downcasting with Dog
        if (myDog instanceof Dog) {
            Dog realDog = (Dog) myDog;
            realDog.fetch(); // Access Dog-specific behavior
        }

        // Example of polymorphism in arrays
        Animal[] animals = { new Dog(), new Cat() };
        for (Animal animal : animals) {
            animal.sound(); // Calls overridden method based on object type
        }
    }
}
