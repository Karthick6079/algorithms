package org.karthick.dsa.stack;

public class Stack {

    private int size;

    private int top = -1;

    private int[] stack;

    public Stack(int size) {
        assert size > 0;
        this.size = size;
        this.stack = new int[size];
    }

    public void push(int element) {
        if (!isFull())
            stack[++top] = element;
        else
            System.out.println("Oops! Stack is full! Please delete some elements");

    }

    public int pop() {
        if (!isEmpty())
            return stack[top--];
        else {
            System.out.println("Oops! Stack is empty! Please add some elements to delete");
            return -1;
        }

    }

    public int peek(int position) {
        if (top - position + 1 < 0) {
            System.out.println("Invalid Position");
            return -1;
        } else
            return stack[top - position + 1];
    }

    public int stackTop(){
        if(!isEmpty())
            return stack[top];
        else
            return -1;
    }


    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

}
