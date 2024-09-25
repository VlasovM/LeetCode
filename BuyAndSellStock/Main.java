package BuyAndSellStock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] stock = new int[] {7, 1, 5, 3, 6, 4};
        System.out.println("Result: " + maxProfit(stock));
//        int[] stock = new int[] {7, 6, 4, 3, 1};
//        System.out.println("Result: " + maxProfit(stock));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > profit) { // Положительный профит
                profit = prices[i] - min;
            }
        }

        return profit;
    }
}
