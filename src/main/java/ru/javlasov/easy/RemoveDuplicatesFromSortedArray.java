package ru.javlasov.easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        // example 1
        System.out.println(removeDuplicates(new int[]{1, 2, 3, 3}) + "\n");

        // example 2
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}) + "\n");

        // example 2
        System.out.println(removeDuplicates(new int[]{1, 1, 2}) + "\n");
    }

    private static int removeDuplicates(int[] nums) {
        System.out.println("input array: " + Arrays.toString(nums));

        if (nums.length < 2) {
            System.out.println("result: k = " + nums.length + " nums: " + Arrays.toString(nums));
            return nums.length;
        }

        int slowIndex = 0; // last unique element
        for (int fastIndex = 1; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != nums[slowIndex]) {
                nums[++slowIndex] = nums[fastIndex];
            }
        }

        slowIndex++;
        System.out.println("result: k = " + slowIndex + " nums: " + Arrays.toString(nums));
        return slowIndex;
        }

}
