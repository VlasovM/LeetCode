package ru.javlasov.easy;

/**
 * Given an integer x, return true if x is a
 * palindrome, and false otherwise.
 *
 * https://leetcode.com/problems/palindrome-number/description/
 */

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String inputValue = String.valueOf(x);
        char[] tempArray = inputValue.toCharArray();
        StringBuilder inputValueReverse = new StringBuilder();
        for (int y = inputValue.length(); y > 0; y--) {
            inputValueReverse.append(tempArray[y - 1]);
        }
        return inputValue.equals(inputValueReverse.toString());
    }

}
