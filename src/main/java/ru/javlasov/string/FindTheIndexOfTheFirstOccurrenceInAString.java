package ru.javlasov.string;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/container-with-most-water/description/">...</a>
 * Time complexity: O(n) – single pass with two pointers.
 * Memory complexity: O(1) – no extra memory used.
 */

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        if (haystack.length() < needle.length()) {
            return -1;
        }

        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystackChars[i + j] != needleChars[j]) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }

        }
        return -1;
    }

}
