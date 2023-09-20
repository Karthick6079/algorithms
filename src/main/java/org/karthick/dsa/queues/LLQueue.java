package org.karthick.dsa.queues;

public class LLQueue {

    static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node front = null;

    private Node rear = null;

    public void enqueue(int value){
        Node temp = new Node(value, null);
        if(front == null)
            front = rear = temp;
        else{
            rear.next = temp;
            rear = temp;
        }
    }

    public int dequeue(){
        int x = -1;
        if(isEmpty())
            return x;

        Node p = front;
        front = front.next;
        return p.data;
    }


    public boolean isEmpty(){
        return front == null;
    }
}
