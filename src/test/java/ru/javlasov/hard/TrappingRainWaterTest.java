package ru.javlasov.hard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.hard.TrappingRainWater.trap;

class TrappingRainWaterTest {

    @Test
    @DisplayName("Example 1: height = [0,1,0,2,1,0,1,3,2,1,2,1]")
    void testExampleFirst() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int expected = 6;
        System.out.println("expected: " + expected);

        int actual = trap(height);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: height = [4,2,0,3,2,5]")
    void testExampleSecond() {
        int[] height = {4, 2, 0, 3, 2, 5};

        int expected = 9;
        System.out.println("expected: " + expected);

        int actual = trap(height);

        assertEquals(expected, actual);
    }

}