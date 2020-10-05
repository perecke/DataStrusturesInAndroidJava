package com.example.datastructuresinandroid.searching;


import android.service.autofill.Dataset;

/**
 * BinarySearch
 */

public class BinarySearch {
    public BinarySearch() {
        DataSet dataset = new DataSet(100000);
        int search=9000;
        Boolean isFound = false;

        searchInArray(dataset, isFound, search);

    }

    private void searchInArray(DataSet dataSet, Boolean isFound, int searchNum) {
        int low = 0;
        int high = dataSet.data.length - 1;
        int mid = 0;

        while (!isFound) {
            if (low < high) {
                System.out.println("Number is not in the search");
            }
            mid = low + ((high - low)/2);
            int currentNumber = dataSet.data[mid];

            if (currentNumber == searchNum) {
                isFound = true;
                System.out.println("Julia binarySearch: " + dataSet.numberOfTriedTimes);
            } else if (currentNumber < searchNum) {
                if (mid + 1 < dataSet.data.length - 1) {
                    low = mid + 1;
                    dataSet.numberOfTriedTimes++;
                }
            } else if(currentNumber > searchNum) {
                if (mid - 1 >= 0) {
                    high = mid - 1;
                    dataSet.numberOfTriedTimes++;
                }

            }
        }

    }
}
