package com.spartaglobal.sorting.models;

import java.util.ArrayList;

public class BinaryTreeSorter implements Sortable {
    private static class TreeNode {
        private int value;
        private TreeNode leftNode;
        private TreeNode rightNode;

        public TreeNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public TreeNode getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(TreeNode leftNode) {
            this.leftNode = leftNode;
        }

        public TreeNode getRightNode() {
            return rightNode;
        }

        public void setRightNode(TreeNode rightNode) {
            this.rightNode = rightNode;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "value=" + value +
                    ", leftNode=" + leftNode +
                    ", rightNode=" + rightNode +
                    '}';
        }
    }
    public ArrayList<Integer> traversalArray = new ArrayList<>();
    private TreeNode root = null;
    public void sort(int[] array) {
        BinaryTreeSorter bTree = createBinaryTree(array);
        System.out.println(bTree.root.toString());
    }

    private int[] createTreeFlattenToArray(int[] array) {
        BinaryTreeSorter bTree = createBinaryTree(array);
        array = flattenToIntArray(bTree);
        return array;
    }

    private BinaryTreeSorter createBinaryTree(int[] array) {
        BinaryTreeSorter bTree = new BinaryTreeSorter();
        for (int number : array) {
            bTree.add(number);
        }
        return bTree;
    }
    private void add(int nextInt) {
        root = addRecursive(root, nextInt);
    }
    private TreeNode addRecursive(TreeNode current, int value) {
        if (current == null) { return new TreeNode(value); }
        if (value < current.value) { current.leftNode = addRecursive(current.leftNode, value); }
        else if (value > current.value) { current.rightNode = addRecursive(current.rightNode, value); }
        else { return current; }
        return current;
    }

    private int[] flattenToIntArray(BinaryTreeSorter bTree) {
        bTree.flatten(bTree.root);
        bTree.inOrder(bTree.root);
        return traversalArray.stream().mapToInt(i->i).toArray();
    }
    public void flatten(TreeNode node) {
        // Base case
        if (node == null) { return; }
        // if Leaf node
        if (node.getLeftNode() == null && node.getRightNode() == null) { return; }
        // If node.leftNode isn't null we have to change it to node.rightNode by moving it right recursively
        if (node.getLeftNode() != null) {
            flatten(node.getLeftNode());
            // temp node to hold the right node
            // Make the shift
            TreeNode tempNode = node.getRightNode();
            node.setRightNode(node.getLeftNode());
            node.setLeftNode(null);
            // Go all the way down the right side of the tree checking for where to insert node
            TreeNode current = node.getRightNode();
            while (current.getRightNode() != null) {
                current = current.getRightNode();
            }
            current.setRightNode(tempNode);
        }
        // Do same for rightNode
        flatten(node.getRightNode());
    }

    public void inOrder(TreeNode node)
    {
        // Base Condition
        if (node == null)
            return;
        inOrder(node.getLeftNode());
        traversalArray.add(node.getValue());
        inOrder(node.getRightNode());
    }

}
