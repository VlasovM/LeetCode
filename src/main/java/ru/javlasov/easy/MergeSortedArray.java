package ru.javlasov.easy;

/**
 * <a href="https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }

        int indexLastElementNums1 = m - 1;
        int indexLastElementNums2 = n - 1;
        int indexLastElementResultList = m + n - 1;

        while (indexLastElementNums1 >= 0 && indexLastElementNums2 >= 0) {
            if (nums1[indexLastElementNums1] > nums2[indexLastElementNums2]) {
                nums1[indexLastElementResultList] = nums1[indexLastElementNums1];
                indexLastElementNums1--;
            } else {
                nums1[indexLastElementResultList] = nums2[indexLastElementNums2];
                indexLastElementNums2--;
            }
            indexLastElementResultList--;
        }

        while (indexLastElementNums2 >= 0) {
            nums1[indexLastElementResultList] = nums2[indexLastElementNums2];
            indexLastElementNums2--;
            indexLastElementResultList--;
        }
    }

}
