package com.spartaglobal.sorting.tests.models.generics;

import com.spartaglobal.sorting.models.generics.InsertionSorterGeneric;
import com.spartaglobal.sorting.models.Generator;
import com.spartaglobal.sorting.models.sortableObjects.Person;
import com.spartaglobal.sorting.models.sortableObjects.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class InsertionSorterGenericTest {
    @Test
    public void insertionSortGenericsRectangle() {
        Rectangle[] rectArray = new Rectangle[] {
                new Rectangle(2, 6),
                new Rectangle(2, 5),
                new Rectangle(2, 4)};
        Rectangle[] rectArray2 = new Rectangle[rectArray.length];
        System.arraycopy(rectArray, 0, rectArray2, 0, rectArray.length);
        InsertionSorterGeneric insertSortGen = new InsertionSorterGeneric();
        Arrays.sort(rectArray2);
        insertSortGen.sort(rectArray);
        Assertions.assertEquals(Arrays.toString(rectArray2), Arrays.toString(rectArray));
    }

    @Test
    public void insertionSortGenericsRandomGenLen20Rectangle() {
        Generator gen = new Generator();
        Rectangle[] rectArray = gen.generateRectArray(20);
        Rectangle[] rectArray2 = new Rectangle[20];
        System.arraycopy(rectArray, 0, rectArray2, 0, rectArray.length);

        InsertionSorterGeneric insertSortGen = new InsertionSorterGeneric();
        insertSortGen.sort(rectArray);
        Arrays.sort(rectArray2);
        System.out.println("       MySort: " + Arrays.toString(rectArray));
        System.out.println("Arrays.sort(): " + Arrays.toString(rectArray2));
        Assertions.assertEquals(Arrays.toString(rectArray2), Arrays.toString(rectArray));
    }

    @Test
    public void insertionSortGenericsRandomGenLen100Rectangle() {
        Generator gen = new Generator();
        Rectangle[] rectArray = gen.generateRectArray(100);
        Rectangle[] rectArray2 = new Rectangle[100];
        System.arraycopy(rectArray, 0, rectArray2, 0, rectArray.length);

        InsertionSorterGeneric insertSortGen = new InsertionSorterGeneric();
        insertSortGen.sort(rectArray);
        Arrays.sort(rectArray2);
        System.out.println("       MySort: " + Arrays.toString(rectArray));
        System.out.println("Arrays.sort(): " + Arrays.toString(rectArray2));
        Assertions.assertEquals(Arrays.toString(rectArray2), Arrays.toString(rectArray));
    }

    @Test
    public void insertionSortGenericsPerson() {
        Person[] personsArray = new Person[] {
                new Person(2, "Jeff", 175),
                new Person(2, "Tim", 188),
                new Person(2, "Rodge", 160)};
        Person[] personsArray2 = new Person[personsArray.length];
        System.arraycopy(personsArray, 0, personsArray2, 0, personsArray.length);
        InsertionSorterGeneric insertSortGen = new InsertionSorterGeneric();
        Arrays.sort(personsArray2);
        insertSortGen.sort(personsArray);
        Assertions.assertEquals(Arrays.toString(personsArray2), Arrays.toString(personsArray));
    }

    @Test
    public void insertionSortGenericsRandomGenLen20Person() {
        Generator gen = new Generator();
        Person[] personArray = gen.generatePeopleArray(20);
        Person[] personArray2 = new Person[20];
        System.arraycopy(personArray, 0, personArray2, 0, personArray.length);
        InsertionSorterGeneric insertSortGen = new InsertionSorterGeneric();
        insertSortGen.sort(personArray);
        Arrays.sort(personArray2);
        System.out.println("       MySort: " + Arrays.toString(personArray));
        System.out.println("Arrays.sort(): " + Arrays.toString(personArray2));
        Assertions.assertEquals(Arrays.toString(personArray2), Arrays.toString(personArray));
    }

    @Test
    public void insertionSortGenericsRandomGenLen100Person() {
        Generator gen = new Generator();
        Person[] personArray = gen.generatePeopleArray(100);
        Person[] personArray2 = new Person[100];
        System.arraycopy(personArray, 0, personArray2, 0, personArray.length);
        InsertionSorterGeneric insertSortGen = new InsertionSorterGeneric();
        insertSortGen.sort(personArray);
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

        InsertionSorterGeneric sorter = new InsertionSorterGeneric();

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