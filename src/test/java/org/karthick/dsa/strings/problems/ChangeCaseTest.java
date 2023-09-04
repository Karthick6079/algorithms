package org.karthick.dsa.strings.problems;

import org.junit.jupiter.api.Test;
import org.karthick.dsa.strings.problems.ChangeCase;

import static org.junit.jupiter.api.Assertions.*;

class ChangeCaseTest {

    @Test
    public void testToggleCaseInString() {
        String str = "WelCome";
       assertEquals("wELcOME", ChangeCase.toggleCase(str));
    }

}