package com.spartaglobal.sorting.tests.models;

import com.spartaglobal.sorting.models.ArrayGenerator;
import com.spartaglobal.sorting.models.QuickSorter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {
    @Test
    public void myQuickSortTest() {
        ArrayGenerator arrGen = new ArrayGenerator();
        int[] myArray = arrGen.generateIntArray(10);
        int[] expectedArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(expectedArray);
        QuickSorter QuickSort = new QuickSorter();
        QuickSort.sort(myArray);
        assertArrayEquals(expectedArray, myArray);
    }
}
