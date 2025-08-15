package com.suraj.Collection.ListInterface;


public class CustomeLinkedList<E> {

    private Node head;
    private Node tail;

    public CustomeLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(E data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.getData()).append(" -> ");
            current = current.getNext();
        }
        sb.append("null");
        return sb.toString();
    }

    public static void main(String[] args) {
        CustomeLinkedList<Integer> linkedList = new CustomeLinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("Linked List: " + linkedList);
    }
}
