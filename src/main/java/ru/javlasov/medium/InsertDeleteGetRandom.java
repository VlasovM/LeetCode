package ru.javlasov.medium;

import java.util.*;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/insert-delete-getrandom-o1/?envType=study-plan-v2&envId=top-interview-150">...</a>
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
