package com.example.datastructuresinandroid.searching;

/**
 * DataSet
 */

class DataSet {
    int[] data;
    int numberOfTriedTimes = 0;

    public DataSet(int size) {
        data = new int[size];
        for (int i = 1; i <= size; i++) {
            data[i - 1] = i;
        }
    }
}
