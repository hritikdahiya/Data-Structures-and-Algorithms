package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {

    @Test
    public void SinglyLinkedList() {
        SinglyLinkedList sll = new SinglyLinkedList();

        Assertions.assertEquals(0, sll.size());
        Assertions.assertNull(sll.popBack());
        Assertions.assertNull(sll.popFront());

        sll.pushFront(1);
        sll.pushFront(2);
        sll.pushBack(3);

        Assertions.assertEquals(3, sll.size());

        Assertions.assertTrue(sll.contains(3));
        Assertions.assertFalse(sll.contains(5));

        Assertions.assertEquals(2, sll.popFront());
        Assertions.assertEquals(3, sll.popBack());
        Assertions.assertEquals(1, sll.popBack());

        Assertions.assertEquals(0, sll.size());
    }

}