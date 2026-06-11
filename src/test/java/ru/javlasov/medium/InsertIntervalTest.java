package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.javlasov.medium.InsertInterval.insert;

class InsertIntervalTest {

    @Test
    @DisplayName("Example 1: intervals = [[1,3],[6,9]], newInterval = [2,5]")
    void testExampleFirst() {
        int[][] intervals = {
                {1, 3},
                {6, 9},
        };

        int[] newInterval = {2, 5};

        int[][] expected = {
                {1, 5},
                {6, 9},
        };

        int[][] actual = insert(intervals, newInterval);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]")
    void testExampleSecond() {
        int[][] intervals = {
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16},
        };

        int[] newInterval = {4, 8};

        int[][] expected = {
                {1, 2},
                {3, 10},
                {12, 16},
        };

        int[][] actual = insert(intervals, newInterval);

        assertArrayEquals(expected, actual);
    }

}