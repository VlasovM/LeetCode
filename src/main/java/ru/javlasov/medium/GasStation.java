package ru.javlasov.medium;

/**
 * LeetCode:
 * <a href="https://leetcode.com/problems/gas-station/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 * We solve this problem use Greedy algorithm.
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
