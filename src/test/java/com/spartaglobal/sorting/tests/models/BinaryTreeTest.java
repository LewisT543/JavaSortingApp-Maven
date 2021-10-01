package com.spartaglobal.sorting.tests.models;

import com.spartaglobal.sorting.models.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
    @Test
    public void createTestNodeWith_K5_I0() {
        BinaryTree.Node node = new BinaryTree.Node(5, 0);
        assertEquals(0, node.getIndex());
        assertEquals(5, node.getKey());
    }

    @Test
    public void createTestNodeWith_I0_K5_L3_R10() {
        BinaryTree.Node node = new BinaryTree.Node(5, 0);
        node.setLeft(new BinaryTree.Node(3, 1));
        node.setRight(new BinaryTree.Node(10, 2));
        assertAll(
                () -> assertEquals(0, node.getIndex()),
                () -> assertEquals(5, node.getKey()),
                () -> assertEquals(3, node.getLeft().getKey()),
                () -> assertEquals(10, node.getRight().getKey())
        );
    }
    @Test
    public void toStringTest_SingleNode_I0_K10() {
        BinaryTree.Node node = new BinaryTree.Node(10, 0);
        System.out.println(node);
        assertEquals(" Node{k=10,l=null,r=null,i=0}", node.toString());
    }
}
