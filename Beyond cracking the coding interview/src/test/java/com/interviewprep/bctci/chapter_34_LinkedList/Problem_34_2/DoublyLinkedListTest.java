package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {

    @Test
    public void DoublyLinkedList() {
        DoublyLinkedList dll = new DoublyLinkedList();

        Assertions.assertEquals(0, dll.size());
        Assertions.assertNull(dll.popBack());
        Assertions.assertNull(dll.popFront());

        dll.pushFront(1);
        dll.pushFront(2);
        dll.pushBack(3);

        Assertions.assertEquals(3, dll.size());

        Assertions.assertTrue(dll.contains(3));
        Assertions.assertFalse(dll.contains(5));

        Assertions.assertEquals(2, dll.popFront());
        Assertions.assertEquals(3, dll.popBack());
        Assertions.assertEquals(1, dll.popBack());

        Assertions.assertEquals(0, dll.size());
    }
}