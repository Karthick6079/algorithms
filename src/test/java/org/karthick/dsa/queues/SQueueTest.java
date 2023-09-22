package org.karthick.dsa.queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQueueTest {

  @Test
  public void testQueueCreatedByStack() {

      SQueue q = new SQueue();
      q.enqueue(10);
      q.enqueue(23);
      q.enqueue(12);
      q.enqueue(88);

      System.out.printf("%d ", q.dequeue());
      System.out.printf("%d ", q.dequeue());
      System.out.printf("%d ", q.dequeue());
  }

}