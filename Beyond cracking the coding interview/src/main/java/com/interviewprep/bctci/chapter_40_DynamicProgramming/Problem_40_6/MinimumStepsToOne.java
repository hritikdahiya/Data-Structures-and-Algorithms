package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_6;

import java.util.HashMap;

import static java.lang.Math.min;

public class MinimumStepsToOne {
    private HashMap<Integer, Integer> cache;

    public int findWithTabulation(int n) {
        cache = new HashMap<>();
        cache.put(1, 0);

        for (int i = 2; i <= n; i++) {
            int minWaysToReachOne = 1 + min(
                    cache.get(i - 1),
                    min(
                            i % 2 == 0 ? cache.get(i / 2) : Integer.MAX_VALUE,
                            i % 3 == 0 ? cache.get(i / 3) : Integer.MAX_VALUE
                    )
            );

            cache.put(i, minWaysToReachOne);
        }

        return cache.get(n);
    }

    public int findWithMemoization(int n) {
        cache = new HashMap<>();
        return findWithMemoizationHelper(n);
    }

    public int findWithMemoizationHelper(int n) {
        if (n == 1) {
            return 0;
        }

        // recurring subproblem
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        int minWays = 1 + findWithMemoization(n - 1);
        if (n % 2 == 0) {
            minWays = min(minWays, 1 + findWithMemoization(n / 2));
        }
        if (n % 3 == 0) {
            minWays = min(minWays, 1 + findWithMemoization(n / 3));
        }

        cache.put(n, minWays);

        return minWays;
    }
}
