package org.karthick.dsa.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    public void testInsert() {

        LinkedList list = new LinkedList();
        list.insert(0, 12);
        list.insert(1, 2);
        list.insert(2, 3);
        list.insert(3, 7);
        list.insert(4, 8);
        list.insert(5, 9);

        list.insert(4, 10);

        list.display();
    }

    @Test
    public void testInsertAtLast() {
        LinkedList list = new LinkedList();
        list.insertAtLast(10);
        list.insertAtLast(19);
        list.insertAtLast(19);
        list.insertAtLast(19);
        list.insertAtLast(19);

        list.display();
    }

    @Test
    public void testDelete() {

        LinkedList list = new LinkedList();
        list.insert(0, 12);
        list.insert(1, 2);
        list.insert(2, 3);
        list.insert(3, 7);
        list.insert(4, 8);
        list.insert(5, 9);

        list.insert(4, 10);

        list.display();

        //Deleting first position node

        int x = list.delete(1);

        System.out.printf("\nDeleted value %d\n", x);

        list.display();

        //Deleting first nth position node

        int x1 = list.delete(2);

        System.out.printf("\nDeleted value %d\n", x1);

        list.display();
    }

    @Test
    public void testSumMethodInLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(0, 12);
        list.insert(1, 2);
        list.insert(2, 3);
        list.insert(3, 7);
        list.insert(4, 8);
        list.insert(5, 9);

        System.out.printf("The sum of linked list value is %d\n", list.rSum(list.getFirst()));
        System.out.printf("The sum of linked list value is %d", list.sum());
    }

    @Test
    public void testCountMethodInLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(0, 12);
        list.insert(1, 2);
        list.insert(2, 3);
        list.insert(3, 7);
        list.insert(4, 8);
        list.insert(5, 9);

        System.out.printf("The no of nodes in linked list is %d\n", list.rCount(list.getFirst()));
        System.out.printf("The no of nodes in linked list is %d", list.count());
    }

    @Test
    public void testPrintReverseInLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(0, 12);
        list.insert(1, 2);
        list.insert(2, 3);
        list.insert(3, 7);
        list.insert(4, 8);
        list.insert(5, 9);

        list.display();
        System.out.println();
        list.printElementsFromReverse(list.getFirst());
    }

    @Test
    public void testSearchInLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(0, 12);
        list.insert(1, 2);
        list.insert(2, 3);
        list.insert(3, 7);
        list.insert(4, 8);
        list.insert(5, 9);

        int key = 7;

        // Iterative search
        LinkedList.Node temp = list.search(key);
        if(temp != null){
            System.out.printf("Key element %d found\n", key);
        } else{
            System.out.println("Key element not found");
        }

        list.display();


        // Recursive search
        LinkedList.Node temp1 = list.search(key);
        if(temp1 != null){
            System.out.printf("Key element %d found\n", key);
        } else{
            System.out.println("Key element not found");
        }
        list.display();

        LinkedList.Node temp2 = list.search(12);
        if(temp2 != null){
            System.out.printf("\nKey element %d found\n", 12);
        } else{
            System.out.println("\nKey element not found\n");
        }
        list.display();

    }

    @Test
    public void testIsLinkedListSortedOrNot() {
        LinkedList list = new LinkedList();
        list.insert(0, 1);
        list.insert(1, 2);
        list.insert(2, 3);
        list.insert(3, 19);
        list.insert(4, 8);
        list.insert(5, 9);

        list.display();
        System.out.println();
        System.out.print(list.isListSorted());
    }

    @Test
    public void testRemoveDuplicatesInLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(0, 1);
        list.insert(1, 5);
        list.insert(2, 5);
        list.insert(3, 8);
        list.insert(4, 8);
        list.insert(5, 9);

        list.display();
        System.out.println();
        list.removeDuplicateFromSorted();
        list.display();
    }

    @Test
    public void testReverseLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(0, 1);
        list.insert(1, 5);
        list.insert(2, 5);
        list.insert(3, 8);
        list.insert(4, 8);
        list.insert(5, 9);

        list.display();
        System.out.println();
        list.reverseLinkedListData();
        list.display();
    }


    @Test
    public void testReverseLinkMethodInLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(0, 1);
        list.insert(1, 5);
        list.insert(2, 5);
        list.insert(3, 8);
        list.insert(4, 8);
        list.insert(5, 9);

        list.display();
        System.out.println();
        list.reverseLink();
        list.display();
    }


    @Test
    public void testReverseLinkMethodUsingRecursiveInLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(0, 1);
        list.insert(1, 5);
        list.insert(2, 5);
        list.insert(3, 8);
        list.insert(4, 8);
        list.insert(5, 9);

        list.display();
        System.out.println();
        list.rReverseList(null, list.getFirst());
        list.display();
    }

}