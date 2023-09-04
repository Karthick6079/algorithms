package org.karthick.dsa.strings.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindingWordsTest {

    @Test
    public void testVowelsAndCosonantsCount() {
        String str = "Karthick Vasudevan";
        FindingWords.findVowelsAndConsonants(str);
    }

    @Test
    public void testVowelsAndCosonantsCount2() {
        String str = "Karthick";
        FindingWords.findVowelsAndConsonants(str);
    }

    @Test
    public void testWordsInGivenSentence() {
        String str = "Hello world, This is Karthick, Creating something new to the world!";
        assertEquals(11, FindingWords.findWords(str));
    }

    @Test
    public void testStringIsValid() {
        String str = "Welcome";
        assertEquals(true, FindingWords.isValidString(str));
    }

    @Test
    public void testStringIsNotValid() {
        String str = "Welcome@123";
        assertEquals(false, FindingWords.isValidString(str));
    }
}