package ru.javlasov.twoPointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.javlasov.twoPointers.RemoveDuplicatesFromSortedArray2.removeDuplicates;

class RemoveDuplicatesFromSortedArray2Test {

    @Test
    @DisplayName("Example 1: nums = [1,1,1,2,2,3]")
    void testExampleFirst() {
        int[] nums = {1,1,1,2,2,3};

        int expected = 5;

        int actual = removeDuplicates(nums);

        assertEquals(expected, actual);
    }

}