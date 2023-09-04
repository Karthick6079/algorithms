package org.karthick.dsa.strings.problems;

public class Reverse {

    public static String reverse(String str) {
        if(str == null || str.isBlank())
            throw new IllegalArgumentException("Invalid Argument!");

        char[] c = str.toCharArray();

        int i = 0, j = c.length - 1;

        while (i < j){
            swap(c, i, j);
            i++;
            j--;
        }
        return new String(c);
    }

    public static boolean isPalindrome(String str) {
        if(str == null || str.isBlank())
            throw new IllegalArgumentException("Invalid Argument!");

        String reversedString = reverse(str);
        return reversedString.equals(str);
    }

    private static void swap(char[] arr, int start, int end){
        char temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
