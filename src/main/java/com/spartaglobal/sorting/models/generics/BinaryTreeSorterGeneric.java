//package com.spartaglobal.sorting.models.generics;
//
//public class BinaryTreeSorterGeneric <T extends Comparable<T>> implements SortableGenerics {
//    @Override
//    public <E extends Comparable<E>> void sort(E[] array) {
//        BinaryTree2<T> bTree = createBinaryTree((T[]) array);
//        System.out.println("---- Tree Structure ----");
//        System.out.println(bTree.getRoot());
//        bTreeToSortedArray(bTree, array);
//    }
//
//    public BinaryTree2<T> createBinaryTree(T[] array) {
//        BinaryTree2<T> binTree = new BinaryTree2<T>();
//        binTree.put(array);
//        return binTree;
//    }
//    public void bTreeToSortedArray(BinaryTree2<T> bTree, Object[] array) {
//        T[] newArray = bTree.flattenToArray(bTree);
//        for (int i = 0; i < newArray.length; i++) {
//            array[i] = newArray[i];
//        }
//    }
//}
