package org.karthick.dsa.strings.problems;

public class FindDuplicateCharacter {

    public static void findDuplicateCharacters(String str) {
        if(str == null || str.isBlank())
            throw new IllegalArgumentException("Invalid Argument!");

        char[] c = str.toCharArray();
        int[] hashtable = new int[26];

        for(int i = 0; i < c.length; i++){
            hashtable[c[i]-97]++;
        }

        for(int i = 0 ; i < 26; i++){
            if(hashtable[i] > 1){
                char dc = (char) (i+97);
                System.out.printf("\nThe character %c repeated %d times",dc, hashtable[i]);
            }

        }
    }


    /*
        Finding the duplicates using bitwise operators
     */
    public static void findDuplicateCharactersMethod2(String str) {
        if(str == null || str.isBlank())
            throw new IllegalArgumentException("Invalid Argument!");

        char[] c = str.toCharArray();
        int x = 0, h = 0;
        for(int i= 0; i < c.length; i++){

            x = 1;
            x = x << (c[i] - 97); // Left shifting bit value 1 based on character type

            if((x & h) > 0){ //Masking(ANDing)- checking the corresponding bit values is already on, means 1

                System.out.printf("The character %c is duplicated\n", c[i]);
            }
            h = x | h; // Merging(ORing) - setting corresponding bit values as 1

        }


    }

}
