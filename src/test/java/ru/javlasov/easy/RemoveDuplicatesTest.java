package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Remove Duplicates")
class RemoveDuplicatesTest {

    private final RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    void testScenarioFirst() {
        System.out.println("----------------------------------------");
        System.out.println("scenario first: ");
        int[] inputArray = new int[] {1, 1, 2};
        int[] expected = new int[] {1, 2};
        System.out.println("input value: " + Arrays.toString(inputArray) + " | expected result: " + expected.length);

        var actualResult = removeDuplicates.removeDuplicates(inputArray);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected.length);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSecond() {
        System.out.println("----------------------------------------");
        System.out.println("scenario second: ");
        int[] inputArray = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int[] expected = new int[] {0, 1, 2, 3, 4};

        System.out.println("input value: " + Arrays.toString(inputArray) + " | expected result: " + expected.length);

        var actualResult = removeDuplicates.removeDuplicates(inputArray);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected.length);
        System.out.println("----------------------------------------");
    }

}