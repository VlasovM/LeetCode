package ru.javlasov.string;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/length-of-last-word/description/">...</a>
 * Time complexity: O(n) – single pass from the end of the string (each character processed at most once).
 * Memory complexity: O(1) – constant extra memory (only integer variable).
 */

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int length = 0;

        int i = s.length() - 1;

        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

}
