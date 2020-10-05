package com.example.datastructuresinandroid.hashmap;

/**
 * Entry
 */

public class Entry {
    private int key;
    private Object value;
    Entry next;

    public Entry(int key, Object value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public Entry() {
        next = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
