package ru.javlasov.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/longest-consecutive-sequence/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class LongestConsecutiveSequence {

    // Time, Memory complexity is O(n)
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int longestSequence = 1;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {

            if (set.contains(num - 1)) {
                continue;
            }

            int current = num;
            int count = 1;

            while (set.contains(current + 1)) {
                current++;
                count++;
            }

            longestSequence = Math.max(longestSequence, count);
        }


        return longestSequence;
    }

}
