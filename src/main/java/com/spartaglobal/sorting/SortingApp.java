package com.spartaglobal.sorting;

import com.spartaglobal.sorting.models.CSVWriter;
import com.spartaglobal.sorting.views.SorterView;
import com.spartaglobal.sorting.controller.Controller;
import com.spartaglobal.sorting.models.ArrayGenerator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SortingApp {
    private static final Logger resultsLogger = Logger.getLogger("ResultsLogger");
    public static void main(String[] args) {
        // Create the controller - currently holds null as its Sorter object.
        Controller controller = new Controller(new SorterView(), new ArrayGenerator(), resultsLogger, new CSVWriter());
        PropertyConfigurator.configure("log4j.properties");
        // Asks for input and adds sorter object to controller based on input.
        while (true) { controller.sortArray(); }
    }
}
