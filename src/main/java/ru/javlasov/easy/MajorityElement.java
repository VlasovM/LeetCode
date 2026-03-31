package ru.javlasov.easy;

/**
 * Link in LeetCode:
 * <a href="https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 * <p>
 * In this task we use Boyer-Moore Majority Voting Algorithm:
 * <a href="https://www.geeksforgeeks.org/theory-of-computation/boyer-moore-majority-voting-algorithm/">...</a>
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
