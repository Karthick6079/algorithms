package org.karthick.dsa.stack.problems;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Stack;

// This class will convert the infix expression to postfix. Use this class for expression if you don't have
// Parenthesis and other associativity.
public class InfixToPostfix {


    private static HashMap<String, Record> lookUpTable = new LinkedHashMap<>();

    static {
        createPrecedenceTable();
    }


    public static String convert(String infix) {

        char[] c = infix.toCharArray();
        char[] postfix = new char[c.length];
        Stack<Record> stack = new Stack<>();
//        stack.push(new Record("$",0,0));
        int i = 0,j = 0;

        while(i < c.length){
            if(isOperand(String.valueOf(c[i]))){
                postfix[j++] = c[i++];
            } else {
                if(stack.isEmpty() || getOutStackPrecedence(String.valueOf(c[i])) > stack.peek().getInStackPrecedence()){
                    stack.push(lookUpTable.get(String.valueOf(c[i])));
                    i++;
                } else if (getOutStackPrecedence(String.valueOf(c[i])) == getInStackPrecedence(stack.peek().getSymbol())){
                    stack.pop();
                } else {
                    postfix[j++] = stack.pop().getSymbol().toCharArray()[0];
                }
            }
        }

        while(!stack.isEmpty() && !stack.peek().getSymbol().equals(")")){
            postfix[j++] = stack.pop().getSymbol().toCharArray()[0];
        }



        return new String(postfix);
    }


    public static void createPrecedenceTable(){
        Record r1 = new Record("+",1,3);
        Record r2 = new Record("*",2,4);
        Record r3 = new Record("^",6,5);
        Record r4 = new Record("(",7,0);
        Record r5 = new Record(")",0,0);

        Record r6 = new Record("-",1,3);
        Record r7 = new Record("/",2,4);

        lookUpTable.put(r1.getSymbol(), r1);
        lookUpTable.put(r2.getSymbol(), r2);
        lookUpTable.put(r3.getSymbol(), r3);
        lookUpTable.put(r4.getSymbol(), r4);
        lookUpTable.put(r5.getSymbol(), r5);
        lookUpTable.put(r6.getSymbol(), r6);
        lookUpTable.put(r7.getSymbol(), r7);
    }


    private static int getInStackPrecedence(String c){
        return  lookUpTable.get(c).getInStackPrecedence();
    }

    private static int getOutStackPrecedence(String c){
        return  lookUpTable.get(c).getOutStackPrecedence();
    }

    private static boolean isOperand(String c) {
        return lookUpTable.get(c) == null;
    }







}
