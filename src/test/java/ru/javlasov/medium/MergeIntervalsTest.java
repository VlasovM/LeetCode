package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.javlasov.intervals.MergeIntervals.merge;

class MergeIntervalsTest {

    @Test
    @DisplayName("Example 1: intervals = [[1,3],[2,6],[8,10],[15,18]]")
    void testExampleFirst() {
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18},
        };

        int[][] expected = {
                {1, 6},
                {8, 10},
                {15, 18},
        };

        int[][] actual = merge(intervals);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: intervals = [[1,4],[4,5]]")
    void testExampleSecond() {
        int[][] intervals = {
                {1, 4},
                {4, 5},
        };

        int[][] expected = {
                {1, 5},
        };

        int[][] actual = merge(intervals);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: intervals = [[4,7],[1,4]]")
    void testExampleThird() {
        int[][] intervals = {
                {4, 7},
                {1, 4},
        };

        int[][] expected = {
                {1, 7},
        };

        int[][] actual = merge(intervals);

        assertArrayEquals(expected, actual);
    }

}