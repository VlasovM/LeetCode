package ru.javlasov.hashMap;

import java.util.HashSet;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/happy-number/description/">...</a>
 * Time complexity: O(log n) – each iteration processes the digits of the current number (number of digits is log₁₀ n).
 * The total number of iterations until termination is bounded by a constant (due to the cycle), but in worst case it's O(log n).
 * Memory complexity: O(log n) – stores seen numbers in the HashSet (could be up to the number of iterations before cycle detection).
 */

public class HappyNumber {

    public static boolean isHappy(int n) {

        HashSet<Integer> uniqueDigits = new HashSet<>();

        while (!uniqueDigits.contains(n)) {
            uniqueDigits.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    private static int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

}
