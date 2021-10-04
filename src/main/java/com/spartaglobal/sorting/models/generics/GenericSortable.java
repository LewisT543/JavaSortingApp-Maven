package com.spartaglobal.sorting.models.generics;

public interface GenericSortable {
    <E extends Comparable<E>> void sort(E[] arr);
}
