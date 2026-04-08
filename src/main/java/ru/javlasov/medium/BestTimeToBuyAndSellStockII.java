package ru.javlasov.medium;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */

public class BestTimeToBuyAndSellStockII {

    public static int maxProfit(int[] prices) {
        int sumPositiveValue = 0;

        for (int i = 1; i < prices.length; i++) {
            int diffValue = prices[i] - prices[i - 1];

            if (diffValue > 0) {
                sumPositiveValue += diffValue;
            }
        }

        return sumPositiveValue;
    }

}
