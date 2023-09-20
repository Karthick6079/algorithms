package org.karthick.dsa.stack.problems;

import java.util.Stack;

public class EvaluationPostfix {

    public static int evaluate(String postfix) {
        char[] c = postfix.toCharArray();
        Stack<Integer> stack = new Stack<>();

        int x1,x2, result = -1;

        for (char value : c) {
            if (isOperand(value)) {
                stack.push(value-'0');
            } else {
                x2 = stack.pop();
                x1 = stack.pop();
                if (value == '+')
                    result = x1 + x2;
                else if (value == '-')
                    result = x1 - x2;
                else if (value == '*')
                    result = x1 * x2;
                else if (value == '/')
                    result = x1 / x2;

                stack.push(result);
            }
        }
        return result;
    }

    public static boolean isOperand(char c){
        if(c == '+' || c == '-' || c == '/' || c == '*'){
            return false;
        } else{
            return true;
        }
    }
}
