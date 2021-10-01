package com.spartaglobal.sorting.tests.models;

import com.spartaglobal.sorting.models.Generator;
import com.spartaglobal.sorting.models.InsertionSorter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertionSortTest {
    @Test
    public void givenArrayLen20_ReturnSortedLen20Array() {
        Generator arrGen = new Generator();
        int[] myArray = arrGen.generateIntArray(20);
        int[] expectedArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(expectedArray);
        InsertionSorter InsertionSort = new InsertionSorter();
        InsertionSort.sort(myArray);
        assertEquals(20, myArray.length);
        assertArrayEquals(expectedArray, myArray);
    }
    @Test
    public void givenArrayLen50_ReturnSortedLen50Array() {
        Generator arrGen = new Generator();
        int[] myArray = arrGen.generateIntArray(50);
        int[] expectedArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(expectedArray);
        InsertionSorter InsertionSort = new InsertionSorter();
        InsertionSort.sort(myArray);
        assertEquals(50, myArray.length);
        assertArrayEquals(expectedArray, myArray);
    }
    @Test
    public void givenArrayLen500_ReturnSortedLen500Array() {
        Generator arrGen = new Generator();
        int[] myArray = arrGen.generateIntArray(500);
        int[] expectedArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(expectedArray);
        InsertionSorter InsertionSort = new InsertionSorter();
        InsertionSort.sort(myArray);
        assertEquals(500, myArray.length);
        assertArrayEquals(expectedArray, myArray);
    }
}

