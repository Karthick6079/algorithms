package org.karthick.dsa.queues;

public class CircularQueue {


    private final int size;

    private int front = 0;

    private int rear = 0;

    private int[] q;

    public CircularQueue(int size){
        this.size = size;
        this.q = new int[this.size];
    }

    public int getFirst() {
        if(isEmpty())
            return -1;
        return q[front+1];
    }

    public int getLast() {
        if(isEmpty())
            return -1;
        return q[rear];
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public boolean isFull(){
        return (rear + 1) % size == front;
    }

    public void enqueue(int value){
        if(isFull())
            System.out.println("Queue is full");
        else {
            rear = (rear + 1) % size;
            q[rear] = value;
        }
    }

    public int dequeue(){
        int x = -1;
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            front = (front + 1) % size;
            x=  q[front];
        }
        return x;
    }
}
