package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountSharingDetectionTest {

    @Test
    void findSharedIP() {
        // no sharing
        String[][] ipUsernameList = new String[][]{
                {"203.0.113.10", "mike"},
                {"298.51.100.25", "bob"},
                {"292.0.2.5", "mike2"},
                {"203.0.113.15", "bob2"}
        };
        Assertions.assertEquals("", AccountSharingDetection.findSharedIP(ipUsernameList));

        // sharing
        ipUsernameList = new String[][]{
                {"203.0.113.10", "mike"},
                {"298.51.100.25", "bob"},
                {"292.0.2.5", "mike"},
                {"203.0.113.15", "bob2"}
        };
        Assertions.assertEquals("203.0.113.10", AccountSharingDetection.findSharedIP(ipUsernameList));

        ipUsernameList = new String[][]{
                {"203.0.113.10", "mike"},
                {"298.51.100.25", "bob"},
                {"292.0.2.5", "mike"},
                {"203.0.113.15", "bob"}
        };
        Assertions.assertEquals("203.0.113.10", AccountSharingDetection.findSharedIP(ipUsernameList));
    }
}