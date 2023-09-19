package org.karthick.dsa.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    public void testDoublyListCreationAndDisplay() {
        int[] a = {2,5,6,7,8,10,12,15};

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.create(a,8);

        dll.display();

        dll.printInBackwards(5);

    }

    @Test
    public void testInsertionAtZeroPosition() {
        int[] a = {2,5,6,7,8,10,12,15};

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.create(a,8);

        dll.insert(0,22);

        dll.display();

        dll.printInBackwards(5);

    }

    @Test
    public void testInsertionAtGivenPosition() {
        int[] a = {2,5,6,7,8,10,12,15};

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.create(a,8);

        dll.insert(4,22);

        dll.display();

        dll.printInBackwards(5);

    }

    @Test
    public void testDeletionAtOnePosition() {
        int[] a = {2,5,6,7,8,10,12,15};

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.create(a,8);

        dll.display();

        dll.delete(1);

        dll.display();

        dll.printInBackwards(5);

    }


    @Test
    public void testDeletionAtFourthPosition() {
        int[] a = {2,5,6,7,8,10,12,15};

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.create(a,8);

        dll.display();

        dll.delete(4);

        dll.display();

        dll.printInBackwards(5);

    }

    @Test
    public void testDeletionAtLastPosition() {
        int[] a = {2,5,6,7,8,10,12,15};

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.create(a,8);

        dll.display();

        dll.delete(8);

        dll.display();

        dll.printInBackwards(5);

    }

    @Test
    public void testReverseOfDLL() {
        int[] a = {2,5,6,7,8,10,12,15};

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.create(a,8);

        dll.display();

        dll.reverse();

        dll.display();

    }


}