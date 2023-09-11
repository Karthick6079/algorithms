package org.karthick.dsa.linkedlist;

public class LinkedList {

    static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node first = null;

    private Node last = null;

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public void insert(int pos, int value) {
        if (pos < 0)
            throw new IllegalArgumentException("Invalid index");

        Node temp = new Node(value, null);
        Node q = null;
        Node p = first;

        if (first == null) {
            first = last = temp;
        } else if (pos == 0) {
            temp.next = first;
            first = temp;
            last = temp;
        } else {
            for (int i = 0; (i < pos - 1 && p != null); i++) {
                p = p.next;
            }
            if (p != null) {
                temp.next = p.next;
                p.next = temp;
            }

        }

    }

    public void insert(int value) {

        Node temp = new Node(value, null);

        if (first == null) {
            first = last = temp;
        }
        last.next = temp;
        last = temp;

    }

    public int delete(int pos) {

        assert pos > 0;

        Node p = first, q = null;

        int x = -1;

        if(first == null)
            return -1;

        if (pos == 1) {
            Node temp = first;
            first = first.next;
            x = temp.data;
            temp = null;
        } else {

            for (int i = 0; (i < pos - 1 && p != null); i++) {
                q = p;
                p = p.next;
            }

            if (p != null) {
                q.next = p.next;
                x= p.data;
                p = null;
            }
        }
        return x;
    }

    public void display() {
        Node p = first;

        while (p != null) {
            System.out.printf("%d ", p.data);
            p = p.next;
        }
    }

    public void rDisplay(Node p){

        if(p != null){
            System.out.printf("%d ", p.data);
            rDisplay(p.next);
        }
    }


    public void printElementsFromReverse(Node p){
        if(p != null){
            printElementsFromReverse(p.next);
            System.out.printf("%d ", p.data);
        }
    }

    public int max(){
        Node p = first;
        int max = Integer.MIN_VALUE;
        while(p!=null){
            if(p.data > max)
                max = p.data;
            p = p.next;
        }
        return max;
    }

    public int min(){
        Node p = first;
        int min = Integer.MAX_VALUE;
        while(p!=null){
            if(p.data < min)
                min = p.data;
            p = p.next;
        }
        return min;
    }

    // Iterative method to find sum of linked list
    public int sum(){
        Node p = first;
        int sum = 0;
        while(p!=null){
            sum+=p.data;
            p = p.next;
        }
        return sum;
    }

    // Recursive method to find the sum of linked list
    public int rSum(Node p){
        if(p == null)
            return  0;
        else
            return rSum(p.next)+p.data;
    }

    public int count(){
        Node p = first;
        int count = 0;
        while(p!=null){
            count++;
            p = p.next;
        }
        return count;
    }

    public int rCount(Node p){

        if(p == null)
            return  0;
        else
            return rCount(p.next)+1;
    }

    public Node search(int key){
        Node p = first;
        Node q = null;

        if(first.data == key){
            return first;
        } else{
            while(p!= null){
                if(key == p.data){
                    // Moving the search found element to first, fetch that element faster when next time same element is searched
                    q.next = p.next;
                    p.next = first;
                    first = p;
                    return p;
                }
                q = p;
                p = p.next;
            }
        }


        return null;
    }

    public Node rSearch(Node p, int key){
        if(p == null)
            return null;

        if(p.data == key)
            return p;
        else
            return rSearch(p.next, key);
    }

    public boolean isListSorted(){
        Node p = first;
        Node q = first.next;

        while(q != null){
            if(p.data > q.data)
                return  false;

            p = q;
            q = q.next;

        }

        return true;
    }

    public void removeDuplicateFromSorted(){
        Node p = first;
        Node q = first.next;

        while(q != null){
            if(p.data == q.data){
                p.next= q.next;
                q = p.next;
            }

            p = q;
            q = q.next;

        }
    }

    // This method used to reverse the data inside the node
    public void reverseLinkedListData(){

        Node p = first;
        int i = 0;
        int length = count();
        int[] a = new int[length];

        while (p != null){
            a[i++] = p.data;
            p = p.next;
        }
        p = first;
        i--;
        while(p != null){
            p.data = a[i--];
            p = p.next;
        }


    }

    // This method reverse links of Linked list
    public void reverseLink(){
        Node p = first;
        Node q = null;
        Node r;

        while( p != null){
            r=q;
            q=p;
            p=p.next;
            q.next = r;
        }

        first = q;
    }

    public void rReverseList(Node q, Node p){
        if(p != null){
            rReverseList(p,p.next);
            p.next = q;
        } else{
            first = q;
        }
    }

    public void concat(LinkedList list){
        Node p = first;
        while (p.next != null) {
            p = p.next;
        }
        p.next = list.getFirst();
        list = null;
    }

    public void merge(LinkedList list){

        Node p = first;
        Node q = list.getFirst();
        Node third = null;
        Node last = null;

        if(p.data < q.data){
            third = p;
            last = p;
            p = p.next;
        } else{
            third = q;
            last = q;
            q = q.next;
        }
        last.next = null;

        while(p != null && q != null){
            if(p.data < q.data){
                last.next = p;
                last = p;
                p  = p.next;
            } else{
                last.next = q;
                last = q;
                q  = q.next;
            }
            last.next = null;
        }

        if(p!= null)
            last.next = p;
        if(q!= null)
            last.next = q;

        first = third;

    }

    public boolean isLoop(){
        Node q;
        Node p = q =  first;

        do{
            p = p.next;
            q = q.next;
            q = q!= null ? q.next : null;
        } while( (p!=null && q != null) && (p != q) );

        return p == q;
    }

    //Helper method to create loop in linkedList
    public void makeLoop(int pos){

        Node p = first;
        Node q = first;

        for (int i = 0; (i < pos - 1 && p != null); i++) {
            p = p.next;
        }

        while(q.next != null){
            q = q.next;
        }

        q.next = p;

    }



}


