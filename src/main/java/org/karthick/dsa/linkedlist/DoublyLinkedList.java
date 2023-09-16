package org.karthick.dsa.linkedlist;

public class DoublyLinkedList {

    static class Node {

        private Node prev;
        private int data;
        private Node next;

        public Node(Node prev, int data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    private Node first = null;

    public Node getFirst() {
        return first;
    }

    public void create(int[] a, int n){

        Node temp, last;

        temp = new Node(null,a[0],null);

        first = temp;
        last = temp;

        for(int i = 1; i<n; i++){
            temp = new Node(null,a[i],null);
            temp.prev = last;
            last.next = temp;
            last = temp;
        }
    }

    public void display(){

        if(first == null)
            return;

        Node p = first;

        while(p != null){
            System.out.printf("%d ", p.data);
            p = p.next;
        }
        System.out.println();

    }

    public int length(){

        if(first == null)
            return 0;

        Node p = first;
        int count=  0;

        while(p != null){
           count++;
            p = p.next;
        }
       return count;

    }

    public void insert(int index, int element){

        if(index < 0 || index > length())
            return;

        Node p,q,temp ;

        if(index == 0){
            temp = new Node(null, element, null);
            temp.next = first;
            temp.prev = null;
            if(first == null){
                first = temp;
                return;
            }
            first.prev = temp;
            first = temp;
        } else{
            p = first;
            for(int i = 0; i < index - 1; i++){
                 p = p.next;
            }
            q = p.next;
            temp = new Node(null, element, null);
            temp.next = q;
            temp.prev = p;

            p.next = temp;
            q.prev = temp;

        }
    }

    public void delete(int index){
        if(index < 0 || index > length() || first == null)
            return;

        Node p,q,r;

        if(index == 1){
            p = first;
            if(first.next == null){
                first = null;
                return;
            }
            p = first.next;
            p.prev = null;
            first = p;
        } else{
            p = first;
            for (int i = 0; i < index - 2; i++) {
                p = p.next;
            }
            q = p.next;
            r = q.next;
            p.next = r;
            if( r != null){
                r.prev = p;
            }
        }
    }

    public void printInBackwards(int position){

        if(position < 0 || position > length() || first == null)
            return;

        Node p = first;
        for(int i = 0; i < position - 1; i++){
            p = p.next;
        }

        while(p != null){
            System.out.printf("%d ", p.data);
            p = p.prev;
        }

        System.out.println();

    }
}
