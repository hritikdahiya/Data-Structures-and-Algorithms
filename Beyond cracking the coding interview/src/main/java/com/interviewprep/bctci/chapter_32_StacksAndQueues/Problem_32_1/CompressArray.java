package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_1;

import java.util.Stack;

public class CompressArray {
    public static Integer[] compress(Integer[] arr) {
        int n = arr.length;
        if (n < 2) {
            return arr;
        }

        Stack<Integer> stack = new Stack<>();
        // adding -1 to handle edge case
        stack.push(-1);
        for (Integer ele : arr) {
            int num = ele;
            while (stack.peek() == num) {
                num += stack.pop();
            }
            stack.push(num);
        }

        int compressedSize = stack.size() - 1;
        Integer[] compressed = new Integer[compressedSize];
        int top;
        // populate the compressed array from the end to start
        while ((top = stack.pop()) > -1) {
            compressed[--compressedSize] = top;
        }

        return compressed;
    }
}
