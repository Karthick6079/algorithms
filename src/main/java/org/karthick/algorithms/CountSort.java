package org.karthick.algorithms;

public class CountSort {

    public static void sort(int[] a) {
        if(a == null || a.length == 0)
            throw new IllegalArgumentException("Input array should not be null or empty");

        int MAX = findMax(a);
        int[] c = new int[MAX  + 1];

        for (int k : a) {
            c[k]++;
        }

        int i = 0, j = 0;

        while( i < MAX + 1){
            if(c[i] > 0){
                a[j++] = i;
                c[i]--;
            } else {
                i++;
            }
        }

    }

    public static int findMax(int[] a) {
        int MAX = Integer.MIN_VALUE;

        for (int j : a) {
            if (j > MAX)
                MAX = j;
        }
        return MAX;
    }
}
