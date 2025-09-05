package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_13;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;
import org.junit.jupiter.api.Test;

import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.areListsEqual;
import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.createListFromValues;

class DuplicateRemovalInSortedLinkedListTest {

    @Test
    public void removeDuplicatesTest() {
        // no duplicates
        Node<Integer> list = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6});
        Node<Integer> expectedList = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6});

        DuplicateRemovalInSortedLinkedList.removeDuplicates(list);
        areListsEqual(expectedList, list);

        // duplicates
        list = createListFromValues(new Integer[]{1, 2, 2, 2, 3, 4, 4, 5, 5, 6, 6});
        expectedList = createListFromValues(new Integer[]{1, 2, 3, 4, 5, 6});

        DuplicateRemovalInSortedLinkedList.removeDuplicates(list);
        areListsEqual(expectedList, list);

        // all duplicates
        list = createListFromValues(new Integer[]{1, 1, 1, 1, 1, 1});
        expectedList = createListFromValues(new Integer[]{1});

        DuplicateRemovalInSortedLinkedList.removeDuplicates(list);
        areListsEqual(expectedList, list);
    }
}