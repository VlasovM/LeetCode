package ru.javlasov.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/3sum/description/">...</a>
 * Time complexity: O(n²) – sorting O(n log n) plus two-pointer scan O(n²) dominates.
 * Memory complexity: O(1) extra (excluding output list) – sorting uses O(log n)
 * to O(n) stack/array, but typically considered O(1) for in-place sort of primitives?
 * For Java’s Arrays.sort on primitives uses O(log n) space for recursion, but we ignore.
 * Output list can be O(n²) in worst case.
 */

public class Sum3 {

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>(new ArrayList<>());
        }

        // sort array for use two-pointer method. Use ready-made method from package java.util
        Arrays.sort(nums);

        List<List<Integer>> resultList = new ArrayList<>();

        for (int fixationIndex = 0; fixationIndex < nums.length; fixationIndex++) {
            if (nums[fixationIndex] > 0) {
                break;
            }

            if (fixationIndex > 0 && nums[fixationIndex] == nums[fixationIndex - 1]) {
                continue;
            }

            int leftPointer = fixationIndex + 1;
            int rightPointer = nums.length - 1;

            while (leftPointer < rightPointer) {
                int sum = nums[leftPointer] + nums[rightPointer] + nums[fixationIndex];

                if (sum < 0) {
                    leftPointer++;

                } else if (sum > 0) {
                    rightPointer--;
                } else {
                    resultList.add(List.of(nums[fixationIndex], nums[leftPointer], nums[rightPointer]));

                    while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer + 1]) {
                        leftPointer++;
                    }
                    while (leftPointer < rightPointer && nums[rightPointer] == nums[rightPointer - 1]) {
                        rightPointer--;
                    }

                    leftPointer++;
                    rightPointer--;
                }
            }
        }

        return resultList;
    }

}
