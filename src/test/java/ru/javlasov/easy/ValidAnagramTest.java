package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Valid anagram")
class ValidAnagramTest {

    private final ValidAnagram validAnagram = new ValidAnagram();

    @Test
    void testScenarioFirst() {
        System.out.println("----------------------------------------");
        System.out.println("scenario first: ");
        String inputFirst = "anagram";
        String inputSecond = "nagaram";
        boolean expected = true;
        System.out.println("input values: " + inputFirst + ", " + inputSecond + " | expected result: " + expected);

        var actualResult = validAnagram.isAnagram(inputFirst, inputSecond);
        assertThat(actualResult).isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSecond() {
        System.out.println("----------------------------------------");
        System.out.println("scenario second: ");
        String inputFirst = "rat";
        String inputSecond = "cat";
        boolean expected = false;
        System.out.println("input values: " + inputFirst + ", " + inputSecond + " | expected result: " + expected);

        var actualResult = validAnagram.isAnagram(inputFirst, inputSecond);
        assertThat(actualResult).isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

}