package com.spartaglobal.sorting.models;

public class ObjectFactory {
    public static Sortable createSortObject(String choice) {
        Sortable mySortType;
        switch(choice.toLowerCase()) {
            case "b" -> mySortType = new BubbleSorter();
            case "m" -> mySortType = new MergeSorter();
            case "q" -> mySortType = new QuickSorter();
            // Default to mergeSort - but I also want to keep it specifically defined.
            default -> mySortType = new MergeSorter();
        }
        System.out.println("Sort type chosen, sorter object created.");
        return mySortType;
    }
}
