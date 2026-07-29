package ru.javlasov.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/merge-intervals/description/">...</a>
 * Time complexity: O(n log n) – dominated by sorting the intervals.
 * Memory complexity: O(n) – stores the result list; sorting may use O(log n) to O(n) extra memory
 * depending on implementation (for int[] arrays, Java’s Arrays.sort uses TimSort which can use O(n) memory in worst case,
 * but is typically considered O(1) for primitives? Actually for arrays of objects (int[] is an object),
 * TimSort uses O(n) temporary storage, so overall O(n) space).
 */

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));

        int[] current = intervals[0];
        int[] next;

        for (int i = 1; i < intervals.length; i++) {
            next = intervals[i];

            if (next[0] <= current[1]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                result.add(new int[]{current[0], current[1]});
                current = next;
            }
        }

        result.add(current);

        return result.toArray(new int[result.size()][]);
    }

}
