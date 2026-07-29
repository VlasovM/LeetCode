package ru.javlasov.hashMap;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/ransom-note/description/">...</a>
 * Time complexity: O(m + n) – where m = magazine.length(), n = ransomNote.length() (two passes over both strings).
 * Memory complexity: O(1) – fixed-size array of 26 (constant).
 */

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        for (Character symbol : magazine.toCharArray()) {
            count[symbol - 'a']++;
        }

        for (Character symbol : ransomNote.toCharArray()) {
            if (count[symbol - 'a'] == 0) {
                return false;
            }

            count[symbol - 'a']--;
        }
        return true;
    }

//    public static boolean canConstruct(String ransomNote, String magazine) {
//        Map<Character, Integer> countCharMap = new HashMap<>();
//
//        for (Character symbol : magazine.toCharArray()) {
//            countCharMap.put(symbol, countCharMap.getOrDefault(symbol, 0) + 1);
//        }
//
//        for (Character symbol : ransomNote.toCharArray()) {
//            if (countCharMap.containsKey(symbol) && countCharMap.get(symbol) > 0) {
//                countCharMap.put(symbol, countCharMap.get(symbol) - 1);
//            } else {
//                return false;
//            }
//        }
//
//        return true;
//    }


}
