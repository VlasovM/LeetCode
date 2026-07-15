package ru.javlasov.intervals;

import java.util.Arrays;
import java.util.Comparator;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class MinimumNumberOfArrowsToBurstBalloons {

    // Time complexity is O(n log n) for sort and memory complexity is O(1)
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
