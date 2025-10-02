package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_3;

public class ExclusiveProduct {
    private static final int MODULO = 1000000007;

    public static int[] findExclusiveProduct(int[] arr) {
        int n = arr.length;
        int[] prefixProduct = new int[n + 1];
        int[] suffixProduct = new int[n + 1];

        prefixProduct[0] = suffixProduct[n] = 1;

        for (int i = 0; i < n; i++) {
            prefixProduct[i + 1] = (prefixProduct[i] * arr[i]) % MODULO;
        }
        for (int i = n - 1; i >= 0; i--) {
            suffixProduct[i] = (suffixProduct[i + 1] * arr[i]) % MODULO;
        }

        int[] responses = new int[n];
        for (int i = 0; i < n; i++) {
            responses[i] = (prefixProduct[i] * suffixProduct[i + 1]) % MODULO;
        }

        return responses;
    }
}
