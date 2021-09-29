package com.spartaglobal.sorting.tests.models;

import com.spartaglobal.sorting.models.ArrayGenerator;
import com.spartaglobal.sorting.models.BubbleSorter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    @Test
    public void myBubbleSortTest() {
        ArrayGenerator arrGen = new ArrayGenerator();
        int[] myArray = arrGen.generateIntArray(10);
        int[] expectedArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(expectedArray);
        BubbleSorter bubbleSort = new BubbleSorter();
        bubbleSort.sort(myArray);
        assertArrayEquals(expectedArray, myArray);
    }
}
