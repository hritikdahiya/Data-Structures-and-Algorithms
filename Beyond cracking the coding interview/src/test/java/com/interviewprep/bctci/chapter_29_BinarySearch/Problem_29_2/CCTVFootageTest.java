package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CCTVFootageTest {
    @Test
    public void findTransitionPointTest() {
        int t1 = 0, t2 = 20, transitionPoint = 15;

        // API implementation per test case
        API apiObject = new API() {
            @Override
            public boolean is_stolen(int time) {
                return time >= t1 && time <= t2 && time >= transitionPoint;
            }
        };

        Assertions.assertEquals(transitionPoint, CCTVFootage.findTransitionPoint(t1, t2, apiObject));
    }

    @Test()
    public void deckCutTest() {
        int[] indicesOf1 = new int[52];
        for(int i=0; i < 52; i++)
            indicesOf1[i] = i+1;

        for (int indexOf1 : indicesOf1) {
            var deck = new int[52];

            // creating a deck with 1 shifted to "indexOf1" position
            // for instance - if indexOf1 is 3, the deck would be - [50,51,52,1,2...] and the deckCutIndex should be 2
            for (int j = 0; j < 52; j++) {
                deck[(j + indexOf1) % 52] = j + 1;
            }

            Assertions.assertEquals((indexOf1 - 1 + 52) % 52, CCTVFootage.findDeckCutIndex(deck));
        }
    }
}
