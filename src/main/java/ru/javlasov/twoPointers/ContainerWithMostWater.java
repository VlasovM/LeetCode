package ru.javlasov.twoPointers;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/container-with-most-water/description/">...</a>
 * Time complexity: O(n) – single pass with two pointers.
 * Memory complexity: O(1) – no extra memory used.
 */

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = 0;

        while (leftPointer < rightPointer) {
            int currentArea = Math.min(height[rightPointer], height[leftPointer]) * (rightPointer - leftPointer);
            maxArea = Math.max(maxArea, currentArea);

            if (height[rightPointer] > height[leftPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }

        }
        return maxArea;
    }

}
