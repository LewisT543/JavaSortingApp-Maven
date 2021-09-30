package com.spartaglobal.sorting.controller;

import com.spartaglobal.sorting.models.ArrayGenerator;
import com.spartaglobal.sorting.models.CSVWriter;
import com.spartaglobal.sorting.models.ObjectFactory;
import com.spartaglobal.sorting.models.Sortable;
import com.spartaglobal.sorting.views.SorterView;
import org.apache.log4j.Logger;

import java.util.LinkedHashMap;

import static java.lang.System.nanoTime;

public class Controller {
    private Sortable sorter;
    private final SorterView view;
    private final ArrayGenerator generator;
    private final Logger logger;
    private final CSVWriter fileWriter;
    private final LinkedHashMap<String, String> acceptableChoices = new LinkedHashMap<>() {{
        put("b", "BubbleSort");
        put("m", "MergeSort");
        put("q", "QuickSort");
        put("i", "InsertionSorter");
        put("x", "Exit Program");
    }};
    private final LinkedHashMap<String, Long> results = new LinkedHashMap<>();

    public Controller(SorterView view, ArrayGenerator generator, Logger logger, CSVWriter fileWriter) {
        this.sorter = null;
        this.view = view;
        this.generator = generator;;
        this.logger = logger;
        this.fileWriter = fileWriter;
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
        long timeTaken = stop - start;
        view.displaySortedArray(myArray, timeTaken);
        String resultString = acceptableChoices.get(sortType) + ":Size(" + arrayLength + ")";
        results.put(resultString, timeTaken);
        logger.info((resultString + " -> " + timeTaken + " (ns)"));
        fileWriter.writeResultToFile(resultString, timeTaken);
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
