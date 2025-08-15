package com.suraj.Collection.ListInterface;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Stack;

public class StackPRactice {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
        stack.push(40);
        System.out.println("Stack after pushing 40: " + stack);
        System.out.println("Searching for 20: " + stack.search(20));
        System.out.println("Searching for 50: " + stack.search(50));
        stack.clear();


        // Using LinkedList as a Stack
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addLast(10);
        linkedList.addLast(20);
        System.out.println("LinkedList as Stack: " + linkedList);
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.removeLast());
        linkedList.addLast(30);
        linkedList.addLast(40);
        System.out.println("LinkedList after adding 30 and 40: " + linkedList);
        System.out.println("Is LinkedList empty? " + linkedList.isEmpty());
        System.out.println("LinkedList as Stack: " + linkedList);

    }




}
