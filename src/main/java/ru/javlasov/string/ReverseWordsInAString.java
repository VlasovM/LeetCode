package ru.javlasov.string;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class ReverseWordsInAString {

    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        // 1. Разворот всей строки
        reverse(chars, 0, n - 1);

        // 2. Очистка от лишних пробелов
        char[] clean = new char[n];
        int write = 0;
        int read = 0;

        // пропускаем начальные пробелы
        while (read < n && chars[read] == ' ') read++;

        boolean firstWord = true;
        while (read < n) {
            if (!firstWord) {
                clean[write++] = ' '; // пробел между словами
            }
            firstWord = false;
            // копируем слово
            while (read < n && chars[read] != ' ') {
                clean[write++] = chars[read++];
            }
            // пропускаем пробелы до следующего слова
            while (read < n && chars[read] == ' ') read++;
        }

        // 3. Разворот каждого слова в clean
        int start = 0;
        for (int i = 0; i < write; i++) {
            if (i == write - 1 || clean[i + 1] == ' ') {
                reverse(clean, start, i);
                start = i + 2;
            }
        }

        return new String(clean, 0, write);
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }

}
