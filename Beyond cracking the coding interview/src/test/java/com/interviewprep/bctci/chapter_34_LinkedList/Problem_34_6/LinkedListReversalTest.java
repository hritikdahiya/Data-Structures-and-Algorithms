package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_6;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;
import org.junit.jupiter.api.Test;

import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.areListsEqual;
import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.createListFromValues;

class LinkedListReversalTest {
    @Test
    public void linkedListReversalTest() {
        // empty list
        Node<Integer> listToReverse = createListFromValues(new Integer[0]);
        Node<Integer> expectedReversedList = createListFromValues(new Integer[0]);
        areListsEqual(expectedReversedList, LinkedListReversal.reverse(listToReverse));


        // single element list
        listToReverse = createListFromValues(new Integer[]{1});
        expectedReversedList = createListFromValues(new Integer[]{1});
        areListsEqual(expectedReversedList, LinkedListReversal.reverse(listToReverse));


        // regular list
        listToReverse = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        expectedReversedList = createListFromValues(new Integer[]{7, 6, 5, 4, 3, 2, 1});
        areListsEqual(expectedReversedList, LinkedListReversal.reverse(listToReverse));
    }
}