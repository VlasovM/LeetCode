package ru.javlasov.hard;

public class Candy {

    /**
     * LeetCode:
     * <a href="https://leetcode.com/problems/candy/?envType=study-plan-v2&envId=top-interview-150">...</a>
     */

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
