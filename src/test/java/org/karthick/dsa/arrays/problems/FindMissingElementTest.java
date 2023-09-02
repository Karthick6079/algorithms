package org.karthick.dsa.arrays.problems;

import org.junit.jupiter.api.Test;

class FindMissingElementTest {

    @Test
    public void testFindMissingElement() {
        int[] arr = {1,2,3,4,5,6,8,9,10,11};
        System.out.println("The missing element: " + FindMissingElement.findMissingElement(arr, 10));
    }

    @Test
    public void testFindMissingElementMethod2() {
        int[] arr = {6,7,8,10,11,12,13,14,15,16};
        FindMissingElement.findMissingElementMethod2(arr, 10);
    }

    @Test
    public void testFindMultipleMissingElement() {
        int[] arr = {6,7,9,10,11,14,15,16,17,19};
        FindMissingElement.findMultipleMissingElement(arr, 10);
    }


    @Test
    public void testFindMultipleMissingElementFromUnsortedArray() {
        int[] arr = {11,14,15,19,6,7,9,10,16,17};
        FindMissingElement.findMissingElementFromUnsortedArray(arr, 10);
    }

    @Test
    public void testFindMaxElement() {
        int[] arr = {6,7,9,10,11,14,15,16,17,19,0,0,0};
        System.out.println(FindMissingElement.findMax(arr, 10));
    }



}