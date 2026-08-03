package ru.javlasov.twoPointers;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/valid-palindrome/description/">...</a>
 * Time complexity: O(n) – single pass with two pointers, each character processed at most once.
 * Memory complexity: O(1) – constant extra memory.
 */

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return true;
        }

        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (rightPointer > leftPointer) {
            while (rightPointer > leftPointer && !Character.isLetterOrDigit(s.charAt(leftPointer))) {
                leftPointer++;
            }

            while (rightPointer > leftPointer && !Character.isLetterOrDigit(s.charAt(rightPointer))) {
                rightPointer--;
            }

            if (leftPointer >= rightPointer) {
                break;
            }

            if (Character.toLowerCase(s.charAt(rightPointer)) != Character.toLowerCase(s.charAt(leftPointer))) {
                return false;
            }

            leftPointer++;
            rightPointer--;
        }
        return true;
    }

}
