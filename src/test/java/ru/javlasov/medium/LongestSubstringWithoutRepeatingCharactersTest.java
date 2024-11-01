package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Longest Substring Without Repeating Characters")
class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters
            = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void testScenarioFirst() {
        System.out.println("----------------------------------------");
        System.out.println("scenario first: ");
        var input = "abcabcbb"; //abc
        var expected = 3;
        System.out.println("input value: " + input + " | expected length: " + expected);

        var actualResult = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSecond() {
        System.out.println("----------------------------------------");
        System.out.println("scenario second: ");
        var input = "bbbbb"; //b
        var expected = 1;
        System.out.println("input value: " + input + " | expected length: " + expected);

        var actualResult = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioThird() {
        System.out.println("----------------------------------------");
        System.out.println("scenario third: ");
        var input = "pwwkew"; //wke
        var expected = 3;
        System.out.println("input value: " + input + " | expected length: " + expected);

        var actualResult = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioFourth() {
        System.out.println("----------------------------------------");
        System.out.println("scenario fourth: ");
        var input = "c"; //c
        var expected = 1;
        System.out.println("input value: " + input + " | expected length: " + expected);

        var actualResult = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioFifth() {
        System.out.println("----------------------------------------");
        System.out.println("scenario fifth: ");
        var input = "dvdf"; //vdf
        var expected = 3;
        System.out.println("input value: " + input + " | expected length: " + expected);

        var actualResult = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSixth() {
        System.out.println("----------------------------------------");
        System.out.println("scenario sixth: ");
        var input = "au";
        var expected = 2;
        System.out.println("input value: " + input + " | expected length: " + expected);

        var actualResult = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSeventh() {
        System.out.println("----------------------------------------");
        System.out.println("scenario seventh: ");
        var input = "loddktdji"; //ktdji
        var expected = 5;
        System.out.println("input value: " + input + " | expected length: " + expected);

        var actualResult = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioEight() {
        System.out.println("----------------------------------------");
        System.out.println("scenario eight: ");
        var input = "umvejcuuk"; // umvejc
        var expected = 6;
        System.out.println("input value: " + input + " | expected length: " + expected);

        var actualResult = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

}