package com.spartaglobal.sorting.models;

public class QuickSorter implements Sortable {
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static int partition(int[] arr, int low, int high) {
        // Method in charge of splitting the array and deciding which direction the numbers need to go in
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high -1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, (i + 1), high);
        return (i + 1);
    }
}
