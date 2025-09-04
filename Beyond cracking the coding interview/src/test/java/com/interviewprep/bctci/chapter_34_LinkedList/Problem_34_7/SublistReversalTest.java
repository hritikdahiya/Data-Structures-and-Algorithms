package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_7;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;
import org.junit.jupiter.api.Test;

import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.areListsEqual;
import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.createListFromValues;

class SublistReversalTest {
    @Test
    public void reverseTest() {
        // empty list
        Node<Integer> listToReverse = createListFromValues(new Integer[0]);
        Node<Integer> expectedReversedList = createListFromValues(new Integer[0]);
        areListsEqual(expectedReversedList, SublistReversal.reverse(listToReverse, 0, 1));

        // single element list
        listToReverse = createListFromValues(new Integer[]{1});
        expectedReversedList = createListFromValues(new Integer[]{1});
        areListsEqual(expectedReversedList, SublistReversal.reverse(listToReverse, 0, 0));

        // reverse entire list - with n equal to exact end index
        listToReverse = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        expectedReversedList = createListFromValues(new Integer[]{8, 7, 6, 5, 4, 3, 2, 1});
        areListsEqual(expectedReversedList, SublistReversal.reverse(listToReverse, 0, 7));

        // reverse entire list - with large end index
        listToReverse = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        expectedReversedList = createListFromValues(new Integer[]{8, 7, 6, 5, 4, 3, 2, 1});
        areListsEqual(expectedReversedList, SublistReversal.reverse(listToReverse, 0, 100));

        // start after list size
        listToReverse = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        expectedReversedList = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        areListsEqual(expectedReversedList, SublistReversal.reverse(listToReverse, 10, 100));

        // start at the end of the list
        listToReverse = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        expectedReversedList = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        areListsEqual(expectedReversedList, SublistReversal.reverse(listToReverse, 7, 7));

        // start in middle and end very large
        listToReverse = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        expectedReversedList = createListFromValues(new Integer[]{1, 2, 3, 8, 7, 6, 5, 4});
        areListsEqual(expectedReversedList, SublistReversal.reverse(listToReverse, 3, 10));

        // start at the beginning and end in the middle
        listToReverse = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        expectedReversedList = createListFromValues(new Integer[]{4, 3, 2, 1, 5, 6, 7, 8});
        areListsEqual(expectedReversedList, SublistReversal.reverse(listToReverse, 0, 3));

        // start and end in the middle
        listToReverse = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        expectedReversedList = createListFromValues(new Integer[]{1, 2, 6, 5, 4, 3, 7, 8});
        areListsEqual(expectedReversedList, SublistReversal.reverse(listToReverse, 2, 5));
    }
}