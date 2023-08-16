package org.karthick.algorithms;

public class BubbleSort {

    /*
        This method will sort the given items in array by comparaing, each element one by one
        The first element will compare with second element, if it is greater than second element,
        the elements swapped. By doing this, the largest value in array will push towards last or highest index,
        Like bubbles raising in the water surface. So this sort called bubble sort.
     */
    public static int[] sort(int[] arr){
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Input array should not be null or size greater than 0");

        int temp;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    /*
    This is optimized bubble sort algorithm it will not iterate array full if array is sorted is intermediate steps
     */

    public static int[] sortOptimized(int[] arr){
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Input array should not be null or size greater than 0");

        int temp;
        boolean isSwaped = false;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            isSwaped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwaped = true;
                }
            }
            // If any of element is not swapped in previous iteration then array is sort, no need proceed further,
            // So breaking outer loop
            if(!isSwaped)
                break;
        }

        return arr;
    }

}
