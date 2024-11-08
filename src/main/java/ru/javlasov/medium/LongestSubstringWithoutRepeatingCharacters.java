package ru.javlasov.medium;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 *
 * Given a string s, find the length of the longest
 * substring without repeating characters.
 */

//TODO: Make more efficient (284 ms | 45.34 mb)
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        char[] arraysInString = s.toCharArray();
        String tempString;
        int lengthSubstring = 0;

        for (int i = 0; i < s.length(); i++) {
            tempString = String.valueOf(arraysInString[i]);
            for (int j = i + 1; j < s.length(); j++) {
                String s1 = String.valueOf(arraysInString[j]);
                if (!tempString.contains(s1)) {
                    tempString += s1;
                    lengthSubstring = Math.max(lengthSubstring, tempString.length());
                } else {
                    lengthSubstring = Math.max(lengthSubstring, tempString.length());
                    break;
                }
            }
        }
        return lengthSubstring;
    }

}
