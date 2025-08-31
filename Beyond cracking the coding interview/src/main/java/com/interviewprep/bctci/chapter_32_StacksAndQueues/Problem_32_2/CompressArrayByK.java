package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_2;

import java.util.*;

public class CompressArrayByK {
    public static List<Integer> compress(Integer[] arr, int k) {
        // very element in stack holds a number and it's count
        Stack<Integer[]> stack = new Stack<>();
        // adding -1 to handle edge case
        stack.push(new Integer[]{-1, 0});
        for (Integer ele : arr) {
            if (!Objects.equals(stack.peek()[0], ele)) {
                // keep pushing to stack if new element is encountered
                stack.push(new Integer[]{ele, 1});
            } else {
                if (stack.peek()[1] < k - 1) {
                    // If ele is same as prev but ele is not repeated k times yet
                    // increment the count of ele
                    stack.peek()[1]++;
                } else {
                    // If ele is same as prev AND ele is repeated k time, compress stack until it cannot be compressed further.
                    int num = ele;
                    while (stack.peek()[0] == num && stack.peek()[1] == k - 1) {
                        num = k * stack.pop()[0];
                    }
                    // push the compressed element to stack with count 1
                    stack.push(new Integer[]{num, 1});
                }
            }
        }


        List<Integer> compressed = new ArrayList<>();
        Integer[] top;
        // populate the compressed array from the end to start
        while ((top = stack.pop())[0] > -1) {
            for (int i = 0; i < top[1]; i++) {
                compressed.add(top[0]);
            }
        }

        Collections.reverse(compressed);
        return compressed;
    }

}
