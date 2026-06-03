package ru.javlasov.easy;

import java.util.Arrays;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/isomorphic-strings/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mapST = new int[256];
        int[] mapTS = new int[256];
        Arrays.fill(mapST, -1);
        Arrays.fill(mapTS, -1);

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapST[c1] != mapTS[c2]) {
                return false;
            }
            mapST[c1] = i + 1;
            mapTS[c2] = i + 1;
        }
        return true;
    }

//    public static boolean isIsomorphic(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        Map<Character, Character> mapST = new HashMap<>();
//        Map<Character, Character> mapTS = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char cs = s.charAt(i);
//            char ct = t.charAt(i);
//
//            if ((mapST.containsKey(cs) && !mapST.get(cs).equals(ct)) || (mapTS.containsKey(ct) && !mapTS.get(ct).equals(cs))) {
//                return false;
//            }
//
//            mapST.put(cs, ct);
//            mapTS.put(ct, cs);
//
//        }
//
//        return true;
//    }

}
