package com.spartaglobal.sorting.tests.views;

import com.spartaglobal.sorting.controller.Controller;
import com.spartaglobal.sorting.models.ArrayGenerator;
import com.spartaglobal.sorting.views.SorterView;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class SorterViewTest {
    @Test
    public void getSortTypeInputTest() {
        SorterView view = new SorterView();
        Controller controller = new Controller(view, new ArrayGenerator());
        LinkedHashMap<String, String> choices = controller.getAcceptableChoices();

        // This is wrong, because I have no way of deciding which input will be returned.
        String choice = view.getSortTypeInput(choices);

        Assertions.assertAll(
                // Do thing.
        );
    }
}
