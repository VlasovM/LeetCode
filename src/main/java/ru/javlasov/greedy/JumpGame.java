package ru.javlasov.greedy;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/jump-game/description/">...</a>
 * Time complexity: O(n) – single pass through the array.
 * Memory complexity: O(1) – constant extra memory.
 */

public class JumpGame {

    public static boolean canJump(int[] nums) {
        int maxDistance = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxDistance) {
                return false;
            }
            maxDistance = Math.max(maxDistance, nums[i] + i);
        }
        return true;
    }

}
