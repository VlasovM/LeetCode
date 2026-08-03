package ru.javlasov.hashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/contains-duplicate-ii/description/">...</a>
 * Time complexity: O(n) – single pass through the array; each HashMap operation is O(1) on average.
 * Memory complexity: O(n) – in worst case, stores all elements (if all are unique).
 * (Can be reduced to O(min(n, k)) with a sliding window Set, but this implementation uses a Map.)
 */

public class ContainsDuplicate2 {

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
