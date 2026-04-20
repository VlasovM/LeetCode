package ru.javlasov.medium;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * In this task we use Sliding Window pattern: <a href="https://www.geeksforgeeks.org/dsa/window-sliding-technique/">...</a>
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
