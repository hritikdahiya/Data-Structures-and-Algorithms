package com.interviewprep.bctci.chapter_34_LinkedList.Problem_34_11;

import com.interviewprep.bctci.chapter_34_LinkedList.Node;
import org.junit.jupiter.api.Test;

import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.areListsEqual;
import static com.interviewprep.bctci.chapter_34_LinkedList.LinkedListTestUtility.createListFromValues;

class RemoveKthNodeFromEndTest {

    @Test
    public void removeInTwoPassTest() {
        // remove last node
        Node<Integer> list = createListFromValues(new Integer[]{1, 2, 3, 4});
        int k = 1;
        Node<Integer> expectedList = createListFromValues(new Integer[]{1, 2, 3});
        list = RemoveKthNodeFromEnd.removeInTwoPass(list, k);
        areListsEqual(expectedList, list);

        // remove first node
        list = createListFromValues(new Integer[]{1, 2, 3, 4});
        k = 4;
        expectedList = createListFromValues(new Integer[]{2, 3, 4});
        list = RemoveKthNodeFromEnd.removeInTwoPass(list, k);
        areListsEqual(expectedList, list);

        // remove middle node
        list = createListFromValues(new Integer[]{1, 2, 3, 4});
        k = 2;
        expectedList = createListFromValues(new Integer[]{1, 2, 4});
        list = RemoveKthNodeFromEnd.removeInTwoPass(list, k);
        areListsEqual(expectedList, list);
    }


    @Test
    public void removeInSinglePass() {
        // remove last node
        Node<Integer> list = createListFromValues(new Integer[]{1, 2, 3, 4});
        int k = 1;
        Node<Integer> expectedList = createListFromValues(new Integer[]{1, 2, 3});
        list = RemoveKthNodeFromEnd.removeInOnePass(list, k);
        areListsEqual(expectedList, list);

        // remove first node
        list = createListFromValues(new Integer[]{1, 2, 3, 4});
        k = 4;
        expectedList = createListFromValues(new Integer[]{2, 3, 4});
        list = RemoveKthNodeFromEnd.removeInOnePass(list, k);
        areListsEqual(expectedList, list);

        // remove middle node
        list = createListFromValues(new Integer[]{1, 2, 3, 4});
        k = 2;
        expectedList = createListFromValues(new Integer[]{1, 2, 4});
        list = RemoveKthNodeFromEnd.removeInOnePass(list, k);
        areListsEqual(expectedList, list);
    }
}