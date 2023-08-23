package org.karthick.dsa.binarysearchtree;

class BinarySearchTreeTest {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(25);
        bst.insert(10);
        bst.insert(35);
        bst.insert(45);


        bst.preOrderTraversal();
        System.out.println();
        bst.postOrderTraversal();


        bst.insert(55);


        System.out.println( bst.search(155));
        bst.inOrderTraversal();
        System.out.print("\nDeleting element 55 (Leaf node)");
        bst.delete(55);
        System.out.println();
        bst.inOrderTraversal();

        bst.insert(5);
        System.out.println();
        bst.inOrderTraversal();

        System.out.print("\nDeleting element 10( One child Node)");
        bst.delete(10);
        System.out.println();
        bst.inOrderTraversal();


        System.out.print("\nDeleting element 30( Two child Node)");
        bst.delete(30);
        System.out.println();
        bst.inOrderTraversal();


    }

}