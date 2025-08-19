package com.suraj.Collection.MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true); // true for access order
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
        //LRU Cache is a type of cache that removes the least recently used items first when it reaches its capacity.
        // It is often implemented using a combination of a HashMap and a doubly linked list
        // to maintain the order of usage.

        LRUCache<String,Integer> map=new LRUCache<>(3);
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        System.out.println(map.get("Apple")); // Accessing "Apple" to make it recently used
        System.out.println(map);
        map.put("Date", 4); // Adding a new key-value pair
        System.out.println(map);
    }
}
