package com.interviewprep.bctci.chapter_33_Recursion.Problem_33_2;

import lombok.Getter;

@Getter
public class IntegerOrArray {
    private final Integer val;
    private final IntegerOrArray[] arr;

    IntegerOrArray(Integer val) {
        this.val = val;
        this.arr = null;
    }

    IntegerOrArray(IntegerOrArray[] arr) {
        this.val = null;
        this.arr = arr;
    }
}
