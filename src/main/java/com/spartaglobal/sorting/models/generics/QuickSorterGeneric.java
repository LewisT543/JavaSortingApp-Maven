package com.spartaglobal.sorting.models.generics;

public class QuickSorterGeneric <T extends Comparable<T>> implements GenericSortable {
    @Override
    public <E extends Comparable<E>> void sort(E[] array) {
        quicksort((T[]) array, 0, array.length - 1);
    }
    private void quicksort(T[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = partition(array, startIndex, endIndex);
            // sort the left sub-array
            quicksort(array, startIndex, pivotIndex);
            // sort the right sub-array
            quicksort(array, pivotIndex + 1, endIndex);
        }
    }

    private int partition(T[] array, int startIndex, int endIndex) {
        int pivotIndex = (startIndex + endIndex) / 2;
        T pivotValue = array[pivotIndex];
        startIndex--;
        endIndex++;
        while (true) {
            // Start at the first index of the sub-array and increment
            // forward until we find a value that is > pivotValue
            do startIndex++;
            while (array[startIndex].compareTo(pivotValue) < 0) ;
            // Start at the last index of the sub-array and increment
            // backwards until we find a value that is < pivotValue
            do endIndex--;
            while (array[endIndex].compareTo(pivotValue) > 0) ;
            if (startIndex >= endIndex) return endIndex;
            T temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
        }
    }
}
