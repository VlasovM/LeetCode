package ru.javlasov.intervals;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/">...</a>
 * Time complexity: O(n log n) – sorting the intervals by their end points.
 * Memory complexity: O(1) – aside from the sorting overhead (which may require O(log n) to O(n) depending on implementation),
 * the algorithm uses only a few variables. Typically considered O(1) extra memory.
 */

public class MinimumNumberOfArrowsToBurstBalloons {

    public static int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        Arrays.sort(points, Comparator.comparingInt(x -> x[1]));

        int arrows = 1;
        int currentEndPosition = points[0][1];

        for (int i = 1; i < points.length; i++) {
            int[] currentInterval = points[i];

            if (currentInterval[0] > currentEndPosition) {
                arrows += 1;
                currentEndPosition = currentInterval[1];
            }
        }

        return arrows;
    }

}
