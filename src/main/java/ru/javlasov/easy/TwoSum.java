package ru.javlasov.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/two-sum/submissions/2021081751/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
