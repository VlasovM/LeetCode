package ru.javlasov.easy;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/valid-anagram/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
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
