package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_7;

import java.util.*;

public class CustomBrackets {
    public static boolean isValidExpression(String expression, String[] brackets) {
        Set<Character> isOpeningBracket = new HashSet<>();
        Map<Character, Character> closingToOpeningBracketMap = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        // pre-populate the set and map
        for (String bracket : brackets) {
            isOpeningBracket.add(bracket.charAt(0));
            closingToOpeningBracketMap.put(bracket.charAt(1), bracket.charAt(0));
        }

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (isOpeningBracket.contains(ch)) {
                stack.push(ch);
            } else if (closingToOpeningBracketMap.containsKey(ch)) {
                if (!stack.isEmpty() && stack.peek() == closingToOpeningBracketMap.get(ch)) {
                    stack.pop();
                } else {
                    // closing bracket appeared before any opening bracket
                    // OR closing bracket did not match the last opened bracket
                    return false;
                }
            }
            // ignore any other character

        }

        return stack.isEmpty();
    }
}
