package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class ActionLogAnomaliesTest {

    @Test
    public void findAnomaliesTest() {
        LogEntry[] entries = new LogEntry[]{
                new LogEntry("A", Action.CLOSE, 1), // closed without being opened
                new LogEntry("A", Action.OPEN, 2),
                new LogEntry("B", Action.OPEN, 3),
                new LogEntry("A", Action.CLOSE, 2),
                new LogEntry("B", Action.OPEN, 4),  // agent opened another ticket without closing prev
                new LogEntry("B", Action.CLOSE, 4),
                new LogEntry("B", Action.CLOSE, 3),
                new LogEntry("C", Action.OPEN, 2),  // ticket reopened
                new LogEntry("A", Action.OPEN, 5),  // never closed
                new LogEntry("B", Action.OPEN, 6),
                new LogEntry("C", Action.CLOSE, 6), // ticket closed by another agent
        };
        List<Integer> expectedAnomalies = Arrays.asList(1, 2, 3, 5, 6);

        verifyResult(expectedAnomalies, Arrays.asList(ActionLogAnomalies.findAnomalies(entries)));


    }

    private void verifyResult(List<Integer> expectedAnomalies, List<Integer> anomalies) {
        expectedAnomalies.sort(Comparator.naturalOrder());
        anomalies.sort(Comparator.naturalOrder());
        Assertions.assertArrayEquals(expectedAnomalies.toArray(), anomalies.toArray());
    }
}