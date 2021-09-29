package com.spartaglobal.sorting.tests.views;

import com.spartaglobal.sorting.views.SorterView;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;

public class SorterViewTest {
    @Test
    public void getSortTypeInputTest() {
        SorterView view = new SorterView();
        LinkedHashMap<String, String> exampleChoices = new LinkedHashMap<>() {{
            put("b", "BubbleSort");
            put("m", "MergeSort");
            put("q", "QuickSort");
            put("x", "Exit Program");
        }};
        view.getSortTypeInput(exampleChoices)
        // choices
    }
}
