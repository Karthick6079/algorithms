package org.karthick.dsa.arrays.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPairOfSumTest {

    String a = new String();

    @Test
    public void testFindPairOfElementForSumWhenArrayUnsorted() {
        int[] arr = {6,3,8,10,16,7,5,2,9,14};
        FindPairOfSum.findPair(arr, 10, 10);
    }

    @Test
    public void testFindPairOfElementForSumWhenArrayIsSorted() {
        int[] arr = {1,3,4,5,6,8,9,10,12,14};
        FindPairOfSum.findPairInSorted(arr, 10, 10);
    }

}