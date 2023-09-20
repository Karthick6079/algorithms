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
    public void testCase2() {
        String infix = "a+b*c-d/e";
        System.out.printf("The infix %s is converted to postfix as %s", infix, InfixToPostfix.convert2(infix));
    }

    @Test
    public void testCase3() {
        String infix = "5+4*4-8/2";
        System.out.printf("The infix %s is converted to postfix as %s", infix, InfixToPostfix.convert2(infix));
    }

}