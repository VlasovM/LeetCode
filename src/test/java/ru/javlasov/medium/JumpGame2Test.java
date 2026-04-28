package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.medium.JumpGame2.jump;

class JumpGame2Test {

    @Test
    @DisplayName("Example 1: prices = [2,3,1,1,4]")
    void testExampleFirst() {
        int[] nums = {2, 3, 1, 1, 4};

        int expected = 2;
        int actual = jump(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: prices = [2,3,0,1,4]")
    void testExampleSecond() {
        int[] nums = {2, 3, 0, 1, 4};

        int expected = 2;
        int actual = jump(nums);

        assertEquals(expected, actual);
    }

}