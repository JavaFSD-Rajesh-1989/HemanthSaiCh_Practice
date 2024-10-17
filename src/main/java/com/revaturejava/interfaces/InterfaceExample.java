package com.revaturejava.interfaces;

// Animal interface with abstract methods
interface Animal {
    void eat();
    void sleep();
    
    // Default method (can have a body in an interface)
    default void makeSound() {
        System.out.println("Animal is making a sound.");
    }

    // Static method in an interface
    static void description() {
        System.out.println("This is an Animal interface.");
    }
}

// Another interface for specific abilities
interface Trainable {
    void train();
}

// Dog class implementing multiple interfaces
class Dog implements Animal, Trainable {
    @Override
    public void eat() {
        System.out.println("Dog eats food.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps.");
    }

    @Override
    public void train() {
        System.out.println("Dog is being trained.");
    }

    // Overriding the default method
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Bird class implementing Animal interface without Trainable
class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("Bird eats seeds.");
    }

    @Override
    public void sleep() {
        System.out.println("Bird sleeps.");
    }

    // Using the default method from the Animal interface
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Interface reference for a Dog object
        Animal myDog = new Dog();
        myDog.eat(); // Dog eats food.
        myDog.sleep(); // Dog sleeps.
        myDog.makeSound(); // Dog barks (overridden method).
        
        // Interface reference for a Bird object
        Animal myBird = new Bird();
        myBird.eat(); // Bird eats seeds.
        myBird.sleep(); // Bird sleeps.
        myBird.makeSound(); // Animal is making a sound (default method).

        // Calling the static method of the interface
        Animal.description(); // This is an Animal interface.

        // Trainable interface reference
        Trainable trainableDog = new Dog();
        trainableDog.train(); // Dog is being trained.
    }
}
