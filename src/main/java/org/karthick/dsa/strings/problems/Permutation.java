package org.karthick.dsa.strings.problems;

import java.util.Arrays;

public class Permutation {

    private static int[] track;

    private static char[] result;

    public static void permutation(String str) {
        if(str == null || str.isBlank())
            throw new IllegalArgumentException("Invalid Argument!");

        char[] c = str.toCharArray();
        track =  new int[str.length()];
        result = new char[str.length()];
        permutation(c,0);
    }

    private static void permutation(char[] c, int k) {

        if(k == c.length){
            System.out.println(Arrays.toString(result));
        } else{
            for(int i = 0; i < c.length; i++){
                if(track[i] == 0){
                    track[i] = 1;
                    result[k] = c[i];
                    permutation(c, k+1);
                    track[i] = 0;
                }
            }
        }
    }
}
