package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.javlasov.medium.JumpGame.canJump;

class JumpGameTest {

    @Test
    @DisplayName("Example 1: prices = [2,3,1,1,4]")
    void testExampleFirst() {
        int[] nums = {2, 3, 1, 1, 4};

        boolean expected = true;
        System.out.println("expected: " + expected);

        boolean actual = canJump(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: prices = [3,2,1,0,4]")
    void testExampleSecond() {
        int[] nums = {3, 2, 1, 0, 4};

        boolean expected = false;
        System.out.println("expected: " + expected);

        boolean actual = canJump(nums);

        assertEquals(expected, actual);
    }

}