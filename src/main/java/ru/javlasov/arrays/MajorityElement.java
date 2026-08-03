package ru.javlasov.arrays;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/majority-element/description/">...</a>
 * In this task we use Boyer-Moore Majority Voting Algorithm:
 * <a href="https://www.geeksforgeeks.org/theory-of-computation/boyer-moore-majority-voting-algorithm/">...</a>
 * Time complexity: O(n) – single pass through the array.
 * Memory complexity: O(1) – constant extra memory.
 */

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0 || nums[i] == candidate) {
                candidate = nums[i];
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

}
