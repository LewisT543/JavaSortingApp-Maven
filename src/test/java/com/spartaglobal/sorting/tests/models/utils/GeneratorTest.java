package com.spartaglobal.sorting.tests.models.utils;

import com.spartaglobal.sorting.models.utils.Generator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratorTest {
    @Test
    public void givenLength10_ReturnArrayLen10() {
        Generator gen = new Generator();
        int[] array = gen.generateIntArray(10);
        for (int number : array) {
            assertTrue(number > 0);
            assertTrue(number < 100);
        }
        assertEquals(array.length, 10);
    }
    @Test
    public void givenLength20_ReturnArrayLen20() {
        Generator gen = new Generator();
        int[] array = gen.generateIntArray(20);
        for (int number : array) {
            assertTrue(number > 0);
            assertTrue(number < 100);
        }
        assertEquals(array.length, 20);
    }

    @Test
    public void givenLength10_ReturnIntegerArrayLen10() {
        Generator gen = new Generator();
        Integer[] array = gen.generateIntegerArray(10);
        for (Integer number : array) {
            assertTrue(number > 0);
            assertTrue(number < 100);
        }
        assertEquals(10, array.length);
    }

    @Test
    public void generateRandomStringTest() {
        Generator gen = new Generator();
        String randString = gen.generateRandomLengthRandomString();
        System.out.println(randString);
        assertAll(
                () -> assertNotNull(randString),
                () -> assertTrue(randString.length() > 4),
                () -> assertTrue(randString.length() < 16),
                () -> assertTrue(randString.matches("[a-zA-Z]+"))
        );
    }

    @Test
    public void returnMostRecentUnsortedArrayTest() {
        Generator myGen = new Generator();
        int[] array = myGen.generateIntArray(10);
        assertEquals(array, myGen.getMostRecentUnsortedIntArray());
    }
}
