package com.spartaglobal.sorting.models.ints;

public class BubbleSorter implements Sortable {
    // Bubble sort Int Array
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                // Swap here
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
