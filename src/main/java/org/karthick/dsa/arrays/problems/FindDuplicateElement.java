package org.karthick.dsa.arrays.problems;

public class FindDuplicateElement {

    /*
       This method receives unsorted array of integers as params and display multiple missing elements
   */
    public static void findDuplicatedElementFromUnsortedArray(int[] arr, int length) {
        int max = findMax(arr, length);
        int hastTableLength = max+1;
        int[] hashtable = new int[hastTableLength];
        for(int i = 0; i < length; i++){
            hashtable[arr[i]]++;
        }


        for(int i = 1; i < hastTableLength; i++){
            if(hashtable[i] > 1)
                System.out.printf("Array element %d repeated %d times\n", i, hashtable[i]);

        }
    }

    public static void findDuplicatedFromSorted(int[] arr, int length) {

        int lastDuplicated = 0, j;

        for(int i = 0; i < length - 1; i++){
            if(arr[i] == arr[i+1] && arr[i] != lastDuplicated){
                j = i+1;
                while(arr[j] == arr[i]){
                    j++;
                }
                System.out.printf("Array element %d is repeated %d times\n", arr[i], j-i);
                lastDuplicated = arr[i];
            }
        }
    }

    public static int findMax(int[] arr, int length) {
        int max = arr[0];
        for (int i = 1; i < length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }


}
