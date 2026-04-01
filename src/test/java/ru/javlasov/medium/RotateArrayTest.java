package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.javlasov.medium.RotateArray.rotate;

class RotateArrayTest {

    @Test
    @DisplayName("Example 1: nums = [1,2,3,4,5,6,7], k = 3")
    void testRotateArrayTestExampleFirst() {
        int k = 3;
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        System.out.println("expected: " + Arrays.toString(expected));

        rotate(nums, k);

        assertArrayEquals(expected, nums);
    }

    @Test
    @DisplayName("Example 2: nums = [-1,-100,3,99], k = 2")
    void testRotateArrayTestExampleSecond() {
        int k = 2;
        int[] nums = {-1, -100, 3, 99};

        int[] expected = {3, 99, -1, -100};
        System.out.println("expected: " + Arrays.toString(expected));

        rotate(nums, k);

        assertArrayEquals(expected, nums);
    }

    @Test
    @DisplayName("Example 3: nums = [1, 2, 3], k = 3")
    void testRotateArrayTestArrayLengthEqualK() {
        int k = 3;
        int[] nums = {1, 2, 3};

        int[] expected = {1, 2, 3};
        System.out.println("expected: " + Arrays.toString(expected));

        rotate(nums, k);

        assertArrayEquals(expected, nums);
    }

}