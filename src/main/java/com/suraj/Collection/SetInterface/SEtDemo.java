package com.suraj.Collection.SetInterface;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SEtDemo {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(67); // Duplicate element, will not be added
        System.out.println(set); // Output: [1, 2, 3]
        //the order of elements in a HashSet is not guaranteed to be the same as the order in which they were added.
        //HashSet does not allow duplicate elements. If you try to add a duplicate element, it will be ignored.
        //HashSet allows null values. You can add a null element to a HashSet.
        //HashSet is not synchronized, which means it is not thread-safe. If multiple threads access a HashSet concurrently and at least one of the threads modifies the set.

        HashMap<Integer, String> map=new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(1, "Uno"); // Duplicate key, will update the value
        System.out.println(map); // Output: {1=Uno, 2=Two,
        Set<Integer> keyst=map.keySet();
        System.out.println(keyst);



        //LinkedHashSet maintains the insertion order of elements. When you iterate over a LinkedHashSet, the elements will be returned in the order they were added.
        //TreeSet stores elements in a sorted order. When you iterate over a TreeSet,
        // the elements will be returned in ascending order (or according to a specified comparator).
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(8);
        linkedHashSet.add(1);
        System.out.println(linkedHashSet.contains(3)); // Output: true
        System.out.println(linkedHashSet); // Output: [5, 3,

        linkedHashSet.remove(3);
        System.out.println(linkedHashSet); // Output: [5, 8, 1]

        set.clear();
        System.out.println(set);


        //for Thread Safe use Collections.synchronizedSet(new HashSet<>());
        Set<Integer> set2=Collections.synchronizedSet(new HashSet<>());


        //Concurrent skip list is a thread-safe variant of Skip List data structure.
        // It allows concurrent access and modifications by multiple threads without the need for external synchronization.
        Set<Integer> set3=new ConcurrentSkipListSet<>();
        set3.add(10);
        set3.add(20);
        set3.add(15);
        System.out.println(set3); // Output: [10, 15, 20]

        //TreeSet example
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(1);
        System.out.println(treeSet); // Output: [1, 3, 5,
        System.out.println(treeSet.first()); // Output: 1
        System.out.println(treeSet.last()); // Output: 8
        System.out.println(treeSet.higher(5)); // Output: 8
        System.out.println(treeSet.lower(5)); // Output: 3
        System.out.println(treeSet.subSet(3,8)); // Output: [3, 5]
        System.out.println(treeSet.headSet(5)); // Output: [1, 3]
        System.out.println(treeSet.tailSet(5)); // Output: [5, 8







    }
}
