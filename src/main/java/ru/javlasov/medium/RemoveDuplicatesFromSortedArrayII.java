package ru.javlasov.medium;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class RemoveDuplicatesFromSortedArrayII {

    public static void main(String[] args) {
        // example 1
        removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});
        // example 2
        removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});

    }

    private static int removeDuplicates(int[] nums) {
        System.out.println("input array: " + Arrays.toString(nums));

        if (nums.length < 3) {
            System.out.println("result: k = " + nums.length + " nums: " + Arrays.toString(nums) + "\n");
            return nums.length;
        }

        int slowIndex = 2; // last unique element
        for (int fastIndex = 2; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != nums[slowIndex - 2]) {
                nums[slowIndex++] = nums[fastIndex];
            }
        }
        System.out.println("result: k = " + slowIndex + " nums: " + Arrays.toString(nums) + "\n");
        return slowIndex;
    }

}
