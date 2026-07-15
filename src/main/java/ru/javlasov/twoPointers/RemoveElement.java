package ru.javlasov.twoPointers;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/remove-element/description/">...</a>
 * Time complexity: O(n) – one pass through the array.
 * Memory complexity: O(1) – in-place modification, no extra memory.
 */

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}
