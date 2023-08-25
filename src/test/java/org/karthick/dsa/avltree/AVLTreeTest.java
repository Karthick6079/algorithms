package org.karthick.dsa.avltree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AVLTreeTest {

    @Test
    public void testLLRotationAtInsertion(){
        AVLTree avl = new AVLTree();
        avl.insert(30);
        avl.insert(25);
        avl.insert(12);

        // Balance Factor should be 0 after LL Rotation
        assertEquals(0, avl.balanceFactor(avl.getRoot()));

    }

    @Test
    public void testRRRotationAtInsertion(){
        AVLTree avl = new AVLTree();
        avl.insert(30);
        avl.insert(20);
        avl.insert(40);
        avl.insert(45);
        avl.insert(10);
        avl.insert(25);
        avl.insert(26);
        avl.insert(24);
        avl.insert(27);

        // Balance Factor of root should be 1 after RR Rotation
        avl.inOrderTraversal(avl.getRoot());
        assertEquals(1, avl.balanceFactor(avl.getRoot()));

    }
    @Test
    public void testRLRotationAtInsertion(){
        AVLTree avl = new AVLTree();
        avl.insert(30);
        avl.insert(20);
        avl.insert(40);
        avl.insert(45);
        avl.insert(35);
        avl.insert(37);

        // Balance Factor of root should be 0 after LR Rotation
        avl.inOrderTraversal(avl.getRoot());
        assertEquals(0, avl.balanceFactor(avl.getRoot()));
        // 35 should be new root to balance the height of tree
        assertEquals(35, avl.getRoot().data);

    }


    @Test
    public void testGivenElementShouldFound(){
        AVLTree avl = new AVLTree();
        avl.insert(30);
        avl.insert(20);
        avl.insert(40);
        avl.insert(45);
        avl.insert(35);
        avl.insert(37);

        // Balance Factor of root should be 0 after LR Rotation
        avl.inOrderTraversal(avl.getRoot());
        assertEquals(0, avl.balanceFactor(avl.getRoot()));
        // 35 should be new root to balance the height of tree
        assertEquals(20, avl.search(20).data);

    }

    @Test
    public void testGivenElementShouldNotFound(){
        AVLTree avl = new AVLTree();
        avl.insert(30);
        avl.insert(20);
        avl.insert(40);
        avl.insert(45);
        avl.insert(35);
        avl.insert(37);

        // Balance Factor of root should be 0 after LR Rotation
        avl.inOrderTraversal(avl.getRoot());
        assertEquals(0, avl.balanceFactor(avl.getRoot()));
        // 35 should be new root to balance the height of tree
       assertNull(avl.search(100));

    }



    @Test
    public void testDelete45ElementRightSideLeafNodeAndVerifyHeight(){
        AVLTree avl = new AVLTree();
        avl.insert(30);
        avl.insert(20);
        avl.insert(40);
        avl.insert(15);
        avl.insert(25);
        avl.insert(45);
        avl.insert(10);

        // Balance Factor of root should be 0 after LR Rotation
        avl.inOrderTraversal(avl.getRoot());
        System.out.println("\nBefore deletion of 45, The height of tree = " + avl.nodeHeight(avl.getRoot()));
        assertEquals(4, avl.nodeHeight(avl.getRoot()));
        avl.delete(45);
        assertNull(avl.search(45));
        System.out.println("\nAfter deletion of 45, The height of tree = " + avl.nodeHeight(avl.getRoot()));
        assertEquals(3, avl.nodeHeight(avl.getRoot()));

    }




}