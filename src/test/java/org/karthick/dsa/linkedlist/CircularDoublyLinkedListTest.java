package org.karthick.dsa.linkedlist;

import org.junit.jupiter.api.Test;

class CircularDoublyLinkedListTest {

    @Test
    public void testCircularDoublyListCreationAndDisplay() {
        int[] a = {2,5,6,7,8,10,12,15};

        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.create(a,8);

        cdll.display();

        cdll.printInBackwards(5);

    }

    @Test
    public void testInsertionAtZeroPosition() {
        int[] a = {2,5,6,7,8,10,12,15};

        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.create(a,8);

        cdll.display();

        cdll.insert(0,22);

        cdll.display();

        cdll.printInBackwards(5);

    }

    @Test
    public void testInsertionAtGivenPosition() {
        int[] a = {2,5,6,7,8,10,12,15};

        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.create(a,8);

        cdll.display();

        cdll.insert(4,22);

        cdll.display();

        cdll.printInBackwards(5);

    }

    @Test
    public void testDeletionAtOnePosition() {
        int[] a = {2,5,6,7,8,10,12,15};

        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.create(a,8);

        cdll.display();

        cdll.delete(1);

        cdll.display();

        cdll.printInBackwards(5);

    }


    @Test
    public void testDeletionAtFourthPosition() {
        int[] a = {2,5,6,7,8,10,12,15};

        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.create(a,8);

        cdll.display();

        cdll.delete(4);

        cdll.display();

        cdll.printInBackwards(5);

    }

    @Test
    public void testDeletionAtLastPosition() {
        int[] a = {2,5,6,7,8,10,12,15};

        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.create(a,8);

        cdll.display();

        cdll.delete(8);

        cdll.display();

        cdll.printInBackwards(5);

    }


}