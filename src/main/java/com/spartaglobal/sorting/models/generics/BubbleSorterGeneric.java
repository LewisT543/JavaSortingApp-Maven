package com.spartaglobal.sorting.models.generics;

public class BubbleSorterGeneric implements SortableGenerics {

    /* NOTE TO SELF: This generic implementation is probably going to break all my int[] sorters. Exploring using
    Integer[] instead to get around it.
    int does not have a compareTo() method, whereas Integer does. Use Integer.valueOf(int) to get an Integer version
    of and int. */

    // Bubble sort Array
    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                // Check if arr[j] > arr[j+1], perform the swap using a temp variable
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    var temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
