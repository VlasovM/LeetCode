package ru.javlasov.easy;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * https://leetcode.com/problems/two-sum/description/
 */

public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        int lengthArray = nums.length;
        for (int x = 0; x < lengthArray; x++) {
            int rightElement = nums[x];
            for (int y = x + 1; y < lengthArray; y++) {
                int nextElement = nums[y];
                if ((rightElement + nextElement) == target) {
                    return new int[]{x, y};
                }
            }
        }
        return null;
    }

}
