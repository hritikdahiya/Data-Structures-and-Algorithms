package com.interviewprep.bctci.chapter_26_StringManipulation.Problem_26_2;

public class StringUtility {
    public static String join(String[] arr, String s) {
        if (arr == null || arr.length == 0) {
            return "";
        }

        // Internally uses a dynamic array to store characters
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(i > 0) {
                result.append(s.toCharArray());
            }
            if (!isStringEmpty(arr[i])) {
                result.append(arr[i].toCharArray());
            }
        }

        return result.toString();
    }

    private static boolean isStringEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
