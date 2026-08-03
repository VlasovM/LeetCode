package ru.javlasov.matrix;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/rotate-image/description/">...</a>
 * Time complexity: O(n²) – each element is processed exactly once (four rotations per layer, total n²/4 iterations, but O(n²) overall).
 * Memory complexity: O(1) – in-place rotation, only a few integer variables used.
 */

public class RotateImage {

    public static void rotate(int[][] matrix) {

        int l = 0;
        int r = matrix.length - 1;

        while (r > l) {
            for (int i = 0; i < r - l; i++) {
                int top = l;
                int bottom = r;

                // save the top left value
                int savedValue = matrix[top][l + i];

                // move bottom left into top left
                matrix[top][l + i] = matrix[bottom - i][l];

                // move bottom right into bottom left
                matrix[bottom - i][l] = matrix[bottom][r - i];

                // move top right into bottom right
                matrix[bottom][r - i] = matrix[top + i][r];

                // set saved value in last box
                matrix[top + i][r] = savedValue;
            }
            l += 1;
            r -= 1;
        }

    }

}
