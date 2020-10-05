package com.example.datastructuresinandroid.searching;

/**
 * InterpolationSearch
 */

class InterpolationSearch {
    public InterpolationSearch() {
        DataSet dataset = new DataSet(100000);
        int search=9000;

        searchInArray(dataset, false, search);

    }

    private void searchInArray(DataSet dataSet, Boolean isFound, int searchNum) {
        int low = 0;
        int high = dataSet.data.length - 1;
        int mid = 0;

        while (!isFound) {
            if (low < high) {
                System.out.println("Number is not in the search");
            }
            mid = low + ((high - low)/(dataSet.data[high] - dataSet.data[low]))*(searchNum - dataSet.data[low]);
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
