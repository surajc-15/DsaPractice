package com.suraj.Collection.ListInterface;

import java.util.LinkedList;

public class LinkedListPRactice {

    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(1, 15); // Adding 15 at index 1
        System.out.println(list);
        list.addFirst(5); // Adding 5 at the beginning
        System.out.println(list);

        for(Integer  node : list) {
            System.out.print(node + " ");
        }

    }


}
