package org.karthick.dsa.strings.problems;

public class FindingWords {

    public static void findVowelsAndConsonants(String str) {
        if(str == null || str.isBlank())
            throw new IllegalArgumentException("Invalid Argument!");

        char[] c = str.toCharArray();
        int vCount = 0, cCount = 0;
        for(int i = 0; i < c.length; i++){
            if(isVowel(c[i]))
                vCount++;
            else if(isAlphabet(c[i]))
                cCount++;
        }

        System.out.printf("\n The vowels count is %d\n The consonants count is %d", vCount, cCount);

    }

    public static int findWords(String str) {
        if(str == null || str.isBlank())
            throw new IllegalArgumentException("Invalid Argument!");

        char[] c = str.toCharArray();
        int wCount = 0;
        for(int i = 0; i < c.length; i++){
           if(c[i] == ' ' && c[i-1] != ' ')
               wCount++;
        }
        return wCount + 1;
    }

    public static boolean isValidString(String str) {
        if(str == null || str.isBlank())
            throw new IllegalArgumentException("Invalid Argument!");

        char[] c = str.toCharArray();

        for(int i = 0; i < c.length; i++){
            if(!isValidString(c[i])){
                return false;
            }
        }
        return true;
    }

    private static boolean isVowel(char c) {
        return (c == 'A'|| c == 'E' || c == 'I' || c == 'O' || c == 'U'
        || c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u') ;

    }

    private static boolean isAlphabet(char c) {
        return (c >=65 && c <= 90) || (c >=97 && c <= 122);
    }

    private static boolean isDigit(char c) {
        return (c >=48 && c <= 57);
    }

    private static boolean isValidString(char c) {
        return isAlphabet(c) || isDigit(c);
    }


}
