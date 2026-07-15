package ru.javlasov.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Leetcode:
 * <a href="https://leetcode.com/problems/merge-intervals/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class MergeIntervals {

    // Time complexity is O(n log n) (sorting) and memory complexity is O(n)
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
