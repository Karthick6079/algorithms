package org.karthick.algorithms;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    @DisplayName("Test given array is sorted")
    public void shouldArraySorted(){
        int[] input = {6,1,12,5,3,7};
        int[] expected = {1,3,5,6,7,12};
        assertArrayEquals(expected, BubbleSort.sortOptimized(input));
    }


    @Test
    @DisplayName("Test should throw excecption when input array is null")
    public void shouldThrowExceptionWhenArrayIsNull(){
       assertThrows(IllegalArgumentException.class, () ->{
           BubbleSort.sort(null);
       });
    }

    @Test
    @DisplayName("Test should throw excecption when input array is length is one")
    public void shouldThrowExceptionWhenArrayLengthEmpty(){
        int[] input = {};
        assertThrows(IllegalArgumentException.class, () ->{
            BubbleSort.sort(input);
        });
    }

}