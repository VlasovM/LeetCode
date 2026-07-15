package ru.javlasov.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 */

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        if (pattern.length() != s.split(" ").length) {
            return false;
        }


        Map<Character, String> countMap = new HashMap<>();
        Set<String> uniqueWord = new HashSet<>();

        String[] arrayWords = s.split(" ");

        for (int i = 0; i < pattern.length(); i++) {
            char symbol = pattern.charAt(i);
            String word = arrayWords[i];

            if (countMap.containsKey(symbol) && !countMap.get(symbol).equals(word)) {
                return false;
            }

            if (!countMap.containsKey(symbol) && uniqueWord.contains(word)) {
                return false;
            }

            if (!countMap.containsKey(symbol)) {
                countMap.put(symbol, word);
                uniqueWord.add(word);
            }
        }

        return true;
    }

}
