package com.spartaglobal.sorting.tests.models.ints;

import com.spartaglobal.sorting.models.utils.Generator;
import com.spartaglobal.sorting.models.ints.MergeSorter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {
    @Test
    public void givenArrayLen20_ReturnSortedLen20Array() {
        Generator arrGen = new Generator();
        int[] myArray = arrGen.generateIntArray(20);
        int[] expectedArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(expectedArray);
        MergeSorter MergeSort = new MergeSorter();
        MergeSort.sort(myArray);
        assertEquals(20, myArray.length);
        assertArrayEquals(expectedArray, myArray);
    }
    @Test
    public void givenArrayLen50_ReturnSortedLen50Array() {
        Generator arrGen = new Generator();
        int[] myArray = arrGen.generateIntArray(50);
        int[] expectedArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(expectedArray);
        MergeSorter MergeSort = new MergeSorter();
        MergeSort.sort(myArray);
        assertEquals(50, myArray.length);
        assertArrayEquals(expectedArray, myArray);
    }
    @Test
    public void givenArrayLen500_ReturnSortedLen500Array() {
        Generator arrGen = new Generator();
        int[] myArray = arrGen.generateIntArray(500);
        int[] expectedArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(expectedArray);
        MergeSorter MergeSort = new MergeSorter();
        MergeSort.sort(myArray);
        assertEquals(500, myArray.length);
        assertArrayEquals(expectedArray, myArray);
    }
}

