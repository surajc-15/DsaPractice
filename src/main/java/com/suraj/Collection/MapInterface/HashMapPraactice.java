package com.suraj.Collection.MapInterface;

import com.suraj.Collection.UtilityClasses.Student;

import java.util.HashMap;
import java.util.Map;

public class HashMapPraactice {
    Map<Integer, Student> studentdetails = new HashMap<>();
    public static void main(String[] args) {
        HashMap<Integer,Student> details=new HashMap<>();
        details.put(1, new Student("Suraj", 101, 20));
        details.put(2, new Student("Amit", 102, 21));
        details.put(3, new Student("Ravi", 103, 22));
        System.out.println("HashMap: " + details);


        // Accessing elements
        Student student1 = details.get(1);
        System.out.println("Accessed Student: " + student1);

        // Checking if a key exists
        boolean hasKey = details.containsKey(2);
        System.out.println("Contains key 2: " + hasKey);

        // Checking if a value exists
        boolean hasValue = details.containsValue(new Student("Amit", 102, 21));
        System.out.println("Contains value Amit: " + hasValue);

        // Removing an element
        Student removedStudent = details.remove(3);
        System.out.println("Removed Student: " + removedStudent);

        // Checking the size of the HashMap
        int size = details.size();
        System.out.println("Size of HashMap: " + size);

        // Checking if the HashMap is empty
        boolean isEmpty = details.isEmpty();
        System.out.println("Is HashMap empty? " + isEmpty);

        //getting the keys and values
        System.out.println("Keys: " + details.keySet());
        System.out.println("Values: " + details.values());

        // Iterating over the HashMap
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<Integer, Student> entry : details.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    
        // Clearing the HashMap
//        details.clear();
        System.out.println("HashMap after clearing: " + details);

        // Re-adding elements to demonstrate that clear works
        System.out.println(details.getOrDefault(11, new Student("Default", 0, 0)));


    }

}
