package org.karthick.algorithms;

import java.util.Arrays;

public class HeapSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Input array should not be null or empty");

        int inputArrayLen = arr.length;

        // Heapify the given input Array
        // Dividing the len / 2 to ignore the leaf node for heapify
        for (int i = inputArrayLen/2 - 1  ; i >= 0 ; i--){
            heapify(arr, inputArrayLen, i);
        }

        //Remove the root element
        for (int i = inputArrayLen - 1  ; i  >0; i--){
            // Storing the root element in temp variable
            // replace root value with last element value
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }



        Arrays.stream(arr).forEach((element) -> System.out.print(" " + element));

    }

    private static void heapify(int[] arr, int length, int currentNodeIndex){
        int largest = currentNodeIndex;

        int leftChildIndex = 2 * currentNodeIndex  + 1;
        int rightChildIndex = 2 * currentNodeIndex + 2;

        if(leftChildIndex < length && arr[leftChildIndex] > arr[largest])
            largest = leftChildIndex;

        if(rightChildIndex < length && arr[rightChildIndex] > arr[largest])
            largest = rightChildIndex;

        if(largest != currentNodeIndex){
            swap(arr, currentNodeIndex, largest);
            heapify(arr, length, largest);
        }


    }
    private static void swap(int[] arr, int start, int end){
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
