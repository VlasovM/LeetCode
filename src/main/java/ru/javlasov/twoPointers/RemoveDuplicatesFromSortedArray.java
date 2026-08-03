package ru.javlasov.twoPointers;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/">...</a>
 * Time complexity: O(n) – single pass through the array.
 * Memory complexity: O(1) – in-place modification, no extra memory.
 */

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int slowIndex = 0; // last unique element
        for (int fastIndex = 1; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != nums[slowIndex]) {
                nums[++slowIndex] = nums[fastIndex];
            }
        }

        slowIndex++;
        return slowIndex;
    }

}
