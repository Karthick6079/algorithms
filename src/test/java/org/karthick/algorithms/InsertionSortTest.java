package org.karthick.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {


    @Test
    @DisplayName("Test given array is sorted")
    public void shouldArraySorted(){
        int[] input = {6,1,12,5,3,7};
        int[] expected = {1,3,5,6,7,12};
        int [] test = {6,1,12,5,3,7,1,12,5,4,90, 12, 54, 12, 33, 12, 78, 96, 94, 93, 92};
        int[] s = InsertionSort.sort(test);
        Arrays.stream(s).forEach((element) ->{
            System.out.printf(", " +  element);
        });
//        System.out.println("Sorted array" + InsertionSort.sort(test));
        assertArrayEquals(expected, InsertionSort.sort(input));
    }


    @Test
    @DisplayName("Test should throw excecption when input array is null")
    public void shouldThrowExceptionWhenArrayIsNull(){
        assertThrows(IllegalArgumentException.class, () ->{
            InsertionSort.sort(null);
        });
    }

    @Test
    @DisplayName("Test should throw excecption when input array is length is one")
    public void shouldThrowExceptionWhenArrayLengthEmpty(){
        int[] input = {};
        assertThrows(IllegalArgumentException.class, () ->{
            InsertionSort.sort(input);
        });
    }


}