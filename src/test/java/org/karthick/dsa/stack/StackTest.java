package org.karthick.dsa.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    public void testStackUsingArray() {

        Stack s = new Stack(10);
        s.push(10);
        s.push(12);
        s.push(23);

        System.out.println(s.pop());
        System.out.println(s.pop());

        System.out.printf("The stack top element is %d\n", s.stackTop());

        System.out.printf("The newly deleted element %d\n", s.pop());

        System.out.println("Is stack is empty? " + s.isEmpty());

        s.push(10);
        s.push(12);
        s.push(23);

        System.out.printf("The 2nd element from stack is = %d", s.peek(2));


    }

}