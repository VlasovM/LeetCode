package ru.javlasov.easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 */


public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (String str : strs) {
            while(str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() -1);
            }
        }
        return prefix;
    }

}
