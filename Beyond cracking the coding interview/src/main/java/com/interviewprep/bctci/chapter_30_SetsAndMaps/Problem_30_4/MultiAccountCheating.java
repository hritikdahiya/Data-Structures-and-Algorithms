package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_4;

import java.util.*;

public class MultiAccountCheating {
    public static boolean areMultipleAccountsPresent(User[] users) {
        Set<List<String>> sortedIpSet = new HashSet<>();

        for (User user : users) {
            List<String> ipsCopy = Arrays.asList(user.ips());
            Collections.sort(ipsCopy);
            if (sortedIpSet.contains(ipsCopy)) {
                return true;
            } else {
                sortedIpSet.add(ipsCopy);
            }
        }

        return false;
    }
}
