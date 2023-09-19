package org.karthick.dsa.stack.problems;

import java.util.Stack;

public class ParenthesisMatching {

    public static boolean isValidParenthesis(String exp){
        if(exp == null)
            throw new IllegalArgumentException("The expression should not be null");

        char[] c = exp.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char value : c) {

            if (isOpenParenthesis(value)) {
                stack.push(value);
            } else if (isCloseParenthesis(value)) {

                if (stack.isEmpty())
                    return false;
                else {
                    char temp = stack.pop();
                    if (temp != getOpenParenthesis(value))
                        return false;
                }

            }
        }

        return stack.isEmpty();

    }

    private static boolean isOpenParenthesis(char c){
        return c == '(' || c == '[' || c == '{';
    }

    private static boolean isCloseParenthesis(char c){
        return c == ')' || c == ']' || c == '}';
    }

    private static char getOpenParenthesis(char c){
        if(c == ')')return '(';
        if(c == ']')return '[';
        if(c == '}')return '{';
        return '\0';
    }
}
