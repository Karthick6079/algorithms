package org.karthick.dsa.arrays.problems;

public class FindPairOfSum {

    // This method display pair of element, which produces the given sum when array is unsorted
    public static void findPair(int[] arr, int length, int k) {
        int diff;

        int max = findMax(arr, length);
        int hashtableSize = max+1;
        int[] hashtable = new int[hashtableSize];

        for(int i = 0; i < length; i++){
            diff = k - arr[i];
            if(diff < 0)
                continue;
            if(hashtable[diff] != 0)
                System.out.printf("%d + %d = %d\n", arr[i],diff, k);

            hashtable[arr[i]]++;
        }
    }

    // This method display pair of element, which produces the given sum when array is unsorted
    public static void findPairInSorted(int[] arr, int length, int k) {
        int i = 0;
        int j = length - 1;

        while(i < j){
            if(arr[i] + arr[j] == k){
                System.out.printf("%d + %d = %d\n", arr[i],arr[j], k);
                i++;
                j++;
            } else if(arr[i] + arr[j] > k){
                j--;
            } else{
                i++;
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
