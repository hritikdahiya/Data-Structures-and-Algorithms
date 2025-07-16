package org.interviewprep.datastructures.LL;

import org.junit.jupiter.api.*;

public class LLTest {
    private LL<Integer> testList;

    @BeforeEach()
    void setup() {
        this.testList = new LL<>();
        for(int i=0; i<8; i++)
            this.testList.add(i);
    }

    @AfterEach
    void tearDown() {
        this.testList = null;
    }

    @Test
    void LL_length_check() {
        Assertions.assertEquals(8, testList.getLength());
    }

    @Test
    void LL_find_elements() {
        Assertions.assertTrue(testList.find(5));
        Assertions.assertFalse(testList.find(-10));
    }

    @Test
    void LL_remove_head() {
        Assertions.assertTrue(testList.find(1));
        Assertions.assertTrue(testList.remove(1, false));
        Assertions.assertFalse(testList.find(1));
        Assertions.assertEquals(7, testList.getLength());
    }

    @Test
    void LL_remove_tail() {
        Assertions.assertTrue(testList.find(5));
        Assertions.assertTrue(testList.remove(5, false));
        Assertions.assertFalse(testList.find(5));
        Assertions.assertEquals(7, testList.getLength());
    }

    @Test
    void LL_remove_multiple() {
        testList.addFirst(5);
        testList.add(5);

        Assertions.assertTrue(testList.find(5));
        Assertions.assertTrue(testList.remove(5, true));
        Assertions.assertEquals(7, testList.getLength());
    }
}