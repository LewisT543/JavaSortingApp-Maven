package com.spartaglobal.sorting.tests.models;

import com.spartaglobal.sorting.models.Generator;
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
    public void generateRandomStringTest() {
        Generator gen = new Generator();
        String randString = gen.generateRandomLengthRandomString();
        System.out.println(randString);
        assertAll(
                () -> assertNotNull(randString),
                () -> assertTrue(randString.length() > 0),
                () -> assertTrue(randString.length() < 11),
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