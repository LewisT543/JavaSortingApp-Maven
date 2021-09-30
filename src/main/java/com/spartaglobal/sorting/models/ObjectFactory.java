package com.spartaglobal.sorting.models;

public class ObjectFactory {
    public static Sortable createSortObject(String choice) {
        // This is the sorter factory that will be in charge of creating a sorter object
        Sortable mySortType;
        switch(choice.toLowerCase()) {
            case "b" -> mySortType = new BubbleSorter();
            case "m" -> mySortType = new MergeSorter();
            case "q" -> mySortType = new QuickSorter();
            case "i" -> mySortType = new InsertionSorter();
            // Default to mergeSort - but I also want to keep it specifically defined.
            default -> mySortType = new MergeSorter();
        }
        System.out.println("Sort type chosen, sorter object created.");
        return mySortType;
    }
}
