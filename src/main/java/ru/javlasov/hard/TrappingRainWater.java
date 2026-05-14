package ru.javlasov.hard;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/trapping-rain-water/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 * Useful video: <a href="https://www.youtube.com/watch?v=ZI2z5pq0TqA">...</a>
 */

public class TrappingRainWater {

    // O(n)
//    public static int trap(int[] height) {
//        if (height.length < 3) {
//            return 0;
//        }
//
//        int[] maxLeft = new int[height.length];
//        int maxValue = 0;
//
//        for (int i = 0; i < height.length; i++) {
//            maxLeft[i] = maxValue;
//            maxValue = Math.max(maxValue, height[i]);
//        }
//
//        int[] maxRight = new int[height.length];
//        maxValue = 0;
//
//        for (int i = height.length - 1; i >= 0; i--) {
//            maxRight[i] = maxValue;
//            maxValue = Math.max(maxValue, height[i]);
//        }
//
//
//        for (int i = 0; i < height.length; i++) {
//            height[i] = Math.max(Math.min(maxLeft[i], maxRight[i]) - height[i], 0);
//        }
//
//        int water = 0;
//
//        for (int j : height) {
//            water += j;
//        }
//
//        return water;
//    }


    // O(1)
    public static int trap(int[] height) {
        if (height.length < 3) {
            return 0;
        }

        int leftPointer = 0;
        int rightPointer = height.length - 1;

        int maxLeftPointer = 0;
        int maxRightPointer = 0;

        int water = 0;

        while (leftPointer < rightPointer) {

            maxLeftPointer = Math.max(maxLeftPointer, height[leftPointer]);
            maxRightPointer = Math.max(maxRightPointer, height[rightPointer]);

            if (maxLeftPointer < maxRightPointer) {
                water += maxLeftPointer - height[leftPointer];
                leftPointer++;
            } else {
                water += maxRightPointer - height[rightPointer];
                rightPointer--;
            }

        }

        return water;
    }

}
