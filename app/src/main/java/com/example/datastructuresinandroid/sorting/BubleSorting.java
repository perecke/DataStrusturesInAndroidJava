package com.example.datastructuresinandroid.sorting;

import java.util.Arrays;

/**
 * BubbleSorting
 */

public class BubleSorting {
    public BubleSorting() {
        sortArray(new int[]{4, 2, 5, 1, 6, 3, 9});
    }

    private void sortArray(int[] dataSetSorting) {

        for (int i = 0; i < dataSetSorting.length; i++) {
            for (int j = 1; j < dataSetSorting.length - i; j++) {
                if (dataSetSorting[j - 1] > dataSetSorting[j]) {
                    int temp = dataSetSorting[j - 1];
                    dataSetSorting[j - 1] = dataSetSorting[j];
                    dataSetSorting[j] = temp;
                }
            }
        }

        System.out.println("Julia buble sort: " + Arrays.toString(dataSetSorting));
    }
}
