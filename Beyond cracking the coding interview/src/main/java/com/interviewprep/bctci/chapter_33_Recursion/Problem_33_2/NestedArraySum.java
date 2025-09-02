package com.interviewprep.bctci.chapter_33_Recursion.Problem_33_2;

public class NestedArraySum {
    public static int sum(IntegerOrArray[] nestedArr) {
        return sum(nestedArr, 0);
    }

    private static int sum(IntegerOrArray[] nestedArr, int index) {
        if (index == nestedArr.length) {
            return 0;
        }

        int currSum = nestedArr[index].getArr() == null ? nestedArr[index].getVal() : sum(nestedArr[index].getArr(), 0);

        return currSum + sum(nestedArr, index + 1);
    }
}
