package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_2;

import java.util.HashMap;
import java.util.Map;

public class MostSharedAccount {
    public static String findMostSharedAccount(String[][] ipUsernameList) {
        Map<String, Integer> usernameFreqMap = new HashMap<>();

        for (String[] ipUserNameTuple : ipUsernameList) {
            String username = ipUserNameTuple[1];

            usernameFreqMap.put(username, usernameFreqMap.getOrDefault(username, 0) + 1);
        }

        String mostSharedUserName = "";
        int mostSharedCount = 0;
        for (Map.Entry<String, Integer> entry : usernameFreqMap.entrySet()) {
            if (entry.getValue() > mostSharedCount) {
                mostSharedCount = entry.getValue();
                mostSharedUserName = entry.getKey();
            }
        }
        return mostSharedUserName;
    }
}
