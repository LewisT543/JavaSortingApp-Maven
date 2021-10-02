package com.spartaglobal.sorting.tests.models.utils;

import com.spartaglobal.sorting.models.ints.Sortable;
import org.junit.jupiter.api.Test;

import static com.spartaglobal.sorting.models.utils.ObjectFactory.createSortObject;
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
