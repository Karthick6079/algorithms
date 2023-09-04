package org.karthick.dsa.strings.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicateCharacterTest {

    @Test
    public void testDuplicatedCharacterInString() {
        String str = "finding";
        FindDuplicateCharacter.findDuplicateCharacters(str);
    }

    @Test
    public void testDuplicatedCharacterInStringUsingMethod2() {
        String str = "finding";
        FindDuplicateCharacter.findDuplicateCharactersMethod2(str);
    }

}