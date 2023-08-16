package MergeSortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/merge-sorted-array/?envType=list&envId=ribypp1e

public class Main {

    public static void main(String[] args) {

        int[] nums1 = new int[] {0};
        int[] nums2 = new int[] {1};
        int m = 0;
        int n = 1;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
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
