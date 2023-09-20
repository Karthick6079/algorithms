package org.karthick.dsa.queues;

public class AQueue {

    private final int size;

    private int front = -1;

    private int rear = -1;

    private int[] q;

    public AQueue(int size){
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

    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full");
        } else {
            rear++;
            q[rear] = element;
        }
    }

    public int dequeue(){
        int x = - 1;
        if(isEmpty()){
            System.out.println("Queue is empty");
        } else {
            front++;
            x = q[front];
        }
        return x;
    }


    public boolean isEmpty(){
        return front == rear;
    }

    public boolean isFull(){
        return rear == this.size - 1;
    }
}
