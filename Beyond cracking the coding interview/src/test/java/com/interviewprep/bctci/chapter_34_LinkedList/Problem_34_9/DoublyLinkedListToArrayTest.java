package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_9;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.createListFromValues;

class DoublyLinkedListToArrayTest {
    @Test
    public void linkedListToArray() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        Node<Integer> list = createListFromValues(arr);

        Assertions.assertArrayEquals(arr, DoublyLinkedListToArray.linkedListToArray(list).toArray());

        Assertions.assertArrayEquals(arr, DoublyLinkedListToArray.linkedListToArray(list.next.next.next).toArray());

        arr = new Integer[]{1, 2, 3};
        list = createListFromValues(arr);
        Assertions.assertArrayEquals(arr, DoublyLinkedListToArray.linkedListToArray(list.next.next).toArray());


        // empty list
        arr = new Integer[]{};
        list = createListFromValues(arr);
        Assertions.assertArrayEquals(arr, DoublyLinkedListToArray.linkedListToArray(list).toArray());
    }
}