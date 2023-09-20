package org.karthick.dsa.queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularQueueTest {
    @Test
    public void testCircularQueue() {

        CircularQueue q = new CircularQueue(7);
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
        assertFalse(q.isFull());
    }


}