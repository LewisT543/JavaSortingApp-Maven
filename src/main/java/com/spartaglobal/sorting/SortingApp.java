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
/* GUI
I honestly don't think I want to do a GUI, but I could make the CLI look a bit nicer.
*/
/* On generic method migration

Finished wo Tests  - Some new controller stuff, not sure if I even need to test at all
                   - ObjectFactory needs tests written for createGenericSortObject()
Still to do        - Readme.
                   - Manually test this thing (mostly user input) and make sure nothing is breaking
Done               - ...Everything
                   - I don't know how, but I've got full generics support implemented
*/
