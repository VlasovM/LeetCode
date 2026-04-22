package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.medium.Sum3.threeSum;

class Sum3Test {

    @Test
    @DisplayName("Example 1: prices = [-1,0,1,2,-1,-4]")
    void testExampleFirst() {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(-1, -1, 2));
        expected.add(List.of(-1, 0, 1));

        System.out.println("expected: " + expected);

        List<List<Integer>> actual = threeSum(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: prices = [0,1,1]")
    void testExampleSecond() {
        int[] nums = {0,1,1};

        List<List<Integer>> expected = new ArrayList<>();

        System.out.println("expected: " + expected);

        List<List<Integer>> actual = threeSum(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: prices = [0,0,0]")
    void testExampleThird() {
        int[] nums = {0,0,0};

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(0, 0, 0));

        System.out.println("expected: " + expected);

        List<List<Integer>> actual = threeSum(nums);

        assertEquals(expected, actual);
    }

}