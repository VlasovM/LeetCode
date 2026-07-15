package ru.javlasov.intervals;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode:
 * <a href="https://leetcode.com/problems/insert-interval/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class InsertInterval {

    // Time, Memory complexity is O(n)
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int[] merged = newInterval;

        for (int[] current : intervals) {
            if (current[1] < merged[0]) {
                result.add(current);
            } else if (current[0] > merged[1]) {
                result.add(merged);
                merged = current;
            } else {
                merged[0] = Math.min(merged[0], current[0]);
                merged[1] = Math.max(merged[1], current[1]);
            }
        }

        result.add(merged);
        return result.toArray(new int[result.size()][]);
    }

}
