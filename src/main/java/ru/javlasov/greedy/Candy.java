package ru.javlasov.greedy;

/**
 * Complexity: Hard
 * LeetCode: <a href="https://leetcode.com/problems/candy/description/">...</a>
 * Time complexity: O(n) – three linear passes through the array.
 * Memory complexity: O(n) – uses an additional array of size n for candies.
 */

public class Candy {

    public static int candy(int[] ratings) {

        if (ratings.length == 0) {
            return 0;
        }

        int[] candies = new int[ratings.length];
        int result = 0;

        for (int i = 0; i < ratings.length; i++) {
            if (i != 0 && ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            } else {
                candies[i] = 1;
            }
        }


        for (int i = ratings.length - 1; i >= 0; i--) {
            if (i != ratings.length - 1 && ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        for (int i = 0; i < ratings.length; i++) {
            result += candies[i];
        }

        return result;
    }

}
