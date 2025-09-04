package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListBasedStackTest {
    @Test
    public void linkedListBaseStackTest() {
        LinkedListBasedStack<Integer> stack = new LinkedListBasedStack<>();

        Assertions.assertTrue(stack.empty());
        Assertions.assertEquals(0, stack.size());
        Assertions.assertNull(stack.peek());
        Assertions.assertNull(stack.pop());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assertions.assertEquals(3, stack.size());
        Assertions.assertEquals(3, stack.peek());

        Assertions.assertFalse(stack.empty());

        Assertions.assertEquals(3, stack.pop());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertEquals(1, stack.size());
        Assertions.assertEquals(1, stack.pop());

        Assertions.assertTrue(stack.empty());
        Assertions.assertEquals(0, stack.size());

    }
}