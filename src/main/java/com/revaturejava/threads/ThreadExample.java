package com.revaturejava.threads;

// Extending the Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running, iteration: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds (0.5 seconds)
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
            }
        }
    }
}

// Implementing Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " (Runnable) is running, iteration: " + i);
            try {
                Thread.sleep(300); // Sleep for 300 milliseconds
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " (Runnable) was interrupted.");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Thread using MyThread class
        MyThread thread1 = new MyThread();
        thread1.setName("CustomThread1");
        
        // Thread using Runnable interface
        Thread thread2 = new Thread(new MyRunnable(), "CustomThread2");

        // Set thread priorities (1 is the minimum, 10 is the maximum)
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Starting both threads
        thread1.start();
        thread2.start();

        // Main thread prints this
        System.out.println(Thread.currentThread().getName() + " (main) is running.");
    }
}
