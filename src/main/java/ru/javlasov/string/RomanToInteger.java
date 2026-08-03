package ru.javlasov.string;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/roman-to-integer/description/">...</a>
 * Time complexity: O(n) – single pass through the string.
 * Memory complexity: O(n) – creates a char[] copy of the input string. (Could be O(1) if using charAt instead.)
 */

public class RomanToInteger {

    public static int romanToInt(String s) {
        int result = 0;
        char[] charArray = s.toCharArray();

        for (int i = 0; i <= s.length() - 1; i++) {
            if (i == s.length() - 1 || getValueFromRoman(charArray[i]) >= getValueFromRoman(charArray[i + 1])) {
                result = result + getValueFromRoman(charArray[i]);
            } else {
                result = result - getValueFromRoman(charArray[i]);
            }
        }

        return result;
    }

    private static int getValueFromRoman(char romanChar) {
        return switch (romanChar) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException();
        };
    }

}
