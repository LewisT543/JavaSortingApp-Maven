package com.spartaglobal.sorting.models;

import java.util.Random;

public class ArrayGenerator {
    // Not currently used but might be at some point
    private int[] mostRecentUnsortedArray;
    // Generate array of random ints
    public int[] generateIntArray(int arrayLength) {
        int[] myArr = new int[arrayLength];
        Random r = new Random();
        for (int i = 0; i < arrayLength; i++) {
            myArr[i] = r.nextInt(100);
        }
        mostRecentUnsortedArray = myArr;
        return myArr;
    }

    public int[] getMostRecentUnsortedArray() {
        return mostRecentUnsortedArray;
    }
}
