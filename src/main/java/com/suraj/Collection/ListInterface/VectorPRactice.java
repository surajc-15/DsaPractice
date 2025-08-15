package com.suraj.Collection.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class VectorPRactice {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>(5,3);

        for(int i=0;i<6;i++){
            vector.add(i * 10); // Adding elements to the vector
            System.out.println(vector.capacity()+" "+vector.size());
        }

        LinkedList<Integer> arrayList = new LinkedList<>(); // Copying vector to ArrayList
        for (Integer element : vector) {
            arrayList.add(element);
        }

        System.out.println("ArrayList: " + arrayList);
        LinkedList<Integer> linkedList = new LinkedList<>(vector); // Copying vector to linkedList
        System.out.println("LinkedList: " + linkedList);
        System.out.println(linkedList.reversed());
        System.out.println(linkedList.contains(10));


        Vector<Integer> vector2 = new Vector<>(arrayList); // Copying vector to vector2
        System.out.println("Vector2: " + vector2);

        vector2.clear();
        System.out.println("Vector2 after clear: " + vector2);
        System.out.println(vector2.capacity()+" "+vector2.size());

    }
}
