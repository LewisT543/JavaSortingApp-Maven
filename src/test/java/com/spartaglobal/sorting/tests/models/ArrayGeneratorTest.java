package com.spartaglobal.sorting.tests.models;

import com.spartaglobal.sorting.models.ArrayGenerator;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class ArrayGeneratorTest {
    @Test
    public void generateIntArrayTest() {
        int length = 10;
        ArrayGenerator myGen = new ArrayGenerator();
        int[] array = myGen.generateIntArray(length);
        for (int number : array) {
            assertTrue(number > 0);
            assertTrue(number < 100);
        }
        assertEquals(array.length, length);
    }

    @Test
    public void getRecentArrayTest() {
        ArrayGenerator myGen = new ArrayGenerator();
        int[] array = myGen.generateIntArray(10);
        assertEquals(array, myGen.getMostRecentUnsortedArray());
    }
}
