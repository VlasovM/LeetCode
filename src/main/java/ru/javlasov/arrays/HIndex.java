package ru.javlasov.arrays;

import java.util.Arrays;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/h-index/description/">...</a>
 * Подсказка: Минимальное цитирование среди n - i статей не меньше, чем количество этих статей
 * Time complexity: O(n log n) – dominated by sorting the array.
 * Memory complexity: O(1) – constant extra memory (sorting may use O(log n) stack space, but typically considered O(1) for primitives).
 */

public class HIndex {

    public static int hIndex(int[] citations) {
        Arrays.sort(citations); // we use default method from java.ulils

        int h = 0;

        for (int i = citations.length - 1; i >= 0; i--) {
            int count = citations.length - i;

            if (citations[i] >= count) {
                h = count;
            } else {
                break;
            }
        }

        return h;
    }

}
