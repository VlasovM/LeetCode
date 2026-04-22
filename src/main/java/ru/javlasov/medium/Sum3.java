package ru.javlasov.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {

    /**
     * LeetCode:
     * <a href="https://leetcode.com/problems/3sum/submissions/1985301452/?envType=study-plan-v2&envId=top-interview-150">...</a>
     * <p>
     * Solved with two-pointer method
     */

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
