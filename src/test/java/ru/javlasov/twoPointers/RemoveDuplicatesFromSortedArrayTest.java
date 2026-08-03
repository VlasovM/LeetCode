package ru.javlasov.twoPointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.twoPointers.RemoveDuplicatesFromSortedArray.removeDuplicates;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    @DisplayName("Example 1: nums = [1,1,2]")
    void testExampleFirst() {
        int[] nums = {1, 1, 2};

        int expected = 2;
        int[] expectedArray = {1, 2, 2};

        int actual = removeDuplicates(nums);

        assertEquals(expected, actual);
        assertArrayEquals(nums, expectedArray);
    }

}