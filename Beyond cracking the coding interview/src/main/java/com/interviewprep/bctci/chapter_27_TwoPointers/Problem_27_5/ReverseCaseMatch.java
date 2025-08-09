package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_5;

public class ReverseCaseMatch {
    public static boolean doesReverseCaseMatch(String s) {
        int n = s.length();
        if (n < 1) {
            return true;
        }

        int l = 0, r = n - 1;
        while (l < n && r > -1) {
            if (!Character.isLowerCase(s.charAt(l))) {
                l++;
            } else if (!Character.isUpperCase(s.charAt(r))) {
                r--;
            } else {
                if (Character.toLowerCase(s.charAt(r)) != s.charAt(l)) {
                    return false;
                }
                l++;
                r--;
            }
        }

        // In case of all lowercase and all uppercase letters (), return false
        return !(l == 0 || r == n - 1);
    }
}
