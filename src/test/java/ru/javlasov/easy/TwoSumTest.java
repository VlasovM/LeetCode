package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Easy: TwoSum")
class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    void testScenarioFirst() {
        System.out.println("----------------------------------------");
        System.out.println("scenario first: ");
        int[] incomeNums = {2, 7, 11, 15};
        var target = 9;

        System.out.println("incomeNums: " + Arrays.toString(incomeNums) + " | target: " + target);

        int[] expected = {0, 1};
        int[] actual = twoSum.twoSum(incomeNums, target);

        System.out.println("expected: " + Arrays.toString(expected) + " | actual: " + Arrays.toString(actual));
        assertThat(expected).isEqualTo(actual);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSecond() {
        System.out.println("----------------------------------------");
        System.out.println("scenario second: ");
        int[] incomeNums = {3, 3};
        var target = 6;

        System.out.println("incomeNums: " + Arrays.toString(incomeNums) + " | target: " + target);

        int[] expected = {0, 1};
        int[] actual = twoSum.twoSum(incomeNums, target);

        System.out.println("expected: " + Arrays.toString(expected) + " | actual: " + Arrays.toString(actual));
        assertThat(expected).isEqualTo(actual);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioThird() {
        System.out.println("----------------------------------------");
        System.out.println("scenario third: ");
        int[] incomeNums = {3, 2, 4};
        var target = 6;

        System.out.println("incomeNums: " + Arrays.toString(incomeNums) + " | target: " + target);

        int[] expected = {1, 2};
        int[] actual = twoSum.twoSum(incomeNums, target);

        System.out.println("expected: " + Arrays.toString(expected) + " | actual: " + Arrays.toString(actual));
        assertThat(expected).isEqualTo(actual);
        System.out.println("----------------------------------------");
    }


}