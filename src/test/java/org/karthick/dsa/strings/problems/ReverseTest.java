package org.karthick.dsa.strings.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    public void testReversingStringPalindromeString() {
        String str = "madam";
        System.out.println(Reverse.reverse(str));
    }


    @Test
    public void testReversingStringIsPalindromeString() {
        String str = "madam";
        assertEquals(true, Reverse.isPalindrome(str));
    }

    @Test
    public void testReversingStringIsNotPalindromeString() {
        String str = "Welcome";
        assertEquals(false, Reverse.isPalindrome(str));
    }


    @Test
    public void testReversingStringNormalString() {
        String str = "Karthick";
        System.out.println(Reverse.reverse(str));
    }

}