package com.spartaglobal.sorting;

import com.spartaglobal.sorting.views.SorterView;
import com.spartaglobal.sorting.controller.Controller;
import com.spartaglobal.sorting.models.ArrayGenerator;

public class SortingApp {
    public static void main(String[] args) {
        // Create the controller - currently holds null as its Sorter object.
        Controller controller = new Controller(new SorterView(), new ArrayGenerator());
        // Asks for input and adds sorter object to controller based on input.

        while (true) {
            controller.sortArray();
        }
    }
}
