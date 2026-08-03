package ru.javlasov.string;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/longest-common-prefix/description/">...</a>
 * Time complexity: O(n * L) where n is the number of strings and L is the length of the prefix (or maximum string length).
 * Memory complexity: O(1) additional memory (excluding input/output; temporary strings from substring are not counted).
 */

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

}
