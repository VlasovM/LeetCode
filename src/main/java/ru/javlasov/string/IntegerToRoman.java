package ru.javlasov.string;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/integer-to-roman/description/">...</a>
 * Time complexity: O(1) – fixed number of iterations (13 values), inner loop runs at most ~15 times for max input (3999).
 * Memory complexity: O(1) – constant extra space (arrays + StringBuilder for output, max 15 chars).
 */

public class IntegerToRoman {

    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanValues = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num = num - values[i];
                result.append(romanValues[i]);
            }
        }
        return result.toString();
    }

}
