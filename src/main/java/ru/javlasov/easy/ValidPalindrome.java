package ru.javlasov.easy;

public class ValidPalindrome {

    /**
     * LeetCode:
     * <a href="https://leetcode.com/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
     * <p>
     * In this task we use Two-pointer method: <a href="https://www.geeksforgeeks.org/dsa/two-pointers-technique/">...</a>
     */

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
