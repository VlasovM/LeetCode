package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.javlasov.medium.MinimumSizeSubarraySum.minSubArrayLen;

class MinimumSizeSubarraySumTest {

    @Test
    @DisplayName("Example 1: nums = [2,3,1,2,4,3], target = 7")
    void testExampleFirst() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int expected = 2;
        System.out.println("expected: " + expected);

        int actual = minSubArrayLen(target, nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1,4,4], target = 4")
    void testExampleSecond() {
        int[] nums = {1, 4, 4};
        int target = 4;

        int expected = 1;
        System.out.println("expected: " + expected);

        int actual = minSubArrayLen(target, nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [1,1,1,1,1,1,1,1], target = 11")
    void testExampleThird() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;

        int expected = 0;
        System.out.println("expected: " + expected);

        int actual = minSubArrayLen(target, nums);

        assertEquals(expected, actual);
    }

}