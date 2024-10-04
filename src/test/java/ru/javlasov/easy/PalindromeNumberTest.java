package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Palindrome number")
class PalindromeNumberTest {

    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void testScenarioFirst() {
        System.out.println("----------------------------------------");
        System.out.println("scenario first: ");
        var input = 121;
        var expectedResult = true;

        System.out.println("input value: " + input + " | expected result: " + expectedResult);

        var actualResult = palindromeNumber.isPalindrome(input);

        assertThat(expectedResult).isEqualTo(actualResult);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSecond() {
        System.out.println("----------------------------------------");
        System.out.println("scenario second: ");
        var input = -121;
        var expectedResult = false;

        System.out.println("input value: " + input + " | expected result: " + expectedResult);

        var actualResult = palindromeNumber.isPalindrome(input);

        assertThat(expectedResult).isEqualTo(actualResult);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioThird() {
        System.out.println("----------------------------------------");
        System.out.println("scenario third: ");
        var input = 10;
        var expectedResult = false;

        System.out.println("input value: " + input + " | expected result: " + expectedResult);

        var actualResult = palindromeNumber.isPalindrome(input);

        assertThat(expectedResult).isEqualTo(actualResult);
        System.out.println("----------------------------------------");
    }

}