package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.javlasov.easy.MergeSortedArray.merge;

class MergeSortedArrayTest {

    private void printInputValue(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        System.out.println("Input value: nums1 = " + Arrays.toString(nums1) + " m = " + m +
                " nums2 = " + Arrays.toString(nums2) + " n = " + n);
        System.out.println("Expected: " + Arrays.toString(expected));
    }

    @Test
    @DisplayName("Оба массива с данными")
    void testMergeBothArraysHaveElements() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        int[] expected = {1, 2, 2, 3, 5, 6};
        printInputValue(nums1, m, nums2, n, expected);

        merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    @DisplayName("Второй массив с данными пустой")
    void testMergeSecondArrayIsEmpty() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        int[] expected = {1};
        printInputValue(nums1, m, nums2, n, expected);

        merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    @DisplayName("Оба массива пустые")
    void testMergeBothArraysIsEmpty() {
        int[] nums1 = {};
        int m = 0;
        int[] nums2 = {};
        int n = 0;

        int[] expected = {};
        printInputValue(nums1, m, nums2, n, expected);

        merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

}