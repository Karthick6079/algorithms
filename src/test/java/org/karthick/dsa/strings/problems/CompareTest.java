package org.karthick.dsa.strings.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTest {

    @Test
    public void testComparingNotEqualStrings() {
        String str1 = "Painter";
        String str2 = "Painting";
        Compare.comparingCaseSensitive(str1, str2);
    }

    @Test
    public void testComparingTheEqualStrings() {
        String str1 = "Kumar1";
        String str2 = "Kumar";
        Compare.comparingCaseSensitive(str1, str2);
    }
}