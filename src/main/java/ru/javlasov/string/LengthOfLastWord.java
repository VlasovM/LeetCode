package ru.javlasov.string;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
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
