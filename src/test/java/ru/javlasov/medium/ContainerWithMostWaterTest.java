package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.medium.ContainerWithMostWater.maxArea;

class ContainerWithMostWaterTest {

    @Test
    @DisplayName("Example 1: height = [1,8,6,2,5,4,8,3,7]")
    void testExampleFirst() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int expected = 49;
        System.out.println("expected: " + expected);

        int actual = maxArea(height);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: height = [1,1]")
    void testExampleSecond() {
        int[] height = {1, 1};

        int expected = 1;
        System.out.println("expected: " + expected);

        int actual = maxArea(height);

        assertEquals(expected, actual);
    }

}