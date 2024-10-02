package ru.javlasov.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/merge-sorted-array/description/
 *
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = Math.max(m, n);
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            if (i < m) {
                tempList.add(nums1[i]);
            }
            if (i < n) {
                tempList.add(nums2[i]);
            }
        }

        Collections.sort(tempList);

        if (tempList.size() == 1) {
            nums1[0] = tempList.get(0);
        } else {
            for (int j = 0; j < tempList.size(); j++) {
                nums1[j] = tempList.get(j);
            }
        }
    }

}
