package com.example.datastructuresinandroid.sorting;

import java.util.Arrays;

/**
 * HeapSort
 */

public class HeapSort {
    int total;

    public HeapSort() {
        Integer[] array = new Integer[]{4, 2, 5, 1, 6, 3,9};
        this.total = array.length;
        sort(array);
    }

    void heapfy(Comparable[] arr, int i) {
        int left = i * 2;
        int right = i * 2 + 1;
        int parent = i;

        if (left <= total && arr[left].compareTo(arr[parent]) >= 0) {
            //Means: left node is bigger than the parent
            parent = left;
        }

        if (right <= total && arr[right].compareTo(arr[parent]) >= 0) {
            //Means: right node is bigger than the parent
            parent = right;
        }

        if (parent != i) {
            swap(arr, i, parent);
            heapfy(arr, parent);
        }
    }

    private void swap(Comparable[] arr, int a, int b) {
        Comparable temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    private void sort(Comparable[] arr) {
        total = arr.length - 1;
        for (int i = total / 2; i >= 0; i--) {
            heapfy(arr, i);
        }

        for (int i = total; i > 0; i--) {
            swap(arr, 0, i);
            total--;
            heapfy(arr, 0);
        }

        System.out.println("Julia heapsort: " + Arrays.toString(arr));
    }
}
