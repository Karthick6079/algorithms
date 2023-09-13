package org.karthick.dsa.linkedlist;

public class CircularLinkedList {

    static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head = null;

    public Node getHead() {
        return head;
    }

    public void create(int[] a, int n) {

        Node last;

        Node temp = new Node(a[0], null);
        head = temp;
        head.next = head;
        last = head;

        for (int i = 1; i < n; i++) {
            temp = new Node(a[i], null);
            last.next = temp;
            temp.next = head;
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

    private static int flag = 0;

    public void display(Node p) {

        if (p != head || flag == 0) {
            flag = 1;
            System.out.printf("%d ", p.data);
            display(p.next);
        }
        flag = 0;
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

    public void insert(int index, int element) {
        if (index < 0 || index > length())
            return;

        Node p = head;
        Node temp = new Node(element, null);

        if (p == null) {
            head = temp;
            head.next = head;
            return;
        }

        if (index == 0) {
            do {
                p = p.next;
            } while (p.next != head);

            p.next = temp;
            temp.next = head;
            head = temp;
        } else {
            for (int i = 0; i < index - 1; i++)
                p = p.next;

            temp.next = p.next;
            p.next = temp;
        }
    }


    public int delete(int index) {
        int x = -1;
        if (index < 0 || index > length())
            return x;

        Node p = head;
        Node q;

        if (index == 1) {
            while (p.next != head)
                p = p.next;

            if (p == head) {
                x = p.data;
                head = null;
                return x;
            }

            p.next = head.next;
            x = head.data;
            head = head.next;
        } else {
            for (int i = 0; i < index - 2; i++) {
                p = p.next;
            }
            q = p.next;
            p.next = q.next;
            x = q.data;

        }

        return x;
    }


}
