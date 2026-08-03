package ru.javlasov.hashMap;

import java.util.HashSet;
import java.util.Set;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/longest-consecutive-sequence/description/">...</a>
 * Time complexity: O(n) – each element is processed once (HashSet building and while loop overall linear).
 * Memory complexity: O(n) – stores all unique elements in a HashSet.
 */

public class LongestConsecutiveSequence {

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
