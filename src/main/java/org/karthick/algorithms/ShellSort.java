package org.karthick.algorithms;

public class ShellSort {

    public static void sort(int[] arr) {
        if(arr == null || arr.length == 0)
            throw new IllegalArgumentException("Input array should not be null or empty");

        int n = arr.length;
        int temp, j;


        for(int gap = n/2; gap >= 1; gap/=2){

            for (int i = gap; i < n; i++) {

                temp = arr[i];
                j = i - gap;

                while( j >= 0 && arr[j] > temp){
                    arr[j+gap] = arr[j];
                    j = j - gap;
                }

                arr[j+gap] = temp;
            }
        }
    }
}
