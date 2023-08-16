package org.karthick.algorithms;

public class InsertionSort {


    /*
        The sorting will start from second element, and it considers as key,
        Key will be compare with its before elements
        while the key is less than it comparing element and not staring of array,
        shift larger elements to right
        repeat above steps until find an element that is smaller than key or beginning of array
        insert the key to empty space created by shifting
        Move to next element, consider that as new key follow above process until all
        elements is sorted!
     */
    public static int[] sort(int[] arr){
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Input array should not be null or empty");

        int n = arr.length,j, key;
        for(int i = 1; i < n; i++ ){
            key = arr[i];
            j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
