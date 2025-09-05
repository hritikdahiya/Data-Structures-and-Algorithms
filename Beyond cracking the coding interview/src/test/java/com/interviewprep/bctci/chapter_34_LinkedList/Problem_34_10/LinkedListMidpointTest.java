package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_10;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.createListFromValues;

class LinkedListMidpointTest {

    @Test
    public void findMidpointTest() {
        Node<Integer> list = createListFromValues(new Integer[]{1});
        Assertions.assertEquals(1, LinkedListMidpoint.findMidpoint(list));

        list = createListFromValues(new Integer[]{1, 2});
        Assertions.assertEquals(2, LinkedListMidpoint.findMidpoint(list));

        list = createListFromValues(new Integer[]{1, 2, 3});
        Assertions.assertEquals(2, LinkedListMidpoint.findMidpoint(list));

        list = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        Assertions.assertEquals(4, LinkedListMidpoint.findMidpoint(list));

        list = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        Assertions.assertEquals(5, LinkedListMidpoint.findMidpoint(list));
    }
}