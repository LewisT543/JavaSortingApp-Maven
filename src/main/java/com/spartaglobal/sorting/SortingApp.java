package com.spartaglobal.sorting;

import com.spartaglobal.sorting.models.CSVWriter;
import com.spartaglobal.sorting.views.SorterView;
import com.spartaglobal.sorting.controller.Controller;
import com.spartaglobal.sorting.models.Generator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SortingApp {
    private static final Logger resultsLogger = Logger.getLogger("ResultsLogger");
    public static void main(String[] args) {
        Controller controller = new Controller(new SorterView(), new Generator(), resultsLogger, new CSVWriter());
        PropertyConfigurator.configure("log4j.properties");
        while (true) { controller.sortArray(); }
    }
}
/* GUI
I honestly don't think I want to do a GUI, but I could make the CLI look a bit nicer.
*/
/* On generic method migration
Almost implemented - add in functionality or at least conversion methods for Integer[] typing instead of int[].
Finished wo Tests  - some generators need testing more rigorously
Still to do        - BTS, Insertion, Merge, Quick
                   - ReadMe...
Done               - BubbleSortGeneric + tests
                   - controller and views methods updated for Object[] typing
*/
