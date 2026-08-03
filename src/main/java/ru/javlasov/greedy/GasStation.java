package ru.javlasov.greedy;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/gas-station/description/">...</a>
 * Time complexity: O(n) – two linear passes through the arrays (gas and cost).
 * Memory complexity: O(1) – constant extra memory (only variables).
 */

public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sumCost = 0;
        int sumGas = 0;

        for (int i = 0; i < gas.length; i++) {
            sumCost = sumCost + cost[i];
            sumGas = sumGas + gas[i];
        }

        if (sumGas < sumCost) {
            return -1;
        }

        int start = 0;
        int balance = 0;

        for (int i = 0; i < gas.length; i++) {
            balance = balance + gas[i] - cost[i];

            if (balance < 0) {
                start = i + 1;
                balance = 0;
            }
        }

        return start;
    }

}
