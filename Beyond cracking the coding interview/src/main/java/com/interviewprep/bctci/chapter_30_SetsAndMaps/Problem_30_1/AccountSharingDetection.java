package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_1;

import java.util.HashMap;
import java.util.Map;

public class AccountSharingDetection {
    public static String findSharedIP(String[][] ipUsernameList) {
        Map<String, String> userNameIPMap = new HashMap<>();

        for (String[] ipUserNameTuple : ipUsernameList) {
            String ip = ipUserNameTuple[0];
            String username = ipUserNameTuple[1];

            if (userNameIPMap.containsKey(username)) {
                return userNameIPMap.get(username);
            } else {
                userNameIPMap.put(username, ip);
            }
        }

        return "";
    }
}
