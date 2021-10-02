package com.spartaglobal.sorting.models.generics;

public interface SortableGenerics {
    <E extends Comparable<E>> void sort(E[] arr);
}
