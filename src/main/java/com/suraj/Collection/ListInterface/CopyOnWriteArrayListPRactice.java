package com.suraj.Collection.ListInterface;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListPRactice {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<>();
        cowList.add(10);
        cowList.add(20);




        //read operations:Fast and safe for concurrent access
        //write operations: in this a copy of the array is created for each write operation, and
        // the original array remains unchanged until the new array is fully constructed.
        System.out.println("CopyOnWriteArrayList: " + cowList);

        //demonstrating thread safety
        Thread thread1 = new Thread(() -> {
            for (int i = 30; i <= 50; i += 10) {
                System.out.println("Thread 1 reading: " + cowList);
                cowList.add(i);
                System.out.println("Thread 1 added: " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 60; i <= 80; i += 10) {
                System.out.println("Thread 2 reading: " + cowList);
                cowList.add(i);
                System.out.println("Thread 2 added: " + i);
            }
        });
        thread1.start();
        thread2.start();



        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final CopyOnWriteArrayList: " + cowList);
    }
}
