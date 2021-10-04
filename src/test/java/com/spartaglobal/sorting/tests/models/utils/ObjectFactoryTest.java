package com.spartaglobal.sorting.tests.models.utils;

import com.spartaglobal.sorting.models.generics.GenericSortable;
import com.spartaglobal.sorting.models.ints.Sortable;
import org.junit.jupiter.api.Test;

import static com.spartaglobal.sorting.models.utils.ObjectFactory.createGenericSortObject;
import static com.spartaglobal.sorting.models.utils.ObjectFactory.createSortObject;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ObjectFactoryTest {
    @Test
    public void createSortObjectTest () {
        Sortable bubbleSorter = createSortObject("b");
        Sortable mergeSorter = createSortObject("m");
        Sortable quickSorter = createSortObject("q");
        Sortable insertionSorter = createSortObject("i");
        Sortable binaryTreeSorter = createSortObject("bt");
        Sortable defaultMergeSorter = createSortObject("m");

        assertAll(
                () -> assertNotNull(bubbleSorter),
                () -> assertNotNull(mergeSorter),
                () -> assertNotNull(quickSorter),
                () -> assertNotNull(insertionSorter),
                () -> assertNotNull(binaryTreeSorter),
                () -> assertNotNull(defaultMergeSorter)
        );
    }

    @Test
    public void createGenericSortObjectTest () {
        GenericSortable bubbleSorterGeneric = createGenericSortObject("b");
        GenericSortable mergeSorterGeneric = createGenericSortObject("m");
        GenericSortable quickSorterGeneric = createGenericSortObject("q");
        GenericSortable insertionSorterGeneric = createGenericSortObject("i");
        GenericSortable defaultMergeSorterGeneric = createGenericSortObject("m");

        assertAll(
                () -> assertNotNull(bubbleSorterGeneric),
                () -> assertNotNull(mergeSorterGeneric),
                () -> assertNotNull(quickSorterGeneric),
                () -> assertNotNull(insertionSorterGeneric),
                () -> assertNotNull(defaultMergeSorterGeneric)
        );
    }
}
