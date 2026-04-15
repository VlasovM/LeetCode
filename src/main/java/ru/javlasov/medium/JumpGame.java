package ru.javlasov.medium;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
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
