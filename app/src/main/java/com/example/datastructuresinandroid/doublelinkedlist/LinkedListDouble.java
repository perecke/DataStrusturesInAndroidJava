package com.example.datastructuresinandroid.doublelinkedlist;

/**
 * Double LinkedList
 */

class LinkedListDouble<T> {
    NodeDouble head;
    public LinkedListDouble() {
        head = null;
    }

    public void add(Object value) {
        NodeDouble node = new NodeDouble(value, null, null);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head.previous = node;
            head = node;
        }
    }

    public void delete() {
        //delete first element
        head = head.next;
        head.previous = null;
    }

    public void displayNodes() {
        NodeDouble n = head;
        while (n != null) {
            System.out.println("Julia " + (T)n.value);
            n = n.next;
        }
    }
}
