package org.karthick.dsa.stack;

public class StackLL {

    private Node top;

    private int length;

    public Node getTop() {
        return top;
    }

    public int getLength() {
        return length;
    }

    static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


    public void push(int element){
        Node temp = new Node(element, null);

        temp.next = top;
        top = temp;
        length++;
    }

    public int pop(){
        if(isEmpty())
            return -1;
        Node p = top;
        top = top.next;
        length--;
        return p.data;
    }

    public boolean isEmpty(){
        return this.top == null;
    }

    public int peek(int index){
        if(isEmpty() || index < 0 || index > length)
            return -1;
        Node p = top;
        for(int i = 0 ; i < index - 1; i++)
            p = p.next;

        return p.data;
    }

    public int stackTop(){
        if(isEmpty())
            return -1;
        return top.data;
    }


}
