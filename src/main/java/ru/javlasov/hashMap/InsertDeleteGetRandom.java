package ru.javlasov.hashMap;

import java.util.*;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/insert-delete-getrandom-o1/description/">...</a>
 * Time complexity:
 * insert: O(1) average – ArrayList.add is amortized O(1), HashMap.put is O(1).
 * remove: O(1) average – swap with last element, remove from end O(1), HashMap operations O(1).
 * getRandom: O(1) – random index generation and ArrayList.get.
 * Memory complexity: O(n) – stores n elements in the list and n entries in the map.
 */

public class InsertDeleteGetRandom {

    private final Random random;
    private final List<Integer> list; // in this list we contain all values
    private final Map<Integer, Integer> map; // in this map we contain value and index (index in array)

    public InsertDeleteGetRandom() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);

        return true;
    }

    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int indexToRemove = map.get(val);
            int lastIndex = list.size() - 1;

            if (indexToRemove != lastIndex) {
                int lastElement = list.get(lastIndex);
                list.set(indexToRemove, lastElement);
                map.put(lastElement, indexToRemove);
            }

            list.remove(lastIndex);
            map.remove(val);

            return true;
        }
        return false;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }

}
