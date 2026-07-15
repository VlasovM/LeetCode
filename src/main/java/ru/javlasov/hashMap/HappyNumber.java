package ru.javlasov.hashMap;

import java.util.HashSet;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/happy-number/?envType=study-plan-v2&envId=top-interview-150">...</a>
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
