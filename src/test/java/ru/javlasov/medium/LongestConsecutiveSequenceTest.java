package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.medium.LongestConsecutiveSequence.longestConsecutive;

class LongestConsecutiveSequenceTest {

    @Test
    @DisplayName("Example 1: nums = [100,4,200,1,3,2]")
    void testExampleFirst() {
        int[] nums = {100, 4, 200, 1, 3, 2};

        int expected = 4;
        int actual = longestConsecutive(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [0,3,7,2,5,8,4,6,0,1]")
    void testExampleSecond() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        int expected = 9;
        int actual = longestConsecutive(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [1,0,1,2]")
    void testExampleThird() {
        int[] nums = {1, 0, 1, 2};

        int expected = 3;
        int actual = longestConsecutive(nums);

        assertEquals(expected, actual);
    }

}