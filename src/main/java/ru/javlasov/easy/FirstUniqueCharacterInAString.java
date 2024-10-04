package ru.javlasov.easy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 *
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 */

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        Map<Character, Integer> countCharactersMap = new LinkedHashMap<>();
        for (char ch : s.toCharArray()) {
            if (countCharactersMap.containsKey(ch)) {
                countCharactersMap.put(ch, (countCharactersMap.get(ch)) + 1);
            } else {
                countCharactersMap.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : countCharactersMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(s.indexOf('c'));
                return s.indexOf(String.valueOf(entry.getKey()));
            }
        }
        return -1;
    }

}
