package com.example.datastructuresinandroid.sorting;

import java.util.Arrays;

/**
 * SelectionSorting
 */
public class SelectionSorting {
    public SelectionSorting() {
        sortArray(new int[]{4, 2, 5, 1, 6, 3, 9});
    }

    private void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }

            if (index != i) {
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("Julia selection sort: " + Arrays.toString(array));
    }

}
