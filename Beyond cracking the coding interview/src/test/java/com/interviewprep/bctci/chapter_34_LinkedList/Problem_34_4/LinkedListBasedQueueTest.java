package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListBasedQueueTest {

    @Test
    public void linkedListBaseQueueTest() {
        LinkedListBasedQueue<Integer> queue = new LinkedListBasedQueue<>();

        Assertions.assertTrue(queue.empty());
        Assertions.assertEquals(0, queue.size());
        Assertions.assertNull(queue.peek());
        Assertions.assertNull(queue.pop());

        queue.push(1);
        queue.push(2);
        queue.push(3);

        Assertions.assertEquals(3, queue.size());
        Assertions.assertEquals(1, queue.peek());

        Assertions.assertFalse(queue.empty());

        Assertions.assertEquals(1, queue.pop());
        Assertions.assertEquals(2, queue.pop());
        Assertions.assertEquals(1, queue.size());
        Assertions.assertEquals(3, queue.pop());

        Assertions.assertTrue(queue.empty());
        Assertions.assertEquals(0, queue.size());

    }
}