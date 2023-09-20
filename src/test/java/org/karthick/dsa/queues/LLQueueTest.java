package org.karthick.dsa.queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LLQueueTest {

    @Test
    public void testQueueWhichImplementedUsingLinkedList() {

        LLQueue q = new LLQueue();
        q.enqueue(10);
        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(8);
        q.enqueue(3);

        assertEquals(10, q.dequeue());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        assertTrue(q.isEmpty());
        q.enqueue(10);
        q.enqueue(5);
        q.enqueue(2);

        assertEquals(10, q.dequeue());
    }

}