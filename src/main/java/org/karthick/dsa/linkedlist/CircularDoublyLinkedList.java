package org.karthick.dsa.linkedlist;

public class CircularDoublyLinkedList {

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

    private Node head = null;

    public Node getHead() {
        return head;
    }

    public void create(int[] a, int n){

        Node temp, last;

        temp = new Node(null,a[0],null);

        head = temp;
        head.next = head;
        head.prev = head;
        last = head;

        for(int i = 1; i<n; i++){
            temp = new Node(null,a[i],null);
            temp.prev = last;
            temp.next = head;
            head.prev = temp;
            last.next = temp;
            last = temp;
        }
    }

    public void display() {
        if (head == null)
            return;

        Node p = head;

        do {
            System.out.printf("%d ", p.data);
            p = p.next;
        } while (p != head);
        System.out.println();

    }

    public int length() {

        if (head == null)
            return 0;

        Node p = head;
        int count = 0;

        do {
            count++;
            p = p.next;
        } while (p != head);
        return count;

    }

    public void insert(int index, int element){

        if(index < 0 || index > length())
            return;

        Node p,q,temp, last ;

        if(index == 0){
            temp = new Node(null, element, null);
            temp.next = head;
            temp.prev = head;
            if(head == null){
                head = temp;
                return;
            }
            last = head.prev;
            temp.prev = last;
            last.next = temp;

            head = temp;

        } else{
            p = head;
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
        if(index < 0 || index > length() || head == null)
            return;

        Node p,q,r,last;

        if(index == 1){
            p = head;
            if(head.next == null){
                head = null;
                return;
            }
            last = head.prev;
            p = head.next;
            p.prev = last;
            last.next = p;
            head = p;
        } else{
            p = head;
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

        if(position < 0 || position > length() || head == null)
            return;

        Node p = head;
        int i = 0;
        for(; i < position - 1; i++){
            p = p.next;
        }

        while(i-- >= 0 ){
            System.out.printf("%d ", p.data);
            p = p.prev;
        }

        System.out.println();

    }
}
