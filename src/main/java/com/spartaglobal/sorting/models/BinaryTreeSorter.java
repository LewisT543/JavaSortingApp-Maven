package com.spartaglobal.sorting.models;

public class BinaryTreeSorter implements Sortable {
    @Override
    public void sort(int[] array) {
        BinaryTree bTree = createBinaryTree(array);
        System.out.println("---- Tree Structure ----");
        System.out.println(bTree.getRoot());
        bTreeToSortedIntArray(bTree, array);
    }

    public BinaryTree createBinaryTree(int[] array) {
        BinaryTree binTree = new BinaryTree();
        binTree.put(array);
        return binTree;
    }
    public void bTreeToSortedIntArray(BinaryTree bTree, int[] array) {
        int[] newArray = bTree.createIntArrayFromBST(bTree);
        for (int i = 0; i < newArray.length; i++) {
            array[i] = newArray[i];
        }
    }
}
