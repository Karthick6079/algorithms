package org.karthick.algorithms;

public class SelectionSort {

    public static int[] sort(int[] arr){
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Input array should not be null or empty");

        int n = arr.length, minIndex;
        for(int i = 0 ; i < n; i++){
            // find the smallest number
            minIndex = findMinimumIndex(arr, i, n);
            // swap that with current element
            swap(arr,i, minIndex);
        }
        return arr;
    }

    private static int findMinimumIndex(int[] arr, int currentIndex, int n){
        int minValue = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int j = currentIndex; j < n; j++){
            if(arr[j] < minValue){
                minValue = arr[j];
                minIndex = j;
            }
        }
        return minIndex;
    }

    private static void swap(int[] arr, int start, int end){
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
