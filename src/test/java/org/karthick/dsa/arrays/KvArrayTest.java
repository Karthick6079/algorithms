package org.karthick.dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KvArrayTest {

    @Test
    public void testLinearSearchMethod() {

        KvArray arr = new KvArray(10);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(3);
        arr.add(2);
        arr.add(1);

        arr.display();

        int key = 3;
        System.out.printf("\nSearch element %d position in array is %d\n", key, arr.linearSearch(key));
        arr.display();
    }


    @Test
    public void testBinarySearchMethod() {

        KvArray arr = new KvArray(10);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(9);
        arr.add(10);

        arr.display();

        int key = 4;
        System.out.printf("\nSearch element %d position in array is %d\n", key, arr.binarySearch(key));
        arr.display();
    }


    @Test
    public void testLeftShiftAnArray() {

        KvArray arr = new KvArray(10);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(9);
        arr.add(10);

        arr.leftShiftAndRotate();
        arr.leftShiftAndRotate();
        arr.leftShiftAndRotate();
        arr.leftShiftAndRotate();


        arr.display();
    }

    @Test
    public void testInsertMethod() {

        KvArray arr = new KvArray(10);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(3);
        arr.add(2);
        arr.add(1);

        arr.insert(5, 10);

        arr.display();


    }

}