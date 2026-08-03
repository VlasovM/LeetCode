package ru.javlasov.greedy;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/">...</a>
 * Time complexity: O(n) – single pass through the array.
 * Memory complexity: O(1) – constant extra memory.
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
