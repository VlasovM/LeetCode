package ru.javlasov.hashMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.javlasov.hashMap.TwoSum.twoSum;

class TwoSumTest {

    @Test
    @DisplayName("Example 1: nums = [2,7,11,15], target = 9")
    void testExampleFirst() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] expected = {0, 1};

        int[] actual = twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [3,2,4], target = 6")
    void testExampleSecond() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] expected = {1, 2};

        int[] actual = twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [3,3], target = 6")
    void testExampleThird() {
        int[] nums = {3, 3};
        int target = 6;

        int[] expected = {0, 1};

        int[] actual = twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

}