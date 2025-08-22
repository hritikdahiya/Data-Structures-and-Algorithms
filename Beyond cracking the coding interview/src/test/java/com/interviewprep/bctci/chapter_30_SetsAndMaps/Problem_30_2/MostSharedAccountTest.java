package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MostSharedAccountTest {

    @Test
    public void findMostSharedAccountTest() {
        // empty connections
        String[][] ipUsernameList = new String[0][];
        Assertions.assertEquals("", MostSharedAccount.findMostSharedAccount(ipUsernameList));

        // no sharing
        ipUsernameList = new String[][]{
                {"203.0.113.10", "mike"},
                {"298.51.100.25", "bob"},
                {"292.0.2.5", "mike2"},
                {"203.0.113.15", "bob2"}
        };

        Assertions.assertEquals("bob2", MostSharedAccount.findMostSharedAccount(ipUsernameList));

        // sharing
        ipUsernameList = new String[][]{
                {"203.0.113.10", "mike"},
                {"298.51.100.25", "bob"},
                {"292.0.2.5", "mike2"},
                {"203.0.113.15", "bob"}
        };
        Assertions.assertEquals("bob", MostSharedAccount.findMostSharedAccount(ipUsernameList));
    }
}