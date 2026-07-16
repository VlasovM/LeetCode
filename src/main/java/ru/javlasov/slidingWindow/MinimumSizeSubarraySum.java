package ru.javlasov.slidingWindow;

/**
 * Complexity: Hard
 * LeetCode: <a href="https://leetcode.com/problems/minimum-window-substring/description/">...</a>
 * Time complexity: O(n) – each element is processed at most twice (once by rightSide, once by leftSide).
 * Memory complexity: O(1) – constant extra memory.
 */

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int leftSide = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int rightSide = 0; rightSide < nums.length; rightSide++) {
            currentSum = currentSum + nums[rightSide];

            while (currentSum >= target) {
                minLength = Math.min(minLength, rightSide - leftSide + 1);
                currentSum = currentSum - nums[leftSide];
                leftSide++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

}
