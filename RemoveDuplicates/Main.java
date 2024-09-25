package RemoveDuplicates;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=list&envId=ribypp1e

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,0,1,1,1,2,2,3,3,4}));

    }


    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }


}
