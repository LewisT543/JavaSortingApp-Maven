package com.spartaglobal.sorting.tests.models;

import com.spartaglobal.sorting.models.ArrayGenerator;
import com.spartaglobal.sorting.models.InsertionSorter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {
    @Test
    public void myInsertionSortTest() {
        ArrayGenerator arrGen = new ArrayGenerator();
        int[] myArray = arrGen.generateIntArray(10);
        int[] expectedArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(expectedArray);
        InsertionSorter InsertionSort = new InsertionSorter();
        InsertionSort.sort(myArray);
        assertArrayEquals(expectedArray, myArray);
    }
}
