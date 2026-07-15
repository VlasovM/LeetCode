package ru.javlasov.matrix;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/set-matrix-zeroes/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        boolean isRowMustBeZero = false;

        // we need to know which rows and colums need to be zero
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                int currentValue = matrix[row][column];

                if (currentValue == 0) {
                    matrix[0][column] = 0; // mark that all values in column need to set zero

                    if (row > 0) {
                        matrix[row][0] = 0; // mark that all values in row need to set zero
                    } else {
                        isRowMustBeZero = true;
                    }

                }
            }
        }

        for (int row = 1; row < rows; row++) {
            for (int column = 1; column < columns; column++) {
                if (matrix[0][column] == 0 || matrix[row][0] == 0) {
                    matrix[row][column] = 0;
                }

            }
        }

        if (matrix[0][0] == 0) {
            for (int row = 0; row < rows; row++) {
                matrix[row][0] = 0;
            }
        }

        if (isRowMustBeZero) {
            for (int column = 0; column < columns; column++) {
                matrix[0][column] = 0;
            }
        }

    }

}
