package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.easy.BestTimeToBuyAndSellStock.maxProfit;

class BestTimeToBuyAndSellStockTest {


    @Test
    @DisplayName("Example 1: prices = [7,1,5,3,6,4]")
    void testRotateArrayTestExampleFirst() {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int expected = 5;
        System.out.println("expected: " + expected);

        int actual = maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: prices = [7,6,4,3,1]")
    void testExampleFirst() {
        int[] prices = {7, 6, 4, 3, 1};

        int expected = 0;
        System.out.println("expected: " + expected);

        int actual = maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: prices = [1, 3, 1]")
    void testExampleSecond() {
        int[] prices = {1, 3, 1};

        int expected = 2;
        System.out.println("expected: " + expected);

        int actual = maxProfit(prices);

        assertEquals(expected, actual);
    }

}