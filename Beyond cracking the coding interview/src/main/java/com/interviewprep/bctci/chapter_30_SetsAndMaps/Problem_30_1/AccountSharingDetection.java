package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_1;

import java.util.HashSet;
import java.util.Set;

public class AccountSharingDetection {
    public static String findSharedIP(String[][] ipUsernameList) {
        Set<String> usernameSet = new HashSet<>();

        for (String[] ipUserNameTuple : ipUsernameList) {
            String ip = ipUserNameTuple[0];
            String username = ipUserNameTuple[1];

            if (usernameSet.contains(username)) {
                return ip;
            } else {
                usernameSet.add(username);
            }
        }

        return "";
    }
}
