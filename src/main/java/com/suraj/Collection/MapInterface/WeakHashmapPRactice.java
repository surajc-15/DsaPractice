package com.suraj.Collection.MapInterface;

public class WeakHashmapPRactice {
    public static void main(String[] args) {
        // WeakHashMap allows keys to be garbage collected when they are no longer in use
        java.util.WeakHashMap<String, String> weakHashMap = new java.util.WeakHashMap<>();

        String key1 = new String("Key1");
        String key2 = new String("Key2");

        weakHashMap.put(key1, "Value1");
        weakHashMap.put(key2, "Value2");

        System.out.println("Before nullifying keys: " + weakHashMap);

        // Nullifying the strong references to the keys
        key1 = null;
        key2 = null;

        // Suggesting garbage collection
        System.gc();

        // The entries may be removed if the garbage collector has run
        System.out.println("After nullifying keys: " + weakHashMap);
    }
}
