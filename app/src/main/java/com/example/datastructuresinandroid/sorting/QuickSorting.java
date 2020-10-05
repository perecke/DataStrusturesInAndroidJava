package com.example.datastructuresinandroid.sorting;

import java.util.Arrays;

/**
 * QuickSorting
 */
public class QuickSorting {

    public QuickSorting() {
        int[] array = new int[]{4, 2, 5, 1, 6, 3, 9};
        quickSorting(array, 0, array.length - 1);
        System.out.println("Julia quick sort: " + Arrays.toString(array));
    }

    private void quickSorting(int[] array, int low, int high) {
        if (low > high) return;
        int mid = low + ((high - low)/2);
        int pivot = array[mid];
        int i = low;
        int j = high;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSorting(array, low, j);
        }
        if (high > i) {
            quickSorting(array, i, high);
        }
    }
}
