package ru.javlasov.intervals;

import java.util.ArrayList;
import java.util.List;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/summary-ranges/description/">...</a>
 * Time complexity: O(n) – single pass through the array.
 * Memory complexity: O(1) – constant extra memory (excluding the output list).
 */

public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }

        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1] + 1) {
                if (start == nums[i-1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i-1]);
                }
                start = nums[i];
            }
        }

        if (start == nums[nums.length-1]) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[nums.length-1]);
        }
        return result;
    }

}
