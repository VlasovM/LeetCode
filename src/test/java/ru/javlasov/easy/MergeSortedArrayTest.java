package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Merge sorted array")
class MergeSortedArrayTest {

    MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    void testScenarioFirst() {
        System.out.println("----------------------------------------");
        System.out.println("scenario first: ");
        int[] inputArrayFirst = new int[] {1, 2, 3, 0, 0, 0};
        int[] inputArraySecond = new int[] {2, 5, 6};
        int m = 3;
        int n = 3;

        int[] expectedValue = new int[] {1, 2, 2, 3, 5, 6};
        System.out.println("input values: " + Arrays.toString(inputArrayFirst) + ", " + Arrays.toString(inputArraySecond) +
                " | expected result: " + Arrays.toString(expectedValue));

        mergeSortedArray.merge(inputArrayFirst, m, inputArraySecond, n);

        assertThat(inputArrayFirst).isEqualTo(expectedValue);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSecond() {
        System.out.println("----------------------------------------");
        System.out.println("scenario second: ");
        int[] inputArrayFirst = new int[] {0};
        int[] inputArraySecond = new int[] {1};
        int m = 0;
        int n = 1;

        int[] expectedValue = new int[] {1};
        System.out.println("input values: " + Arrays.toString(inputArrayFirst) + ", " + Arrays.toString(inputArraySecond) +
                " | expected result: " + Arrays.toString(expectedValue));

        mergeSortedArray.merge(inputArrayFirst, m, inputArraySecond, n);

        assertThat(inputArrayFirst).isEqualTo(expectedValue);
        System.out.println("----------------------------------------");
    }



}