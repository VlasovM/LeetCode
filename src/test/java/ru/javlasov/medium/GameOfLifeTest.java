package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.javlasov.matrix.GameOfLife.gameOfLife;

class GameOfLifeTest {

    @Test
    @DisplayName("Example 1: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]")
    void testExampleFirst() {
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0},

        };

        int[][] expected = {
                {0, 0, 0},
                {1, 0, 1},
                {0, 1, 1},
                {0, 1, 0},

        };

        gameOfLife(board);

        assertArrayEquals(expected, board);
    }

    @Test
    @DisplayName("Example 2: board = [[1,1],[1,0]]")
    void testExampleSecond() {
        int[][] board = {
                {1, 1},
                {1, 0},

        };

        int[][] expected = {
                {1, 1},
                {1, 1},

        };

        gameOfLife(board);

        assertArrayEquals(expected, board);
    }

}