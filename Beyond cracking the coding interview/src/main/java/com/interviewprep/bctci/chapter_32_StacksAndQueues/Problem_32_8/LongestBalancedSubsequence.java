package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_8;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LongestBalancedSubsequence {
    public static String getLongestBalancedSubsequence(String s) {
        Set<Integer> indexToRemove = new HashSet<>();

        Stack<Integer> openParenthesesIndexStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openParenthesesIndexStack.push(i);
            } else {
                if (openParenthesesIndexStack.isEmpty()) {
                    // remove the closing character which does not have any opening character
                    indexToRemove.add(i);
                } else {
                    openParenthesesIndexStack.pop();
                }
            }
        }

        // remove all the dangling open characters
        indexToRemove.addAll(openParenthesesIndexStack);

        StringBuilder balancedSubsequenceBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!indexToRemove.contains(i)) {
                balancedSubsequenceBuilder.append(s.charAt(i));
            }
        }

        return balancedSubsequenceBuilder.toString();
    }
}
