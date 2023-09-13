package org.karthick.dsa.linkedlist;

import org.junit.jupiter.api.Test;

class CircularLinkedListTest {

    @Test
    public void testCreateAndDisplayOfCircularLL() {

        int[] a = {2,5,6,7,8,10,12,15};

        CircularLinkedList cll = new CircularLinkedList();
        cll.create(a,8);
        cll.display();
        cll.display(cll.getHead());
    }

    @Test
    public void testInsertMethodOfCircularLL() {

        int[] a = {2,5,6,7,8,10,12,15};

        CircularLinkedList cll = new CircularLinkedList();
        cll.create(a,8);
        cll.display();
        cll.insert(8,20);
        cll.insert(5,45);

        cll.display();
    }

    @Test
    public void testDeleteMethodOfCircularLL() {

        int[] a = {2,5,6,7,8,10,12,15};

        CircularLinkedList cll = new CircularLinkedList();
        cll.create(a,8);
        cll.display();
        System.out.printf("Deleted 1st position, that index value is %d\n",   cll.delete(1));
        cll.display();
        System.out.printf("Deleted 5th position, that index value is %d\n",  cll.delete(5));
        cll.display();
    }

}