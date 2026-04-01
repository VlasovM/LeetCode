package ru.javlasov.medium;

import java.util.Arrays;

/**
 * In this case I use the Reverse approach. Reverse array basic in algorithm "two pointers".
 * LeetCode:
 * <a href="https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        if (nums.length == k || k == 0) {
            return;
        }

        if (k > nums.length) {
            k = k % nums.length;
        }

        // step 1: reverse all array
        int left = 0;
        int right = nums.length - 1;

        while (right > left) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        // step 2: reverse first k elements
        left = 0;
        right = k - 1;

        while (right > left) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        // step 3: reverse remaining elements (nums.lenght - k)
        left = k;
        right = nums.length - 1;

        while (right > left) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

}
