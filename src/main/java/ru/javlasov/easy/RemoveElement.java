package ru.javlasov.easy;

/**
 * <a href="https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}
