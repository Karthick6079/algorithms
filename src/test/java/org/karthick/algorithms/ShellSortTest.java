package org.karthick.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShellSortTest {

    @Test
    public void testSortMethod(){
        int[] test = {11, 13, 7, 12, 16, 9, 2, 4, 5, 10, 3};
        int[] expected = {2, 3, 4, 5, 7, 9, 10, 11, 12, 13, 16};
        ShellSort.sort(test);
        Arrays.stream(test).forEach(e -> System.out.print( e + " "));
        assertArrayEquals(expected, test);
    }


}