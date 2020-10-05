package com.example.datastructuresinandroid.hashmap;

/**
 * HashTableArray
 */

public class HashTableArray<T> {
    Entry[] arrayHash;
    int size;

    public HashTableArray(int size) {
        this.size = size;
        arrayHash = new Entry[size];
        //initialize
        for (int i = 0; i < size; i++) {
            arrayHash[i] = new Entry();
        }
    }

    int getHashKey(int key) {
        return key % size;
    }

    public void put(int key, Object value) {
        int hashIndex = getHashKey(key);
        Entry arrayValue = arrayHash[hashIndex];
        Entry newValue = new Entry(key, value);
        newValue.next = arrayValue.next;
        arrayValue.next = newValue;

    }

    public T get(int key) {
        int hashIndex = getHashKey(key);
        Entry entryArray = arrayHash[hashIndex];
        while (entryArray != null) {
            if (entryArray.getKey() == key) {
                return (T) entryArray.getValue();
            }
            entryArray = entryArray.next;
        }

        return null;
    }
}
