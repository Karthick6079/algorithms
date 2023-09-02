package org.karthick.dsa.arrays.problems;

import org.junit.jupiter.api.Test;

class FindDuplicateElementTest {

    @Test
    public void testFindMultipleMissingElementFromUnsortedArray() {
        int[] arr = {11,11,15,19,6,7,15,10,15,17};
        FindDuplicateElement.findDuplicatedElementFromUnsortedArray(arr, 10);
    }

    @Test
    public void testFindMultipleMissingElementFromSortedArray() {
        int[] arr = {3,6,8,8,8,9,9,15,15,7};
        FindDuplicateElement.findDuplicatedFromSorted(arr, 10);
    }

}