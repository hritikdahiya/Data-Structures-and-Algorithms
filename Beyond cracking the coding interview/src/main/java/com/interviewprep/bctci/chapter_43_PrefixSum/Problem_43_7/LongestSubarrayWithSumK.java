package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_7;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    public static int findLengthOfLongestSubarrayWithSum(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        }

        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // a subarray[i, j] with sum k will have
        // prefixSum[j] - prefixSum[i] = k ====> prefixSum[j] - k = prefixSum[i]
        // prefixSumToIndexMap contains the index of the prefixSum whose value is (prefixSum[j] - k)
        Map<Integer, Integer> prefixSumToIndexMap = new HashMap<>();
        prefixSumToIndexMap.put(0, -1);

        int maxLen = -1;
        for (int i = 0; i < n; i++) {
            if (prefixSumToIndexMap.containsKey(prefixSum[i] - k)) {
                int lenOfSubArray = i - prefixSumToIndexMap.get(prefixSum[i] - k);
                maxLen = Math.max(maxLen, lenOfSubArray);
                // do not update the index, since the earliest index would make the longest array
            } else {
                prefixSumToIndexMap.put(prefixSum[i] - k, i);
            }
        }

        return maxLen;
    }
}
