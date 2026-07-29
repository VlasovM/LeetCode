package ru.javlasov.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/spiral-matrix/description/">...</a>
 * Time complexity: O(m × n) – each element is added exactly once.
 * Memory complexity: O(1) additional (excluding the output list), but the output list itself requires O(m × n) space.
 */

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;

        while (top <= bottom && left <= right) {

            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }


        return result;
    }

}
