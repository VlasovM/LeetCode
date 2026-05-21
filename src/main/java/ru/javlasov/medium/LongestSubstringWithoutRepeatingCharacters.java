package ru.javlasov.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }

        int maxSubArray = 0;
        Set<Character> tempList = new HashSet<>();

        int left = 0;
        int right = 0;

        char[] charArray = s.toCharArray();

        while (right < s.length()) {
            if (tempList.contains(charArray[right])) {
                while (tempList.contains(charArray[right])) {
                    tempList.remove(charArray[left]);
                    left++;
                }
            } else {
                tempList.add(charArray[right]);
                right++;

                maxSubArray = Math.max(tempList.size(), maxSubArray);
            }

        }
        return maxSubArray;
    }

}
