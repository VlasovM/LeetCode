package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.javlasov.medium.ProductOfArrayExceptSelf.productExceptSelf;

class ProductOfArrayExceptSelfTest {

    @Test
    @DisplayName("Example 1: nums = [1,2,3,4]")
    void testExampleFirst() {
        int[] nums = {1, 2, 3, 4};

        int[] expected = {24, 12, 8, 6};
        System.out.println("expected: " + Arrays.toString(expected));

        int[] actual = productExceptSelf(nums);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [-1,1,0,-3,3]")
    void testExampleSecond() {
        int[] nums = {-1, 1, 0, -3, 3};

        int[] expected = {0, 0, 9, 0, 0};
        System.out.println("expected: " + Arrays.toString(expected));

        int[] actual = productExceptSelf(nums);

        assertArrayEquals(expected, actual);
    }

}