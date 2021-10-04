package com.spartaglobal.sorting.models.generics;

public class BubbleSorterGeneric implements GenericSortable {
    // Bubble sort Array
    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                // Swap here
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    var temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
