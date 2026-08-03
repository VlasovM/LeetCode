package ru.javlasov.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/word-pattern/description/">...</a>
 * Time complexity: O(n + m) – where n = pattern.length() (number of words) and m = s.length() (for split). The loop runs in O(n), and split is O(m).
 * Memory complexity: O(n) – stores up to n entries in countMap and uniqueWord.
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
