package com.revaturejava.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Obtain the class object for java.lang.String
            Class<?> clazz = Class.forName("java.lang.String");
            
            // Print the class name
            System.out.println("Class Name: " + clazz.getName());

            // Fetch and print all declared methods
            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("\nMethods:");
            for (Method method : methods) {
                System.out.println("Method Name: " + method.getName() +
                                   ", Return Type: " + method.getReturnType() +
                                   ", Modifiers: " + Modifier.toString(method.getModifiers()));
            }

            // Fetch and print all constructors
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            System.out.println("\nConstructors:");
            for (Constructor<?> constructor : constructors) {
                System.out.println("Constructor: " + constructor.getName() +
                                   ", Parameter Count: " + constructor.getParameterCount());
            }

            // Fetch and print all fields
            Field[] fields = clazz.getDeclaredFields();
            System.out.println("\nFields:");
            for (Field field : fields) {
                System.out.println("Field Name: " + field.getName() +
                                   ", Type: " + field.getType() +
                                   ", Modifiers: " + Modifier.toString(field.getModifiers()));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
