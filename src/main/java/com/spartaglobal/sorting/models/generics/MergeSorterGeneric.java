package com.spartaglobal.sorting.models.generics;

public class MergeSorterGeneric <T extends Comparable<T>> implements SortableGenerics {
    @Override
    public <E extends Comparable<E>> void sort(E[] array) {
        mergeSort((T[]) array, 0, array.length - 1);
    }

    void mergeSort(T[] array, int start, int end)
    {
        if (start < end)
        {
            int middle = (start + end) / 2;
            mergeSort(array, start, middle); // sort first half
            mergeSort(array, middle + 1, end);  // sort second half
            merge(array, start, middle, end);
        }
    }
    // merges two subarrays of array[].
    void merge(T[] array, int start, int middle, int end) {
        T[] leftArray  = (T[]) new Comparable[middle - start + 1];
        T[] rightArray = (T[]) new Comparable[end - middle];
        // fill in left array
        for (int i = 0; i < leftArray.length; ++i)
            leftArray[i] = array[start + i];
        // fill in right array
        for (int i = 0; i < rightArray.length; ++i)
            rightArray[i] = array[middle + 1 + i];

        /* Merge the temp arrays */
        int leftIndex = 0, rightIndex = 0;
        int currentIndex = start;
        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0) {
                array[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }
        while (leftIndex < leftArray.length) array[currentIndex++] = leftArray[leftIndex++];
        while (rightIndex < rightArray.length) array[currentIndex++] = rightArray[rightIndex++];
    }
}

