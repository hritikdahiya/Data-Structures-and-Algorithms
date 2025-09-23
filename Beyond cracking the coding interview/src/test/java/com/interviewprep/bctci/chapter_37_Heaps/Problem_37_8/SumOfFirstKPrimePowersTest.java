package com.interviewprep.bctci.chapter_37_Heaps.Problem_37_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumOfFirstKPrimePowersTest {

    @Test
    public void sumOfFirstKPrimePowersTest() {
        int[] primes = new int[]{2};
        int k = 1;
        int expectedSum = 2;
        Assertions.assertEquals(expectedSum, SumOfFirstKPrimePowers.calculate(primes, k));


        primes = new int[]{5};
        k = 3;
        expectedSum = 155;
        Assertions.assertEquals(expectedSum, SumOfFirstKPrimePowers.calculate(primes, k));

        primes = new int[]{2, 3};
        k = 7;
        expectedSum = 69;
        Assertions.assertEquals(expectedSum, SumOfFirstKPrimePowers.calculate(primes, k));
    }

}