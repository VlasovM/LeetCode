package ru.javlasov.medium;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * In this task we use two-pointer method.
 * The sorting property: If the array is sorted in ascending order, then
 * The sum of left + right will decrease if you move rightPointer to the left.
 * The sum of left + right will increase if you move leftPointer to the right
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
