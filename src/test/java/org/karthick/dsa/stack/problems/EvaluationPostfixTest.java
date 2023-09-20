package org.karthick.dsa.stack.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluationPostfixTest {

    @Test
    public void test() {
        String postfix = "544*+82/-";
        System.out.printf("The postfix is %s and its evaluation value is %d", postfix, EvaluationPostfix.evaluate(postfix));

    }

}