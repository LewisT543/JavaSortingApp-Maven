package com.spartaglobal.sorting.models;

public interface SortableGenerics {
    <E extends Comparable<E>> void sort(E[] arr);
}
