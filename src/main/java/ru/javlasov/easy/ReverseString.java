package ru.javlasov.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/reverse-string/description/
 *
 * Write a function that reverses a string. The input string is given as an array of characters s.
 */

public class ReverseString {

    public void reverseString(char[] s) {
        char[] tempChar = Arrays.copyOf(s, s.length);

        int indexOfTempArray = 0;
        for (int indexOfArray = s.length - 1; indexOfArray > -1; indexOfArray--) {
            s[indexOfTempArray] = tempChar[indexOfArray];
            indexOfTempArray++;
        }
    }

}
