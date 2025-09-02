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
                // as soon a 'go' to a url happens, we cannot move forward
                forwardStack.clear();
                historyUrlStack.push(action.url());
            } else if (action.actionType() == ActionType.FORWARD) {
                // as we move forward, go through the forward tack and add to history
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

    public static String getCurrentUrlEfficient(Action[] actions) {
        // max possible values of url - actions.length
        String[] urls = new String[actions.length];
        int currentPointer = -1, lastPointer = -1;

        for (Action action : actions) {
            if (action.actionType() == ActionType.GO) {
                lastPointer = ++currentPointer;
                urls[currentPointer] = action.url();
            } else if (action.actionType() == ActionType.FORWARD) {
                currentPointer = Math.min(lastPointer, currentPointer + action.hops());
            } else {
                currentPointer = Math.max(0, currentPointer - action.hops());
            }
        }

        if (currentPointer < 0) {
            throw new IllegalArgumentException("There were no 'GO' actions to any URL");
        }

        return urls[currentPointer];
    }
}
