package ru.javlasov.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/group-anagrams/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> countMap = new HashMap<>();

        for (String word : strs) {
            int[] countSymbolsArray = new int[26];

            for (Character symbol : word.toCharArray()) {
                countSymbolsArray[symbol - 'a']++;
            }

            StringBuilder builder = new StringBuilder();
            for (int count : countSymbolsArray) {
                builder.append(count).append('#');
            }

            if (countMap.containsKey(builder.toString())) {
                List<String> mapSubList = countMap.get(builder.toString());
                mapSubList.add(word);
            } else {
                List<String> newMapSubList = new ArrayList<>();
                newMapSubList.add(word);
                countMap.put(builder.toString(), newMapSubList);
            }
        }


        return new ArrayList<>(countMap.values());
    }


}
