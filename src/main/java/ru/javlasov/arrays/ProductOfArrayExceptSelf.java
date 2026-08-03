package ru.javlasov.arrays;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/product-of-array-except-self/description/">...</a>
 * Time complexity: O(n) – two linear passes through the array.
 * Memory complexity: O(1) – constant extra memory (excluding the output array).
 */

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        if (nums.length == 0) {
            return new int[0];
        }

        int[] answers = new int[nums.length];
        answers[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            answers[i] = answers[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answers[i] = answers[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return answers;
    }

}
