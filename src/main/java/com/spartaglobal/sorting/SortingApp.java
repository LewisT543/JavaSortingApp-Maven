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
/* GUI
I honestly don't think I want to do a GUI, but I could make the CLI look WAAAAAY nicer. Tables and the like.
*/
/* Generics... I think...
In order to implement generic typed sorting, it would require each object class to implement Comparable<T>.
Within this interface we would define the method signature for isEqual(), lessThan(), greaterThan(). This would force
us to implement these methods within the new object classes. e.g. Rectangle would have a lessThan(this, other) method.
This means that the implementation of our sorting algorithms doesn't need to change at all, we just need to add the
Comparable interface and change the typing in the methods to <E>.
*/
