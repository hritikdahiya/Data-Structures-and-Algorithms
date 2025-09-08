package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_14;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;
import org.junit.jupiter.api.Test;

import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.areListsEqual;
import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.createListFromValues;

class LinkedListBlockReversalTest {
    @Test
    public void linkedListBlockReversalRecursiveTest() {
        Node<Integer> list = createListFromValues(new Integer[]{1});
        int k = 2;
        Node<Integer> expectedBlockReversedList = createListFromValues(new Integer[]{1});
        areListsEqual(expectedBlockReversedList, LinkedListBlockReversal.reverse(list, k));

        list = createListFromValues(new Integer[]{});
//        k = 2;
        expectedBlockReversedList = createListFromValues(new Integer[]{});
        areListsEqual(expectedBlockReversedList, LinkedListBlockReversal.reverse(list, k));


        list = createListFromValues(new Integer[]{1, 2, 3, 4});
//        k = 2;
        expectedBlockReversedList = createListFromValues(new Integer[]{2, 1, 4, 3});
        areListsEqual(expectedBlockReversedList, LinkedListBlockReversal.reverse(list, k));

        list = createListFromValues(new Integer[]{1, 2, 3, 4});
        k = 1;
        expectedBlockReversedList = createListFromValues(new Integer[]{1, 2, 3, 4});
        areListsEqual(expectedBlockReversedList, LinkedListBlockReversal.reverse(list, k));

        list = createListFromValues(new Integer[]{1, 2, 3, 4});
        k = 3;
        expectedBlockReversedList = createListFromValues(new Integer[]{3, 2, 1, 4});
        areListsEqual(expectedBlockReversedList, LinkedListBlockReversal.reverse(list, k));


        list = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
//        k = 3;
        expectedBlockReversedList = createListFromValues(new Integer[]{3, 2, 1, 6, 5, 4, 9, 8, 7, 10, 11});
        areListsEqual(expectedBlockReversedList, LinkedListBlockReversal.reverse(list, k));
    }

    @Test
    public void linkedListBlockReversalIterativeTest() {
        Node<Integer> list = createListFromValues(new Integer[]{1});
        int k = 2;
        Node<Integer> expectedBlockReversedList = createListFromValues(new Integer[]{1});
        areListsEqual(expectedBlockReversedList, LinkedListBlockReversal.reverseIterative(list, k));

        list = createListFromValues(new Integer[]{});
//        k = 2;
        expectedBlockReversedList = createListFromValues(new Integer[]{});
        areListsEqual(expectedBlockReversedList, LinkedListBlockReversal.reverseIterative(list, k));


        list = createListFromValues(new Integer[]{1, 2, 3, 4});
//        k = 2;
        expectedBlockReversedList = createListFromValues(new Integer[]{2, 1, 4, 3});
        areListsEqual(expectedBlockReversedList, LinkedListBlockReversal.reverseIterative(list, k));

        list = createListFromValues(new Integer[]{1, 2, 3, 4});
        k = 1;
        expectedBlockReversedList = createListFromValues(new Integer[]{1, 2, 3, 4});
        areListsEqual(expectedBlockReversedList, LinkedListBlockReversal.reverseIterative(list, k));

        list = createListFromValues(new Integer[]{1, 2, 3, 4});
        k = 3;
        expectedBlockReversedList = createListFromValues(new Integer[]{3, 2, 1, 4});
        areListsEqual(expectedBlockReversedList, LinkedListBlockReversal.reverseIterative(list, k));


        list = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
//        k = 3;
        expectedBlockReversedList = createListFromValues(new Integer[]{3, 2, 1, 6, 5, 4, 9, 8, 7, 10, 11});
        areListsEqual(expectedBlockReversedList, LinkedListBlockReversal.reverseIterative(list, k));
    }
}