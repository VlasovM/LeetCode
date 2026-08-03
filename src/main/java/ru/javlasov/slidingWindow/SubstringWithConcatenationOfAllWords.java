package ru.javlasov.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Complexity: Hard
 * LeetCode: <a href="https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/">...</a>
 * Time complexity: O(n * wordLen) – outer loop over start (up to wordLen), inner loop processes each character once
 * per start, effectively each character may be checked wordLen times.
 * Memory complexity:  O(m + L) – need and window store up to m words from words; window may store up to L words
 * in worst case (where L is total number of words in a window). In practice, O(m + totalLen/wordLen).
 */

public class SubstringWithConcatenationOfAllWords {

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.isEmpty() || words == null || words.length == 0) return result;

        int wordLen = words[0].length();
        int totalLen = words.length * wordLen;
        if (s.length() < totalLen) return result;

        Map<String, Integer> need = new HashMap<>();
        for (String w : words) {
            need.put(w, need.getOrDefault(w, 0) + 1);
        }

        for (int start = 0; start < wordLen; start++) {
            int left = start;
            int right = start;
            Map<String, Integer> window = new HashMap<>();
            int count = 0;

            while (right + wordLen <= s.length()) {
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (need.containsKey(word)) {
                    window.put(word, window.getOrDefault(word, 0) + 1);
                    count++;

                    while (window.get(word) > need.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }

                    if (count == words.length) {
                        result.add(left);
                        String leftWord = s.substring(left, left + wordLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }
                } else {
                    window.clear();
                    count = 0;
                    left = right;
                }
            }
        }
        return result;
    }

}
