package com.suraj.Collection.SetInterface;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArray {
    public static void main(String[] args) {
        CopyOnWriteArray copyOnWriteArray = new CopyOnWriteArray();
        copyOnWriteArray.set.add(1);
        copyOnWriteArray.set.add(2);
        copyOnWriteArray.set.add(3);
        copyOnWriteArray.set.add(4);
        copyOnWriteArray.set.add(5);

        System.out.println("Elements in the CopyOnWriteArraySet: " + copyOnWriteArray);

        // Iterating through the elements
        for (Integer i : copyOnWriteArray.set) {
            System.out.println(i);
        }
}
