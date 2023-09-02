package org.karthick.dsa.arrays.problems;

public class FindMissingElement {


    /*
    This method receives sorted array of integers as params and returns missing one element
    if the element value start from 1
     */
    public static int findMissingElement(int[] arr, int length) {

        int n = arr[length-1];

        // finding sum of given elements
        int sum = 0;
        for (int i = 0; i < length; i++) {
           sum = sum + arr[i];
        }

        // finding the sum of natural numbers from 1 to nth
        // n*(n+1)/2

        int s = n*(n+1)/2;

        return s - sum;
    }


    /*
   This method receives sorted array of integers as params and display missing one element
   if the element value not start from 1
    */
    public static void findMissingElementMethod2(int[] arr, int length) {

        int difference = arr[0];
        int missingElement;

        for (int i = 0; i < length; i++) {

            if(arr[i] - i != difference){
                missingElement = difference + i;
                System.out.print("Missing element is " + missingElement);
                break;
            }

        }

    }


     /*
   This method receives sorted array of integers as params and display multiple missing elements
   if the element value not start from 1
    */
    public static void findMultipleMissingElement(int[] arr, int length) {
        int difference = arr[0];
        int missingElement;

        for (int i = 0; i < length; i++) {

            if(arr[i] - i != difference){

                while(difference < arr[i] - i){
                    missingElement = difference + i;
                    System.out.printf("%d " , missingElement );
                    difference++;
                }
            }

        }
    }

    /*
        This method receives unsorted array of integers as params and display multiple missing elements
    */
    public static void findMissingElementFromUnsortedArray(int[] arr, int length) {
        int max = findMax(arr, length);
        int hastTableLength = max+1;
        int[] hashtable = new int[hastTableLength];
        for(int i = 0; i < length; i++){
            hashtable[arr[i]]++;
        }


        for(int i = 1; i < hastTableLength; i++){
            if(hashtable[i] == 0)
                System.out.printf("%d ", i);
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
