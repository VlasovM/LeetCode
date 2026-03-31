package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.easy.MajorityElement.majorityElement;

class MajorityElementTest {

    @Test
    @DisplayName("Example 1 [3, 2, 3]")
    void testMajorityElementFirstExample() {
        int[] nums = {3, 2, 3};

        int expected = 3;

        int actual = majorityElement(nums);

        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Example 2 [2, 2, 1, 1, 1, 2, 2]")
    void testMajorityElementSecondExample() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int expected = 2;

        int actual = majorityElement(nums);

        assertEquals(expected, actual);
    }

}