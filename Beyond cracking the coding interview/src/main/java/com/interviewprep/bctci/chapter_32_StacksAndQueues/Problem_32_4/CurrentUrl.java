package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_4;

import java.util.Stack;

public class CurrentUrl {
    public static String getCurrentUrl(Action[] actions) {
        Stack<String> urlStack = new Stack<>();

        for (Action action : actions) {
            if (action.actionType() == ActionType.GO) {
                urlStack.push(action.url());
            } else {
                int hops = action.hops();
                while (urlStack.size() > 1 && hops > 0) {
                    urlStack.pop();
                    hops--;
                }
            }
        }

        if (urlStack.isEmpty()) {
            throw new IllegalArgumentException("There were no 'GO' actions to any URL");
        }

        return urlStack.peek();
    }
}
