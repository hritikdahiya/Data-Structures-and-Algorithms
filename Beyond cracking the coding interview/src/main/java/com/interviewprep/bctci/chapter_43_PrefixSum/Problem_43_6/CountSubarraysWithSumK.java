package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_6;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithSumK {
    public static int count(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) {
            return k == 0 ? 1 : 0;
        }

        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // a subarray[i, j] with sum k will have
        // prefixSum[j] - prefixSum[i] = k ====> prefixSum[j] - k = prefixSum[i]
        // freqMap contains the number of elements which have a prefix sum of (prefixSum[j] - k)
        Map<Integer, Integer> freqMap = new HashMap<>();
        // empty array is a subarray with sum 0
        freqMap.put(0, 1);

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (freqMap.containsKey(prefixSum[i] - k)) {
                result += freqMap.get(prefixSum[i] - k);
            }
            freqMap.compute(prefixSum[i], (key, val) -> val == null ? 1 : val + 1);
        }

        return result;
    }
}
