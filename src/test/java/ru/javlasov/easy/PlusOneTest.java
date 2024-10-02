package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Plus one")
class PlusOneTest {

    PlusOne plusOne = new PlusOne();

    @Test
    void testScenarioFirst() {
        System.out.println("----------------------------------------");
        System.out.println("scenario first: ");
        int[] inputArray = new int[] {9, 1, 9, 9};
        int[] expected = new int[] {9, 2, 0, 0};
        System.out.println("input value: " + Arrays.toString(inputArray) + " | expected result: " + Arrays.toString(expected));

        var actualResult = plusOne.plusOne(inputArray);

        assertThat(actualResult).isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSecond() {
        System.out.println("----------------------------------------");
        System.out.println("scenario second: ");
        int[] inputArray = new int[] {9, 1, 9, 9};
        int[] expected = new int[] {9, 2, 0, 0};
        System.out.println("input value: " + Arrays.toString(inputArray) + " | expected result: " + Arrays.toString(expected));

        var actualResult = plusOne.plusOne(inputArray);

        assertThat(actualResult).isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

}