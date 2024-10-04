package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("First unique character")
class FirstUniqueCharacterInAStringTest {

    private final FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();

    @Test
    void testScenarioFirst() {
        System.out.println("----------------------------------------");
        System.out.println("scenario first: ");
        String input = "leetcode";
        var expected = 0;

        System.out.println("input value: " + input + " | expected result: " + expected);

        var actualResult = firstUniqueCharacterInAString.firstUniqChar(input);

        assertThat(expected).isEqualTo(actualResult);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSecond() {
        System.out.println("----------------------------------------");
        System.out.println("scenario second: ");
        String input = "loveleetcode";
        var expected = 2;

        System.out.println("input value: " + input + " | expected result: " + expected);

        var actualResult = firstUniqueCharacterInAString.firstUniqChar(input);

        assertThat(expected).isEqualTo(actualResult);
        System.out.println("----------------------------------------");
    }

}