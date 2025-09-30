package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MagicBlackjackTest {
    final int TOTAL_POSSIBLE_BUSTS = 100081;

    @Test
    void numOfWaysToBustMemoization() {
        Assertions.assertEquals(TOTAL_POSSIBLE_BUSTS, new MagicBlackjack().numOfWaysToBustMemoization());
    }

    @Test
    void numOfWaysToBustTabulation() {
        Assertions.assertEquals(TOTAL_POSSIBLE_BUSTS, new MagicBlackjack().numOfWaysToBustTabulation());
    }
}