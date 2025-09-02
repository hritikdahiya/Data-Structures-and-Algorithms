package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_5;

import com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_4.Action;
import com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_4.ActionType;

import java.util.Stack;

public class CurrentUrlWithForward {
    public static String getCurrentUrl(Action[] actions) {
        Stack<String> historyUrlStack = new Stack<>();
        Stack<String> forwardStack = new Stack<>();

        for (Action action : actions) {
            if (action.actionType() == ActionType.GO) {
                // as soon a go to a url happens, we cannot move forward
                forwardStack.clear();
                historyUrlStack.push(action.url());
            } else if (action.actionType() == ActionType.FORWARD) {
                int hops = action.hops();
                while (!forwardStack.isEmpty() && hops > 0) {
                    historyUrlStack.push(forwardStack.pop());
                    hops--;
                }
            } else {
                // as we go back, we populate the forward stack to perform the forward action
                int hops = action.hops();
                while (historyUrlStack.size() > 1 && hops > 0) {
                    forwardStack.push(historyUrlStack.pop());
                    hops--;
                }
            }
        }

        if (historyUrlStack.isEmpty()) {
            throw new IllegalArgumentException("There were no 'GO' actions to any URL");
        }

        return historyUrlStack.peek();
    }
}
