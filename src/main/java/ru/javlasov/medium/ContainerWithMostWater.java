package ru.javlasov.medium;

public class ContainerWithMostWater {

    /**
     * LeetCode:
     * <a href="https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
     *
     * In this task we use Two-pointer method.
     * The key idea is to move the pointer that has a lower height.
     */

    public static int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = 0;

        while (leftPointer < rightPointer) {
            int currentArea = Math.min(height[rightPointer], height[leftPointer]) * (rightPointer  - leftPointer);
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
