package com.spartaglobal.sorting.tests.models;

import com.spartaglobal.sorting.models.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryTreeTest {
    @Test
    public void createTestNode() {
        int keyValue = 5;
        BinaryTree.Node node = new BinaryTree.Node(5, 0);
        assertEquals(0, node.getIndex());
        assertEquals(5, node.getKey());
    }
}
