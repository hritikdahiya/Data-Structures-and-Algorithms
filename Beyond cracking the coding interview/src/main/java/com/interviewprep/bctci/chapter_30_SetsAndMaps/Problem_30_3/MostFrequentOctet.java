package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_3;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentOctet {
    public static String findMostFrequentOctet(String[] ips) {
        Map<String, Integer> firstOctetFreqMap = new HashMap<>();

        for (String ip : ips) {
            String firstOctet = ip.split("\\.")[0];

            Integer currFreq = firstOctetFreqMap.getOrDefault(firstOctet, 0);
            firstOctetFreqMap.put(firstOctet, currFreq + 1);
        }

        String mostFrequentFirstOctet = "";
        int freq = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : firstOctetFreqMap.entrySet()) {
            if (entry.getValue() > freq) {
                freq = entry.getValue();
                mostFrequentFirstOctet = entry.getKey();
            }
        }

        return mostFrequentFirstOctet;
    }

    public static String findMostFrequentOctetWithArray(String[] ips) {
        int[] octetFrequency = new int[256];
        int freq = Integer.MIN_VALUE;
        String maxFreqOctet = "";
        for (String ip : ips) {
            String firstOctet = ip.split("\\.")[0];
            int octetInt = Integer.parseInt(firstOctet);
            octetFrequency[octetInt]++;

            if (octetFrequency[octetInt] > freq) {
                freq = octetFrequency[octetInt];
                maxFreqOctet = firstOctet;
            }
        }
        return maxFreqOctet;
    }
}
