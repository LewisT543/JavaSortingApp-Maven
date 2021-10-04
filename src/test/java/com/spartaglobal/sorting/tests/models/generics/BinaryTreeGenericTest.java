//package com.spartaglobal.sorting.tests.models.generics;
//
//import com.spartaglobal.sorting.models.generics.BinaryTree2;
//import com.spartaglobal.sorting.models.ints.BinaryTree;
//import com.spartaglobal.sorting.models.sortableObjects.Person;
//import com.spartaglobal.sorting.models.sortableObjects.Rectangle;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertAll;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
// // NOT CURRENTLY IN USE
//
//public class BinaryTreeGenericTest {
//    @Test
//    public void randomBash () {
//        Person p1 = new Person(0, "ABC", 175);
//        Person p2 = new Person(1, "ABD", 175);
//        Person p3 = new Person(2, "ABE", 175);
//        Person p4 = new Person(3, "SAM", 175);
//        Person p5 = new Person(4, "ROB", 175);
//        Person p6 = new Person(5, "XYZ", 175);
//        System.out.println(Integer.MAX_VALUE - p1.hashCode());
//        System.out.println(Integer.MAX_VALUE - p2.hashCode());
//        System.out.println(Integer.MAX_VALUE - p3.hashCode());
//        System.out.println(Integer.MAX_VALUE - p4.hashCode());
//        System.out.println(Integer.MAX_VALUE - p5.hashCode());
//        System.out.println(Integer.MAX_VALUE - p6.hashCode());
//    }
//
//    @Test
//    public void createTestNodeWith_RectangleNode() {
//        Rectangle myRect = new Rectangle(5, 10);
//        BinaryTree2.TreeNode node = new BinaryTree2.TreeNode(myRect, 0); // Need an explanation for this, google
//        assertAll(                                                             // has finally run dry.
//                () -> assertEquals(0, node.getIndex()),
//                () -> assertEquals(myRect, node.getObject()),
//                () -> assertEquals(50, node.getKey())
//        );
//    }
//
//    @Test
//    public void createTestNodeWith_PeopleNode() {
//        Person myPerson = new Person(0, "ABCDEF", 180);
//        long expectedAsciiValue = 656667686970L;
//
//        BinaryTree2.TreeNode node = new BinaryTree2.TreeNode(myPerson, 0); // Need an explanation for this, google
//        Person storedObj = (Person) node.getObject();                            // has finally run dry.
//        assertAll(
//                () -> assertEquals(0, node.getIndex()),
//                () -> assertEquals(myPerson, node.getObject()),
//                () -> assertEquals(expectedAsciiValue, node.getKey()),
//                () -> assertEquals(180, storedObj.getHeight())
//        );
//    }
//
//    @Test
//    public void createTestNodeWith_I0_K5_L3_R10() {
//        Person p1 = new Person(0, "ABCDEF", 180);
//        long l1 = 656667686970L;
//        Person p2 = new Person(1, "ABDEFG", 175);
//        long l2 = 656668697071L;
//        Person p3 = new Person(2, "ABCDEE", 177);
//        long l3 = 656667686969L;
//
//        BinaryTree.Node node = new BinaryTree.Node(5, 0);
//        node.setLeft(new BinaryTree.Node(3, 1));
//        node.setRight(new BinaryTree.Node(10, 2));
//        assertAll(
//                () -> assertEquals(0, node.getIndex()),
//                () -> assertEquals(5, node.getKey()),
//                () -> assertEquals(3, node.getLeft().getKey()),
//                () -> assertEquals(10, node.getRight().getKey())
//        );
//    }
//}
