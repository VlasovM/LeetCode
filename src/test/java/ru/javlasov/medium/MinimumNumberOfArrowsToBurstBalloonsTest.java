package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.intervals.MinimumNumberOfArrowsToBurstBalloons.findMinArrowShots;

class MinimumNumberOfArrowsToBurstBalloonsTest {

    @Test
    @DisplayName("Example 1: points = [[10,16],[2,8],[1,6],[7,12]]")
    void testExampleFirst() {
        int[][] points = {
                {10, 16},
                {2, 8},
                {1, 6},
                {7, 12},
        };

        int expected = 2;

        int actual = findMinArrowShots(points);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: points = [[1,2],[3,4],[5,6],[7,8]]")
    void testExampleSecond() {
        int[][] points = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
        };

        int expected = 4;

        int actual = findMinArrowShots(points);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: points = [[1,2],[2,3],[3,4],[4,5]]")
    void testExampleThird() {
        int[][] points = {
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5},
        };

        int expected = 2;

        int actual = findMinArrowShots(points);

        assertEquals(expected, actual);
    }

}