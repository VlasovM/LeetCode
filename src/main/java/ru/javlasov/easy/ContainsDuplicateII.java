package ru.javlasov.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/contains-duplicate-ii/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class ContainsDuplicateII {

    // O(n) in memory, O(n) in time
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int distance = i - map.get(nums[i]);

                if (distance <= k) {
                    return true;
                }
            }

            map.put(nums[i], i);
        }

        return false;
    }

}
