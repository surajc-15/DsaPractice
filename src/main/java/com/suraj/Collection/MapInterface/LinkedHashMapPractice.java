package com.suraj.Collection.MapInterface;

import java.util.LinkedHashMap;

public class LinkedHashMapPractice {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        System.out.println(map);


        map.put("Date", 4); // Adding a new key-value pair
        System.out.println(map);
        map.put("Apple", 5); // Updating the value for an existing key
        System.out.println(map);
        map.put("Elderberry", 5); // Adding another new key-value pair
        System.out.println(map);


        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Checking if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana is present in the map with value: " + map.get("Banana"));
        } else {
            System.out.println("Banana is not present in the map.");
        }
        //get last key value
        String lastKey = null;
        for (String key : map.keySet()) {
            lastKey = key; // This will end up with the last key in the iteration
        }
        if (lastKey != null) {
            System.out.println("Last key in the LinkedHashMap: " + lastKey + ", Value: " + map.get(lastKey));
        } else {
            System.out.println("The LinkedHashMap is empty.");
        }
    }
}
