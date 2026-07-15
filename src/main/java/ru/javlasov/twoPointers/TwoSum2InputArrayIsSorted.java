package ru.javlasov.twoPointers;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/">...</a>
 * Time complexity: O(n) – single pass with two pointers.
 * Memory complexity: O(1) – constant extra memory.
 */

public class TwoSum2InputArrayIsSorted {

    public static int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        while (leftPointer < rightPointer) {

            int sum = numbers[leftPointer] + numbers[rightPointer];

            if (sum == target) {
                return new int[]{leftPointer + 1, rightPointer + 1};
            } else if (sum > target) {
                rightPointer--;
            } else {
                leftPointer++;
            }

        }

        return null;
    }

}
