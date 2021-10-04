package com.spartaglobal.sorting.models.utils;

import com.spartaglobal.sorting.models.generics.*;
import com.spartaglobal.sorting.models.ints.Sortable;
import com.spartaglobal.sorting.models.ints.*;

public class ObjectFactory {
    public static Sortable createSortObject(String choice) {
        Sortable mySortType;
        switch(choice.toLowerCase()) {
            case "b" -> mySortType = new BubbleSorter();
            case "m" -> mySortType = new MergeSorter();
            case "q" -> mySortType = new QuickSorter();
            case "i" -> mySortType = new InsertionSorter();
            case "bt" -> mySortType = new BinaryTreeSorter();
            // Default to mergeSort - but I also want to keep it specifically defined.
            default -> mySortType = new MergeSorter();
        }
        System.out.println("Sort type chosen, sorter object created.");
        return mySortType;
    }
    public static GenericSortable createGenericSortObject(String choice) {
        GenericSortable mySortType;
        switch(choice.toLowerCase()) {
            case "b" -> mySortType = new BubbleSorterGeneric();
            case "m" -> mySortType = new MergeSorterGeneric<>();
            case "q" -> mySortType = new QuickSorterGeneric<>();
            case "i" -> mySortType = new InsertionSorterGeneric();
            // Default to mergeSort
            default -> mySortType = new MergeSorterGeneric<>();
        }
        System.out.println("Sort type chosen, sorter object created.");
        return mySortType;
    }

}
