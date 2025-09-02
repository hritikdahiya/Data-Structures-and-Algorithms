package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_5;

import com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_4.Action;
import com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_4.ActionType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CurrentUrlWithForwardTest {

    @Test
    public void currentUrlWithForwardTest() {
        Action[] actions = new Action[]{
                new Action(ActionType.GO, "google.com", null),
                new Action(ActionType.GO, "wikipedia.com", null),
                new Action(ActionType.BACK, null, 1),
                new Action(ActionType.FORWARD, null, 1),
                new Action(ActionType.BACK, null, 3),
                new Action(ActionType.GO, "netflix.com", null),
                new Action(ActionType.FORWARD, null, 3),
        };
        Assertions.assertEquals("netflix.com", CurrentUrlWithForward.getCurrentUrl(actions));
        Assertions.assertEquals("netflix.com", CurrentUrlWithForward.getCurrentUrlEfficient(actions));
    }
}