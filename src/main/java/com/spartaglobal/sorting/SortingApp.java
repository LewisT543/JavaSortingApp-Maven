package com.spartaglobal.sorting;

import com.spartaglobal.sorting.models.utils.CSVWriter;
import com.spartaglobal.sorting.views.SorterView;
import com.spartaglobal.sorting.controller.Controller;
import com.spartaglobal.sorting.models.utils.Generator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SortingApp {
    private static final Logger resultsLogger = Logger.getLogger("ResultsLogger");
    public static void main(String[] args) {
        Controller controller = new Controller(new SorterView(), new Generator(), resultsLogger, new CSVWriter());
        PropertyConfigurator.configure("log4j.properties");
        controller.printWelcomeBanner();
        while (true) { controller.whichSort(); }
    }
}

