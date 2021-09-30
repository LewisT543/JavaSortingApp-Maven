package com.spartaglobal.sorting.tests.models;

import com.spartaglobal.sorting.models.Sortable;
import org.junit.jupiter.api.Test;

import static com.spartaglobal.sorting.models.ObjectFactory.createSortObject;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ObjectFactoryTest {
    @Test
    public void createSortObjectTest () {
        Sortable bubbleSorter = createSortObject("b");
        Sortable mergeSorter = createSortObject("m");
        Sortable quickSorter = createSortObject("q");
        Sortable insertionSorter = createSortObject("i");
        Sortable defaultMergeSorter = createSortObject("m");

        assertNotNull(bubbleSorter);
        assertNotNull(mergeSorter);
        assertNotNull(quickSorter);
        assertNotNull(insertionSorter);
        assertNotNull(defaultMergeSorter);
    }
}
