package com.spartaglobal.sorting.tests.models;

import com.spartaglobal.sorting.models.BubbleSorterGeneric;
import com.spartaglobal.sorting.models.Generator;
import com.spartaglobal.sorting.models.sortableObjects.Person;
import com.spartaglobal.sorting.models.sortableObjects.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSorterGenericTest {
    @Test
    public void bubbleSortGenericsRectangle() {
        Rectangle[] rectArray = new Rectangle[] {
                new Rectangle(2, 6),
                new Rectangle(2, 5),
                new Rectangle(2, 4)};
        Rectangle[] rectArray2 = new Rectangle[rectArray.length];
        System.arraycopy(rectArray, 0, rectArray2, 0, rectArray.length);
        BubbleSorterGeneric bubSortGen = new BubbleSorterGeneric();
        Arrays.sort(rectArray2);
        bubSortGen.sort(rectArray);
        Assertions.assertEquals(Arrays.toString(rectArray2), Arrays.toString(rectArray));
    }

    @Test
    public void bubbleSortGenericsRandomGenLen20Rectangle() {
        Rectangle[] rectArray = new Rectangle[20];
        Rectangle[] rectArray2 = new Rectangle[20];
        for (int i = 0; i < 20; i++) {
            int num1 = (int)(Math.random() * 100);
            int num2 = (int)(Math.random() * 100);
            rectArray[i]  = new Rectangle(num1, num2);
            rectArray2[i] = new Rectangle(num1, num2);
        }
        BubbleSorterGeneric bubSortGen = new BubbleSorterGeneric();
        bubSortGen.sort(rectArray);
        Arrays.sort(rectArray2);
        System.out.println("       MySort: " + Arrays.toString(rectArray));
        System.out.println("Arrays.sort(): " + Arrays.toString(rectArray2));
        Assertions.assertEquals(Arrays.toString(rectArray2), Arrays.toString(rectArray));
    }

    @Test
    public void bubbleSortGenericsRandomGenLen100Rectangle() {
        Rectangle[] rectArray = new Rectangle[100];
        Rectangle[] rectArray2 = new Rectangle[100];
        for (int i = 0; i < 100; i++) {
            int num1 = (int)(Math.random() * 100);
            int num2 = (int)(Math.random() * 100);
            rectArray[i]  = new Rectangle(num1, num2);
            rectArray2[i] = new Rectangle(num1, num2);
        }
        BubbleSorterGeneric bubSortGen = new BubbleSorterGeneric();
        bubSortGen.sort(rectArray);
        Arrays.sort(rectArray2);
        System.out.println("       MySort: " + Arrays.toString(rectArray));
        System.out.println("Arrays.sort(): " + Arrays.toString(rectArray2));
        Assertions.assertEquals(Arrays.toString(rectArray2), Arrays.toString(rectArray));
    }

    @Test
    public void bubbleSortGenericsPerson() {
        Person[] personsArray = new Person[] {
                new Person(2, "Jeff", 175),
                new Person(2, "Tim", 188),
                new Person(2, "Rodge", 160)};
        Person[] personsArray2 = new Person[personsArray.length];
        System.arraycopy(personsArray, 0, personsArray2, 0, personsArray.length);
        BubbleSorterGeneric bubSortGen = new BubbleSorterGeneric();
        Arrays.sort(personsArray2);
        bubSortGen.sort(personsArray);
        Assertions.assertEquals(Arrays.toString(personsArray2), Arrays.toString(personsArray));
    }

    @Test
    public void bubbleSortGenericsRandomGenLen20Person() {
        Generator gen = new Generator();
        Person[] personArray = new Person[20];
        Person[] personArray2 = new Person[20];
        for (int i = 0; i < 20; i++) {
            int num1 = (int)(Math.random() * 200);
            String randomName = gen.generateRandomLengthRandomString();
            personArray[i]  = new Person(i, randomName, num1);
            personArray2[i] = new Person(i, randomName, num1);
        }
        BubbleSorterGeneric bubSortGen = new BubbleSorterGeneric();
        bubSortGen.sort(personArray);
        Arrays.sort(personArray2);
        System.out.println("       MySort: " + Arrays.toString(personArray));
        System.out.println("Arrays.sort(): " + Arrays.toString(personArray2));
        Assertions.assertEquals(Arrays.toString(personArray2), Arrays.toString(personArray));
    }

    @Test
    public void bubbleSortGenericsRandomGenLen100Person() {
        Generator gen = new Generator();
        Person[] personArray = new Person[100];
        Person[] personArray2 = new Person[100];
        for (int i = 0; i < 100; i++) {
            int num1 = (int)(Math.random() * 200);
            String randomName = gen.generateRandomLengthRandomString();
            personArray[i]  = new Person(i, randomName, num1);
            personArray2[i] = new Person(i, randomName, num1);
        }
        BubbleSorterGeneric bubSortGen = new BubbleSorterGeneric();
        bubSortGen.sort(personArray);
        Arrays.sort(personArray2);
        System.out.println("       MySort: " + Arrays.toString(personArray));
        System.out.println("Arrays.sort(): " + Arrays.toString(personArray2));
        Assertions.assertEquals(Arrays.toString(personArray2), Arrays.toString(personArray));
    }

    @Test
    public void theGenericSortWithIntProblem () {
        Generator gen = new Generator();
        Person[] personsArray = new Person[] {
                new Person(1, "Jeff", 175),
                new Person(2, "Tim", 188),
                new Person(3, "Rodge", 160),
                new Person(4, "Simon", 165),
                new Person(5, "Alan", 165),
        };
        Rectangle[] rectangleArray = new Rectangle[] {
                new Rectangle(5, 10),
                new Rectangle(5, 12),
                new Rectangle( 5, 15),
                new Rectangle(5, 11),
                new Rectangle( 5, 13)
        };
        int[] intArray = new int[] { 3, 5, 4 , 6, 0 };

        BubbleSorterGeneric sorter = new BubbleSorterGeneric();

        sorter.sort(personsArray);
        sorter.sort(rectangleArray);
        // Not quite sure how this works, but it does exactly what I want it to.

        Integer[] integerArray = Arrays.stream( intArray ).boxed().toArray( Integer[]::new );
        sorter.sort(integerArray);

        System.out.println(Arrays.toString(personsArray));
        System.out.println(Arrays.toString(rectangleArray));
        System.out.println(Arrays.toString(integerArray));

    }
}
