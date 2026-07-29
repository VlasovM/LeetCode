package ru.javlasov.matrix;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/valid-sudoku/description/">...</a>
 * Time complexity: O(1) – board size is fixed (9×9), constant number of operations.
 * Memory complexity: O(1) – fixed-size boolean arrays (9×9 each).
 */

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;

                int num = c - '1';
                int boxIndex = (i / 3) * 3 + (j / 3);

                if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
                    return false;
                }

                rows[i][num] = true;
                cols[j][num] = true;
                boxes[boxIndex][num] = true;
            }
        }
        return true;
    }

}
