package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BalancedPartitionTest {

    @Test
    public void countBalancedSubstringsTest() {
        Assertions.assertEquals(0, BalancedPartition.countBalancedSubstrings(""));

        Assertions.assertEquals(1, BalancedPartition.countBalancedSubstrings("((()))"));

        Assertions.assertEquals(4, BalancedPartition.countBalancedSubstrings("((()))(()()((())))()(()())"));
    }
}