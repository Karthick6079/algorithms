package org.karthick.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    @Test
    @DisplayName("Test given array is sorted")
    public void shouldArraySorted(){
        int[] input = {6,1,12,5,3,7};
        int[] expected = {1,3,5,6,7,12};
        MergeSort.mergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("Test given medium size array is sorted or not")
    public void shouldMidArraySorted(){
        int[] input = {9,3,7,4,8,6,2,5};
        int[] expected = {2,3,4,5,6,7,8,9};
        MergeSort.mergeSort(input);
        assertArrayEquals(expected, input);
    }



    @Test
    @DisplayName("Test given large array is sorted or not")
    public void shouldLargeArraySorted(){
        int[] input = {6,1,12,5,3,7,1,12,5,4,90, 12, 54, 12, 33, 12, 78, 96, 94, 93, 92};
        int[] expected = {1, 1, 3, 4, 5, 5, 6, 7, 12, 12, 12, 12, 12, 33, 54, 78, 90, 92, 93, 94, 96};
        MergeSort.mergeSort(input);
        assertArrayEquals(expected, input);
    }


    @Test
    @DisplayName("Test should throw exception when input array is null")
    public void shouldThrowExceptionWhenArrayIsNull(){
        assertThrows(IllegalArgumentException.class, () ->{
            MergeSort.mergeSort(null);
        });
    }

    @Test
    @DisplayName("Test should throw exception when input array is length is one")
    public void shouldThrowExceptionWhenArrayLengthEmpty(){
        int[] input = {};
        assertThrows(IllegalArgumentException.class, () ->{
            MergeSort.mergeSort(input);
        });
    }


}