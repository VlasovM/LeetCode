package ru.javlasov.hashMap;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&envId=top-interview-150">...</a>
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
