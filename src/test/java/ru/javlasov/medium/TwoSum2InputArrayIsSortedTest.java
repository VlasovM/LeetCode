package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static ru.javlasov.medium.TwoSum2InputArrayIsSorted.twoSum;

class TwoSum2InputArrayIsSortedTest {

    @Test
    @DisplayName("Example 1: numbers = [2,7,11,15], target = 9")
    void testExampleFirst() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] expected = {1, 2};
        System.out.println("expected: " + Arrays.toString(expected));

        int[] actual = twoSum(numbers, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: numbers = [2,3,4], target = 6")
    void testExampleSecond() {
        int[] numbers = {2, 3, 4};
        int target = 6;

        int[] expected = {1, 3};
        System.out.println("expected: " + Arrays.toString(expected));

        int[] actual = twoSum(numbers, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: numbers = [-1,0], target = -1")
    void testExampleThird() {
        int[] numbers = {-1, 0};
        int target = -1;

        int[] expected = {1, 2};
        System.out.println("expected: " + Arrays.toString(expected));

        int[] actual = twoSum(numbers, target);

        assertArrayEquals(expected, actual);
    }

}