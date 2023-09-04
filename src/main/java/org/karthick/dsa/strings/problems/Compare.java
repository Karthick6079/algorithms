package org.karthick.dsa.strings.problems;

public class Compare {

    public static void comparingCaseSensitive(String str1, String str2) {
        if(str1 == null || str1.isBlank())
            throw new IllegalArgumentException("Invalid Argument!");

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        if(c1.length != c2.length){
            System.out.println("The given string are not equal");
            return;
        }
        int i = 0, j = 0;
        for(;i < c1.length && j < c2.length; i++, j++){
            if(c1[i] != c2[j])
                break;
        }

        if(i == c1.length && j == c2.length)
            System.out.println("The given string are equals");
        else if (c1[i] > c2[j])
            System.out.println("The input string 1 is greater than input string 2");
        else if(c1[i] < c2[j])
            System.out.println("The input string 1 is smaller than input string 2");

    }
}
