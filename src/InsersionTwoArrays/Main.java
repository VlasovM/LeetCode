package InsersionTwoArrays;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = new int[]{3, 2, 1};
        int[] nums2 = new int[]{1, 3};

        intersect(nums1, nums2);

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]){
                j++;
            } else {
                nums1[k++] = nums1[i++];
                j++;
            }
        }

        return Arrays.copyOf(nums1, k);
    }

}
