package BuyAndSellStockII;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(array));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            System.out.println(prices[i]);
            System.out.println(prices[i-1]);
            if (prices[i] > prices[i-1]) {
                profit += (prices[i] - prices[i-1]);
            }
        }
        return profit;
    }

}
