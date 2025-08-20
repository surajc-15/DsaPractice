package com.suraj.Collection.MapInterface;

import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

public class ConcurrentHashMapPractice {
    // ConcurrentHashMap is a thread-safe implementation of the Map interface.
    // It allows concurrent access to the map without locking the entire map,
    // which improves performance in multi-threaded environments.

    //in java 8 aand below ,it is implemented using a segmented locking mechanism.
    // In java 9 and above, it is implemented using a new algorithm that uses a
    // combination of lock-free and lock-based techniques to improve performance.

    // Key features of ConcurrentHashMap:
    // 1. Thread-safe: It allows concurrent access by multiple threads without external synchronization.
    // 2. High concurrency: It allows a high level of concurrency by dividing the map
    //    into segments, each of which can be accessed independently.
    // 3. Non-blocking reads: Reads can be performed without locking the map,
    //    allowing for better performance in read-heavy scenarios.
    // 4. Iterators: Iterators are weakly consistent, meaning they reflect the state of the map
    //    at the time of their creation, but may not reflect subsequent changes made to the
    //    map by other threads.
    // 5. Null values: It does not allow null keys or values, which helps avoid ambiguity
    //    in concurrent scenarios.
    // 6. Performance: It provides better performance than synchronized maps in multi-threaded
    //    environments due to its fine-grained locking mechanism.
    // 7. Bulk operations: It supports bulk operations like putAll, removeAll, and retainAll,
    //    which can be performed atomically.
    // 8. Size: The size of the map can be obtained without locking, which allows for
    //    non-blocking size checks.
    // 9. Atomic operations: It provides atomic operations like putIfAbsent, remove, and replace,
    //    which allow for safe updates to the map without external synchronization.
    // 10. Performance: It is designed for high performance in multi-threaded environments,
    //     making it suitable for applications that require concurrent access to a shared map.
    // 11. Load factor: It has a default load factor of 0.75, which balances space and time
    //     efficiency. This means that the map will resize when it is 75% full
    //     to maintain performance.


    // Example usage:
    private  static final Logger logger=Logger.getLogger(ConcurrentHashMapPractice.class.getName());
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Put key-value pairs into the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Get a value from the map
        logger.info("ConcurrentHashMap created successfully");
        logger.info("map data is: " + map);


        Integer value = map.get("Two");
        System.out.println("Value for key 'Two': " + value);

        // Check if a key exists
        boolean containsKey = map.containsKey("Three");
        System.out.println("Contains key 'Three': " + containsKey);

        // Remove a key-value pair
        map.remove("One");

        // Iterate over the map
        for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
