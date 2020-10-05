package com.example.datastructuresinandroid.doublelinkedlist;

import org.w3c.dom.Node;

/**
 * LinkedList Node
 */

class NodeDouble {
    Object value;
    NodeDouble next;
    NodeDouble previous;

    public NodeDouble(Object value, NodeDouble next, NodeDouble previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
}
