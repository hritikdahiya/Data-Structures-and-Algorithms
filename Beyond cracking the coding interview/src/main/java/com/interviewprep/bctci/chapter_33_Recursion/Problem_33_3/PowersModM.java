package com.interviewprep.bctci.chapter_33_Recursion.Problem_33_3;

public class PowersModM {
    public static int calculate(int num, int exponent, int modulus) {
        if (exponent == 0 || num == 1) {
            return 1;
        }

        // a^2b --> a^b * a^b
        // a^(2b+1) --> a * a^2b

        if (exponent % 2 == 1) {
            // multiplying by 1l to keep the multiplication in long and avoid Integer overflow error
            return (int) (((long) num * calculate(num, exponent - 1, modulus)) % modulus);
        } else {
            int halfExponentResult = calculate(num, exponent / 2, modulus);

            return (int) (((long) halfExponentResult * halfExponentResult) % modulus);
        }
    }
}
