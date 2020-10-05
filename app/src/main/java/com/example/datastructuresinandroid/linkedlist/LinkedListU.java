package com.example.datastructuresinandroid.linkedlist;

/**
 * LinkedListU
 */

public class LinkedListU<T> {
    public LinkedNode head;
    public LinkedListU() {
        head = null;
    }

    public void add(Object value) {
        LinkedNode node = new LinkedNode(value, null);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public T popElement() {
        LinkedNode node = head;
        if (node != null) {
            LinkedNode temp = head.next;
            head = temp;
            return (T)node.value;
        }
        return null;
    }

    public void delete() {
        //delete first element
        head = head.next;
    }

    public void displayNodes() {
        LinkedNode n = head;
        while (n != null) {
            System.out.println("Julia " + (T)n.value);
            n = n.next;
        }
    }
}
