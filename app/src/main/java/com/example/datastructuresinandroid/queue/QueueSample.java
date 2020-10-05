package com.example.datastructuresinandroid.queue;

/**
 * QueueSample
 */

public class QueueSample<T> {
    Object[] arrayQueue;
    int reare;
    int front;
    int size;

    public QueueSample(int size) {
        this.size = size;
        arrayQueue = new Object[size];
        front = -1;
        reare = -1;
    }

    Boolean isFull() {
        return reare == size -1;
    }

    Boolean isEmpty() {
        return front == -1 || front > reare;
    }

    public void add(Object item) {
        if (!isFull()) {
            reare = reare + 1;
            arrayQueue[reare] = item;
            if (front == -1) {
                front = 0;
            }
        }
    }

    public T popQueue() {
        if (!isEmpty()) {
            T objectOut = (T) arrayQueue[front];
            front = front + 1;

            return objectOut;
        }

        return null;
    }
}
