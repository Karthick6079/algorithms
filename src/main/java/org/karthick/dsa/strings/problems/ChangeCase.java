package org.karthick.dsa.strings.problems;

public class ChangeCase {

    public static String toggleCase(String str) {
        if(str == null || str.isBlank())
            throw new IllegalArgumentException("Invalid Argument!");

        char[] c = str.toCharArray();

        for(int i = 0; i < c.length; i++){
            if(c[i] >= 65 && c[i] <= 90){
                c[i] += 32;
            } else if(c[i] >= 97 && c[i] <= 122){
                c[i] -= 32;
            }
        }
        return new String(c);

    }
}
