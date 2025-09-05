package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_12;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;
import org.junit.jupiter.api.Test;

import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.areListsEqual;
import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.createListFromValues;

class LinkedListZipTest {

    @Test
    void zip() {
        // empty lists
        Node<Integer> list1 = createListFromValues(new Integer[]{});
        Node<Integer> list2 = createListFromValues(new Integer[]{});

        Node<Integer> expectedZippedList = createListFromValues(new Integer[]{});
        Node<Integer> actualZippedList = LinkedListZip.zip(list1, list2);

        areListsEqual(expectedZippedList, actualZippedList);

        // empty list1
        list1 = createListFromValues(new Integer[]{});
        list2 = createListFromValues(new Integer[]{1, 2, 3, 4});

        expectedZippedList = createListFromValues(new Integer[]{1, 2, 3, 4});
        actualZippedList = LinkedListZip.zip(list1, list2);

        areListsEqual(expectedZippedList, actualZippedList);

        // empty list2
        list1 = createListFromValues(new Integer[]{1, 2, 3, 4});
        list2 = createListFromValues(new Integer[]{});

        expectedZippedList = createListFromValues(new Integer[]{1, 2, 3, 4});
        actualZippedList = LinkedListZip.zip(list1, list2);

        areListsEqual(expectedZippedList, actualZippedList);

        // empty list2
        list1 = createListFromValues(new Integer[]{1, 2, 3, 4});
        list2 = createListFromValues(new Integer[]{5, 6, 7, 8, 9, 10});

        expectedZippedList = createListFromValues(new Integer[]{1, 5, 2, 6, 3, 7, 4, 8, 9, 10});
        actualZippedList = LinkedListZip.zip(list1, list2);

        areListsEqual(expectedZippedList, actualZippedList);

    }
}