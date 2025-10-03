package com.interviewprep.bctci.chapter_42_TopologicalSort.Problem_42_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ParallelCompilationTest {

    @Test
    public void parallelCompilationTest() {
        int[] seconds = new int[]{10, 20, 30};
        List<List<Integer>> imports = List.of(
                List.of(),
                List.of(),
                List.of(0, 1)
        );
        int expected = 50;
        Assertions.assertEquals(expected, ParallelCompilation.findTimeToCompile(seconds, imports));

        seconds = new int[]{10, 20, 30};
        imports = List.of(
                List.of(),
                List.of(),
                List.of()
        );
        expected = 30;
        Assertions.assertEquals(expected, ParallelCompilation.findTimeToCompile(seconds, imports));

        seconds = new int[]{10, 10, 200, 50, 10};
        imports = List.of(
                List.of(),
                List.of(),
                List.of(),
                List.of(0, 1),
                List.of(2, 3)
        );
        expected = 210;
        Assertions.assertEquals(expected, ParallelCompilation.findTimeToCompile(seconds, imports));
    }
}