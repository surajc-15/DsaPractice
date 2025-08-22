package com.suraj.Collection.Streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        //Iterator is a design pattern that provides a way to access elements of a collection sequentially without exposing its underlying representation.
        // It is commonly used in Java Collections Framework to traverse collections like lists, sets, and maps.
        // The Iterator interface provides methods like hasNext(), next(), and remove() to iterate over elements.
        // Example of using Iterator with a List
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Example of using Iterator with a List and removing elements
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            Integer number = numberIterator.next();
            if (number % 2 == 0) {
                numberIterator.remove(); // Remove even numbers
            }
        }
        System.out.println("After removing even numbers: " + numbers);
        // Example of using Iterator with a Set

    }
}
