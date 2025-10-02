package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_3;

public class ExclusiveProduct {
    private static final int MODULO = 1000000007;

    public static int[] findExclusiveProduct(int[] arr) {
        int n = arr.length;
        // inclusive of the current number
        int[] prefixProduct = new int[n];
        int[] suffixProduct = new int[n];

        for (int i = 0; i < n; i++) {
            prefixProduct[i] = ((i == 0 ? 1 : prefixProduct[i - 1]) * arr[i]) % MODULO;
        }
        for (int i = n - 1; i >= 0; i--) {
            suffixProduct[i] = ((i == n - 1 ? 1 : suffixProduct[i + 1]) * arr[i]) % MODULO;
        }

        int[] responses = new int[n];
        for (int i = 0; i < n; i++) {
            responses[i] = (
                    (i == 0 ? 1 : prefixProduct[i - 1]) *
                            (i == n - 1 ? 1 : suffixProduct[i + 1])) % MODULO;
        }

        return responses;
    }
}
