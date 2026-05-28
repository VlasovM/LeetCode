package ru.javlasov.medium;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/rotate-image/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
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
