package org.karthick.dsa.stack.problems;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfixToPostfixTest {

    @Test
    public void testCase1() {
        String infix = "((a+b)*c)-d^e^f";
        System.out.printf("The infix %s is converted to postfix as %s", infix, InfixToPostfix.convert(infix));
    }

    @Test
    public void testIsOperator() {
        String infix = "a+b*c-d/e";
        System.out.printf("The infix %s is converted to postfix as %s", infix, InfixToPostfix.convert(infix));
    }

}