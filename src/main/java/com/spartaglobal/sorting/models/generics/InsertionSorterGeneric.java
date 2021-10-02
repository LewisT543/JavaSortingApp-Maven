package com.spartaglobal.sorting.models.generics;

public class InsertionSorterGeneric implements SortableGenerics {
    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            var key = arr[i];
            int j = i - 1;
            while (j >= 0 && (arr[j].compareTo(key) > 0)) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
