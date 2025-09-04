package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_8;

import com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility;
import com.interviewprep.bctci.chapter_34_LinkedList.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.getLastNode;

class LinkedListCycleDetectionTest {

    @Test
    public void hasCycleTest() {
        // empty list
        Node<Integer> list = LinkedListTestUtility.createListFromValues(new Integer[]{});
        Assertions.assertFalse(LinkedListCycleDetection.hasCycle(list));

        // single element without cycle
        list = LinkedListTestUtility.createListFromValues(new Integer[]{1});
        Assertions.assertFalse(LinkedListCycleDetection.hasCycle(list));

        // multiple elements without cycle
        list = LinkedListTestUtility.createListFromValues(new Integer[]{1, 2, 3, 4, 5});
        Assertions.assertFalse(LinkedListCycleDetection.hasCycle(list));

        // single element with cycle
        list = LinkedListTestUtility.createListFromValues(new Integer[]{1});
        getLastNode(list).next = list;
        Assertions.assertTrue(LinkedListCycleDetection.hasCycle(list));

        // multiple elements with single element cycle
        list = LinkedListTestUtility.createListFromValues(new Integer[]{1, 2, 3, 4});
        Node<Integer> lastNode = getLastNode(list);
        lastNode.next = lastNode;
        Assertions.assertTrue(LinkedListCycleDetection.hasCycle(list));

        // multiple elements with cycle
        list = LinkedListTestUtility.createListFromValues(new Integer[]{1, 2, 3, 4, 5});
        lastNode = getLastNode(list);
        lastNode.next = list.next.next;
        Assertions.assertTrue(LinkedListCycleDetection.hasCycle(list));

    }
}