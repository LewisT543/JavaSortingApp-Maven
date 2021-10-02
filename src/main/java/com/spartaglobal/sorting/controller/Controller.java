package com.spartaglobal.sorting.controller;

import com.spartaglobal.sorting.models.generics.SortableGenerics;
import com.spartaglobal.sorting.models.ints.Sortable;
import com.spartaglobal.sorting.models.utils.CSVWriter;
import com.spartaglobal.sorting.models.utils.Generator;
import com.spartaglobal.sorting.models.utils.ObjectFactory;
import com.spartaglobal.sorting.views.SorterView;
import org.apache.log4j.Logger;

import java.util.LinkedHashMap;

// Update for logger, add a unique ID using date and time strings -> remove punctuation and turn into 1 int.

public class Controller {
    private Sortable sorter;
    private SortableGenerics genericSorter;
    private final SorterView view;
    private final Generator generator;
    private final Logger logger;
    private final CSVWriter fileWriter;
    private final LinkedHashMap<String, String> INT_SORT_CHOICES = new LinkedHashMap<>() {{
        put("b", "BubbleSort");
        put("m", "MergeSort");
        put("q", "QuickSort");
        put("i", "InsertionSorter");
        put("bt", "BinaryTree");
        put("x", "Exit Program");
    }};
    // This is not ideal, but I couldn't think of a clever way to exclude BinaryTree as an option.
    private final LinkedHashMap<String, String> OBJ_SORT_CHOICES = new LinkedHashMap<>() {{
        put("b", "BubbleSort");
        put("m", "MergeSort");
        put("q", "QuickSort");
        put("i", "InsertionSorter");
        put("x", "Exit Program");
    }};
    private final LinkedHashMap<String, String> OBJECT_CHOICES = new LinkedHashMap<>() {{
        put("i", "Integers");
        put("r", "Rectangles");
        put("p", "People");
        put("x", "Exit Program");
    }};
    private final LinkedHashMap<String, String> ARRAY_TYPES = new LinkedHashMap<>() {{
        put("i", "int[]");
        put("o", "object[]");
        put("x", "Exit Program");
    }};
    private final LinkedHashMap<String, Long> results = new LinkedHashMap<>();

    public Controller(SorterView view, Generator generator, Logger logger, CSVWriter fileWriter) {
        this.sorter = null;
        this.view = view;
        this.generator = generator;;
        this.logger = logger;
        this.fileWriter = fileWriter;
    }
    // Add a method to determine int[] or object[], which calls the appropriate method.
    public void whichSort() {
        String sortChoice = view.getInput(ARRAY_TYPES,"int[]'s or object[]'s to sort");
        switch (sortChoice) {
            case "i" -> sortIntArray();
            case "o" -> sortObjArray();
            default -> sortObjArray();
        };
    }

    public void sortIntArray() {
        // Get and set sort type
        String sortType = view.getInput(INT_SORT_CHOICES, "a sorting algorithm");
        sorter = ObjectFactory.createSortObject(sortType);
        // Get array length and generate int[] array
        int arrayLength = view.getArrayLengthInput();
        int[] myArray = generator.generateIntArray(arrayLength);

        view.displayUnsortedArray(myArray);
        long start = System.nanoTime();
        sorter.sort(myArray);
        long stop = System.nanoTime();
        long timeTaken = stop - start;
        view.displaySortedArray(myArray, timeTaken);
        String resultString = INT_SORT_CHOICES.get(sortType) + ":Size(" + arrayLength + ")";
        results.put(resultString, timeTaken);
        logger.info((resultString + " -> " + timeTaken + " (ns)"));
        fileWriter.writeResultToFile(resultString, timeTaken);
        printResults();
    }

    // Why comparable? <E> on its own should work?
    public <E extends Comparable <E>> void sortObjArray() {
        String sortType = view.getInput(OBJ_SORT_CHOICES, "a sorting algorithm");
        genericSorter = ObjectFactory.createGenericSortObject(sortType);
        int arrayLength = view.getArrayLengthInput();
        String objectType = view.getInput(OBJECT_CHOICES, "an object type");
        Object[] myArray = null;
        switch (objectType) {
            case "r" -> myArray = generator.generateRectArray(arrayLength);
            case "p" -> myArray = generator.generatePeopleArray(arrayLength);
            default -> myArray = generator.generateIntegerArray(arrayLength);
        }
        view.displayUnsortedObjArray(myArray);
        long start = System.nanoTime();
        genericSorter.sort((E[]) myArray); // Object[] -> E[] casting. No idea what could go wrong here.
        long stop = System.nanoTime();
        long timeTaken = stop - start;
        view.displaySortedObjArray(myArray, timeTaken);
        String resultString = INT_SORT_CHOICES.get(sortType) + "||" + OBJECT_CHOICES.get(objectType) +
                ":Size(" + arrayLength + ")";
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

    public void printWelcomeBanner() {
        view.printWelcomeBanner();
    }
}
