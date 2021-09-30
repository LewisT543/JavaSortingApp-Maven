package com.spartaglobal.sorting.tests.models;

import com.spartaglobal.sorting.models.ArrayGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayGeneratorTest {
    @Test
    public void givenLength10_ReturnArrayLen10() {
        ArrayGenerator gen = new ArrayGenerator();
        int[] array = gen.generateIntArray(10);
        for (int number : array) {
            assertTrue(number > 0);
            assertTrue(number < 100);
        }
        assertEquals(array.length, 10);
    }
    @Test
    public void givenLength20_ReturnArrayLen20() {
        ArrayGenerator gen = new ArrayGenerator();
        int[] array = gen.generateIntArray(20);
        for (int number : array) {
            assertTrue(number > 0);
            assertTrue(number < 100);
        }
        assertEquals(array.length, 20);
    }

    @Test
    public void returnMostRecentUnsortedArrayTest() {
        ArrayGenerator myGen = new ArrayGenerator();
        int[] array = myGen.generateIntArray(10);
        assertEquals(array, myGen.getMostRecentUnsortedArray());
    }
}
