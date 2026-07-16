package ru.javlasov.string;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/reverse-words-in-a-string/description/">...</a>
 * Time complexity: O(n) – several linear passes (reverse entire string, clean spaces, reverse each word).
 * Memory complexity: O(n) – uses two character arrays (chars and clean) of size n.
 */

public class ReverseWordsInAString {

    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        reverse(chars, 0, n - 1);

        char[] clean = new char[n];
        int write = 0;
        int read = 0;

        while (read < n && chars[read] == ' ') read++;

        boolean firstWord = true;
        while (read < n) {
            if (!firstWord) {
                clean[write++] = ' ';
            }
            firstWord = false;
            while (read < n && chars[read] != ' ') {
                clean[write++] = chars[read++];
            }
            while (read < n && chars[read] == ' ') read++;
        }

        int start = 0;
        for (int i = 0; i < write; i++) {
            if (i == write - 1 || clean[i + 1] == ' ') {
                reverse(clean, start, i);
                start = i + 2;
            }
        }

        return new String(clean, 0, write);
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }

}
