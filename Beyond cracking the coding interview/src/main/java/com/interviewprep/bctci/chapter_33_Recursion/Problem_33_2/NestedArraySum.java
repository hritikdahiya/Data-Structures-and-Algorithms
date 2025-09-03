package com.interviewprep.bctci.chapter_33_Recursion.Problem_33_2;

import java.util.Stack;

public class NestedArraySum {

    public static int sumIterative(IntegerOrArray[] nestedArr) {
        if (0 == nestedArr.length) {
            return 0;
        }

        Stack<IntegerOrArray> recursiveStack = new Stack<>();
        for (IntegerOrArray integerOrArray : nestedArr) {
            recursiveStack.push(integerOrArray);
        }

        int sum = 0;
        while (!recursiveStack.empty()) {
            IntegerOrArray integerOrArray = recursiveStack.pop();
            if (integerOrArray.getVal() != null) {
                // integer
                sum += integerOrArray.getVal();
            } else {
                // array
                for (IntegerOrArray nestedIntegerOrArray : integerOrArray.getArr()) {
                    recursiveStack.push(nestedIntegerOrArray);
                }
            }
        }

        return sum;
    }

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
