package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Longest common prefix")
class LongestCommonPrefixTest {

    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void testScenarioFirst() {
        System.out.println("----------------------------------------");
        System.out.println("scenario first: ");
        String[] input = new String[] {"flower", "flow", "flight"};
        var expected = "fl";

        System.out.println("input value: " + Arrays.toString(input) + " | expected result: " + expected);

        var actualResult = longestCommonPrefix.longestCommonPrefix(input);

        assertThat(expected).isEqualTo(actualResult);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSecond() {
        System.out.println("----------------------------------------");
        System.out.println("scenario second: ");
        String[] input = new String[] {"dog", "racecar", "car"};
        var expected = "";

        System.out.println("input value: " + Arrays.toString(input) + " | expected result: " + expected);

        var actualResult = longestCommonPrefix.longestCommonPrefix(input);

        assertThat(expected).isEqualTo(actualResult);
        System.out.println("----------------------------------------");
    }

}