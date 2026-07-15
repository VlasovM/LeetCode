package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.matrix.SpiralMatrix.spiralOrder;

class SpiralMatrixTest {

    @Test
    @DisplayName("Example 1: matrix = [[1,2,3],[4,5,6],[7,8,9]]")
    void testExampleFirst() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},

        };

        List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
        System.out.println("expected: " + expected);

        List<Integer> actual = spiralOrder(matrix);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]")
    void testExampleSecond() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},

        };

        List<Integer> expected = List.of(1,2,3,4,8,12,11,10,9,5,6,7);
        System.out.println("expected: " + expected);

        List<Integer> actual = spiralOrder(matrix);

        assertEquals(expected, actual);
    }

}