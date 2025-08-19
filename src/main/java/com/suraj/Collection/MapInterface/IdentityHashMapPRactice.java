package com.suraj.Collection.MapInterface;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapPRactice {
//{
    public static void main(String[] args) {
        Map<String, String> identityMap = new IdentityHashMap<>();

        String key1 = new String("hello");
        String key2 = new String("hello"); // different object, same value

        identityMap.put(key1, "world1");
        identityMap.put(key2, "world2");

        System.out.println(identityMap);
        // Output: {hello=world1, hello=world2}
        // (two entries because key1 != key2 in memory)
    }
}
