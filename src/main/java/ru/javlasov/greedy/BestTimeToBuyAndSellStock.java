package ru.javlasov.greedy;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">...</a>
 *  * In this task we use Kadane's Algorithm:
 *  * <a href="https://www.geeksforgeeks.org/dsa/largest-sum-contiguous-subarray/">...</a>
 * Time complexity: O(n) – single pass through the array (prices).
 * Memory complexity: O(1) – only a few variables used.
 */


public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }

        int localMax = prices[1] - prices[0];;
        int globalMax = localMax;


        for (int i = 1; i < prices.length - 1; i++) {
            int currentDiffValue = prices[i + 1] - prices[i];

            localMax = Math.max(currentDiffValue, localMax + currentDiffValue);
            globalMax = Math.max(localMax, globalMax);

        }

        return Math.max(globalMax, 0);
    }

}
