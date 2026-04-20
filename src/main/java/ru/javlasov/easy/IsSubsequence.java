package ru.javlasov.easy;

public class IsSubsequence {

    /**
     * LeetCode:
     * <a href="https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
     * <p>
     * In this task we use Two-pointer method: <a href="https://www.geeksforgeeks.org/dsa/two-pointers-technique/">...</a>
     */

    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int firstPointer = 0;

        for (int secondPointer = 0; secondPointer < t.length(); secondPointer++) {
            if (firstPointer == s.length()) {
                return true;
            }

            if (s.charAt(firstPointer) == t.charAt(secondPointer)) {
                firstPointer++;
            }

        }

        return firstPointer == s.length();
    }

}
