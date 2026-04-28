package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.medium.HIndex.hIndex;

class HIndexTest {

    @Test
    @DisplayName("Example 1: citations = [3,0,6,1,5]")
    void testExampleFirst() {
        int[] nums = {3, 0, 6, 1, 5};

        int expected = 3;
        int actual = hIndex(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: citations = [1,3,1]")
    void testExampleSecond() {
        int[] nums = {1, 3, 1};

        int expected = 1;
        int actual = hIndex(nums);

        assertEquals(expected, actual);
    }

}