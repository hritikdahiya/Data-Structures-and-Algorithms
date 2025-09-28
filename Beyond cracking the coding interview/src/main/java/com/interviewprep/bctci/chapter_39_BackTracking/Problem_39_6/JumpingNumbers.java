package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_6;

import java.util.ArrayList;
import java.util.List;

public class JumpingNumbers {
    public static List<Integer> findJumpingNumbers(int n) {
        List<Integer> jumpingNumbers = new ArrayList<>();

        for (int num = 1; num < 10; num++) {
            findJumpingNumbersHelper(num, n, jumpingNumbers);
        }

        jumpingNumbers.sort(Integer::compareTo);

        return jumpingNumbers;
    }

    private static void findJumpingNumbersHelper(int currNum, int maxNum, List<Integer> jumpingNumbers) {
        if (currNum >= maxNum) {
            return;
        }

        jumpingNumbers.add(currNum);

        int lastDigit = currNum % 10;
        // next digit smaller than last digit
        if (lastDigit > 0) {
            findJumpingNumbersHelper(10 * currNum + lastDigit - 1, maxNum, jumpingNumbers);
        }
        // next digit greater than last digit
        if (lastDigit < 9) {
            findJumpingNumbersHelper(10 * currNum + lastDigit + 1, maxNum, jumpingNumbers);
        }
    }
}
