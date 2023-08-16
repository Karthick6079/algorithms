package org.karthick.algorithms;

public class MergeSort {

    private static int length = 0;


    //Implementation take reference from Coding with John youtube channal
    // this explanation is very understandable
    public static void mergeSort(int[] arr){
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Input array should not be null or empty");

        length = arr.length;
        // Merge sort not suitable for small case problems
        // so invoking the insertion sort if the input element size is less than 15
        if( length < 15 )
           InsertionSort.sort(arr);

        if( length < 2)
            return;

        int midIndex = length /2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[length - midIndex];

        for(int i = 0; i < midIndex; i++)
            leftHalf[i] = arr[i];

        for(int i = midIndex; i < length; i++)
            rightHalf[i-midIndex] = arr[i];


        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(arr, leftHalf, rightHalf);
    }



    private static void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, j = 0, k = 0;
        while(i < leftSize && j < rightSize){
            if(leftArray[i] < rightArray[j]){
                arr[k++] = leftArray[i++];
            } else{
                arr[k++] = rightArray[j++];
            }
        }

        while ( i < leftSize){
            arr[k++] = leftArray[i++];
        }

        while ( j < rightSize){
            arr[k++] = rightArray[j++];
        }
    }
}
