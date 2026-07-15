package ru.javlasov.twoPointers;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/rotate-array/description/">...</a>
 * Time complexity: O(n) – three reversals, each linear; total ~2n operations.
 * Memory complexity: O(1) – in-place reversal, no extra memory.
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
