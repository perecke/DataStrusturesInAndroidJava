package com.example.datastructuresinandroid.dynamicarray;

import java.util.Arrays;

/**
 * DynamicArray
 */

public class DynamicArray<T> {
    Object[] data;
    int size;
    public DynamicArray() {
        size = 0;
        data = new Object[1];
    }

    public int getSize() {
        return data.length;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void put(Object element) {
        ensureCapacity(size + 1);
        data[size++] = element;

    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = getSize();
        System.out.println("Julia " + minCapacity + "" + oldCapacity);
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity; //when deletem element
            }
            data = Arrays.copyOf(data, newCapacity);
        }
    }
}
