package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.medium.BestTimeToBuyAndSellStockII.maxProfit;

class BestTimeToBuyAndSellStockIITest {

    @Test
    @DisplayName("Example 1: prices = [7,1,5,3,6,4]")
    void testExampleFirst() {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int expected = 7;
        System.out.println("expected: " + expected);

        int actual = maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: prices = [7,6,4,3,1]")
    void testExampleSecond() {
        int[] prices = {7, 6, 4, 3, 1};

        int expected = 0;
        System.out.println("expected: " + expected);

        int actual = maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: prices = [1,2,3,4,5]")
    void testExampleThird() {
        int[] prices = {1, 2, 3, 4, 5};

        int expected = 4;
        System.out.println("expected: " + expected);

        int actual = maxProfit(prices);

        assertEquals(expected, actual);
    }

}