package ru.javlasov.hashMap;

import java.util.*;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/group-anagrams/description/">...</a>
 * Time complexity: O(N * K log K), where N is the number of strings and K is the average length of a string (or O(T log K) where T is total characters).
 * Memory complexity: O(T) – stores all strings and keys in the hash map.
 */

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());
    }

//    public static List<List<String>> groupAnagrams(String[] strs) {
//        Map<String, List<String>> countMap = new HashMap<>();
//
//        for (String word : strs) {
//            int[] countSymbolsArray = new int[26];
//
//            for (Character symbol : word.toCharArray()) {
//                countSymbolsArray[symbol - 'a']++;
//            }
//
//            StringBuilder builder = new StringBuilder();
//            for (int count : countSymbolsArray) {
//                builder.append(count).append('#');
//            }
//
//            if (countMap.containsKey(builder.toString())) {
//                List<String> mapSubList = countMap.get(builder.toString());
//                mapSubList.add(word);
//            } else {
//                List<String> newMapSubList = new ArrayList<>();
//                newMapSubList.add(word);
//                countMap.put(builder.toString(), newMapSubList);
//            }
//        }
//
//
//        return new ArrayList<>(countMap.values());
//    }


}
