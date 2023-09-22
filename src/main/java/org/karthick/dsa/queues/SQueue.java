package org.karthick.dsa.queues;

import java.util.Stack;

public class SQueue {

    private Stack<Integer> stack1;

    private Stack<Integer> stack2;


    public SQueue(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }


    public void enqueue(int element){

        stack1.push(element);

    }

    public int dequeue(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("The queue is empty");
        } else {
            if(stack2.empty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
        }
        return stack2.pop();
    }




}
