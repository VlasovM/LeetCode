import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 5, 11};
        int target = 10;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        int lengthArray = nums.length;

        for (int x = 0; x < lengthArray; x++) {
            int rightElement = nums[x];
            for (int y = x + 1; y < lengthArray; y++) {
                int nextElement = nums[y];
                if ((rightElement + nextElement) == target) {
                    return new int[]{x, y};
                }
            }
        }
        return null;
    }

}
