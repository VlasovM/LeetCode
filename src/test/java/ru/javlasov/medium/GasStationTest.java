package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.medium.GasStation.canCompleteCircuit;

class GasStationTest {

    @Test
    @DisplayName("Example 1: gas = [1,2,3,4,5], cost = [3,4,5,1,2]")
    void testExampleFirst() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        int expected = 3;
        System.out.println("expected: " + expected);

        int actual = canCompleteCircuit(gas, cost);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 1: gas = [2,3,4], cost = [3,4,3]")
    void testExampleSecond() {
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};

        int expected = -1;
        System.out.println("expected: " + expected);

        int actual = canCompleteCircuit(gas, cost);

        assertEquals(expected, actual);
    }

}