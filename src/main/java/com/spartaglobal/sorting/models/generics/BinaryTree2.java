//package com.spartaglobal.sorting.models.generics;
//
//import java.util.ArrayList;
//
// // NEW IDEA: keep key as an int, which is derived from a given object property?
// // Better yet, use getHashCode() to allocate a value to the key. This allows me to independently allocate a method
// // of producing the correct size hashcode based on the sort criteria.
// // e.g. if p1 has a name "ABCCD" + P2.name = "ZGHYF". person1.getHashCode() -> 001432, p2.getHashCode() -> 602365.
// // This is going to require a custom algorithm for each type of object I want compatible with a BinarySearchTree.
// // FURTHER UPDATE: this IS how to do it, but i just can't put together a hashing function that is small enough
// // to return an integer...
// // But apart from that, this is a working implementation of a binary sort tree where each node is able to carry
// // an object of <T> type, and determine its own key using hashCodes().
//
//
//public class BinaryTree2 <T extends Comparable<T>> implements SortableGenerics {
//    @Override
//    public <E extends Comparable<E>> void sort(E[] arr) {
//        // Sort goes here - base call
//    }
//    public static class TreeNode<T> {
//        private long key;
//        private T object;
//        private TreeNode<T> left;
//        private TreeNode<T> right;
//        private int index;
//
//        public TreeNode(T object) {
//            this.object = object;
//            this.key = object.hashCode();
//        }
//        public TreeNode(T object, int index) {
//            this.object = object;
//            this.key = object.hashCode();
//            this.index = index;
//        }
//        public TreeNode(T object, TreeNode<T> left, TreeNode<T> right) {
//            this.object = object;
//            this.key = object.hashCode();
//            this.left = left;
//            this.right = right;
//        }
//
//        public long getKey() {
//            return key;
//        }
//        public void setKey(long key) {
//            this.key = key;
//        }
//        public T getObject() {
//            return object;
//        }
//        public void setObject(T object) {
//            this.object = object;
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
//                    "key=" + key +
//                    "obj=" + object +
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
//    private TreeNode<T> put(TreeNode<T> node, T obj, int index) {
//        if (node == null)
//            return new TreeNode<T>(obj, index);
//        long cmp = Long.compare(obj.hashCode(), node.key);
//        if (cmp < 0)
//            node.left = put(node.left, obj, index);
//        else if (cmp >= 0) // <--- Don't know why intelliJ doesn't like this, but it works - no more dupe deletion.
//            node.right = put(node.right, obj, index);
//        else
//            node.key = obj.hashCode();
//        return node;
//    }
//
//    public int[] keys() {
//        int[] result = new int[size];
//        get(root, result, 0);
//        return result;
//    }

//    public void get(TreeNode<T> node, int[] result, int i) {
//        if (i >= result.length || node == null)
//            return;
//        result[node.index] = node.getKey();
//        get(node.left, result, ++i);
//        get(node.right, result, ++i);
//    }
//
//    private ArrayList<Long> arrayList = null;
//    public T[] createIntegerArrayFromBST(BinaryTree2<T> bTree) {
//        if (arrayList == null) {
//            arrayList = new ArrayList<Long>();
//        }
//        inOrder(bTree.root);
//        return (T[]) arrayList.toArray();
//    }
//
//    private ArrayList<T> tempList = null;
//    public T[] flattenToArray(BinaryTree2<T> bTree) {
//        if (tempList == null) {
//            tempList = new ArrayList<T>();
//        }
//        inOrder(bTree.root);
//        return (T[]) tempList.toArray();
//    }
//
//    // inOrder(Node node)
//    private void inOrder(TreeNode<T> node) {
//        if (node == null) {
//            return;
//        }
//        inOrder(node.left);
//        arrayList.add(node.key);
//        inOrder(node.right);
//    }
//
//    // getRoot()
//    public TreeNode<T> getRoot() {
//        return root;
//    }
//}