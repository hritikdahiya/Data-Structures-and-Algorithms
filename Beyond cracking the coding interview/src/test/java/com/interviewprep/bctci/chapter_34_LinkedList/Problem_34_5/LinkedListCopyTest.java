package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_5;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;
import org.junit.jupiter.api.Test;

import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.areListsEqual;
import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.createListFromValues;

class LinkedListCopyTest {

    @Test
    public void copyTest() {
        // empty list
        Node<Integer> listToCopy = createListFromValues(new Integer[0]);
        areListsEqual(listToCopy, LinkedListCopy.copy(listToCopy));

        // single element
        listToCopy = createListFromValues(new Integer[]{1});
        areListsEqual(listToCopy, LinkedListCopy.copy(listToCopy));

        // normal case
        listToCopy = createListFromValues(new Integer[]{1, 2, 3, 6, 5, 4});
        areListsEqual(listToCopy, LinkedListCopy.copy(listToCopy));
    }
}