package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.hashMap.ContainsDuplicate2.containsNearbyDuplicate;

class ContainsDuplicate2Test {

    @Test
    @DisplayName("Example 1: nums = [1,2,3,1], k = 3")
    void testExampleFirst() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean expected = true;
        boolean actual = containsNearbyDuplicate(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1,0,1,1], k = 1")
    void testExampleSecond() {
        int[] nums = {1, 0, 1, 1};
        int k = 1;

        boolean expected = true;
        boolean actual = containsNearbyDuplicate(nums, k);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: nums = [1,2,3,1,2,3], k = 2")
    void testExampleThird() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;

        boolean expected = true;
        boolean actual = containsNearbyDuplicate(nums, k);

        assertEquals(expected, actual);
    }

}