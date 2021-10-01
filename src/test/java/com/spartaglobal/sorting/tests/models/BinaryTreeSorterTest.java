package com.spartaglobal.sorting.tests.models;

import com.spartaglobal.sorting.models.ArrayGenerator;
import com.spartaglobal.sorting.models.BinaryTree;
import com.spartaglobal.sorting.models.BinaryTreeSorter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeSorterTest {
    @Test
    public void createBinaryTreeSize5 () {
        int[] myNums = new int[] { 5, 4, 3, 2, 1};
        String expectedOutput = "Node{k=5,l= Node{k=4,l= Node{k=3,l= Node{k=2,l= Node{k=1,l=null,r=null,i=4}," +
                "r=null,i=3},r=null,i=2},r=null,i=1},r=null,i=0}";
        BinaryTree bTree = new BinaryTree();
        bTree.put(myNums);
        var root = bTree.getRoot();
        assertEquals(expectedOutput, root.toString());
    }

    @Test
    public void createBinaryTreeSize10 () {
        int[] myNums = new int[] { 5, 4, 3, 2, 1, 9, 12, 11, 25, 14 };
        String expectedOutput = "Node{k=5,l= Node{k=4,l= Node{k=3,l= Node{k=2,l= Node{k=1,l=null,r=null,i=4}," +
                "r=null,i=3},r=null,i=2},r=null,i=1},r= Node{k=9,l=null,r= Node{k=12,l= Node{k=11,l=null," +
                "r=null,i=7},r= Node{k=25,l= Node{k=14,l=null,r=null,i=9},r=null,i=8},i=6},i=5},i=0}";
        BinaryTree bTree = new BinaryTree();
        bTree.put(myNums);
        var root = bTree.getRoot();
        assertEquals(expectedOutput, root.toString());
    }

    @Test
    public void givenArrayLen20_ReturnSortedLen20Array() {
        ArrayGenerator arrGen = new ArrayGenerator();
        int[] myArray = arrGen.generateIntArray(20);
        int[] expectedArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(expectedArray);
        BinaryTreeSorter BinaryTreeSort = new BinaryTreeSorter();
        BinaryTreeSort.sort(myArray);
        assertEquals(20, myArray.length);
        assertArrayEquals(expectedArray, myArray);
    }
    @Test
    public void givenArrayLen50_ReturnSortedLen50Array() {
        ArrayGenerator arrGen = new ArrayGenerator();
        int[] myArray = arrGen.generateIntArray(50);
        int[] expectedArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(expectedArray);
        BinaryTreeSorter BinaryTreeSort = new BinaryTreeSorter();
        BinaryTreeSort.sort(myArray);
        assertEquals(50, myArray.length);
        assertArrayEquals(expectedArray, myArray);
    }
    @Test
    public void givenArrayLen500_ReturnSortedLen500Array() {
        ArrayGenerator arrGen = new ArrayGenerator();
        int[] myArray = arrGen.generateIntArray(500);
        int[] expectedArray = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(expectedArray);
        BinaryTreeSorter BinaryTreeSort = new BinaryTreeSorter();
        BinaryTreeSort.sort(myArray);
        assertEquals(500, myArray.length);
        assertArrayEquals(expectedArray, myArray);
    }
    
}
