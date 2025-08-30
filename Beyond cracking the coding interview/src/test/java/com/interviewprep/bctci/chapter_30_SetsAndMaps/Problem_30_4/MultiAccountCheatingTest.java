package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiAccountCheatingTest {

    @Test
    public void areMultipleAccountsPresentTest() {
        User[] users = new User[]{
                new User("mike", new String[]{"203.0.3.10", "208.51.0.5", "52.0.2.5"}),
                new User("bob", new String[]{"111.0.0.10", "222.0.0.5", "222.0.0.8"}),
                new User("bob2", new String[]{"222.0.0.5", "222.0.0.8", "111.0.0.10"}),
        };
        Assertions.assertTrue(MultiAccountCheating.areMultipleAccountsPresent(users));

        users = new User[]{
                new User("mike", new String[]{"203.0.3.10"}),
                new User("bob", new String[]{"111.0.0.10"}),
        };
        Assertions.assertFalse(MultiAccountCheating.areMultipleAccountsPresent(users));

        users = new User[]{};
        Assertions.assertFalse(MultiAccountCheating.areMultipleAccountsPresent(users));

    }
}