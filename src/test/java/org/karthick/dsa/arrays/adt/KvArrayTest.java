package org.karthick.dsa.arrays.adt;

import org.junit.jupiter.api.Test;
import org.karthick.dsa.arrays.adt.KvArray;

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

    @Test
    public void testMergeArray() {

        KvArray arr1 = new KvArray(10);
        arr1.add(1);
        arr1.add(4);
        arr1.add(7);
        arr1.add(11);
        arr1.add(13);
        arr1.add(15);


        KvArray arr2 = new KvArray(10);
        arr2.add(2);
        arr2.add(3);
        arr2.add(5);
        arr2.add(8);
        arr2.add(9);
        arr2.add(10);

        int[] mergeArray  = arr1.merge(arr2);

        for (int j : mergeArray) {
            System.out.print(j + " ");
        }

    }


    @Test
    public void testUnionMethodInArray() {

        KvArray arr1 = new KvArray(10);
        arr1.add(1);
        arr1.add(4);
        arr1.add(7);
        arr1.add(11);
        arr1.add(13);
        arr1.add(15);


        KvArray arr2 = new KvArray(10);
        arr2.add(2);
        arr2.add(5);
        arr2.add(7);
        arr2.add(11);
        arr2.add(13);
        arr2.add(17);

        int[] unionArray  = arr1.union(arr2);

        for (int j : unionArray) {
            System.out.print(j + " ");
        }
    }


    @Test
    public void testIntersectionMethodInArray() {

        KvArray arr1 = new KvArray(10);
        arr1.add(1);
        arr1.add(4);
        arr1.add(7);
        arr1.add(11);
        arr1.add(13);
        arr1.add(15);


        KvArray arr2 = new KvArray(10);
        arr2.add(2);
        arr2.add(5);
        arr2.add(7);
        arr2.add(11);
        arr2.add(13);
        arr2.add(17);

        int[] unionArray  = arr1.intersection(arr2);

        for (int j : unionArray) {
            System.out.print(j + " ");
        }
    }


    @Test
    public void testDifferenceMethodInArray() {

        KvArray arr1 = new KvArray(10);
        arr1.add(1);
        arr1.add(4);
        arr1.add(7);
        arr1.add(11);
        arr1.add(13);
        arr1.add(15);


        KvArray arr2 = new KvArray(10);
        arr2.add(2);
        arr2.add(5);
        arr2.add(7);
        arr2.add(11);
        arr2.add(13);
        arr2.add(17);

        int[] unionArray  = arr2.difference(arr1);

        for (int j : unionArray) {
            System.out.print(j + " ");
        }
    }

}