package ru.javlasov.easy;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        // example 1:
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        // example 2:
        merge(new int[]{1}, 1, new int[]{}, 0);
        // example 3:
        merge(new int[]{0}, 0, new int[]{}, 0);
        // example 4:
        merge(new int[]{0}, 0, new int[]{1}, 1);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            System.out.println("result: " + Arrays.toString(nums1));
            return;
        }

        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            System.out.println("result: " + Arrays.toString(nums1));
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

        System.out.println("result: " + Arrays.toString(nums1));
    }

}
