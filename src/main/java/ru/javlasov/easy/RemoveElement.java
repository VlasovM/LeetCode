package ru.javlasov.easy;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        // example 1
        System.out.println("k = " + removeElement(new int[]{3, 2, 2, 3}, 3) + "\n");
        // example 2
        System.out.println("k = " + removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2) + "\n");
        // example 3
        System.out.println("k = " + removeElement(new int[]{1, 2, 3}, 2) + "\n");
    }

    private static int removeElement(int[] nums, int val) {
        System.out.println("input: nums: " + Arrays.toString(nums) + " val = " + val);
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println("result array: " + Arrays.toString(nums));
        return k;
    }

}
