package org.karthick.dsa.queues;

import org.junit.jupiter.api.Test;
import org.karthick.dsa.queues.AQueue;

import static org.junit.jupiter.api.Assertions.*;

class AQueueTest {

    @Test
    public void testEnQueueInQByArray() {

        AQueue q = new AQueue(7);
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
        assertTrue(q.isFull());
    }

}