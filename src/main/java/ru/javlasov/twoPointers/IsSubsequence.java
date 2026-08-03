package ru.javlasov.twoPointers;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/is-subsequence/description/">...</a>
 * Time complexity: O(t.length()) – single pass through string t.
 * Memory complexity: O(1) – only a few integer variables.
 */

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int firstPointer = 0;

        for (int secondPointer = 0; secondPointer < t.length(); secondPointer++) {
            if (firstPointer == s.length()) {
                return true;
            }

            if (s.charAt(firstPointer) == t.charAt(secondPointer)) {
                firstPointer++;
            }

        }

        return firstPointer == s.length();
    }

}
