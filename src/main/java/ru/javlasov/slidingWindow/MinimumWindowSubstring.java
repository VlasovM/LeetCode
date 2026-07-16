package ru.javlasov.slidingWindow;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/minimum-size-subarray-sum/description/">...</a>
 * Time complexity: O(|s|) – each character is processed at most twice (once by right, once by left).
 * Memory complexity: O(1) – fixed-size array of 128 for ASCII characters.
 */

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty() ||
                s.length() < t.length()) {
            return "";
        }

        int[] needed = new int[128];
        for (char c : t.toCharArray()) {
            needed[c]++;
        }

        int required = t.length();
        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int indexStart = 0;

        char[] chars = s.toCharArray();
        while (right < chars.length) {
            char cur = chars[right];
            right++;

            if (needed[cur] > 0) {
                required--;
            }

            needed[cur]--;

            while (required == 0) {
                int currentLen = right - left;
                if (currentLen < minLen) {
                    minLen = currentLen;
                    indexStart = left;
                }

                char leftChar = chars[left];
                left++;

                needed[leftChar]++;

                if (needed[leftChar] > 0) {
                    required++;
                }
            }

        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(indexStart, indexStart + minLen);
    }

}
