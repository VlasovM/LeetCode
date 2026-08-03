package ru.javlasov.hashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/two-sum/description/">...</a>
 * Time complexity: O(n) – single pass through the array; each HashMap operation is O(1) on average.
 * Memory complexity: O(n) – stores up to n elements in the worst case.
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
