package org.karthick.dsa.stack.problems;

import org.junit.jupiter.api.Test;

class ParenthesisMatchingTest {

    @Test
    public void testIsParenthesisMatchingWorkingOrNotCase1() {
        String exp = "(a+b)+(w+b)";
        System.out.printf("%s is having valid parenthesis? %s", exp, ParenthesisMatching.isValidParenthesis(exp) ? "Yes": "No");
    }

    @Test
    public void testIsParenthesisMatchingWorkingOrNotCase2() {
        String exp = "([a+b)+(w+b)";
        System.out.printf("%s is having valid parenthesis? %s", exp, ParenthesisMatching.isValidParenthesis(exp) ? "Yes": "No");
    }


    @Test
    public void testIsParenthesisMatchingWorkingOrNotCase3() {
        String exp = "{([a+b])}+(w+b)";
        System.out.printf("%s is having valid parenthesis? %s", exp, ParenthesisMatching.isValidParenthesis(exp) ? "Yes": "No");
    }


}