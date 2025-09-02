package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CurrentUrlTest {
    @Test
    public void currentUrlTest() {
        Action[] actions = new Action[]{
                new Action(ActionType.GO, "google.com", null),
                new Action(ActionType.GO, "wikipedia.com", null),
                new Action(ActionType.GO, "amazon.com", null),
                new Action(ActionType.BACK, null, 4),
                new Action(ActionType.GO, "youtube.com", null),
                new Action(ActionType.GO, "netflix.com", null),
                new Action(ActionType.BACK, null, 1),
        };
        Assertions.assertEquals("youtube.com", CurrentUrl.getCurrentUrl(actions));
    }
}