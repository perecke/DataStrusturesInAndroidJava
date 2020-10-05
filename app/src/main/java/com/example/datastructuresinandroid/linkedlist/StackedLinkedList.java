package com.example.datastructuresinandroid.linkedlist;

/**
 * StackedLinkedList
 */

class StackedLinkedList<T> {
    public LinkedNode top;
    public StackedLinkedList() {
        top = null;
    }

    public void add(Object value) {
        LinkedNode node = new LinkedNode(value, null);
        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
    }

    public T popElement() {
        LinkedNode node = top;
        if (node != null) {
            LinkedNode temp = top.next;
            top = temp;
            return (T)node.value;
        }
        return null;
    }

    public void delete() {
        //delete first element
        top = top.next;
    }

    public void displayNodes() {
        LinkedNode n = top;
        while (n != null) {
            System.out.println("Julia " + (T)n.value);
            n = n.next;
        }
    }
}
