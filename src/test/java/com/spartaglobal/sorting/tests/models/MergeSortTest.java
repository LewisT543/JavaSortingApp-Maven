package com.spartaglobal.sorting.tests.models;

import com.spartaglobal.sorting.models.ArrayGenerator;
import com.spartaglobal.sorting.models.MergeSorter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {
    @Test
    public void myMergeSortTest() {
        ArrayGenerator arrGen = new ArrayGenerator();
        int[] myArray = arrGen.generateIntArray(10);
        int[] expectedArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(expectedArray);
        MergeSorter MergeSort = new MergeSorter();
        MergeSort.sort(myArray);
        assertArrayEquals(expectedArray, myArray);
    }
}
