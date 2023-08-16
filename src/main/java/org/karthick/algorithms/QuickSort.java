package org.karthick.algorithms;

public class QuickSort {

    public static  void sort(int[] arr){
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Input array should not be null or empty");
        quickSort(arr, 0, arr.length - 1);
    }

    private static  void quickSort(int[] arr, int left, int right){
        int pivot;
        if(left < right){
            pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }

    }


    private static int partition(int[] arr, int left, int right){
        int i =  left  - 1;
        int pivot = arr[right] ;
        int mid;
        for(int j = left; j <= right - 1; j++){

            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        mid = i+1;
        swap(arr, mid, right);
        return mid;
    }

    private static void swap(int[] arr, int start, int end){
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
