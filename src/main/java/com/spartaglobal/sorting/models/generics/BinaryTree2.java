//package com.spartaglobal.sorting.models.generics;
//
//import java.util.ArrayList;
//
//public class BinaryTree2 <T extends Comparable<T>> implements SortableGenerics {
//    @Override
//    public <E extends Comparable<E>> void sort(E[] arr) {
//        // Sort goes here - base call
//    }
//    public static class TreeNode<T> {
//        private T keyObject;
//        private TreeNode<T> left;
//        private TreeNode<T> right;
//        private int index;
//
//        public TreeNode(T key) {
//            this.keyObject = key;
//        }
//        public TreeNode(T key, int index) {
//            this.keyObject = key;
//            this.index = index;
//        }
//        public TreeNode(T object, TreeNode<T> left, TreeNode<T> right) {
//            this.keyObject = object;
//            this.left = left;
//            this.right = right;
//        }
//
//        public T getKeyObject() {
//            return keyObject;
//        }
//        public void setKeyObject(T keyObject) {
//            this.keyObject = keyObject;
//        }
//        public TreeNode<T> getLeft() {
//            return left;
//        }
//        public void setLeft(TreeNode<T> left) {
//            this.left = left;
//        }
//        public TreeNode<T> getRight() {
//            return right;
//        }
//        public void setRight(TreeNode<T> right) {
//            this.right = right;
//        }
//        public int getIndex() {
//            return index;
//        }
//        public void setIndex(int index) {
//            this.index = index;
//        }
//
//        @Override
//        public String toString() {
//            return "TreeNode{" +
//                    "key=" + keyObject +
//                    "l=" + left +
//                    "r=" + right +
//                    '}';
//        }
//    }
//
//    private TreeNode<T> root;
//    private int size = 0;
//
//    public void put(T[] array) {
//        if (size >= array.length)
//            return;
//        root = put(root, array[size], size);
//        size++;
//        put(array);
//    }
//    private TreeNode<T> put(TreeNode<T> node, T key, int index) {
//        if (node == null)
//            return new TreeNode<T>(key, index);
//
//        // How do I make the comparison without a standardised way of doing so
//        // key for Integer -> key.value()
//        // key for Rectangle -> key.getArea()
//        // key for Person -> key.getName()
//        // int cmp = key.something.compareTo(node.keyObject.something); // A fix using a universal variable for all
//                                                                        // comparable classes
//        int cmp = Integer.valueOf(key).compareTo(node.keyObject); // <-- how am I inserting the values??
//
//        if (cmp < 0)
//            node.left = put(node.left, key, index);
//        else if (cmp >= 0) // <--- Don't know why intelliJ doesn't like this, but it works - no more dupe deletion.
//            node.right = put(node.right, key, index);
//        else
//            node.keyObject = key;
//        return node;
//    }
//
////    public int[] keys() {
////        int[] result = new int[size];
////        get(root, result, 0);
////        return result;
////    }
//
////    public void get(TreeNode<T> node, int[] result, int i) {
////        if (i >= result.length || node == null)
////            return;
////        result[node.index] = node.getKey();
////        get(node.left, result, ++i);
////        get(node.right, result, ++i);
////    }
//
//    private ArrayList<Integer> arrayList = null;
//    public T[] createIntegerArrayFromBST(BinaryTree2<T> bTree) {
//        if (arrayList == null) {
//            arrayList = new ArrayList<Integer>();
//        }
//        inOrder(bTree.root);
//        return (T[]) arrayList.toArray();
//    }
//
//    // inOrder(Node node)
//    private void inOrder(TreeNode<T> node) {
//        if (node == null) {
//            return;
//        }
//        inOrder(node.left);
//        arrayList.add(node.keyObject);
//        inOrder(node.right);
//    }
//
//    // getRoot()
//    public TreeNode<T> getRoot() {
//        return root;
//    }
//}