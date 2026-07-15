package ru.javlasov.string;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
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
