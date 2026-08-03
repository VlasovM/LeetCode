package ru.javlasov.hashMap;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/valid-anagram/description/">...</a>
 * Time complexity: O(n) – two passes over the strings (length n).
 * Memory complexity: O(1) – fixed-size array of 26.
 */

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (Character symbol : s.toCharArray()) {
            count[symbol - 'a']++;

        }

        for (Character symbol : t.toCharArray()) {
            count[symbol - 'a']--;

            if (count[symbol - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

}
