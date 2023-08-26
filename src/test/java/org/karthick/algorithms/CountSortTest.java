package org.karthick.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountSortTest {

    @Test
    public void testSortMethod(){
        int[] test = {12, 1, 12, 3,10, 6};
        int[] expected = {1,3,6, 10, 12, 12};
        CountSort.sort(test);
        Arrays.stream(test).forEach(e -> System.out.print( e + " "));
        assertArrayEquals(expected, test);
    }

}