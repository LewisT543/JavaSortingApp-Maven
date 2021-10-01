package com.spartaglobal.sorting.models;

public class BubbleSorterGeneric implements SortableGenerics {
    // Bubble sort Int Array
    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                // Check if arr[j] > arr[j+1], perform the swap using a temp variable
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    E temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}