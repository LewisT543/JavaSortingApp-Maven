package com.spartaglobal.sorting.controller;

import com.spartaglobal.sorting.models.ArrayGenerator;
import com.spartaglobal.sorting.models.ObjectFactory;
import com.spartaglobal.sorting.models.Sortable;
import com.spartaglobal.sorting.views.SorterView;

import java.util.LinkedHashMap;

import static java.lang.System.nanoTime;

public class Controller {
    private Sortable sorter;
    private final SorterView view;
    private final ArrayGenerator generator;
    private final LinkedHashMap<String, String> acceptableChoices = new LinkedHashMap<>() {{
        put("b", "BubbleSort");
        put("m", "MergeSort");
        put("q", "QuickSort");
        put("i", "InsertionSorter");
        put("x", "Exit Program");
    }};
    private final LinkedHashMap<String, Long> results = new LinkedHashMap<>();

    public Controller(SorterView view, ArrayGenerator generator) {
        this.sorter = null;
        this.view = view;
        this.generator = generator;
    }

    public void sortArray() {
        String sortType = view.getSortTypeInput(acceptableChoices);
        int arrayLength = view.getArrayLengthInput();
        sorter = ObjectFactory.createSortObject(sortType);
        int[] myArray = generator.generateIntArray(arrayLength);

        view.displayUnsortedArray(myArray);
        long start = nanoTime();
        sorter.sort(myArray);
        long stop = nanoTime();
        view.displaySortedArray(myArray, (stop - start));
        results.put(acceptableChoices.get(sortType) + ":Size(" + arrayLength + ")"  , (stop-start));
        printResults();
    }

    public void printResults() {
        int i = 1;
        for (String result : results.keySet()) {
            System.out.println(i + "). " + result + " -> " + results.get(result) + " (ns)");
            i ++;
        }
        System.out.println("");
    }

    public LinkedHashMap<String, String> getAcceptableChoices() {
        return acceptableChoices;
    }
}
