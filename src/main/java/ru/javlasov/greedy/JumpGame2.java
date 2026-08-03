package ru.javlasov.greedy;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/jump-game-ii/description/">...</a>
 * Time complexity: O(n) – single pass through the array (except last element).
 * Memory complexity: O(1) – constant extra memory.
 */

public class JumpGame2 {

    public static int jump(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }

        int farthest = 0;
        int currentEnd = 0;
        int jumps = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }

            if (currentEnd >= nums.length - 1) {
                break;
            }
        }

        return jumps;
    }

}
