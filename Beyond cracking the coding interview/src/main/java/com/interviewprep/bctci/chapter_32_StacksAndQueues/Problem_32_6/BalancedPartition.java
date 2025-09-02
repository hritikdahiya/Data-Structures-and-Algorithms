package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_6;

public class BalancedPartition {
    public static int countBalancedSubstrings(String s) {
        int count = 0;
        int openParentheses = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                openParentheses++;
            } else {
                openParentheses--;
                if(openParentheses == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
