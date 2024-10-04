package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Valid palindrome")
class ValidPalindromeTest {

    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void testScenarioFirst() {
        System.out.println("----------------------------------------");
        System.out.println("scenario first: ");
        String input = "A man, a plan, a canal: Panama";
        boolean expected = true;
        System.out.println("input value: " + input + " | expected result: " + expected);

        var actualResult = validPalindrome.isPalindrome(input);

        assertThat(actualResult).isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSecond() {
        System.out.println("----------------------------------------");
        System.out.println("scenario second: ");
        String input = " ";
        boolean expected = true;
        System.out.println("input value: " + input + " | expected result: " + expected);

        var actualResult = validPalindrome.isPalindrome(input);

        assertThat(actualResult).isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioThird() {
        System.out.println("----------------------------------------");
        System.out.println("scenario third: ");
        String input = "ab_a";
        boolean expected = true;
        System.out.println("input value: " + input + " | expected result: " + expected);

        var actualResult = validPalindrome.isPalindrome(input);

        assertThat(actualResult).isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

}