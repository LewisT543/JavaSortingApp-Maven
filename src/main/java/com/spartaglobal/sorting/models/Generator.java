package com.spartaglobal.sorting.models;

import com.spartaglobal.sorting.models.sortableObjects.Person;
import com.spartaglobal.sorting.models.sortableObjects.Rectangle;

import java.util.Random;

public class Generator {
    // Not currently used but might be at some point
    private int[] mostRecentUnsortedIntArray;
    private Object[] mostRecentUnsortedObjectArray;
    private final char[] charChoices = new char[] {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };
    // Generate array of random ints
    public int[] generateIntArray(int arrayLength) {
        int[] myArr = new int[arrayLength];
        Random r = new Random();
        for (int i = 0; i < arrayLength; i++) {
            myArr[i] = r.nextInt(100);
        }
        mostRecentUnsortedIntArray = myArr;
        return myArr;
    }
// -----------------------------------------------------------//
    public Integer[] generateIntegerArray(int arrayLength) {
        Integer[] myArr = new Integer[arrayLength];
        Random r = new Random();
        for (int i = 0; i < arrayLength; i++) {
            myArr[i] = (int) (Math.random() * 100) + 1;
        }
        mostRecentUnsortedObjectArray = myArr;
        return myArr;
    }
//
    public Rectangle[] generateRectArray(int arrayLength) {
        Rectangle[] myArr = new Rectangle[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            myArr[i] = new Rectangle((int)(Math.random() * 100) + 1, (int)(Math.random() * 100) + 1);
        }
        mostRecentUnsortedObjectArray = myArr;
        return myArr;
    }
//
    public Person[] generatePeopleArray(int arrayLength) {
        Person[] myArr = new Person[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            myArr[i] = new Person(i, generateRandomLengthRandomString(), (int)(Math.random() * 200) + 1);
        }
        mostRecentUnsortedObjectArray = myArr;
        return myArr;
    }
// --------------------------------------------------------- //
    public String generateRandomLengthRandomString() {
        int length = (int)(Math.random() * 10) + 5;
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= length; i++) {
            str.append(charChoices[(int)(Math.random() * charChoices.length)]);
        }
        return str.toString();
    }

    public int[] getMostRecentUnsortedIntArray() {
        return mostRecentUnsortedIntArray;
    }
    public Object[] getMostRecentUnsortedObjectArray() {
        return mostRecentUnsortedObjectArray;
    }
}
