package ru.javlasov.easy;

/**
 * https://leetcode.com/problems/plus-one/description/
 *
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 */

public class PlusOne {

    public int[] plusOne(int[] digits) {
        for (int indexOfArray = digits.length - 1; indexOfArray >= 0; indexOfArray--) {
            if (digits[indexOfArray] < 9) {
                digits[indexOfArray]++;
                return digits;
            }
            digits[indexOfArray] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

