package ru.javlasov.twoPointers;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/">...</a>
 * Time complexity: O(n) – single pass through the array.
 * Memory complexity: O(1) – in-place modification, no extra memory.
 */

public class RemoveDuplicatesFromSortedArray2 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int slowIndex = 2; // last unique element
        for (int fastIndex = 2; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != nums[slowIndex - 2]) {
                nums[slowIndex++] = nums[fastIndex];
            }
        }
        return slowIndex;
    }

}
