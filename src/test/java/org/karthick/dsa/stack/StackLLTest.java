package org.karthick.dsa.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackLLTest {
    @Test
    public void testStackUsingArray() {

        StackLL s = new StackLL();
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

        System.out.printf("The 2nd element from stack is = %d\n", s.peek(4));

        System.out.printf("The length of stack is = %d", s.getLength());


    }


}