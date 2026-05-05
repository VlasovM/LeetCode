package ru.javlasov.medium;

import java.util.Arrays;

public class HIndex {

    /**
     * LeetCode:
     * <a href="https://leetcode.com/problems/h-index/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
     *  Подсказка: Минимальное цитирование среди n - i статей не меньше, чем количество этих статей
     */

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
