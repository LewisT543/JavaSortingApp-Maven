package com.spartaglobal.sorting.models;

import java.util.ArrayList;

public class BinaryTree {
    private class Node {
        private Integer key;
        private Node left;
        private Node right;
        private int index;

        public Node(Integer key, int index) {
            this.key = key;
            this.index = index;
        }

        @Override
        public String toString() {
            return " Node{" +
                    "k=" + key +
                    ",l=" + left +
                    ",r=" + right +
                    ",i=" + index +
                    '}';
        }
    }

    private Node root;
    private int size = 0;

    public void put(int[] arr) {
        if (size >= arr.length)
            return;
        root = put(root, arr[size], size);
        size++;
        put(arr);
    }

    private Node put(Node node, int key, int index) {
        if (node == null)
            return new Node(key, index);
        int cmp = Integer.valueOf(key).compareTo(node.key);
        if (cmp < 0)
            node.left = put(node.left, key, index);
        else if (cmp > 0)
            node.right = put(node.right, key, index);
        else
            node.key = key;
        return node;
    }

    public int[] keys() {
        int[] result = new int[size];
        get(root, result, 0);
        return result;
    }

    public void get(Node node, int[] result, int i) {
        if (i >= result.length || node == null)
            return;
        result[node.index] = node.key;
        get(node.left, result, ++i);
        get(node.right, result, ++i);
    }

    private ArrayList<Integer> arrayList = null;
    public int[] createIntArrayFromBST(BinaryTree bTree) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        inOrder(bTree.root);
        return arrayList.stream().mapToInt(i->i).toArray();
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        arrayList.add(node.key);
        inOrder(node.right);
    }

    public Node getRoot() {
        return root;
    }
}
