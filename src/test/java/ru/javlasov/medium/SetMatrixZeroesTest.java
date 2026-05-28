package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.javlasov.medium.SetMatrixZeroes.setZeroes;

class SetMatrixZeroesTest {

    @Test
    @DisplayName("Example 1: matrix = [[1,1,1],[1,0,1],[1,1,1]]")
    void testExampleFirst() {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1},

        };

        int[][] expected = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1},

        };

        setZeroes(matrix);

        assertArrayEquals(expected, matrix);
    }

    @Test
    @DisplayName("Example 2: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]")
    void testExampleSecond() {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5},

        };

        int[][] expected = {
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0},

        };

        setZeroes(matrix);

        assertArrayEquals(expected, matrix);
    }

}