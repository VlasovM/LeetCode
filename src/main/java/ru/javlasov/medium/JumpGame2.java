package ru.javlasov.medium;

public class JumpGame2 {

    /**
     * LeetCode:
     * <a href="https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
     * <p>
     * We solve this problem use Greedy algorithm.
     */

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
