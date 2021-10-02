//package com.spartaglobal.sorting.models.generics;
//
//public class BinaryTreeSorterGeneric <T extends Comparable<T>> implements SortableGenerics {
//    @Override
//    public <E extends Comparable<E>> void sort(E[] array) {
//        BinaryTreeGeneric bTree = createBinaryTree((T[]) array);
//        System.out.println("---- Tree Structure ----");
//        System.out.println(bTree.getRoot());
//        bTreeToSortedIntegerArray(bTree, array);
//    }
//
//    public BinaryTreeGeneric createBinaryTree(T[] array) {
//        BinaryTreeGeneric binTree = new BinaryTreeGeneric();
//        binTree.put(array);
//        return binTree;
//    }
//    public void bTreeToSortedIntegerArray(BinaryTreeGeneric bTree, Object[] array) {
//        int[] newArray = bTree.createIntegerArrayFromBST(bTree);
//        for (int i = 0; i < newArray.length; i++) {
//            array[i] = newArray[i];
//        }
//    }
//}
